// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MFASettings.proto

package com.appdirect.event;

public final class MFASettingsOuterClass {
  private MFASettingsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_MFASettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_MFASettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_appdirect_event_MFASettingsDeletedPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_appdirect_event_MFASettingsDeletedPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021MFASettings.proto\022\023com.appdirect.event" +
      "\032\016resource.proto\"\246\002\n\013MFASettings\022/\n\010reso" +
      "urce\030\001 \001(\0132\035.com.appdirect.event.Resourc" +
      "e\022\017\n\007enabled\030\002 \001(\010\022\025\n\rrequiredRoles\030\003 \003(" +
      "\t\022\026\n\016tokenTolerance\030\004 \001(\003\022\034\n\024trustedDevi" +
      "ceEnabled\030\005 \001(\010\022\023\n\013trustedDays\030\006 \001(\005\022\014\n\004" +
      "type\030\007 \001(\t\022\020\n\010entityId\030\010 \001(\t\022\032\n\022security" +
      "KeyEnabled\030\t \001(\t\022\031\n\021superuserExcluded\030\n " +
      "\001(\010\022\034\n\024authenticationViaSms\030\013 \001(\010\"l\n\031MFA" +
      "SettingsDeletedPayload\022/\n\010resource\030\001 \001(\013",
      "2\035.com.appdirect.event.Resource\022\014\n\004type\030" +
      "\002 \001(\t\022\020\n\010entityId\030\003 \001(\tB\002P\001b\006proto3"
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
    internal_static_com_appdirect_event_MFASettings_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_appdirect_event_MFASettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_MFASettings_descriptor,
        new java.lang.String[] { "Resource", "Enabled", "RequiredRoles", "TokenTolerance", "TrustedDeviceEnabled", "TrustedDays", "Type", "EntityId", "SecurityKeyEnabled", "SuperuserExcluded", "AuthenticationViaSms", });
    internal_static_com_appdirect_event_MFASettingsDeletedPayload_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_appdirect_event_MFASettingsDeletedPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_appdirect_event_MFASettingsDeletedPayload_descriptor,
        new java.lang.String[] { "Resource", "Type", "EntityId", });
    com.appdirect.event.ResourceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
