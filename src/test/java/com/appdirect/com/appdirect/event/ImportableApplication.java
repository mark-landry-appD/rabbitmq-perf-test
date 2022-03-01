// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: importableApplication.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.ImportableApplication}
 */
public  final class ImportableApplication extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.ImportableApplication)
    ImportableApplicationOrBuilder {
  // Use ImportableApplication.newBuilder() to construct.
  private ImportableApplication(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportableApplication() {
    globalIdentifier_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ImportableApplication(
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
            com.appdirect.event.Application.Builder subBuilder = null;
            if (application_ != null) {
              subBuilder = application_.toBuilder();
            }
            application_ = input.readMessage(com.appdirect.event.Application.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(application_);
              application_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            globalIdentifier_ = s;
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
    return com.appdirect.event.ImportableApplicationOuterClass.internal_static_com_appdirect_event_ImportableApplication_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.ImportableApplicationOuterClass.internal_static_com_appdirect_event_ImportableApplication_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.ImportableApplication.class, com.appdirect.event.ImportableApplication.Builder.class);
  }

  public static final int APPLICATION_FIELD_NUMBER = 1;
  private com.appdirect.event.Application application_;
  /**
   * <code>optional .com.appdirect.event.Application application = 1;</code>
   */
  public boolean hasApplication() {
    return application_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.Application application = 1;</code>
   */
  public com.appdirect.event.Application getApplication() {
    return application_ == null ? com.appdirect.event.Application.getDefaultInstance() : application_;
  }
  /**
   * <code>optional .com.appdirect.event.Application application = 1;</code>
   */
  public com.appdirect.event.ApplicationOrBuilder getApplicationOrBuilder() {
    return getApplication();
  }

  public static final int GLOBALIDENTIFIER_FIELD_NUMBER = 2;
  private volatile java.lang.Object globalIdentifier_;
  /**
   * <code>optional string globalIdentifier = 2;</code>
   */
  public java.lang.String getGlobalIdentifier() {
    java.lang.Object ref = globalIdentifier_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      globalIdentifier_ = s;
      return s;
    }
  }
  /**
   * <code>optional string globalIdentifier = 2;</code>
   */
  public com.google.protobuf.ByteString
      getGlobalIdentifierBytes() {
    java.lang.Object ref = globalIdentifier_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      globalIdentifier_ = b;
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
    if (application_ != null) {
      output.writeMessage(1, getApplication());
    }
    if (!getGlobalIdentifierBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, globalIdentifier_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (application_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getApplication());
    }
    if (!getGlobalIdentifierBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, globalIdentifier_);
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
    if (!(obj instanceof com.appdirect.event.ImportableApplication)) {
      return super.equals(obj);
    }
    com.appdirect.event.ImportableApplication other = (com.appdirect.event.ImportableApplication) obj;

    boolean result = true;
    result = result && (hasApplication() == other.hasApplication());
    if (hasApplication()) {
      result = result && getApplication()
          .equals(other.getApplication());
    }
    result = result && getGlobalIdentifier()
        .equals(other.getGlobalIdentifier());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasApplication()) {
      hash = (37 * hash) + APPLICATION_FIELD_NUMBER;
      hash = (53 * hash) + getApplication().hashCode();
    }
    hash = (37 * hash) + GLOBALIDENTIFIER_FIELD_NUMBER;
    hash = (53 * hash) + getGlobalIdentifier().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.ImportableApplication parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.ImportableApplication parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.ImportableApplication parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.ImportableApplication parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.ImportableApplication parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.ImportableApplication parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.ImportableApplication parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.ImportableApplication parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.ImportableApplication parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.ImportableApplication parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.ImportableApplication prototype) {
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
   * Protobuf type {@code com.appdirect.event.ImportableApplication}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.ImportableApplication)
      com.appdirect.event.ImportableApplicationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.ImportableApplicationOuterClass.internal_static_com_appdirect_event_ImportableApplication_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.ImportableApplicationOuterClass.internal_static_com_appdirect_event_ImportableApplication_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.ImportableApplication.class, com.appdirect.event.ImportableApplication.Builder.class);
    }

    // Construct using com.appdirect.event.ImportableApplication.newBuilder()
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
      if (applicationBuilder_ == null) {
        application_ = null;
      } else {
        application_ = null;
        applicationBuilder_ = null;
      }
      globalIdentifier_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appdirect.event.ImportableApplicationOuterClass.internal_static_com_appdirect_event_ImportableApplication_descriptor;
    }

    public com.appdirect.event.ImportableApplication getDefaultInstanceForType() {
      return com.appdirect.event.ImportableApplication.getDefaultInstance();
    }

    public com.appdirect.event.ImportableApplication build() {
      com.appdirect.event.ImportableApplication result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.ImportableApplication buildPartial() {
      com.appdirect.event.ImportableApplication result = new com.appdirect.event.ImportableApplication(this);
      if (applicationBuilder_ == null) {
        result.application_ = application_;
      } else {
        result.application_ = applicationBuilder_.build();
      }
      result.globalIdentifier_ = globalIdentifier_;
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
      if (other instanceof com.appdirect.event.ImportableApplication) {
        return mergeFrom((com.appdirect.event.ImportableApplication)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.ImportableApplication other) {
      if (other == com.appdirect.event.ImportableApplication.getDefaultInstance()) return this;
      if (other.hasApplication()) {
        mergeApplication(other.getApplication());
      }
      if (!other.getGlobalIdentifier().isEmpty()) {
        globalIdentifier_ = other.globalIdentifier_;
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
      com.appdirect.event.ImportableApplication parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.ImportableApplication) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.Application application_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Application, com.appdirect.event.Application.Builder, com.appdirect.event.ApplicationOrBuilder> applicationBuilder_;
    /**
     * <code>optional .com.appdirect.event.Application application = 1;</code>
     */
    public boolean hasApplication() {
      return applicationBuilder_ != null || application_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.Application application = 1;</code>
     */
    public com.appdirect.event.Application getApplication() {
      if (applicationBuilder_ == null) {
        return application_ == null ? com.appdirect.event.Application.getDefaultInstance() : application_;
      } else {
        return applicationBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.Application application = 1;</code>
     */
    public Builder setApplication(com.appdirect.event.Application value) {
      if (applicationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        application_ = value;
        onChanged();
      } else {
        applicationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Application application = 1;</code>
     */
    public Builder setApplication(
        com.appdirect.event.Application.Builder builderForValue) {
      if (applicationBuilder_ == null) {
        application_ = builderForValue.build();
        onChanged();
      } else {
        applicationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Application application = 1;</code>
     */
    public Builder mergeApplication(com.appdirect.event.Application value) {
      if (applicationBuilder_ == null) {
        if (application_ != null) {
          application_ =
            com.appdirect.event.Application.newBuilder(application_).mergeFrom(value).buildPartial();
        } else {
          application_ = value;
        }
        onChanged();
      } else {
        applicationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Application application = 1;</code>
     */
    public Builder clearApplication() {
      if (applicationBuilder_ == null) {
        application_ = null;
        onChanged();
      } else {
        application_ = null;
        applicationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Application application = 1;</code>
     */
    public com.appdirect.event.Application.Builder getApplicationBuilder() {
      
      onChanged();
      return getApplicationFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.Application application = 1;</code>
     */
    public com.appdirect.event.ApplicationOrBuilder getApplicationOrBuilder() {
      if (applicationBuilder_ != null) {
        return applicationBuilder_.getMessageOrBuilder();
      } else {
        return application_ == null ?
            com.appdirect.event.Application.getDefaultInstance() : application_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.Application application = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Application, com.appdirect.event.Application.Builder, com.appdirect.event.ApplicationOrBuilder> 
        getApplicationFieldBuilder() {
      if (applicationBuilder_ == null) {
        applicationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.Application, com.appdirect.event.Application.Builder, com.appdirect.event.ApplicationOrBuilder>(
                getApplication(),
                getParentForChildren(),
                isClean());
        application_ = null;
      }
      return applicationBuilder_;
    }

    private java.lang.Object globalIdentifier_ = "";
    /**
     * <code>optional string globalIdentifier = 2;</code>
     */
    public java.lang.String getGlobalIdentifier() {
      java.lang.Object ref = globalIdentifier_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        globalIdentifier_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string globalIdentifier = 2;</code>
     */
    public com.google.protobuf.ByteString
        getGlobalIdentifierBytes() {
      java.lang.Object ref = globalIdentifier_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        globalIdentifier_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string globalIdentifier = 2;</code>
     */
    public Builder setGlobalIdentifier(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      globalIdentifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string globalIdentifier = 2;</code>
     */
    public Builder clearGlobalIdentifier() {
      
      globalIdentifier_ = getDefaultInstance().getGlobalIdentifier();
      onChanged();
      return this;
    }
    /**
     * <code>optional string globalIdentifier = 2;</code>
     */
    public Builder setGlobalIdentifierBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      globalIdentifier_ = value;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.ImportableApplication)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.ImportableApplication)
  private static final com.appdirect.event.ImportableApplication DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.ImportableApplication();
  }

  public static com.appdirect.event.ImportableApplication getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportableApplication>
      PARSER = new com.google.protobuf.AbstractParser<ImportableApplication>() {
    public ImportableApplication parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ImportableApplication(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImportableApplication> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportableApplication> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.ImportableApplication getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

