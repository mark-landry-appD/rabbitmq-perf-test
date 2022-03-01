// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userMFASettings.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.SmsFactor}
 */
public  final class SmsFactor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.SmsFactor)
    SmsFactorOrBuilder {
  // Use SmsFactor.newBuilder() to construct.
  private SmsFactor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmsFactor() {
    primary_ = false;
    verified_ = false;
    smsNumber_ = "";
    smsVerificationToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SmsFactor(
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
          case 16: {

            primary_ = input.readBool();
            break;
          }
          case 24: {

            verified_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            smsNumber_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            smsVerificationToken_ = s;
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
    return com.appdirect.event.UserMFASettingsOuterClass.internal_static_com_appdirect_event_SmsFactor_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.UserMFASettingsOuterClass.internal_static_com_appdirect_event_SmsFactor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.SmsFactor.class, com.appdirect.event.SmsFactor.Builder.class);
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

  public static final int PRIMARY_FIELD_NUMBER = 2;
  private boolean primary_;
  /**
   * <code>optional bool primary = 2;</code>
   */
  public boolean getPrimary() {
    return primary_;
  }

  public static final int VERIFIED_FIELD_NUMBER = 3;
  private boolean verified_;
  /**
   * <code>optional bool verified = 3;</code>
   */
  public boolean getVerified() {
    return verified_;
  }

  public static final int SMSNUMBER_FIELD_NUMBER = 4;
  private volatile java.lang.Object smsNumber_;
  /**
   * <code>optional string smsNumber = 4;</code>
   */
  public java.lang.String getSmsNumber() {
    java.lang.Object ref = smsNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      smsNumber_ = s;
      return s;
    }
  }
  /**
   * <code>optional string smsNumber = 4;</code>
   */
  public com.google.protobuf.ByteString
      getSmsNumberBytes() {
    java.lang.Object ref = smsNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      smsNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SMSVERIFICATIONTOKEN_FIELD_NUMBER = 5;
  private volatile java.lang.Object smsVerificationToken_;
  /**
   * <code>optional string smsVerificationToken = 5;</code>
   */
  public java.lang.String getSmsVerificationToken() {
    java.lang.Object ref = smsVerificationToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      smsVerificationToken_ = s;
      return s;
    }
  }
  /**
   * <code>optional string smsVerificationToken = 5;</code>
   */
  public com.google.protobuf.ByteString
      getSmsVerificationTokenBytes() {
    java.lang.Object ref = smsVerificationToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      smsVerificationToken_ = b;
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
    if (resource_ != null) {
      output.writeMessage(1, getResource());
    }
    if (primary_ != false) {
      output.writeBool(2, primary_);
    }
    if (verified_ != false) {
      output.writeBool(3, verified_);
    }
    if (!getSmsNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, smsNumber_);
    }
    if (!getSmsVerificationTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, smsVerificationToken_);
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
    if (primary_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, primary_);
    }
    if (verified_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, verified_);
    }
    if (!getSmsNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, smsNumber_);
    }
    if (!getSmsVerificationTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, smsVerificationToken_);
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
    if (!(obj instanceof com.appdirect.event.SmsFactor)) {
      return super.equals(obj);
    }
    com.appdirect.event.SmsFactor other = (com.appdirect.event.SmsFactor) obj;

    boolean result = true;
    result = result && (hasResource() == other.hasResource());
    if (hasResource()) {
      result = result && getResource()
          .equals(other.getResource());
    }
    result = result && (getPrimary()
        == other.getPrimary());
    result = result && (getVerified()
        == other.getVerified());
    result = result && getSmsNumber()
        .equals(other.getSmsNumber());
    result = result && getSmsVerificationToken()
        .equals(other.getSmsVerificationToken());
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
    hash = (37 * hash) + PRIMARY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPrimary());
    hash = (37 * hash) + VERIFIED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getVerified());
    hash = (37 * hash) + SMSNUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getSmsNumber().hashCode();
    hash = (37 * hash) + SMSVERIFICATIONTOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getSmsVerificationToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.SmsFactor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.SmsFactor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.SmsFactor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.SmsFactor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.SmsFactor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.SmsFactor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.SmsFactor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.SmsFactor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.SmsFactor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.SmsFactor parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.SmsFactor prototype) {
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
   * Protobuf type {@code com.appdirect.event.SmsFactor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.SmsFactor)
      com.appdirect.event.SmsFactorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.UserMFASettingsOuterClass.internal_static_com_appdirect_event_SmsFactor_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.UserMFASettingsOuterClass.internal_static_com_appdirect_event_SmsFactor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.SmsFactor.class, com.appdirect.event.SmsFactor.Builder.class);
    }

    // Construct using com.appdirect.event.SmsFactor.newBuilder()
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
      primary_ = false;

      verified_ = false;

      smsNumber_ = "";

      smsVerificationToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appdirect.event.UserMFASettingsOuterClass.internal_static_com_appdirect_event_SmsFactor_descriptor;
    }

    public com.appdirect.event.SmsFactor getDefaultInstanceForType() {
      return com.appdirect.event.SmsFactor.getDefaultInstance();
    }

    public com.appdirect.event.SmsFactor build() {
      com.appdirect.event.SmsFactor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.SmsFactor buildPartial() {
      com.appdirect.event.SmsFactor result = new com.appdirect.event.SmsFactor(this);
      if (resourceBuilder_ == null) {
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
      }
      result.primary_ = primary_;
      result.verified_ = verified_;
      result.smsNumber_ = smsNumber_;
      result.smsVerificationToken_ = smsVerificationToken_;
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
      if (other instanceof com.appdirect.event.SmsFactor) {
        return mergeFrom((com.appdirect.event.SmsFactor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.SmsFactor other) {
      if (other == com.appdirect.event.SmsFactor.getDefaultInstance()) return this;
      if (other.hasResource()) {
        mergeResource(other.getResource());
      }
      if (other.getPrimary() != false) {
        setPrimary(other.getPrimary());
      }
      if (other.getVerified() != false) {
        setVerified(other.getVerified());
      }
      if (!other.getSmsNumber().isEmpty()) {
        smsNumber_ = other.smsNumber_;
        onChanged();
      }
      if (!other.getSmsVerificationToken().isEmpty()) {
        smsVerificationToken_ = other.smsVerificationToken_;
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
      com.appdirect.event.SmsFactor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.SmsFactor) e.getUnfinishedMessage();
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

    private boolean primary_ ;
    /**
     * <code>optional bool primary = 2;</code>
     */
    public boolean getPrimary() {
      return primary_;
    }
    /**
     * <code>optional bool primary = 2;</code>
     */
    public Builder setPrimary(boolean value) {
      
      primary_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool primary = 2;</code>
     */
    public Builder clearPrimary() {
      
      primary_ = false;
      onChanged();
      return this;
    }

    private boolean verified_ ;
    /**
     * <code>optional bool verified = 3;</code>
     */
    public boolean getVerified() {
      return verified_;
    }
    /**
     * <code>optional bool verified = 3;</code>
     */
    public Builder setVerified(boolean value) {
      
      verified_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool verified = 3;</code>
     */
    public Builder clearVerified() {
      
      verified_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object smsNumber_ = "";
    /**
     * <code>optional string smsNumber = 4;</code>
     */
    public java.lang.String getSmsNumber() {
      java.lang.Object ref = smsNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        smsNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string smsNumber = 4;</code>
     */
    public com.google.protobuf.ByteString
        getSmsNumberBytes() {
      java.lang.Object ref = smsNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        smsNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string smsNumber = 4;</code>
     */
    public Builder setSmsNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      smsNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string smsNumber = 4;</code>
     */
    public Builder clearSmsNumber() {
      
      smsNumber_ = getDefaultInstance().getSmsNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional string smsNumber = 4;</code>
     */
    public Builder setSmsNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      smsNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object smsVerificationToken_ = "";
    /**
     * <code>optional string smsVerificationToken = 5;</code>
     */
    public java.lang.String getSmsVerificationToken() {
      java.lang.Object ref = smsVerificationToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        smsVerificationToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string smsVerificationToken = 5;</code>
     */
    public com.google.protobuf.ByteString
        getSmsVerificationTokenBytes() {
      java.lang.Object ref = smsVerificationToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        smsVerificationToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string smsVerificationToken = 5;</code>
     */
    public Builder setSmsVerificationToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      smsVerificationToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string smsVerificationToken = 5;</code>
     */
    public Builder clearSmsVerificationToken() {
      
      smsVerificationToken_ = getDefaultInstance().getSmsVerificationToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string smsVerificationToken = 5;</code>
     */
    public Builder setSmsVerificationTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      smsVerificationToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.SmsFactor)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.SmsFactor)
  private static final com.appdirect.event.SmsFactor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.SmsFactor();
  }

  public static com.appdirect.event.SmsFactor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmsFactor>
      PARSER = new com.google.protobuf.AbstractParser<SmsFactor>() {
    public SmsFactor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SmsFactor(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SmsFactor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmsFactor> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.SmsFactor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

