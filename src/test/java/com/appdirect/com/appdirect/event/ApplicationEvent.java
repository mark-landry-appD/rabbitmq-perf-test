// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: application.event.proto

package com.appdirect.event;

public final class ApplicationEvent {
  private ApplicationEvent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_ApplicationCreated_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_ApplicationCreated_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_ApplicationUpdated_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_ApplicationUpdated_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_ApplicationDeleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_ApplicationDeleted_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_ApplicationSegmentUpdated_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_ApplicationSegmentUpdated_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027application.event.proto\022\023com.appdirect" +
      ".event\032\021application.proto\032\016metadata.prot" +
      "o\"|\n\022ApplicationCreated\0225\n\013application\030\001" +
      " \001(\0132 .com.appdirect.event.Application\022/" +
      "\n\010metadata\030\002 \001(\0132\035.com.appdirect.event.M" +
      "etadata\"|\n\022ApplicationUpdated\0225\n\013applica" +
      "tion\030\001 \001(\0132 .com.appdirect.event.Applica" +
      "tion\022/\n\010metadata\030\002 \001(\0132\035.com.appdirect.e" +
      "vent.Metadata\"|\n\022ApplicationDeleted\0225\n\013a" +
      "pplication\030\001 \001(\0132 .com.appdirect.event.A",
      "pplication\022/\n\010metadata\030\002 \001(\0132\035.com.appdi" +
      "rect.event.Metadata\"\230\001\n\031ApplicationSegme" +
      "ntUpdated\0225\n\013application\030\001 \001(\0132 .com.app" +
      "direct.event.Application\022/\n\010metadata\030\002 \001" +
      "(\0132\035.com.appdirect.event.Metadata\022\023\n\013seg" +
      "ment_ids\030\003 \003(\tB\002P\001b\006proto3"
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
          com.appdirect.event.ApplicationOuterClass.getDescriptor(),
          com.appdirect.event.MetadataOuterClass.getDescriptor(),
        }, assigner);
    internal_static_com_appdirect_event_ApplicationCreated_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_appdirect_event_ApplicationCreated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_ApplicationCreated_descriptor,
        new java.lang.String[] { "Application", "Metadata", });
    internal_static_com_appdirect_event_ApplicationUpdated_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_appdirect_event_ApplicationUpdated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_ApplicationUpdated_descriptor,
        new java.lang.String[] { "Application", "Metadata", });
    internal_static_com_appdirect_event_ApplicationDeleted_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_appdirect_event_ApplicationDeleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_ApplicationDeleted_descriptor,
        new java.lang.String[] { "Application", "Metadata", });
    internal_static_com_appdirect_event_ApplicationSegmentUpdated_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_appdirect_event_ApplicationSegmentUpdated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_ApplicationSegmentUpdated_descriptor,
        new java.lang.String[] { "Application", "Metadata", "SegmentIds", });
    com.appdirect.event.ApplicationOuterClass.getDescriptor();
    com.appdirect.event.MetadataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
