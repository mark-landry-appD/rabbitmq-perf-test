// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: merchandisingBadge.event.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.MerchandisingBadgeUpdated}
 */
public  final class MerchandisingBadgeUpdated extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.MerchandisingBadgeUpdated)
    MerchandisingBadgeUpdatedOrBuilder {
  // Use MerchandisingBadgeUpdated.newBuilder() to construct.
  private MerchandisingBadgeUpdated(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MerchandisingBadgeUpdated() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MerchandisingBadgeUpdated(
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
            com.appdirect.event.MerchandisingBadge.Builder subBuilder = null;
            if (merchandisingBadge_ != null) {
              subBuilder = merchandisingBadge_.toBuilder();
            }
            merchandisingBadge_ = input.readMessage(com.appdirect.event.MerchandisingBadge.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(merchandisingBadge_);
              merchandisingBadge_ = subBuilder.buildPartial();
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
    return com.appdirect.event.MerchandisingBadgeEvent.internal_static_com_appdirect_event_MerchandisingBadgeUpdated_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.MerchandisingBadgeEvent.internal_static_com_appdirect_event_MerchandisingBadgeUpdated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.MerchandisingBadgeUpdated.class, com.appdirect.event.MerchandisingBadgeUpdated.Builder.class);
  }

  public static final int MERCHANDISINGBADGE_FIELD_NUMBER = 1;
  private com.appdirect.event.MerchandisingBadge merchandisingBadge_;
  /**
   * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
   */
  public boolean hasMerchandisingBadge() {
    return merchandisingBadge_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
   */
  public com.appdirect.event.MerchandisingBadge getMerchandisingBadge() {
    return merchandisingBadge_ == null ? com.appdirect.event.MerchandisingBadge.getDefaultInstance() : merchandisingBadge_;
  }
  /**
   * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
   */
  public com.appdirect.event.MerchandisingBadgeOrBuilder getMerchandisingBadgeOrBuilder() {
    return getMerchandisingBadge();
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
    if (merchandisingBadge_ != null) {
      output.writeMessage(1, getMerchandisingBadge());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (merchandisingBadge_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMerchandisingBadge());
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
    if (!(obj instanceof com.appdirect.event.MerchandisingBadgeUpdated)) {
      return super.equals(obj);
    }
    com.appdirect.event.MerchandisingBadgeUpdated other = (com.appdirect.event.MerchandisingBadgeUpdated) obj;

    boolean result = true;
    result = result && (hasMerchandisingBadge() == other.hasMerchandisingBadge());
    if (hasMerchandisingBadge()) {
      result = result && getMerchandisingBadge()
          .equals(other.getMerchandisingBadge());
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
    if (hasMerchandisingBadge()) {
      hash = (37 * hash) + MERCHANDISINGBADGE_FIELD_NUMBER;
      hash = (53 * hash) + getMerchandisingBadge().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.MerchandisingBadgeUpdated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.MerchandisingBadgeUpdated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.MerchandisingBadgeUpdated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.MerchandisingBadgeUpdated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.MerchandisingBadgeUpdated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.MerchandisingBadgeUpdated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.MerchandisingBadgeUpdated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.MerchandisingBadgeUpdated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.MerchandisingBadgeUpdated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.MerchandisingBadgeUpdated parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.MerchandisingBadgeUpdated prototype) {
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
   * Protobuf type {@code com.appdirect.event.MerchandisingBadgeUpdated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.MerchandisingBadgeUpdated)
      com.appdirect.event.MerchandisingBadgeUpdatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.MerchandisingBadgeEvent.internal_static_com_appdirect_event_MerchandisingBadgeUpdated_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.MerchandisingBadgeEvent.internal_static_com_appdirect_event_MerchandisingBadgeUpdated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.MerchandisingBadgeUpdated.class, com.appdirect.event.MerchandisingBadgeUpdated.Builder.class);
    }

    // Construct using com.appdirect.event.MerchandisingBadgeUpdated.newBuilder()
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
      if (merchandisingBadgeBuilder_ == null) {
        merchandisingBadge_ = null;
      } else {
        merchandisingBadge_ = null;
        merchandisingBadgeBuilder_ = null;
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
      return com.appdirect.event.MerchandisingBadgeEvent.internal_static_com_appdirect_event_MerchandisingBadgeUpdated_descriptor;
    }

    public com.appdirect.event.MerchandisingBadgeUpdated getDefaultInstanceForType() {
      return com.appdirect.event.MerchandisingBadgeUpdated.getDefaultInstance();
    }

    public com.appdirect.event.MerchandisingBadgeUpdated build() {
      com.appdirect.event.MerchandisingBadgeUpdated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.MerchandisingBadgeUpdated buildPartial() {
      com.appdirect.event.MerchandisingBadgeUpdated result = new com.appdirect.event.MerchandisingBadgeUpdated(this);
      if (merchandisingBadgeBuilder_ == null) {
        result.merchandisingBadge_ = merchandisingBadge_;
      } else {
        result.merchandisingBadge_ = merchandisingBadgeBuilder_.build();
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
      if (other instanceof com.appdirect.event.MerchandisingBadgeUpdated) {
        return mergeFrom((com.appdirect.event.MerchandisingBadgeUpdated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.MerchandisingBadgeUpdated other) {
      if (other == com.appdirect.event.MerchandisingBadgeUpdated.getDefaultInstance()) return this;
      if (other.hasMerchandisingBadge()) {
        mergeMerchandisingBadge(other.getMerchandisingBadge());
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
      com.appdirect.event.MerchandisingBadgeUpdated parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.MerchandisingBadgeUpdated) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.MerchandisingBadge merchandisingBadge_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.MerchandisingBadge, com.appdirect.event.MerchandisingBadge.Builder, com.appdirect.event.MerchandisingBadgeOrBuilder> merchandisingBadgeBuilder_;
    /**
     * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
     */
    public boolean hasMerchandisingBadge() {
      return merchandisingBadgeBuilder_ != null || merchandisingBadge_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
     */
    public com.appdirect.event.MerchandisingBadge getMerchandisingBadge() {
      if (merchandisingBadgeBuilder_ == null) {
        return merchandisingBadge_ == null ? com.appdirect.event.MerchandisingBadge.getDefaultInstance() : merchandisingBadge_;
      } else {
        return merchandisingBadgeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
     */
    public Builder setMerchandisingBadge(com.appdirect.event.MerchandisingBadge value) {
      if (merchandisingBadgeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        merchandisingBadge_ = value;
        onChanged();
      } else {
        merchandisingBadgeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
     */
    public Builder setMerchandisingBadge(
        com.appdirect.event.MerchandisingBadge.Builder builderForValue) {
      if (merchandisingBadgeBuilder_ == null) {
        merchandisingBadge_ = builderForValue.build();
        onChanged();
      } else {
        merchandisingBadgeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
     */
    public Builder mergeMerchandisingBadge(com.appdirect.event.MerchandisingBadge value) {
      if (merchandisingBadgeBuilder_ == null) {
        if (merchandisingBadge_ != null) {
          merchandisingBadge_ =
            com.appdirect.event.MerchandisingBadge.newBuilder(merchandisingBadge_).mergeFrom(value).buildPartial();
        } else {
          merchandisingBadge_ = value;
        }
        onChanged();
      } else {
        merchandisingBadgeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
     */
    public Builder clearMerchandisingBadge() {
      if (merchandisingBadgeBuilder_ == null) {
        merchandisingBadge_ = null;
        onChanged();
      } else {
        merchandisingBadge_ = null;
        merchandisingBadgeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
     */
    public com.appdirect.event.MerchandisingBadge.Builder getMerchandisingBadgeBuilder() {
      
      onChanged();
      return getMerchandisingBadgeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
     */
    public com.appdirect.event.MerchandisingBadgeOrBuilder getMerchandisingBadgeOrBuilder() {
      if (merchandisingBadgeBuilder_ != null) {
        return merchandisingBadgeBuilder_.getMessageOrBuilder();
      } else {
        return merchandisingBadge_ == null ?
            com.appdirect.event.MerchandisingBadge.getDefaultInstance() : merchandisingBadge_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.MerchandisingBadge merchandisingBadge = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.MerchandisingBadge, com.appdirect.event.MerchandisingBadge.Builder, com.appdirect.event.MerchandisingBadgeOrBuilder> 
        getMerchandisingBadgeFieldBuilder() {
      if (merchandisingBadgeBuilder_ == null) {
        merchandisingBadgeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.MerchandisingBadge, com.appdirect.event.MerchandisingBadge.Builder, com.appdirect.event.MerchandisingBadgeOrBuilder>(
                getMerchandisingBadge(),
                getParentForChildren(),
                isClean());
        merchandisingBadge_ = null;
      }
      return merchandisingBadgeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.MerchandisingBadgeUpdated)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.MerchandisingBadgeUpdated)
  private static final com.appdirect.event.MerchandisingBadgeUpdated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.MerchandisingBadgeUpdated();
  }

  public static com.appdirect.event.MerchandisingBadgeUpdated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MerchandisingBadgeUpdated>
      PARSER = new com.google.protobuf.AbstractParser<MerchandisingBadgeUpdated>() {
    public MerchandisingBadgeUpdated parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MerchandisingBadgeUpdated(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MerchandisingBadgeUpdated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MerchandisingBadgeUpdated> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.MerchandisingBadgeUpdated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

