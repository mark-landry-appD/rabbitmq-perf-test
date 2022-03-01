// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: invoice.proto

package com.appdirect.event;

public final class InvoiceOuterClass {
  private InvoiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_InvoiceLine_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_InvoiceLine_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_Invoice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_Invoice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rinvoice.proto\022\023com.appdirect.event\032\016re" +
      "source.proto\"\257\001\n\013InvoiceLine\022/\n\010resource" +
      "\030\001 \001(\0132\035.com.appdirect.event.Resource\022\027\n" +
      "\017invoiceLineType\030\002 \001(\t\022\020\n\010quantity\030\003 \001(\003" +
      "\022\r\n\005price\030\004 \001(\001\022\r\n\005total\030\005 \001(\001\022\023\n\013period" +
      "Start\030\006 \001(\003\022\021\n\tperiodEnd\030\007 \001(\003\"\230\002\n\007Invoi" +
      "ce\022/\n\010resource\030\001 \001(\0132\035.com.appdirect.eve" +
      "nt.Resource\022\024\n\014creationDate\030\002 \001(\003\022\017\n\007due" +
      "Date\030\003 \001(\003\022\016\n\006status\030\004 \001(\t\022\r\n\005total\030\005 \001(" +
      "\001\022\020\n\010currency\030\006 \001(\t\022\023\n\013companyUuid\030\007 \001(\t",
      "\022\020\n\010userUuid\030\010 \001(\t\0225\n\013invoiceline\030\t \003(\0132" +
      " .com.appdirect.event.InvoiceLine\022\020\n\010isR" +
      "efund\030\n \001(\010\022\024\n\014isCreditNote\030\013 \001(\010B\002P\001b\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.appdirect.event.ResourceOuterClass.getDescriptor(),
        }, assigner);
    internal_static_com_appdirect_event_InvoiceLine_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_appdirect_event_InvoiceLine_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_InvoiceLine_descriptor,
        new java.lang.String[] { "Resource", "InvoiceLineType", "Quantity", "Price", "Total", "PeriodStart", "PeriodEnd", });
    internal_static_com_appdirect_event_Invoice_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_appdirect_event_Invoice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_Invoice_descriptor,
        new java.lang.String[] { "Resource", "CreationDate", "DueDate", "Status", "Total", "Currency", "CompanyUuid", "UserUuid", "Invoiceline", "IsRefund", "IsCreditNote", });
    com.appdirect.event.ResourceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
