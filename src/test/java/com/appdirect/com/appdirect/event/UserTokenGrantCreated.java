// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userTokenGrant.event.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.UserTokenGrantCreated}
 */
public  final class UserTokenGrantCreated extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.UserTokenGrantCreated)
    UserTokenGrantCreatedOrBuilder {
  // Use UserTokenGrantCreated.newBuilder() to construct.
  private UserTokenGrantCreated(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserTokenGrantCreated() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UserTokenGrantCreated(
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
            com.appdirect.event.UserTokenGrant.Builder subBuilder = null;
            if (userTokenGrant_ != null) {
              subBuilder = userTokenGrant_.toBuilder();
            }
            userTokenGrant_ = input.readMessage(com.appdirect.event.UserTokenGrant.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userTokenGrant_);
              userTokenGrant_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.appdirect.event.Metadata.Builder subBuilder = null;
            if (metadata_ != null) {
              subBuilder = metadata_.toBuilder();
            }
            metadata_ = input.readMessage(com.appdirect.event.Metadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metadata_);
              metadata_ = subBuilder.buildPartial();
            }

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
    return com.appdirect.event.UserTokenGrantEvent.internal_static_com_appdirect_event_UserTokenGrantCreated_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.UserTokenGrantEvent.internal_static_com_appdirect_event_UserTokenGrantCreated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.UserTokenGrantCreated.class, com.appdirect.event.UserTokenGrantCreated.Builder.class);
  }

  public static final int USERTOKENGRANT_FIELD_NUMBER = 1;
  private com.appdirect.event.UserTokenGrant userTokenGrant_;
  /**
   * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
   */
  public boolean hasUserTokenGrant() {
    return userTokenGrant_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
   */
  public com.appdirect.event.UserTokenGrant getUserTokenGrant() {
    return userTokenGrant_ == null ? com.appdirect.event.UserTokenGrant.getDefaultInstance() : userTokenGrant_;
  }
  /**
   * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
   */
  public com.appdirect.event.UserTokenGrantOrBuilder getUserTokenGrantOrBuilder() {
    return getUserTokenGrant();
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.appdirect.event.Metadata metadata_;
  /**
   * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
   */
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
   */
  public com.appdirect.event.Metadata getMetadata() {
    return metadata_ == null ? com.appdirect.event.Metadata.getDefaultInstance() : metadata_;
  }
  /**
   * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
   */
  public com.appdirect.event.MetadataOrBuilder getMetadataOrBuilder() {
    return getMetadata();
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
    if (userTokenGrant_ != null) {
      output.writeMessage(1, getUserTokenGrant());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userTokenGrant_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserTokenGrant());
    }
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadata());
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
    if (!(obj instanceof com.appdirect.event.UserTokenGrantCreated)) {
      return super.equals(obj);
    }
    com.appdirect.event.UserTokenGrantCreated other = (com.appdirect.event.UserTokenGrantCreated) obj;

    boolean result = true;
    result = result && (hasUserTokenGrant() == other.hasUserTokenGrant());
    if (hasUserTokenGrant()) {
      result = result && getUserTokenGrant()
          .equals(other.getUserTokenGrant());
    }
    result = result && (hasMetadata() == other.hasMetadata());
    if (hasMetadata()) {
      result = result && getMetadata()
          .equals(other.getMetadata());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasUserTokenGrant()) {
      hash = (37 * hash) + USERTOKENGRANT_FIELD_NUMBER;
      hash = (53 * hash) + getUserTokenGrant().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.UserTokenGrantCreated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.UserTokenGrantCreated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.UserTokenGrantCreated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.UserTokenGrantCreated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.UserTokenGrantCreated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.UserTokenGrantCreated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.UserTokenGrantCreated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.UserTokenGrantCreated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.UserTokenGrantCreated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.UserTokenGrantCreated parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.UserTokenGrantCreated prototype) {
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
   * Protobuf type {@code com.appdirect.event.UserTokenGrantCreated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.UserTokenGrantCreated)
      com.appdirect.event.UserTokenGrantCreatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.UserTokenGrantEvent.internal_static_com_appdirect_event_UserTokenGrantCreated_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.UserTokenGrantEvent.internal_static_com_appdirect_event_UserTokenGrantCreated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.UserTokenGrantCreated.class, com.appdirect.event.UserTokenGrantCreated.Builder.class);
    }

    // Construct using com.appdirect.event.UserTokenGrantCreated.newBuilder()
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
      if (userTokenGrantBuilder_ == null) {
        userTokenGrant_ = null;
      } else {
        userTokenGrant_ = null;
        userTokenGrantBuilder_ = null;
      }
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appdirect.event.UserTokenGrantEvent.internal_static_com_appdirect_event_UserTokenGrantCreated_descriptor;
    }

    public com.appdirect.event.UserTokenGrantCreated getDefaultInstanceForType() {
      return com.appdirect.event.UserTokenGrantCreated.getDefaultInstance();
    }

    public com.appdirect.event.UserTokenGrantCreated build() {
      com.appdirect.event.UserTokenGrantCreated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.UserTokenGrantCreated buildPartial() {
      com.appdirect.event.UserTokenGrantCreated result = new com.appdirect.event.UserTokenGrantCreated(this);
      if (userTokenGrantBuilder_ == null) {
        result.userTokenGrant_ = userTokenGrant_;
      } else {
        result.userTokenGrant_ = userTokenGrantBuilder_.build();
      }
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
      }
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
      if (other instanceof com.appdirect.event.UserTokenGrantCreated) {
        return mergeFrom((com.appdirect.event.UserTokenGrantCreated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.UserTokenGrantCreated other) {
      if (other == com.appdirect.event.UserTokenGrantCreated.getDefaultInstance()) return this;
      if (other.hasUserTokenGrant()) {
        mergeUserTokenGrant(other.getUserTokenGrant());
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
      com.appdirect.event.UserTokenGrantCreated parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.UserTokenGrantCreated) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.UserTokenGrant userTokenGrant_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.UserTokenGrant, com.appdirect.event.UserTokenGrant.Builder, com.appdirect.event.UserTokenGrantOrBuilder> userTokenGrantBuilder_;
    /**
     * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
     */
    public boolean hasUserTokenGrant() {
      return userTokenGrantBuilder_ != null || userTokenGrant_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
     */
    public com.appdirect.event.UserTokenGrant getUserTokenGrant() {
      if (userTokenGrantBuilder_ == null) {
        return userTokenGrant_ == null ? com.appdirect.event.UserTokenGrant.getDefaultInstance() : userTokenGrant_;
      } else {
        return userTokenGrantBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
     */
    public Builder setUserTokenGrant(com.appdirect.event.UserTokenGrant value) {
      if (userTokenGrantBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userTokenGrant_ = value;
        onChanged();
      } else {
        userTokenGrantBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
     */
    public Builder setUserTokenGrant(
        com.appdirect.event.UserTokenGrant.Builder builderForValue) {
      if (userTokenGrantBuilder_ == null) {
        userTokenGrant_ = builderForValue.build();
        onChanged();
      } else {
        userTokenGrantBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
     */
    public Builder mergeUserTokenGrant(com.appdirect.event.UserTokenGrant value) {
      if (userTokenGrantBuilder_ == null) {
        if (userTokenGrant_ != null) {
          userTokenGrant_ =
            com.appdirect.event.UserTokenGrant.newBuilder(userTokenGrant_).mergeFrom(value).buildPartial();
        } else {
          userTokenGrant_ = value;
        }
        onChanged();
      } else {
        userTokenGrantBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
     */
    public Builder clearUserTokenGrant() {
      if (userTokenGrantBuilder_ == null) {
        userTokenGrant_ = null;
        onChanged();
      } else {
        userTokenGrant_ = null;
        userTokenGrantBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
     */
    public com.appdirect.event.UserTokenGrant.Builder getUserTokenGrantBuilder() {
      
      onChanged();
      return getUserTokenGrantFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
     */
    public com.appdirect.event.UserTokenGrantOrBuilder getUserTokenGrantOrBuilder() {
      if (userTokenGrantBuilder_ != null) {
        return userTokenGrantBuilder_.getMessageOrBuilder();
      } else {
        return userTokenGrant_ == null ?
            com.appdirect.event.UserTokenGrant.getDefaultInstance() : userTokenGrant_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.UserTokenGrant userTokenGrant = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.UserTokenGrant, com.appdirect.event.UserTokenGrant.Builder, com.appdirect.event.UserTokenGrantOrBuilder> 
        getUserTokenGrantFieldBuilder() {
      if (userTokenGrantBuilder_ == null) {
        userTokenGrantBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.UserTokenGrant, com.appdirect.event.UserTokenGrant.Builder, com.appdirect.event.UserTokenGrantOrBuilder>(
                getUserTokenGrant(),
                getParentForChildren(),
                isClean());
        userTokenGrant_ = null;
      }
      return userTokenGrantBuilder_;
    }

    private com.appdirect.event.Metadata metadata_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Metadata, com.appdirect.event.Metadata.Builder, com.appdirect.event.MetadataOrBuilder> metadataBuilder_;
    /**
     * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
     */
    public boolean hasMetadata() {
      return metadataBuilder_ != null || metadata_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
     */
    public com.appdirect.event.Metadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.appdirect.event.Metadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
     */
    public Builder setMetadata(com.appdirect.event.Metadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
     */
    public Builder setMetadata(
        com.appdirect.event.Metadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
     */
    public Builder mergeMetadata(com.appdirect.event.Metadata value) {
      if (metadataBuilder_ == null) {
        if (metadata_ != null) {
          metadata_ =
            com.appdirect.event.Metadata.newBuilder(metadata_).mergeFrom(value).buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
     */
    public com.appdirect.event.Metadata.Builder getMetadataBuilder() {
      
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
     */
    public com.appdirect.event.MetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.appdirect.event.Metadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Metadata, com.appdirect.event.Metadata.Builder, com.appdirect.event.MetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.Metadata, com.appdirect.event.Metadata.Builder, com.appdirect.event.MetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.UserTokenGrantCreated)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.UserTokenGrantCreated)
  private static final com.appdirect.event.UserTokenGrantCreated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.UserTokenGrantCreated();
  }

  public static com.appdirect.event.UserTokenGrantCreated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserTokenGrantCreated>
      PARSER = new com.google.protobuf.AbstractParser<UserTokenGrantCreated>() {
    public UserTokenGrantCreated parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserTokenGrantCreated(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserTokenGrantCreated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserTokenGrantCreated> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.UserTokenGrantCreated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

