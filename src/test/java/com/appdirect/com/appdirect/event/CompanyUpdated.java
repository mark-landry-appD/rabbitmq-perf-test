// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: company.event.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.CompanyUpdated}
 */
public  final class CompanyUpdated extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.CompanyUpdated)
    CompanyUpdatedOrBuilder {
  // Use CompanyUpdated.newBuilder() to construct.
  private CompanyUpdated(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CompanyUpdated() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private CompanyUpdated(
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
            com.appdirect.event.Company.Builder subBuilder = null;
            if (company_ != null) {
              subBuilder = company_.toBuilder();
            }
            company_ = input.readMessage(com.appdirect.event.Company.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(company_);
              company_ = subBuilder.buildPartial();
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
    return com.appdirect.event.CompanyEvent.internal_static_com_appdirect_event_CompanyUpdated_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.CompanyEvent.internal_static_com_appdirect_event_CompanyUpdated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.CompanyUpdated.class, com.appdirect.event.CompanyUpdated.Builder.class);
  }

  public static final int COMPANY_FIELD_NUMBER = 1;
  private com.appdirect.event.Company company_;
  /**
   * <code>optional .com.appdirect.event.Company company = 1;</code>
   */
  public boolean hasCompany() {
    return company_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.Company company = 1;</code>
   */
  public com.appdirect.event.Company getCompany() {
    return company_ == null ? com.appdirect.event.Company.getDefaultInstance() : company_;
  }
  /**
   * <code>optional .com.appdirect.event.Company company = 1;</code>
   */
  public com.appdirect.event.CompanyOrBuilder getCompanyOrBuilder() {
    return getCompany();
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
    if (company_ != null) {
      output.writeMessage(1, getCompany());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (company_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCompany());
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
    if (!(obj instanceof com.appdirect.event.CompanyUpdated)) {
      return super.equals(obj);
    }
    com.appdirect.event.CompanyUpdated other = (com.appdirect.event.CompanyUpdated) obj;

    boolean result = true;
    result = result && (hasCompany() == other.hasCompany());
    if (hasCompany()) {
      result = result && getCompany()
          .equals(other.getCompany());
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
    if (hasCompany()) {
      hash = (37 * hash) + COMPANY_FIELD_NUMBER;
      hash = (53 * hash) + getCompany().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.CompanyUpdated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.CompanyUpdated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.CompanyUpdated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.CompanyUpdated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.CompanyUpdated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.CompanyUpdated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.CompanyUpdated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.CompanyUpdated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.CompanyUpdated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.CompanyUpdated parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.CompanyUpdated prototype) {
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
   * Protobuf type {@code com.appdirect.event.CompanyUpdated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.CompanyUpdated)
      com.appdirect.event.CompanyUpdatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.CompanyEvent.internal_static_com_appdirect_event_CompanyUpdated_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.CompanyEvent.internal_static_com_appdirect_event_CompanyUpdated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.CompanyUpdated.class, com.appdirect.event.CompanyUpdated.Builder.class);
    }

    // Construct using com.appdirect.event.CompanyUpdated.newBuilder()
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
      if (companyBuilder_ == null) {
        company_ = null;
      } else {
        company_ = null;
        companyBuilder_ = null;
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
      return com.appdirect.event.CompanyEvent.internal_static_com_appdirect_event_CompanyUpdated_descriptor;
    }

    public com.appdirect.event.CompanyUpdated getDefaultInstanceForType() {
      return com.appdirect.event.CompanyUpdated.getDefaultInstance();
    }

    public com.appdirect.event.CompanyUpdated build() {
      com.appdirect.event.CompanyUpdated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.CompanyUpdated buildPartial() {
      com.appdirect.event.CompanyUpdated result = new com.appdirect.event.CompanyUpdated(this);
      if (companyBuilder_ == null) {
        result.company_ = company_;
      } else {
        result.company_ = companyBuilder_.build();
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
      if (other instanceof com.appdirect.event.CompanyUpdated) {
        return mergeFrom((com.appdirect.event.CompanyUpdated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.CompanyUpdated other) {
      if (other == com.appdirect.event.CompanyUpdated.getDefaultInstance()) return this;
      if (other.hasCompany()) {
        mergeCompany(other.getCompany());
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
      com.appdirect.event.CompanyUpdated parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.CompanyUpdated) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.Company company_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Company, com.appdirect.event.Company.Builder, com.appdirect.event.CompanyOrBuilder> companyBuilder_;
    /**
     * <code>optional .com.appdirect.event.Company company = 1;</code>
     */
    public boolean hasCompany() {
      return companyBuilder_ != null || company_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.Company company = 1;</code>
     */
    public com.appdirect.event.Company getCompany() {
      if (companyBuilder_ == null) {
        return company_ == null ? com.appdirect.event.Company.getDefaultInstance() : company_;
      } else {
        return companyBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.Company company = 1;</code>
     */
    public Builder setCompany(com.appdirect.event.Company value) {
      if (companyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        company_ = value;
        onChanged();
      } else {
        companyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Company company = 1;</code>
     */
    public Builder setCompany(
        com.appdirect.event.Company.Builder builderForValue) {
      if (companyBuilder_ == null) {
        company_ = builderForValue.build();
        onChanged();
      } else {
        companyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Company company = 1;</code>
     */
    public Builder mergeCompany(com.appdirect.event.Company value) {
      if (companyBuilder_ == null) {
        if (company_ != null) {
          company_ =
            com.appdirect.event.Company.newBuilder(company_).mergeFrom(value).buildPartial();
        } else {
          company_ = value;
        }
        onChanged();
      } else {
        companyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Company company = 1;</code>
     */
    public Builder clearCompany() {
      if (companyBuilder_ == null) {
        company_ = null;
        onChanged();
      } else {
        company_ = null;
        companyBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Company company = 1;</code>
     */
    public com.appdirect.event.Company.Builder getCompanyBuilder() {
      
      onChanged();
      return getCompanyFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.Company company = 1;</code>
     */
    public com.appdirect.event.CompanyOrBuilder getCompanyOrBuilder() {
      if (companyBuilder_ != null) {
        return companyBuilder_.getMessageOrBuilder();
      } else {
        return company_ == null ?
            com.appdirect.event.Company.getDefaultInstance() : company_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.Company company = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Company, com.appdirect.event.Company.Builder, com.appdirect.event.CompanyOrBuilder> 
        getCompanyFieldBuilder() {
      if (companyBuilder_ == null) {
        companyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.Company, com.appdirect.event.Company.Builder, com.appdirect.event.CompanyOrBuilder>(
                getCompany(),
                getParentForChildren(),
                isClean());
        company_ = null;
      }
      return companyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.CompanyUpdated)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.CompanyUpdated)
  private static final com.appdirect.event.CompanyUpdated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.CompanyUpdated();
  }

  public static com.appdirect.event.CompanyUpdated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CompanyUpdated>
      PARSER = new com.google.protobuf.AbstractParser<CompanyUpdated>() {
    public CompanyUpdated parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CompanyUpdated(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CompanyUpdated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CompanyUpdated> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.CompanyUpdated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

