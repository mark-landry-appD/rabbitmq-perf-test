// Copyright (c) 2017-2020 VMware, Inc. or its affiliates.  All rights reserved.
//
// This software, the RabbitMQ Java client library, is triple-licensed under the
// Mozilla Public License 2.0 ("MPL"), the GNU General Public License version 2
// ("GPL") and the Apache License version 2 ("ASL"). For the MPL, please see
// LICENSE-MPL-RabbitMQ. For the GPL, please see LICENSE-GPL2.  For the ASL,
// please see LICENSE-APACHE2.
//
// This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY KIND,
// either express or implied. See the LICENSE file for specific language governing
// rights and limitations of this software.
//
// If you have any questions regarding licensing, please contact us at
// info@rabbitmq.com.

package com.rabbitmq.perf;


import com.appdirect.jbilling.event.invoice.Invoice;
import com.appdirect.jbilling.event.invoice.InvoiceLine;
import com.appdirect.jbilling.event.invoice.InvoiceEvent;
import com.appdirect.jbilling.event.invoice.JBillingInvoiceEvent;

import com.google.protobuf.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.time.Instant;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;


import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class LocalFilesMessageBodySourceTest {

    File targetDir=new File("target");
   // File targetFile=new File(targetDir, fileName);
    //FileOutputStream fos = new FileOutputStream(targetFile);

    File permFolder = new File("target");
    static final int LOWER_BOUND_INVOICE_ID = 83502;
    static final int UPPER_BOUND_INVOICE_ID = 999999;
    static final int LOWER_BOUND_LINE_ID = 200000;
    static final int UPPER_BOUND_LINE_ID = 999999;
    static final int NUMBER_OF_FILES = 60;

    @TempDir
    File folder;

    private static void write(File file, String content) throws Exception {
        FileWriter writer = new FileWriter(file);
        writer.append(content);
        writer.flush();
        writer.close();
    }

    @Test
    public void createOneFileThatExists() throws Exception {
        File file = new File(folder, "content.txt");
        file.createNewFile();
        String content = "dummy content";
        write(file, content);
        MessageBodySource creator = new LocalFilesMessageBodySource(asList(file.getAbsolutePath()));
        byte[] body1 = creator.create(1).getBody();
        byte[] body2 = creator.create(1).getBody();
        assertEquals(content, new String(body1, "UTF-8"));
        assertEquals(content, new String(body2, "UTF-8"));
    }


   // @Test
    public void createInvoiceCoreProtoBufFile() throws Exception {
        // use InvoiceLine.Builder to create invoice lines.
        File file = new File(targetDir, "Invoice.txt");
        file.createNewFile();
        JBillingInvoiceEvent jbillingInvoiceEvent = JBillingInvoiceEvent.newBuilder()
                .setInvoice(newInvoice()).build();
        write(file, jbillingInvoiceEvent.toString());
        Serializer serializer = new Serializer();
        serializer.WriteBinaryFile(jbillingInvoiceEvent, "InvoiceSerialized.bin");
    }

    @Test
    public void createProtoBufBinaryFiles() throws Exception {
        for (int i=0; i<NUMBER_OF_FILES; i++) {
            JBillingInvoiceEvent jbillingInvoiceEvent = JBillingInvoiceEvent.newBuilder()
                    .setInvoice(newInvoice()).build();
            Serializer serializer = new Serializer();
            serializer.WriteBinaryFile(jbillingInvoiceEvent, "Invoice_"+i+".bin");
        }
    }


    @Test
    public void createSeveralFileThatExists() throws Exception {
        List<String> files = new ArrayList<String>();
        for (int i = 0; i < 3; i++) {
            File file = new File(folder, "content" + i + ".txt");
            file.createNewFile();
            String content = "content" + i;
            write(file, content);
            files.add(file.getAbsolutePath());
        }

        MessageBodySource creator = new LocalFilesMessageBodySource(files);
        byte[] body0 = creator.create(0).getBody();
        assertEquals("content0", new String(body0, "UTF-8"));
        byte[] body1 = creator.create(1).getBody();
        assertEquals("content1", new String(body1, "UTF-8"));
        byte[] body2 = creator.create(2).getBody();
        assertEquals("content2", new String(body2, "UTF-8"));
        byte[] body4 = creator.create(3).getBody();
        assertEquals("content0", new String(body4, "UTF-8"));
    }

    @Test
    public void createFileDoesNotExist() throws Exception {
        File file = new File(folder, "dummy.txt");
        try {
            new LocalFilesMessageBodySource(asList(file.getAbsolutePath()));
            fail("File does not exist, exception should have thrown");
        } catch (IllegalArgumentException e) {
            // ok
        }
    }


    public Invoice newInvoice() {

        int invoiceId = generateRandomIntBetween (LOWER_BOUND_INVOICE_ID, UPPER_BOUND_INVOICE_ID);

        Invoice.Builder invoiceBuilder = Invoice.newBuilder()
            .setId(invoiceId)
            .setVersion(1)
            .setSource("BILLING_PROCESS")
            .addBillingOrderIds(1)
            .setUserId(Int32Value.newBuilder().setValue(553401).build())
            .setBillingProcessId(Int32Value.newBuilder().setValue(11228).build())
            .setCreationDate(getFormattedDate(Instant.now()))
            .setDueDate(getFormattedDate(Instant.now().plus(5, ChronoUnit.DAYS )))
            //.setCreationDate("2022-02-18T00:00:00-05:00")
            //.setDueDate("2022-02-23T00:00:00-05:00")
            .setTotal("10.00")
            .setStatus("UNPAID")
            .setBalance("10.00")
            .setCarriedBalance("0")
            .setCurrency("USD")
            //.setCreationTimestamp(getFormattedDate(Instant.now()))
            .setCreationTimestamp("2022-02-18T00:00:00-05:00")
            .setIsToProcess(true)
            .setIsPaymentInProcess(true)
            .setPublicNumber(String.valueOf(invoiceId))
            .setIsToSyncWithAd(true)
            .setPartner("APPDIRECT")
            .setIsMarketplaceInvoiceSequenceNumber(true);
        invoiceBuilder.addAllInvoiceLines(invoiceLines());
        return invoiceBuilder.build();
    }

    private static Iterable<InvoiceLine> invoiceLines() {
        InvoiceLine.Builder invoiceLineBuilder = InvoiceLine.newBuilder()
                .setId(generateRandomIntBetween(LOWER_BOUND_LINE_ID, UPPER_BOUND_LINE_ID))
                .setDescription("AUTO_WEBAPP_NEW - Recurring Edition - Monthly Fee Period from 02/16/22 to 03/16/22")
                .setInvoiceLineType("ITEM")
                .setQuantity(BigDecimal.ONE.toPlainString())
                .setPrice(BigDecimal.TEN.toPlainString())
                .setAmount(BigDecimal.TEN.toPlainString())
                .setItemId(Int32Value.newBuilder().setValue(31906).build())
                .setOrderId(Int32Value.newBuilder().setValue(49400).build())
                .setExternalOrderLineId(Int64Value.newBuilder().setValue(13963L).build())
                .setPeriodStart(getFormattedDate(Instant.now()))
                .setPeriodEnd(getFormattedDate(Instant.now()));

        return List.of(invoiceLineBuilder.build());
    }



    // helper function from invoice-core
    public static String getFormattedDate(Instant instant) {
        return DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(LocalDate.ofInstant(instant, ZoneId.systemDefault()).atStartOfDay().atOffset(ZoneOffset.UTC));
    }


    private static int generateRandomIntBetween(int lowerBound,int upperBound) {
            Random rand = new Random(); //instance of random class
            return rand.nextInt(upperBound) + lowerBound;

    }
}
