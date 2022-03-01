// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: clientSyndicatedTenants.event.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.ClientSyndicatedTenantUpdated}
 */
public  final class ClientSyndicatedTenantUpdated extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.ClientSyndicatedTenantUpdated)
    ClientSyndicatedTenantUpdatedOrBuilder {
  // Use ClientSyndicatedTenantUpdated.newBuilder() to construct.
  private ClientSyndicatedTenantUpdated(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientSyndicatedTenantUpdated() {
    clientId_ = "";
    tenant_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ClientSyndicatedTenantUpdated(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            clientId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            tenant_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appdirect.event.ClientSyndicatedTenantsEvent.internal_static_com_appdirect_event_ClientSyndicatedTenantUpdated_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.ClientSyndicatedTenantsEvent.internal_static_com_appdirect_event_ClientSyndicatedTenantUpdated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.ClientSyndicatedTenantUpdated.class, com.appdirect.event.ClientSyndicatedTenantUpdated.Builder.class);
  }

  public static final int CLIENTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object clientId_;
  /**
   * <code>optional string clientId = 1;</code>
   */
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string clientId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENANT_FIELD_NUMBER = 2;
  private volatile java.lang.Object tenant_;
  /**
   * <code>optional string tenant = 2;</code>
   */
  public java.lang.String getTenant() {
    java.lang.Object ref = tenant_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tenant_ = s;
      return s;
    }
  }
  /**
   * <code>optional string tenant = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTenantBytes() {
    java.lang.Object ref = tenant_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tenant_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getClientIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    if (!getTenantBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tenant_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    if (!getTenantBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tenant_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.appdirect.event.ClientSyndicatedTenantUpdated)) {
      return super.equals(obj);
    }
    com.appdirect.event.ClientSyndicatedTenantUpdated other = (com.appdirect.event.ClientSyndicatedTenantUpdated) obj;

    boolean result = true;
    result = result && getClientId()
        .equals(other.getClientId());
    result = result && getTenant()
        .equals(other.getTenant());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    hash = (37 * hash) + TENANT_FIELD_NUMBER;
    hash = (53 * hash) + getTenant().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.ClientSyndicatedTenantUpdated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.ClientSyndicatedTenantUpdated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.ClientSyndicatedTenantUpdated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.ClientSyndicatedTenantUpdated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.ClientSyndicatedTenantUpdated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.ClientSyndicatedTenantUpdated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.ClientSyndicatedTenantUpdated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.ClientSyndicatedTenantUpdated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.ClientSyndicatedTenantUpdated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.ClientSyndicatedTenantUpdated parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.appdirect.event.ClientSyndicatedTenantUpdated prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.appdirect.event.ClientSyndicatedTenantUpdated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.ClientSyndicatedTenantUpdated)
      com.appdirect.event.ClientSyndicatedTenantUpdatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.ClientSyndicatedTenantsEvent.internal_static_com_appdirect_event_ClientSyndicatedTenantUpdated_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.ClientSyndicatedTenantsEvent.internal_static_com_appdirect_event_ClientSyndicatedTenantUpdated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.ClientSyndicatedTenantUpdated.class, com.appdirect.event.ClientSyndicatedTenantUpdated.Builder.class);
    }

    // Construct using com.appdirect.event.ClientSyndicatedTenantUpdated.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      clientId_ = "";

      tenant_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appdirect.event.ClientSyndicatedTenantsEvent.internal_static_com_appdirect_event_ClientSyndicatedTenantUpdated_descriptor;
    }

    public com.appdirect.event.ClientSyndicatedTenantUpdated getDefaultInstanceForType() {
      return com.appdirect.event.ClientSyndicatedTenantUpdated.getDefaultInstance();
    }

    public com.appdirect.event.ClientSyndicatedTenantUpdated build() {
      com.appdirect.event.ClientSyndicatedTenantUpdated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.ClientSyndicatedTenantUpdated buildPartial() {
      com.appdirect.event.ClientSyndicatedTenantUpdated result = new com.appdirect.event.ClientSyndicatedTenantUpdated(this);
      result.clientId_ = clientId_;
      result.tenant_ = tenant_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.appdirect.event.ClientSyndicatedTenantUpdated) {
        return mergeFrom((com.appdirect.event.ClientSyndicatedTenantUpdated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.ClientSyndicatedTenantUpdated other) {
      if (other == com.appdirect.event.ClientSyndicatedTenantUpdated.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        onChanged();
      }
      if (!other.getTenant().isEmpty()) {
        tenant_ = other.tenant_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.appdirect.event.ClientSyndicatedTenantUpdated parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.ClientSyndicatedTenantUpdated) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object clientId_ = "";
    /**
     * <code>optional string clientId = 1;</code>
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string clientId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string clientId = 1;</code>
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string clientId = 1;</code>
     */
    public Builder clearClientId() {
      
      clientId_ = getDefaultInstance().getClientId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string clientId = 1;</code>
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tenant_ = "";
    /**
     * <code>optional string tenant = 2;</code>
     */
    public java.lang.String getTenant() {
      java.lang.Object ref = tenant_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tenant_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string tenant = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTenantBytes() {
      java.lang.Object ref = tenant_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tenant_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string tenant = 2;</code>
     */
    public Builder setTenant(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tenant_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string tenant = 2;</code>
     */
    public Builder clearTenant() {
      
      tenant_ = getDefaultInstance().getTenant();
      onChanged();
      return this;
    }
    /**
     * <code>optional string tenant = 2;</code>
     */
    public Builder setTenantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tenant_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.ClientSyndicatedTenantUpdated)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.ClientSyndicatedTenantUpdated)
  private static final com.appdirect.event.ClientSyndicatedTenantUpdated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.ClientSyndicatedTenantUpdated();
  }

  public static com.appdirect.event.ClientSyndicatedTenantUpdated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientSyndicatedTenantUpdated>
      PARSER = new com.google.protobuf.AbstractParser<ClientSyndicatedTenantUpdated>() {
    public ClientSyndicatedTenantUpdated parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientSyndicatedTenantUpdated(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientSyndicatedTenantUpdated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientSyndicatedTenantUpdated> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.ClientSyndicatedTenantUpdated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

