// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assignment.proto

package com.appdirect.event;

public final class AssignmentOuterClass {
  private AssignmentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_Assignment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_Assignment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020assignment.proto\022\023com.appdirect.event\032" +
      "\016resource.proto\032\022subscription.proto\"\311\001\n\n" +
      "Assignment\022/\n\010resource\030\001 \001(\0132\035.com.appdi" +
      "rect.event.Resource\022\024\n\014creationDate\030\002 \001(" +
      "\003\022\031\n\021externalAccountId\030\003 \001(\t\022\016\n\006status\030\004" +
      " \001(\t\022\020\n\010userUuid\030\005 \001(\t\0227\n\014subscription\030\006" +
      " \001(\0132!.com.appdirect.event.SubscriptionB" +
      "\002P\001b\006proto3"
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
          com.appdirect.event.SubscriptionOuterClass.getDescriptor(),
        }, assigner);
    internal_static_com_appdirect_event_Assignment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_appdirect_event_Assignment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_Assignment_descriptor,
        new java.lang.String[] { "Resource", "CreationDate", "ExternalAccountId", "Status", "UserUuid", "Subscription", });
    com.appdirect.event.ResourceOuterClass.getDescriptor();
    com.appdirect.event.SubscriptionOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
