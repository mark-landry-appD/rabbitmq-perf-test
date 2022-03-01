// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: attribute.event.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.AttributeUpdated}
 */
public  final class AttributeUpdated extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.AttributeUpdated)
    AttributeUpdatedOrBuilder {
  // Use AttributeUpdated.newBuilder() to construct.
  private AttributeUpdated(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AttributeUpdated() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private AttributeUpdated(
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
            com.appdirect.event.Attribute.Builder subBuilder = null;
            if (attribute_ != null) {
              subBuilder = attribute_.toBuilder();
            }
            attribute_ = input.readMessage(com.appdirect.event.Attribute.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(attribute_);
              attribute_ = subBuilder.buildPartial();
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
    return com.appdirect.event.AttributeEvent.internal_static_com_appdirect_event_AttributeUpdated_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.AttributeEvent.internal_static_com_appdirect_event_AttributeUpdated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.AttributeUpdated.class, com.appdirect.event.AttributeUpdated.Builder.class);
  }

  public static final int ATTRIBUTE_FIELD_NUMBER = 1;
  private com.appdirect.event.Attribute attribute_;
  /**
   * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
   */
  public boolean hasAttribute() {
    return attribute_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
   */
  public com.appdirect.event.Attribute getAttribute() {
    return attribute_ == null ? com.appdirect.event.Attribute.getDefaultInstance() : attribute_;
  }
  /**
   * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
   */
  public com.appdirect.event.AttributeOrBuilder getAttributeOrBuilder() {
    return getAttribute();
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
    if (attribute_ != null) {
      output.writeMessage(1, getAttribute());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (attribute_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAttribute());
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
    if (!(obj instanceof com.appdirect.event.AttributeUpdated)) {
      return super.equals(obj);
    }
    com.appdirect.event.AttributeUpdated other = (com.appdirect.event.AttributeUpdated) obj;

    boolean result = true;
    result = result && (hasAttribute() == other.hasAttribute());
    if (hasAttribute()) {
      result = result && getAttribute()
          .equals(other.getAttribute());
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
    if (hasAttribute()) {
      hash = (37 * hash) + ATTRIBUTE_FIELD_NUMBER;
      hash = (53 * hash) + getAttribute().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.AttributeUpdated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.AttributeUpdated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.AttributeUpdated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.AttributeUpdated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.AttributeUpdated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.AttributeUpdated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.AttributeUpdated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.AttributeUpdated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.AttributeUpdated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.AttributeUpdated parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.AttributeUpdated prototype) {
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
   * Protobuf type {@code com.appdirect.event.AttributeUpdated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.AttributeUpdated)
      com.appdirect.event.AttributeUpdatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.AttributeEvent.internal_static_com_appdirect_event_AttributeUpdated_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.AttributeEvent.internal_static_com_appdirect_event_AttributeUpdated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.AttributeUpdated.class, com.appdirect.event.AttributeUpdated.Builder.class);
    }

    // Construct using com.appdirect.event.AttributeUpdated.newBuilder()
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
      if (attributeBuilder_ == null) {
        attribute_ = null;
      } else {
        attribute_ = null;
        attributeBuilder_ = null;
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
      return com.appdirect.event.AttributeEvent.internal_static_com_appdirect_event_AttributeUpdated_descriptor;
    }

    public com.appdirect.event.AttributeUpdated getDefaultInstanceForType() {
      return com.appdirect.event.AttributeUpdated.getDefaultInstance();
    }

    public com.appdirect.event.AttributeUpdated build() {
      com.appdirect.event.AttributeUpdated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.AttributeUpdated buildPartial() {
      com.appdirect.event.AttributeUpdated result = new com.appdirect.event.AttributeUpdated(this);
      if (attributeBuilder_ == null) {
        result.attribute_ = attribute_;
      } else {
        result.attribute_ = attributeBuilder_.build();
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
      if (other instanceof com.appdirect.event.AttributeUpdated) {
        return mergeFrom((com.appdirect.event.AttributeUpdated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.AttributeUpdated other) {
      if (other == com.appdirect.event.AttributeUpdated.getDefaultInstance()) return this;
      if (other.hasAttribute()) {
        mergeAttribute(other.getAttribute());
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
      com.appdirect.event.AttributeUpdated parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.AttributeUpdated) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.Attribute attribute_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Attribute, com.appdirect.event.Attribute.Builder, com.appdirect.event.AttributeOrBuilder> attributeBuilder_;
    /**
     * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
     */
    public boolean hasAttribute() {
      return attributeBuilder_ != null || attribute_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
     */
    public com.appdirect.event.Attribute getAttribute() {
      if (attributeBuilder_ == null) {
        return attribute_ == null ? com.appdirect.event.Attribute.getDefaultInstance() : attribute_;
      } else {
        return attributeBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
     */
    public Builder setAttribute(com.appdirect.event.Attribute value) {
      if (attributeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attribute_ = value;
        onChanged();
      } else {
        attributeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
     */
    public Builder setAttribute(
        com.appdirect.event.Attribute.Builder builderForValue) {
      if (attributeBuilder_ == null) {
        attribute_ = builderForValue.build();
        onChanged();
      } else {
        attributeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
     */
    public Builder mergeAttribute(com.appdirect.event.Attribute value) {
      if (attributeBuilder_ == null) {
        if (attribute_ != null) {
          attribute_ =
            com.appdirect.event.Attribute.newBuilder(attribute_).mergeFrom(value).buildPartial();
        } else {
          attribute_ = value;
        }
        onChanged();
      } else {
        attributeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
     */
    public Builder clearAttribute() {
      if (attributeBuilder_ == null) {
        attribute_ = null;
        onChanged();
      } else {
        attribute_ = null;
        attributeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
     */
    public com.appdirect.event.Attribute.Builder getAttributeBuilder() {
      
      onChanged();
      return getAttributeFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
     */
    public com.appdirect.event.AttributeOrBuilder getAttributeOrBuilder() {
      if (attributeBuilder_ != null) {
        return attributeBuilder_.getMessageOrBuilder();
      } else {
        return attribute_ == null ?
            com.appdirect.event.Attribute.getDefaultInstance() : attribute_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.Attribute attribute = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Attribute, com.appdirect.event.Attribute.Builder, com.appdirect.event.AttributeOrBuilder> 
        getAttributeFieldBuilder() {
      if (attributeBuilder_ == null) {
        attributeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.Attribute, com.appdirect.event.Attribute.Builder, com.appdirect.event.AttributeOrBuilder>(
                getAttribute(),
                getParentForChildren(),
                isClean());
        attribute_ = null;
      }
      return attributeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.AttributeUpdated)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.AttributeUpdated)
  private static final com.appdirect.event.AttributeUpdated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.AttributeUpdated();
  }

  public static com.appdirect.event.AttributeUpdated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttributeUpdated>
      PARSER = new com.google.protobuf.AbstractParser<AttributeUpdated>() {
    public AttributeUpdated parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new AttributeUpdated(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AttributeUpdated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttributeUpdated> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.AttributeUpdated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

