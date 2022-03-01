// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: category.event.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.CategoryUpdated}
 */
public  final class CategoryUpdated extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.CategoryUpdated)
    CategoryUpdatedOrBuilder {
  // Use CategoryUpdated.newBuilder() to construct.
  private CategoryUpdated(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CategoryUpdated() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CategoryUpdated(
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
            com.appdirect.event.Category.Builder subBuilder = null;
            if (category_ != null) {
              subBuilder = category_.toBuilder();
            }
            category_ = input.readMessage(com.appdirect.event.Category.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(category_);
              category_ = subBuilder.buildPartial();
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
    return com.appdirect.event.CategoryEvent.internal_static_com_appdirect_event_CategoryUpdated_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.CategoryEvent.internal_static_com_appdirect_event_CategoryUpdated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.CategoryUpdated.class, com.appdirect.event.CategoryUpdated.Builder.class);
  }

  public static final int CATEGORY_FIELD_NUMBER = 1;
  private com.appdirect.event.Category category_;
  /**
   * <code>optional .com.appdirect.event.Category category = 1;</code>
   */
  public boolean hasCategory() {
    return category_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.Category category = 1;</code>
   */
  public com.appdirect.event.Category getCategory() {
    return category_ == null ? com.appdirect.event.Category.getDefaultInstance() : category_;
  }
  /**
   * <code>optional .com.appdirect.event.Category category = 1;</code>
   */
  public com.appdirect.event.CategoryOrBuilder getCategoryOrBuilder() {
    return getCategory();
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
    if (category_ != null) {
      output.writeMessage(1, getCategory());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (category_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCategory());
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
    if (!(obj instanceof com.appdirect.event.CategoryUpdated)) {
      return super.equals(obj);
    }
    com.appdirect.event.CategoryUpdated other = (com.appdirect.event.CategoryUpdated) obj;

    boolean result = true;
    result = result && (hasCategory() == other.hasCategory());
    if (hasCategory()) {
      result = result && getCategory()
          .equals(other.getCategory());
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
    if (hasCategory()) {
      hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
      hash = (53 * hash) + getCategory().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.CategoryUpdated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.CategoryUpdated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.CategoryUpdated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.CategoryUpdated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.CategoryUpdated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.CategoryUpdated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.CategoryUpdated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.CategoryUpdated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.CategoryUpdated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.CategoryUpdated parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.CategoryUpdated prototype) {
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
   * Protobuf type {@code com.appdirect.event.CategoryUpdated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.CategoryUpdated)
      com.appdirect.event.CategoryUpdatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.CategoryEvent.internal_static_com_appdirect_event_CategoryUpdated_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.CategoryEvent.internal_static_com_appdirect_event_CategoryUpdated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.CategoryUpdated.class, com.appdirect.event.CategoryUpdated.Builder.class);
    }

    // Construct using com.appdirect.event.CategoryUpdated.newBuilder()
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
      if (categoryBuilder_ == null) {
        category_ = null;
      } else {
        category_ = null;
        categoryBuilder_ = null;
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
      return com.appdirect.event.CategoryEvent.internal_static_com_appdirect_event_CategoryUpdated_descriptor;
    }

    public com.appdirect.event.CategoryUpdated getDefaultInstanceForType() {
      return com.appdirect.event.CategoryUpdated.getDefaultInstance();
    }

    public com.appdirect.event.CategoryUpdated build() {
      com.appdirect.event.CategoryUpdated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.CategoryUpdated buildPartial() {
      com.appdirect.event.CategoryUpdated result = new com.appdirect.event.CategoryUpdated(this);
      if (categoryBuilder_ == null) {
        result.category_ = category_;
      } else {
        result.category_ = categoryBuilder_.build();
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
      if (other instanceof com.appdirect.event.CategoryUpdated) {
        return mergeFrom((com.appdirect.event.CategoryUpdated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.CategoryUpdated other) {
      if (other == com.appdirect.event.CategoryUpdated.getDefaultInstance()) return this;
      if (other.hasCategory()) {
        mergeCategory(other.getCategory());
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
      com.appdirect.event.CategoryUpdated parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.CategoryUpdated) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.Category category_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Category, com.appdirect.event.Category.Builder, com.appdirect.event.CategoryOrBuilder> categoryBuilder_;
    /**
     * <code>optional .com.appdirect.event.Category category = 1;</code>
     */
    public boolean hasCategory() {
      return categoryBuilder_ != null || category_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.Category category = 1;</code>
     */
    public com.appdirect.event.Category getCategory() {
      if (categoryBuilder_ == null) {
        return category_ == null ? com.appdirect.event.Category.getDefaultInstance() : category_;
      } else {
        return categoryBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.Category category = 1;</code>
     */
    public Builder setCategory(com.appdirect.event.Category value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        category_ = value;
        onChanged();
      } else {
        categoryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Category category = 1;</code>
     */
    public Builder setCategory(
        com.appdirect.event.Category.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        category_ = builderForValue.build();
        onChanged();
      } else {
        categoryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Category category = 1;</code>
     */
    public Builder mergeCategory(com.appdirect.event.Category value) {
      if (categoryBuilder_ == null) {
        if (category_ != null) {
          category_ =
            com.appdirect.event.Category.newBuilder(category_).mergeFrom(value).buildPartial();
        } else {
          category_ = value;
        }
        onChanged();
      } else {
        categoryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Category category = 1;</code>
     */
    public Builder clearCategory() {
      if (categoryBuilder_ == null) {
        category_ = null;
        onChanged();
      } else {
        category_ = null;
        categoryBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Category category = 1;</code>
     */
    public com.appdirect.event.Category.Builder getCategoryBuilder() {
      
      onChanged();
      return getCategoryFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.Category category = 1;</code>
     */
    public com.appdirect.event.CategoryOrBuilder getCategoryOrBuilder() {
      if (categoryBuilder_ != null) {
        return categoryBuilder_.getMessageOrBuilder();
      } else {
        return category_ == null ?
            com.appdirect.event.Category.getDefaultInstance() : category_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.Category category = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Category, com.appdirect.event.Category.Builder, com.appdirect.event.CategoryOrBuilder> 
        getCategoryFieldBuilder() {
      if (categoryBuilder_ == null) {
        categoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.Category, com.appdirect.event.Category.Builder, com.appdirect.event.CategoryOrBuilder>(
                getCategory(),
                getParentForChildren(),
                isClean());
        category_ = null;
      }
      return categoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.CategoryUpdated)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.CategoryUpdated)
  private static final com.appdirect.event.CategoryUpdated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.CategoryUpdated();
  }

  public static com.appdirect.event.CategoryUpdated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CategoryUpdated>
      PARSER = new com.google.protobuf.AbstractParser<CategoryUpdated>() {
    public CategoryUpdated parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CategoryUpdated(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CategoryUpdated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CategoryUpdated> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.CategoryUpdated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

