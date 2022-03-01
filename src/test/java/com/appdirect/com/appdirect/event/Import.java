// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: import.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.Import}
 */
public  final class Import extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.Import)
    ImportOrBuilder {
  // Use Import.newBuilder() to construct.
  private Import(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Import() {
    companyUuid_ = "";
    applicationUuid_ = "";
    integrationConfigurationId_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Import(
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
            com.appdirect.event.Resource.Builder subBuilder = null;
            if (resource_ != null) {
              subBuilder = resource_.toBuilder();
            }
            resource_ = input.readMessage(com.appdirect.event.Resource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resource_);
              resource_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            companyUuid_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            applicationUuid_ = s;
            break;
          }
          case 32: {

            integrationConfigurationId_ = input.readInt64();
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
    return com.appdirect.event.ImportOuterClass.internal_static_com_appdirect_event_Import_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.ImportOuterClass.internal_static_com_appdirect_event_Import_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.Import.class, com.appdirect.event.Import.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  private com.appdirect.event.Resource resource_;
  /**
   * <code>optional .com.appdirect.event.Resource resource = 1;</code>
   */
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.Resource resource = 1;</code>
   */
  public com.appdirect.event.Resource getResource() {
    return resource_ == null ? com.appdirect.event.Resource.getDefaultInstance() : resource_;
  }
  /**
   * <code>optional .com.appdirect.event.Resource resource = 1;</code>
   */
  public com.appdirect.event.ResourceOrBuilder getResourceOrBuilder() {
    return getResource();
  }

  public static final int COMPANYUUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object companyUuid_;
  /**
   * <code>optional string companyUuid = 2;</code>
   */
  public java.lang.String getCompanyUuid() {
    java.lang.Object ref = companyUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      companyUuid_ = s;
      return s;
    }
  }
  /**
   * <code>optional string companyUuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCompanyUuidBytes() {
    java.lang.Object ref = companyUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      companyUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPLICATIONUUID_FIELD_NUMBER = 3;
  private volatile java.lang.Object applicationUuid_;
  /**
   * <code>optional string applicationUuid = 3;</code>
   */
  public java.lang.String getApplicationUuid() {
    java.lang.Object ref = applicationUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      applicationUuid_ = s;
      return s;
    }
  }
  /**
   * <code>optional string applicationUuid = 3;</code>
   */
  public com.google.protobuf.ByteString
      getApplicationUuidBytes() {
    java.lang.Object ref = applicationUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      applicationUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTEGRATIONCONFIGURATIONID_FIELD_NUMBER = 4;
  private long integrationConfigurationId_;
  /**
   * <code>optional int64 integrationConfigurationId = 4;</code>
   */
  public long getIntegrationConfigurationId() {
    return integrationConfigurationId_;
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
    if (resource_ != null) {
      output.writeMessage(1, getResource());
    }
    if (!getCompanyUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, companyUuid_);
    }
    if (!getApplicationUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, applicationUuid_);
    }
    if (integrationConfigurationId_ != 0L) {
      output.writeInt64(4, integrationConfigurationId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResource());
    }
    if (!getCompanyUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, companyUuid_);
    }
    if (!getApplicationUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, applicationUuid_);
    }
    if (integrationConfigurationId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, integrationConfigurationId_);
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
    if (!(obj instanceof com.appdirect.event.Import)) {
      return super.equals(obj);
    }
    com.appdirect.event.Import other = (com.appdirect.event.Import) obj;

    boolean result = true;
    result = result && (hasResource() == other.hasResource());
    if (hasResource()) {
      result = result && getResource()
          .equals(other.getResource());
    }
    result = result && getCompanyUuid()
        .equals(other.getCompanyUuid());
    result = result && getApplicationUuid()
        .equals(other.getApplicationUuid());
    result = result && (getIntegrationConfigurationId()
        == other.getIntegrationConfigurationId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (37 * hash) + COMPANYUUID_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyUuid().hashCode();
    hash = (37 * hash) + APPLICATIONUUID_FIELD_NUMBER;
    hash = (53 * hash) + getApplicationUuid().hashCode();
    hash = (37 * hash) + INTEGRATIONCONFIGURATIONID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIntegrationConfigurationId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.Import parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.Import parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.Import parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.Import parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.Import parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.Import parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.Import parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.Import parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.Import parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.Import parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.Import prototype) {
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
   * Protobuf type {@code com.appdirect.event.Import}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.Import)
      com.appdirect.event.ImportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.ImportOuterClass.internal_static_com_appdirect_event_Import_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.ImportOuterClass.internal_static_com_appdirect_event_Import_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.Import.class, com.appdirect.event.Import.Builder.class);
    }

    // Construct using com.appdirect.event.Import.newBuilder()
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
      if (resourceBuilder_ == null) {
        resource_ = null;
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }
      companyUuid_ = "";

      applicationUuid_ = "";

      integrationConfigurationId_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appdirect.event.ImportOuterClass.internal_static_com_appdirect_event_Import_descriptor;
    }

    public com.appdirect.event.Import getDefaultInstanceForType() {
      return com.appdirect.event.Import.getDefaultInstance();
    }

    public com.appdirect.event.Import build() {
      com.appdirect.event.Import result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.Import buildPartial() {
      com.appdirect.event.Import result = new com.appdirect.event.Import(this);
      if (resourceBuilder_ == null) {
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
      }
      result.companyUuid_ = companyUuid_;
      result.applicationUuid_ = applicationUuid_;
      result.integrationConfigurationId_ = integrationConfigurationId_;
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
      if (other instanceof com.appdirect.event.Import) {
        return mergeFrom((com.appdirect.event.Import)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.Import other) {
      if (other == com.appdirect.event.Import.getDefaultInstance()) return this;
      if (other.hasResource()) {
        mergeResource(other.getResource());
      }
      if (!other.getCompanyUuid().isEmpty()) {
        companyUuid_ = other.companyUuid_;
        onChanged();
      }
      if (!other.getApplicationUuid().isEmpty()) {
        applicationUuid_ = other.applicationUuid_;
        onChanged();
      }
      if (other.getIntegrationConfigurationId() != 0L) {
        setIntegrationConfigurationId(other.getIntegrationConfigurationId());
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
      com.appdirect.event.Import parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.Import) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.Resource resource_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Resource, com.appdirect.event.Resource.Builder, com.appdirect.event.ResourceOrBuilder> resourceBuilder_;
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public boolean hasResource() {
      return resourceBuilder_ != null || resource_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public com.appdirect.event.Resource getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.appdirect.event.Resource.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public Builder setResource(com.appdirect.event.Resource value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
        onChanged();
      } else {
        resourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public Builder setResource(
        com.appdirect.event.Resource.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
        onChanged();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public Builder mergeResource(com.appdirect.event.Resource value) {
      if (resourceBuilder_ == null) {
        if (resource_ != null) {
          resource_ =
            com.appdirect.event.Resource.newBuilder(resource_).mergeFrom(value).buildPartial();
        } else {
          resource_ = value;
        }
        onChanged();
      } else {
        resourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        resource_ = null;
        onChanged();
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public com.appdirect.event.Resource.Builder getResourceBuilder() {
      
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public com.appdirect.event.ResourceOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            com.appdirect.event.Resource.getDefaultInstance() : resource_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Resource, com.appdirect.event.Resource.Builder, com.appdirect.event.ResourceOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.Resource, com.appdirect.event.Resource.Builder, com.appdirect.event.ResourceOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
    }

    private java.lang.Object companyUuid_ = "";
    /**
     * <code>optional string companyUuid = 2;</code>
     */
    public java.lang.String getCompanyUuid() {
      java.lang.Object ref = companyUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        companyUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string companyUuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCompanyUuidBytes() {
      java.lang.Object ref = companyUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        companyUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string companyUuid = 2;</code>
     */
    public Builder setCompanyUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      companyUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string companyUuid = 2;</code>
     */
    public Builder clearCompanyUuid() {
      
      companyUuid_ = getDefaultInstance().getCompanyUuid();
      onChanged();
      return this;
    }
    /**
     * <code>optional string companyUuid = 2;</code>
     */
    public Builder setCompanyUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      companyUuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object applicationUuid_ = "";
    /**
     * <code>optional string applicationUuid = 3;</code>
     */
    public java.lang.String getApplicationUuid() {
      java.lang.Object ref = applicationUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        applicationUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string applicationUuid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getApplicationUuidBytes() {
      java.lang.Object ref = applicationUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        applicationUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string applicationUuid = 3;</code>
     */
    public Builder setApplicationUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      applicationUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string applicationUuid = 3;</code>
     */
    public Builder clearApplicationUuid() {
      
      applicationUuid_ = getDefaultInstance().getApplicationUuid();
      onChanged();
      return this;
    }
    /**
     * <code>optional string applicationUuid = 3;</code>
     */
    public Builder setApplicationUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      applicationUuid_ = value;
      onChanged();
      return this;
    }

    private long integrationConfigurationId_ ;
    /**
     * <code>optional int64 integrationConfigurationId = 4;</code>
     */
    public long getIntegrationConfigurationId() {
      return integrationConfigurationId_;
    }
    /**
     * <code>optional int64 integrationConfigurationId = 4;</code>
     */
    public Builder setIntegrationConfigurationId(long value) {
      
      integrationConfigurationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 integrationConfigurationId = 4;</code>
     */
    public Builder clearIntegrationConfigurationId() {
      
      integrationConfigurationId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.Import)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.Import)
  private static final com.appdirect.event.Import DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.Import();
  }

  public static com.appdirect.event.Import getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Import>
      PARSER = new com.google.protobuf.AbstractParser<Import>() {
    public Import parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Import(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Import> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Import> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.Import getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

