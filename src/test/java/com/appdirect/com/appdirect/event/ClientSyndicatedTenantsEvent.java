// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: clientSyndicatedTenants.event.proto

package com.appdirect.event;

public final class ClientSyndicatedTenantsEvent {
  private ClientSyndicatedTenantsEvent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_ClientSyndicatedTenantUpdated_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_ClientSyndicatedTenantUpdated_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_ClientSyndicatedTenantDeleted_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_ClientSyndicatedTenantDeleted_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#clientSyndicatedTenants.event.proto\022\023c" +
      "om.appdirect.event\"A\n\035ClientSyndicatedTe" +
      "nantUpdated\022\020\n\010clientId\030\001 \001(\t\022\016\n\006tenant\030" +
      "\002 \001(\t\"A\n\035ClientSyndicatedTenantDeleted\022\020" +
      "\n\010clientId\030\001 \001(\t\022\016\n\006tenant\030\002 \001(\tB\002P\001b\006pr" +
      "oto3"
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
        }, assigner);
    internal_static_com_appdirect_event_ClientSyndicatedTenantUpdated_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_appdirect_event_ClientSyndicatedTenantUpdated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_ClientSyndicatedTenantUpdated_descriptor,
        new java.lang.String[] { "ClientId", "Tenant", });
    internal_static_com_appdirect_event_ClientSyndicatedTenantDeleted_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_appdirect_event_ClientSyndicatedTenantDeleted_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_ClientSyndicatedTenantDeleted_descriptor,
        new java.lang.String[] { "ClientId", "Tenant", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
