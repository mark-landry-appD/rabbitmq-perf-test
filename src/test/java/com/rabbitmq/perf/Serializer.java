package com.rabbitmq.perf;
import com.appdirect.jbilling.event.invoice.Invoice;
import com.appdirect.jbilling.event.invoice.JBillingInvoiceEvent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Serializer {
    File targetDir = new File("target");
    public void WriteBinaryFile(JBillingInvoiceEvent jBilligInvoiceEvent, String filename) throws IOException {
        File targetFile = new File(targetDir,filename);
        FileOutputStream outStream = new FileOutputStream(targetFile);
        jBilligInvoiceEvent.writeTo(outStream);
        outStream.close();
    }
    public Invoice ReadBinaryFile(String filename) throws IOException {
        FileInputStream inStream = new FileInputStream(filename);
        Invoice invoice = Invoice.parseFrom(inStream);
        inStream.close();
        return invoice;
    }

    public static void main(String[] args) throws IOException {
    }
}
