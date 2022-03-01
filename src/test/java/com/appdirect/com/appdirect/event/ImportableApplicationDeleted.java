// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: importableApplication.event.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.ImportableApplicationDeleted}
 */
public  final class ImportableApplicationDeleted extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.ImportableApplicationDeleted)
    ImportableApplicationDeletedOrBuilder {
  // Use ImportableApplicationDeleted.newBuilder() to construct.
  private ImportableApplicationDeleted(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportableApplicationDeleted() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ImportableApplicationDeleted(
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
            com.appdirect.event.ImportableApplication.Builder subBuilder = null;
            if (importableApplication_ != null) {
              subBuilder = importableApplication_.toBuilder();
            }
            importableApplication_ = input.readMessage(com.appdirect.event.ImportableApplication.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(importableApplication_);
              importableApplication_ = subBuilder.buildPartial();
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
    return com.appdirect.event.ImportableApplicationEvent.internal_static_com_appdirect_event_ImportableApplicationDeleted_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.ImportableApplicationEvent.internal_static_com_appdirect_event_ImportableApplicationDeleted_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.ImportableApplicationDeleted.class, com.appdirect.event.ImportableApplicationDeleted.Builder.class);
  }

  public static final int IMPORTABLEAPPLICATION_FIELD_NUMBER = 1;
  private com.appdirect.event.ImportableApplication importableApplication_;
  /**
   * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
   */
  public boolean hasImportableApplication() {
    return importableApplication_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
   */
  public com.appdirect.event.ImportableApplication getImportableApplication() {
    return importableApplication_ == null ? com.appdirect.event.ImportableApplication.getDefaultInstance() : importableApplication_;
  }
  /**
   * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
   */
  public com.appdirect.event.ImportableApplicationOrBuilder getImportableApplicationOrBuilder() {
    return getImportableApplication();
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
    if (importableApplication_ != null) {
      output.writeMessage(1, getImportableApplication());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (importableApplication_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getImportableApplication());
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
    if (!(obj instanceof com.appdirect.event.ImportableApplicationDeleted)) {
      return super.equals(obj);
    }
    com.appdirect.event.ImportableApplicationDeleted other = (com.appdirect.event.ImportableApplicationDeleted) obj;

    boolean result = true;
    result = result && (hasImportableApplication() == other.hasImportableApplication());
    if (hasImportableApplication()) {
      result = result && getImportableApplication()
          .equals(other.getImportableApplication());
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
    if (hasImportableApplication()) {
      hash = (37 * hash) + IMPORTABLEAPPLICATION_FIELD_NUMBER;
      hash = (53 * hash) + getImportableApplication().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.ImportableApplicationDeleted parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.ImportableApplicationDeleted parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.ImportableApplicationDeleted parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.ImportableApplicationDeleted parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.ImportableApplicationDeleted parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.ImportableApplicationDeleted parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.ImportableApplicationDeleted parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.ImportableApplicationDeleted parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.ImportableApplicationDeleted parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.ImportableApplicationDeleted parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.ImportableApplicationDeleted prototype) {
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
   * Protobuf type {@code com.appdirect.event.ImportableApplicationDeleted}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.ImportableApplicationDeleted)
      com.appdirect.event.ImportableApplicationDeletedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.ImportableApplicationEvent.internal_static_com_appdirect_event_ImportableApplicationDeleted_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.ImportableApplicationEvent.internal_static_com_appdirect_event_ImportableApplicationDeleted_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.ImportableApplicationDeleted.class, com.appdirect.event.ImportableApplicationDeleted.Builder.class);
    }

    // Construct using com.appdirect.event.ImportableApplicationDeleted.newBuilder()
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
      if (importableApplicationBuilder_ == null) {
        importableApplication_ = null;
      } else {
        importableApplication_ = null;
        importableApplicationBuilder_ = null;
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
      return com.appdirect.event.ImportableApplicationEvent.internal_static_com_appdirect_event_ImportableApplicationDeleted_descriptor;
    }

    public com.appdirect.event.ImportableApplicationDeleted getDefaultInstanceForType() {
      return com.appdirect.event.ImportableApplicationDeleted.getDefaultInstance();
    }

    public com.appdirect.event.ImportableApplicationDeleted build() {
      com.appdirect.event.ImportableApplicationDeleted result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.ImportableApplicationDeleted buildPartial() {
      com.appdirect.event.ImportableApplicationDeleted result = new com.appdirect.event.ImportableApplicationDeleted(this);
      if (importableApplicationBuilder_ == null) {
        result.importableApplication_ = importableApplication_;
      } else {
        result.importableApplication_ = importableApplicationBuilder_.build();
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
      if (other instanceof com.appdirect.event.ImportableApplicationDeleted) {
        return mergeFrom((com.appdirect.event.ImportableApplicationDeleted)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.ImportableApplicationDeleted other) {
      if (other == com.appdirect.event.ImportableApplicationDeleted.getDefaultInstance()) return this;
      if (other.hasImportableApplication()) {
        mergeImportableApplication(other.getImportableApplication());
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
      com.appdirect.event.ImportableApplicationDeleted parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.ImportableApplicationDeleted) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.ImportableApplication importableApplication_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.ImportableApplication, com.appdirect.event.ImportableApplication.Builder, com.appdirect.event.ImportableApplicationOrBuilder> importableApplicationBuilder_;
    /**
     * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
     */
    public boolean hasImportableApplication() {
      return importableApplicationBuilder_ != null || importableApplication_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
     */
    public com.appdirect.event.ImportableApplication getImportableApplication() {
      if (importableApplicationBuilder_ == null) {
        return importableApplication_ == null ? com.appdirect.event.ImportableApplication.getDefaultInstance() : importableApplication_;
      } else {
        return importableApplicationBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
     */
    public Builder setImportableApplication(com.appdirect.event.ImportableApplication value) {
      if (importableApplicationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        importableApplication_ = value;
        onChanged();
      } else {
        importableApplicationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
     */
    public Builder setImportableApplication(
        com.appdirect.event.ImportableApplication.Builder builderForValue) {
      if (importableApplicationBuilder_ == null) {
        importableApplication_ = builderForValue.build();
        onChanged();
      } else {
        importableApplicationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
     */
    public Builder mergeImportableApplication(com.appdirect.event.ImportableApplication value) {
      if (importableApplicationBuilder_ == null) {
        if (importableApplication_ != null) {
          importableApplication_ =
            com.appdirect.event.ImportableApplication.newBuilder(importableApplication_).mergeFrom(value).buildPartial();
        } else {
          importableApplication_ = value;
        }
        onChanged();
      } else {
        importableApplicationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
     */
    public Builder clearImportableApplication() {
      if (importableApplicationBuilder_ == null) {
        importableApplication_ = null;
        onChanged();
      } else {
        importableApplication_ = null;
        importableApplicationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
     */
    public com.appdirect.event.ImportableApplication.Builder getImportableApplicationBuilder() {
      
      onChanged();
      return getImportableApplicationFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
     */
    public com.appdirect.event.ImportableApplicationOrBuilder getImportableApplicationOrBuilder() {
      if (importableApplicationBuilder_ != null) {
        return importableApplicationBuilder_.getMessageOrBuilder();
      } else {
        return importableApplication_ == null ?
            com.appdirect.event.ImportableApplication.getDefaultInstance() : importableApplication_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.ImportableApplication importableApplication = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.ImportableApplication, com.appdirect.event.ImportableApplication.Builder, com.appdirect.event.ImportableApplicationOrBuilder> 
        getImportableApplicationFieldBuilder() {
      if (importableApplicationBuilder_ == null) {
        importableApplicationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.ImportableApplication, com.appdirect.event.ImportableApplication.Builder, com.appdirect.event.ImportableApplicationOrBuilder>(
                getImportableApplication(),
                getParentForChildren(),
                isClean());
        importableApplication_ = null;
      }
      return importableApplicationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.ImportableApplicationDeleted)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.ImportableApplicationDeleted)
  private static final com.appdirect.event.ImportableApplicationDeleted DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.ImportableApplicationDeleted();
  }

  public static com.appdirect.event.ImportableApplicationDeleted getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportableApplicationDeleted>
      PARSER = new com.google.protobuf.AbstractParser<ImportableApplicationDeleted>() {
    public ImportableApplicationDeleted parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ImportableApplicationDeleted(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImportableApplicationDeleted> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportableApplicationDeleted> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.ImportableApplicationDeleted getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

