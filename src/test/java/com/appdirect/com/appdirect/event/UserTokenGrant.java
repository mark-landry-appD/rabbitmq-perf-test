// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userTokenGrant.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.UserTokenGrant}
 */
public  final class UserTokenGrant extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.UserTokenGrant)
    UserTokenGrantOrBuilder {
  // Use UserTokenGrant.newBuilder() to construct.
  private UserTokenGrant(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserTokenGrant() {
    clientId_ = "";
    companyId_ = "";
    userId_ = "";
    grantId_ = "";
    tenant_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UserTokenGrant(
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

            companyId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            userId_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            grantId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            tenant_ = s;
            break;
          }
          case 50: {
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              parameters_ = com.google.protobuf.MapField.newMapField(
                  ParametersDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000020;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            parameters__ = input.readMessage(
                ParametersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            parameters_.getMutableMap().put(
                parameters__.getKey(), parameters__.getValue());
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
    return com.appdirect.event.UserTokenGrantOuterClass.internal_static_com_appdirect_event_UserTokenGrant_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 6:
        return internalGetParameters();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.UserTokenGrantOuterClass.internal_static_com_appdirect_event_UserTokenGrant_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.UserTokenGrant.class, com.appdirect.event.UserTokenGrant.Builder.class);
  }

  private int bitField0_;
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

  public static final int COMPANYID_FIELD_NUMBER = 2;
  private volatile java.lang.Object companyId_;
  /**
   * <code>optional string companyId = 2;</code>
   */
  public java.lang.String getCompanyId() {
    java.lang.Object ref = companyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      companyId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string companyId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCompanyIdBytes() {
    java.lang.Object ref = companyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      companyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERID_FIELD_NUMBER = 3;
  private volatile java.lang.Object userId_;
  /**
   * <code>optional string userId = 3;</code>
   */
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string userId = 3;</code>
   */
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GRANTID_FIELD_NUMBER = 4;
  private volatile java.lang.Object grantId_;
  /**
   * <code>optional string grantId = 4;</code>
   */
  public java.lang.String getGrantId() {
    java.lang.Object ref = grantId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      grantId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string grantId = 4;</code>
   */
  public com.google.protobuf.ByteString
      getGrantIdBytes() {
    java.lang.Object ref = grantId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      grantId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TENANT_FIELD_NUMBER = 5;
  private volatile java.lang.Object tenant_;
  /**
   * <code>optional string tenant = 5;</code>
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
   * <code>optional string tenant = 5;</code>
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

  public static final int PARAMETERS_FIELD_NUMBER = 6;
  private static final class ParametersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.appdirect.event.UserTokenGrantOuterClass.internal_static_com_appdirect_event_UserTokenGrant_ParametersEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> parameters_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetParameters() {
    if (parameters_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ParametersDefaultEntryHolder.defaultEntry);
    }
    return parameters_;
  }

  public int getParametersCount() {
    return internalGetParameters().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; parameters = 6;</code>
   */

  public boolean containsParameters(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetParameters().getMap().containsKey(key);
  }
  /**
   * Use {@link #getParametersMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getParameters() {
    return getParametersMap();
  }
  /**
   * <code>map&lt;string, string&gt; parameters = 6;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getParametersMap() {
    return internalGetParameters().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; parameters = 6;</code>
   */

  public java.lang.String getParametersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetParameters().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; parameters = 6;</code>
   */

  public java.lang.String getParametersOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetParameters().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getCompanyIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, companyId_);
    }
    if (!getUserIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userId_);
    }
    if (!getGrantIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, grantId_);
    }
    if (!getTenantBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, tenant_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetParameters(),
        ParametersDefaultEntryHolder.defaultEntry,
        6);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClientIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    if (!getCompanyIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, companyId_);
    }
    if (!getUserIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userId_);
    }
    if (!getGrantIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, grantId_);
    }
    if (!getTenantBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, tenant_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetParameters().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      parameters__ = ParametersDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, parameters__);
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
    if (!(obj instanceof com.appdirect.event.UserTokenGrant)) {
      return super.equals(obj);
    }
    com.appdirect.event.UserTokenGrant other = (com.appdirect.event.UserTokenGrant) obj;

    boolean result = true;
    result = result && getClientId()
        .equals(other.getClientId());
    result = result && getCompanyId()
        .equals(other.getCompanyId());
    result = result && getUserId()
        .equals(other.getUserId());
    result = result && getGrantId()
        .equals(other.getGrantId());
    result = result && getTenant()
        .equals(other.getTenant());
    result = result && internalGetParameters().equals(
        other.internalGetParameters());
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
    hash = (37 * hash) + COMPANYID_FIELD_NUMBER;
    hash = (53 * hash) + getCompanyId().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + GRANTID_FIELD_NUMBER;
    hash = (53 * hash) + getGrantId().hashCode();
    hash = (37 * hash) + TENANT_FIELD_NUMBER;
    hash = (53 * hash) + getTenant().hashCode();
    if (!internalGetParameters().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParameters().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.UserTokenGrant parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.UserTokenGrant parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.UserTokenGrant parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.UserTokenGrant parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.UserTokenGrant parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.UserTokenGrant parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.UserTokenGrant parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.UserTokenGrant parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.UserTokenGrant parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.UserTokenGrant parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.UserTokenGrant prototype) {
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
   * Protobuf type {@code com.appdirect.event.UserTokenGrant}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.UserTokenGrant)
      com.appdirect.event.UserTokenGrantOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.UserTokenGrantOuterClass.internal_static_com_appdirect_event_UserTokenGrant_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetParameters();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 6:
          return internalGetMutableParameters();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.UserTokenGrantOuterClass.internal_static_com_appdirect_event_UserTokenGrant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.UserTokenGrant.class, com.appdirect.event.UserTokenGrant.Builder.class);
    }

    // Construct using com.appdirect.event.UserTokenGrant.newBuilder()
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

      companyId_ = "";

      userId_ = "";

      grantId_ = "";

      tenant_ = "";

      internalGetMutableParameters().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appdirect.event.UserTokenGrantOuterClass.internal_static_com_appdirect_event_UserTokenGrant_descriptor;
    }

    public com.appdirect.event.UserTokenGrant getDefaultInstanceForType() {
      return com.appdirect.event.UserTokenGrant.getDefaultInstance();
    }

    public com.appdirect.event.UserTokenGrant build() {
      com.appdirect.event.UserTokenGrant result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.UserTokenGrant buildPartial() {
      com.appdirect.event.UserTokenGrant result = new com.appdirect.event.UserTokenGrant(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.clientId_ = clientId_;
      result.companyId_ = companyId_;
      result.userId_ = userId_;
      result.grantId_ = grantId_;
      result.tenant_ = tenant_;
      result.parameters_ = internalGetParameters();
      result.parameters_.makeImmutable();
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.appdirect.event.UserTokenGrant) {
        return mergeFrom((com.appdirect.event.UserTokenGrant)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.UserTokenGrant other) {
      if (other == com.appdirect.event.UserTokenGrant.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        onChanged();
      }
      if (!other.getCompanyId().isEmpty()) {
        companyId_ = other.companyId_;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        onChanged();
      }
      if (!other.getGrantId().isEmpty()) {
        grantId_ = other.grantId_;
        onChanged();
      }
      if (!other.getTenant().isEmpty()) {
        tenant_ = other.tenant_;
        onChanged();
      }
      internalGetMutableParameters().mergeFrom(
          other.internalGetParameters());
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
      com.appdirect.event.UserTokenGrant parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.UserTokenGrant) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private java.lang.Object companyId_ = "";
    /**
     * <code>optional string companyId = 2;</code>
     */
    public java.lang.String getCompanyId() {
      java.lang.Object ref = companyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        companyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string companyId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCompanyIdBytes() {
      java.lang.Object ref = companyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        companyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string companyId = 2;</code>
     */
    public Builder setCompanyId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      companyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string companyId = 2;</code>
     */
    public Builder clearCompanyId() {
      
      companyId_ = getDefaultInstance().getCompanyId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string companyId = 2;</code>
     */
    public Builder setCompanyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      companyId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>optional string userId = 3;</code>
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string userId = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string userId = 3;</code>
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string userId = 3;</code>
     */
    public Builder clearUserId() {
      
      userId_ = getDefaultInstance().getUserId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string userId = 3;</code>
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object grantId_ = "";
    /**
     * <code>optional string grantId = 4;</code>
     */
    public java.lang.String getGrantId() {
      java.lang.Object ref = grantId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        grantId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string grantId = 4;</code>
     */
    public com.google.protobuf.ByteString
        getGrantIdBytes() {
      java.lang.Object ref = grantId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        grantId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string grantId = 4;</code>
     */
    public Builder setGrantId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      grantId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string grantId = 4;</code>
     */
    public Builder clearGrantId() {
      
      grantId_ = getDefaultInstance().getGrantId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string grantId = 4;</code>
     */
    public Builder setGrantIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      grantId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object tenant_ = "";
    /**
     * <code>optional string tenant = 5;</code>
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
     * <code>optional string tenant = 5;</code>
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
     * <code>optional string tenant = 5;</code>
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
     * <code>optional string tenant = 5;</code>
     */
    public Builder clearTenant() {
      
      tenant_ = getDefaultInstance().getTenant();
      onChanged();
      return this;
    }
    /**
     * <code>optional string tenant = 5;</code>
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

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> parameters_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetParameters() {
      if (parameters_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParametersDefaultEntryHolder.defaultEntry);
      }
      return parameters_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableParameters() {
      onChanged();;
      if (parameters_ == null) {
        parameters_ = com.google.protobuf.MapField.newMapField(
            ParametersDefaultEntryHolder.defaultEntry);
      }
      if (!parameters_.isMutable()) {
        parameters_ = parameters_.copy();
      }
      return parameters_;
    }

    public int getParametersCount() {
      return internalGetParameters().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; parameters = 6;</code>
     */

    public boolean containsParameters(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetParameters().getMap().containsKey(key);
    }
    /**
     * Use {@link #getParametersMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getParameters() {
      return getParametersMap();
    }
    /**
     * <code>map&lt;string, string&gt; parameters = 6;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getParametersMap() {
      return internalGetParameters().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; parameters = 6;</code>
     */

    public java.lang.String getParametersOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetParameters().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; parameters = 6;</code>
     */

    public java.lang.String getParametersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetParameters().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParameters() {
      getMutableParameters().clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; parameters = 6;</code>
     */

    public Builder removeParameters(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableParameters().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableParameters() {
      return internalGetMutableParameters().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; parameters = 6;</code>
     */
    public Builder putParameters(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      getMutableParameters().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; parameters = 6;</code>
     */

    public Builder putAllParameters(
        java.util.Map<java.lang.String, java.lang.String> values) {
      getMutableParameters().putAll(values);
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.UserTokenGrant)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.UserTokenGrant)
  private static final com.appdirect.event.UserTokenGrant DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.UserTokenGrant();
  }

  public static com.appdirect.event.UserTokenGrant getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserTokenGrant>
      PARSER = new com.google.protobuf.AbstractParser<UserTokenGrant>() {
    public UserTokenGrant parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserTokenGrant(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserTokenGrant> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserTokenGrant> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.UserTokenGrant getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

