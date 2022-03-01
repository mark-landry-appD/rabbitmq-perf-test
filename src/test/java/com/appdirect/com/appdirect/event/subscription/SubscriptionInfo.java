// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscription.lifecycle.proto

package com.appdirect.event.subscription;

/**
 * Protobuf type {@code com.appdirect.event.subscription.SubscriptionInfo}
 */
public  final class SubscriptionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.subscription.SubscriptionInfo)
    SubscriptionInfoOrBuilder {
  // Use SubscriptionInfo.newBuilder() to construct.
  private SubscriptionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubscriptionInfo() {
    subscriptionId_ = "";
    purchaseItemId_ = "";
    status_ = 0;
    allowMeteredUsage_ = false;
    developerId_ = "";
    developerAccountId_ = "";
    partner_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SubscriptionInfo(
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

            subscriptionId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            purchaseItemId_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 32: {

            allowMeteredUsage_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            developerId_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            developerAccountId_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            partner_ = s;
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
    return com.appdirect.event.subscription.SubscriptionLifecycle.internal_static_com_appdirect_event_subscription_SubscriptionInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.subscription.SubscriptionLifecycle.internal_static_com_appdirect_event_subscription_SubscriptionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.subscription.SubscriptionInfo.class, com.appdirect.event.subscription.SubscriptionInfo.Builder.class);
  }

  public static final int SUBSCRIPTIONID_FIELD_NUMBER = 1;
  private volatile java.lang.Object subscriptionId_;
  /**
   * <code>optional string subscriptionId = 1;</code>
   */
  public java.lang.String getSubscriptionId() {
    java.lang.Object ref = subscriptionId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscriptionId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string subscriptionId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSubscriptionIdBytes() {
    java.lang.Object ref = subscriptionId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subscriptionId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PURCHASEITEMID_FIELD_NUMBER = 2;
  private volatile java.lang.Object purchaseItemId_;
  /**
   * <code>optional string purchaseItemId = 2;</code>
   */
  public java.lang.String getPurchaseItemId() {
    java.lang.Object ref = purchaseItemId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      purchaseItemId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string purchaseItemId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getPurchaseItemIdBytes() {
    java.lang.Object ref = purchaseItemId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      purchaseItemId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>optional .com.appdirect.event.subscription.SubscriptionStatus status = 3;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .com.appdirect.event.subscription.SubscriptionStatus status = 3;</code>
   */
  public com.appdirect.event.subscription.SubscriptionStatus getStatus() {
    com.appdirect.event.subscription.SubscriptionStatus result = com.appdirect.event.subscription.SubscriptionStatus.valueOf(status_);
    return result == null ? com.appdirect.event.subscription.SubscriptionStatus.UNRECOGNIZED : result;
  }

  public static final int ALLOWMETEREDUSAGE_FIELD_NUMBER = 4;
  private boolean allowMeteredUsage_;
  /**
   * <code>optional bool allowMeteredUsage = 4;</code>
   */
  public boolean getAllowMeteredUsage() {
    return allowMeteredUsage_;
  }

  public static final int DEVELOPERID_FIELD_NUMBER = 5;
  private volatile java.lang.Object developerId_;
  /**
   * <code>optional string developerId = 5;</code>
   */
  public java.lang.String getDeveloperId() {
    java.lang.Object ref = developerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      developerId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string developerId = 5;</code>
   */
  public com.google.protobuf.ByteString
      getDeveloperIdBytes() {
    java.lang.Object ref = developerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      developerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVELOPERACCOUNTID_FIELD_NUMBER = 6;
  private volatile java.lang.Object developerAccountId_;
  /**
   * <code>optional string developerAccountId = 6;</code>
   */
  public java.lang.String getDeveloperAccountId() {
    java.lang.Object ref = developerAccountId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      developerAccountId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string developerAccountId = 6;</code>
   */
  public com.google.protobuf.ByteString
      getDeveloperAccountIdBytes() {
    java.lang.Object ref = developerAccountId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      developerAccountId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTNER_FIELD_NUMBER = 7;
  private volatile java.lang.Object partner_;
  /**
   * <code>optional string partner = 7;</code>
   */
  public java.lang.String getPartner() {
    java.lang.Object ref = partner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partner_ = s;
      return s;
    }
  }
  /**
   * <code>optional string partner = 7;</code>
   */
  public com.google.protobuf.ByteString
      getPartnerBytes() {
    java.lang.Object ref = partner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      partner_ = b;
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
    if (!getSubscriptionIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscriptionId_);
    }
    if (!getPurchaseItemIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, purchaseItemId_);
    }
    if (status_ != com.appdirect.event.subscription.SubscriptionStatus.INITIALIZED.getNumber()) {
      output.writeEnum(3, status_);
    }
    if (allowMeteredUsage_ != false) {
      output.writeBool(4, allowMeteredUsage_);
    }
    if (!getDeveloperIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, developerId_);
    }
    if (!getDeveloperAccountIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, developerAccountId_);
    }
    if (!getPartnerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, partner_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubscriptionIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscriptionId_);
    }
    if (!getPurchaseItemIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, purchaseItemId_);
    }
    if (status_ != com.appdirect.event.subscription.SubscriptionStatus.INITIALIZED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    if (allowMeteredUsage_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, allowMeteredUsage_);
    }
    if (!getDeveloperIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, developerId_);
    }
    if (!getDeveloperAccountIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, developerAccountId_);
    }
    if (!getPartnerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, partner_);
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
    if (!(obj instanceof com.appdirect.event.subscription.SubscriptionInfo)) {
      return super.equals(obj);
    }
    com.appdirect.event.subscription.SubscriptionInfo other = (com.appdirect.event.subscription.SubscriptionInfo) obj;

    boolean result = true;
    result = result && getSubscriptionId()
        .equals(other.getSubscriptionId());
    result = result && getPurchaseItemId()
        .equals(other.getPurchaseItemId());
    result = result && status_ == other.status_;
    result = result && (getAllowMeteredUsage()
        == other.getAllowMeteredUsage());
    result = result && getDeveloperId()
        .equals(other.getDeveloperId());
    result = result && getDeveloperAccountId()
        .equals(other.getDeveloperAccountId());
    result = result && getPartner()
        .equals(other.getPartner());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SUBSCRIPTIONID_FIELD_NUMBER;
    hash = (53 * hash) + getSubscriptionId().hashCode();
    hash = (37 * hash) + PURCHASEITEMID_FIELD_NUMBER;
    hash = (53 * hash) + getPurchaseItemId().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + ALLOWMETEREDUSAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllowMeteredUsage());
    hash = (37 * hash) + DEVELOPERID_FIELD_NUMBER;
    hash = (53 * hash) + getDeveloperId().hashCode();
    hash = (37 * hash) + DEVELOPERACCOUNTID_FIELD_NUMBER;
    hash = (53 * hash) + getDeveloperAccountId().hashCode();
    hash = (37 * hash) + PARTNER_FIELD_NUMBER;
    hash = (53 * hash) + getPartner().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.subscription.SubscriptionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.subscription.SubscriptionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.subscription.SubscriptionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.subscription.SubscriptionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.subscription.SubscriptionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.subscription.SubscriptionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.subscription.SubscriptionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.subscription.SubscriptionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.subscription.SubscriptionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.subscription.SubscriptionInfo parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.subscription.SubscriptionInfo prototype) {
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
   * Protobuf type {@code com.appdirect.event.subscription.SubscriptionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.subscription.SubscriptionInfo)
      com.appdirect.event.subscription.SubscriptionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.subscription.SubscriptionLifecycle.internal_static_com_appdirect_event_subscription_SubscriptionInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.subscription.SubscriptionLifecycle.internal_static_com_appdirect_event_subscription_SubscriptionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.subscription.SubscriptionInfo.class, com.appdirect.event.subscription.SubscriptionInfo.Builder.class);
    }

    // Construct using com.appdirect.event.subscription.SubscriptionInfo.newBuilder()
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
      subscriptionId_ = "";

      purchaseItemId_ = "";

      status_ = 0;

      allowMeteredUsage_ = false;

      developerId_ = "";

      developerAccountId_ = "";

      partner_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appdirect.event.subscription.SubscriptionLifecycle.internal_static_com_appdirect_event_subscription_SubscriptionInfo_descriptor;
    }

    public com.appdirect.event.subscription.SubscriptionInfo getDefaultInstanceForType() {
      return com.appdirect.event.subscription.SubscriptionInfo.getDefaultInstance();
    }

    public com.appdirect.event.subscription.SubscriptionInfo build() {
      com.appdirect.event.subscription.SubscriptionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.subscription.SubscriptionInfo buildPartial() {
      com.appdirect.event.subscription.SubscriptionInfo result = new com.appdirect.event.subscription.SubscriptionInfo(this);
      result.subscriptionId_ = subscriptionId_;
      result.purchaseItemId_ = purchaseItemId_;
      result.status_ = status_;
      result.allowMeteredUsage_ = allowMeteredUsage_;
      result.developerId_ = developerId_;
      result.developerAccountId_ = developerAccountId_;
      result.partner_ = partner_;
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
      if (other instanceof com.appdirect.event.subscription.SubscriptionInfo) {
        return mergeFrom((com.appdirect.event.subscription.SubscriptionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.subscription.SubscriptionInfo other) {
      if (other == com.appdirect.event.subscription.SubscriptionInfo.getDefaultInstance()) return this;
      if (!other.getSubscriptionId().isEmpty()) {
        subscriptionId_ = other.subscriptionId_;
        onChanged();
      }
      if (!other.getPurchaseItemId().isEmpty()) {
        purchaseItemId_ = other.purchaseItemId_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.getAllowMeteredUsage() != false) {
        setAllowMeteredUsage(other.getAllowMeteredUsage());
      }
      if (!other.getDeveloperId().isEmpty()) {
        developerId_ = other.developerId_;
        onChanged();
      }
      if (!other.getDeveloperAccountId().isEmpty()) {
        developerAccountId_ = other.developerAccountId_;
        onChanged();
      }
      if (!other.getPartner().isEmpty()) {
        partner_ = other.partner_;
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
      com.appdirect.event.subscription.SubscriptionInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.subscription.SubscriptionInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object subscriptionId_ = "";
    /**
     * <code>optional string subscriptionId = 1;</code>
     */
    public java.lang.String getSubscriptionId() {
      java.lang.Object ref = subscriptionId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscriptionId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string subscriptionId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSubscriptionIdBytes() {
      java.lang.Object ref = subscriptionId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subscriptionId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string subscriptionId = 1;</code>
     */
    public Builder setSubscriptionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subscriptionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string subscriptionId = 1;</code>
     */
    public Builder clearSubscriptionId() {
      
      subscriptionId_ = getDefaultInstance().getSubscriptionId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string subscriptionId = 1;</code>
     */
    public Builder setSubscriptionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subscriptionId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object purchaseItemId_ = "";
    /**
     * <code>optional string purchaseItemId = 2;</code>
     */
    public java.lang.String getPurchaseItemId() {
      java.lang.Object ref = purchaseItemId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        purchaseItemId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string purchaseItemId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPurchaseItemIdBytes() {
      java.lang.Object ref = purchaseItemId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        purchaseItemId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string purchaseItemId = 2;</code>
     */
    public Builder setPurchaseItemId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      purchaseItemId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string purchaseItemId = 2;</code>
     */
    public Builder clearPurchaseItemId() {
      
      purchaseItemId_ = getDefaultInstance().getPurchaseItemId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string purchaseItemId = 2;</code>
     */
    public Builder setPurchaseItemIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      purchaseItemId_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .com.appdirect.event.subscription.SubscriptionStatus status = 3;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .com.appdirect.event.subscription.SubscriptionStatus status = 3;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.appdirect.event.subscription.SubscriptionStatus status = 3;</code>
     */
    public com.appdirect.event.subscription.SubscriptionStatus getStatus() {
      com.appdirect.event.subscription.SubscriptionStatus result = com.appdirect.event.subscription.SubscriptionStatus.valueOf(status_);
      return result == null ? com.appdirect.event.subscription.SubscriptionStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .com.appdirect.event.subscription.SubscriptionStatus status = 3;</code>
     */
    public Builder setStatus(com.appdirect.event.subscription.SubscriptionStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.appdirect.event.subscription.SubscriptionStatus status = 3;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private boolean allowMeteredUsage_ ;
    /**
     * <code>optional bool allowMeteredUsage = 4;</code>
     */
    public boolean getAllowMeteredUsage() {
      return allowMeteredUsage_;
    }
    /**
     * <code>optional bool allowMeteredUsage = 4;</code>
     */
    public Builder setAllowMeteredUsage(boolean value) {
      
      allowMeteredUsage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool allowMeteredUsage = 4;</code>
     */
    public Builder clearAllowMeteredUsage() {
      
      allowMeteredUsage_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object developerId_ = "";
    /**
     * <code>optional string developerId = 5;</code>
     */
    public java.lang.String getDeveloperId() {
      java.lang.Object ref = developerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        developerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string developerId = 5;</code>
     */
    public com.google.protobuf.ByteString
        getDeveloperIdBytes() {
      java.lang.Object ref = developerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        developerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string developerId = 5;</code>
     */
    public Builder setDeveloperId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      developerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string developerId = 5;</code>
     */
    public Builder clearDeveloperId() {
      
      developerId_ = getDefaultInstance().getDeveloperId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string developerId = 5;</code>
     */
    public Builder setDeveloperIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      developerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object developerAccountId_ = "";
    /**
     * <code>optional string developerAccountId = 6;</code>
     */
    public java.lang.String getDeveloperAccountId() {
      java.lang.Object ref = developerAccountId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        developerAccountId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string developerAccountId = 6;</code>
     */
    public com.google.protobuf.ByteString
        getDeveloperAccountIdBytes() {
      java.lang.Object ref = developerAccountId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        developerAccountId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string developerAccountId = 6;</code>
     */
    public Builder setDeveloperAccountId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      developerAccountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string developerAccountId = 6;</code>
     */
    public Builder clearDeveloperAccountId() {
      
      developerAccountId_ = getDefaultInstance().getDeveloperAccountId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string developerAccountId = 6;</code>
     */
    public Builder setDeveloperAccountIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      developerAccountId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object partner_ = "";
    /**
     * <code>optional string partner = 7;</code>
     */
    public java.lang.String getPartner() {
      java.lang.Object ref = partner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string partner = 7;</code>
     */
    public com.google.protobuf.ByteString
        getPartnerBytes() {
      java.lang.Object ref = partner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string partner = 7;</code>
     */
    public Builder setPartner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      partner_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string partner = 7;</code>
     */
    public Builder clearPartner() {
      
      partner_ = getDefaultInstance().getPartner();
      onChanged();
      return this;
    }
    /**
     * <code>optional string partner = 7;</code>
     */
    public Builder setPartnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      partner_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.subscription.SubscriptionInfo)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.subscription.SubscriptionInfo)
  private static final com.appdirect.event.subscription.SubscriptionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.subscription.SubscriptionInfo();
  }

  public static com.appdirect.event.subscription.SubscriptionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscriptionInfo>
      PARSER = new com.google.protobuf.AbstractParser<SubscriptionInfo>() {
    public SubscriptionInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubscriptionInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubscriptionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscriptionInfo> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.subscription.SubscriptionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

