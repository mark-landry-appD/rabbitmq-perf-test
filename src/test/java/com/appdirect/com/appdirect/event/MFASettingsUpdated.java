// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MFASettings.event.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.MFASettingsUpdated}
 */
public  final class MFASettingsUpdated extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.MFASettingsUpdated)
    MFASettingsUpdatedOrBuilder {
  // Use MFASettingsUpdated.newBuilder() to construct.
  private MFASettingsUpdated(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MFASettingsUpdated() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MFASettingsUpdated(
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
            com.appdirect.event.MFASettings.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(com.appdirect.event.MFASettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(settings_);
              settings_ = subBuilder.buildPartial();
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
    return com.appdirect.event.MFASettingsEvent.internal_static_com_appdirect_event_MFASettingsUpdated_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.MFASettingsEvent.internal_static_com_appdirect_event_MFASettingsUpdated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.MFASettingsUpdated.class, com.appdirect.event.MFASettingsUpdated.Builder.class);
  }

  public static final int SETTINGS_FIELD_NUMBER = 1;
  private com.appdirect.event.MFASettings settings_;
  /**
   * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
   */
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
   */
  public com.appdirect.event.MFASettings getSettings() {
    return settings_ == null ? com.appdirect.event.MFASettings.getDefaultInstance() : settings_;
  }
  /**
   * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
   */
  public com.appdirect.event.MFASettingsOrBuilder getSettingsOrBuilder() {
    return getSettings();
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
    if (settings_ != null) {
      output.writeMessage(1, getSettings());
    }
    if (metadata_ != null) {
      output.writeMessage(2, getMetadata());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSettings());
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
    if (!(obj instanceof com.appdirect.event.MFASettingsUpdated)) {
      return super.equals(obj);
    }
    com.appdirect.event.MFASettingsUpdated other = (com.appdirect.event.MFASettingsUpdated) obj;

    boolean result = true;
    result = result && (hasSettings() == other.hasSettings());
    if (hasSettings()) {
      result = result && getSettings()
          .equals(other.getSettings());
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
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.MFASettingsUpdated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.MFASettingsUpdated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.MFASettingsUpdated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.MFASettingsUpdated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.MFASettingsUpdated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.MFASettingsUpdated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.MFASettingsUpdated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.MFASettingsUpdated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.MFASettingsUpdated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.MFASettingsUpdated parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.MFASettingsUpdated prototype) {
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
   * Protobuf type {@code com.appdirect.event.MFASettingsUpdated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.MFASettingsUpdated)
      com.appdirect.event.MFASettingsUpdatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.MFASettingsEvent.internal_static_com_appdirect_event_MFASettingsUpdated_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.MFASettingsEvent.internal_static_com_appdirect_event_MFASettingsUpdated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.MFASettingsUpdated.class, com.appdirect.event.MFASettingsUpdated.Builder.class);
    }

    // Construct using com.appdirect.event.MFASettingsUpdated.newBuilder()
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
      if (settingsBuilder_ == null) {
        settings_ = null;
      } else {
        settings_ = null;
        settingsBuilder_ = null;
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
      return com.appdirect.event.MFASettingsEvent.internal_static_com_appdirect_event_MFASettingsUpdated_descriptor;
    }

    public com.appdirect.event.MFASettingsUpdated getDefaultInstanceForType() {
      return com.appdirect.event.MFASettingsUpdated.getDefaultInstance();
    }

    public com.appdirect.event.MFASettingsUpdated build() {
      com.appdirect.event.MFASettingsUpdated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.MFASettingsUpdated buildPartial() {
      com.appdirect.event.MFASettingsUpdated result = new com.appdirect.event.MFASettingsUpdated(this);
      if (settingsBuilder_ == null) {
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
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
      if (other instanceof com.appdirect.event.MFASettingsUpdated) {
        return mergeFrom((com.appdirect.event.MFASettingsUpdated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.MFASettingsUpdated other) {
      if (other == com.appdirect.event.MFASettingsUpdated.getDefaultInstance()) return this;
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
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
      com.appdirect.event.MFASettingsUpdated parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.MFASettingsUpdated) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.MFASettings settings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.MFASettings, com.appdirect.event.MFASettings.Builder, com.appdirect.event.MFASettingsOrBuilder> settingsBuilder_;
    /**
     * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
     */
    public com.appdirect.event.MFASettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? com.appdirect.event.MFASettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
     */
    public Builder setSettings(com.appdirect.event.MFASettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
        onChanged();
      } else {
        settingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
     */
    public Builder setSettings(
        com.appdirect.event.MFASettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
     */
    public Builder mergeSettings(com.appdirect.event.MFASettings value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            com.appdirect.event.MFASettings.newBuilder(settings_).mergeFrom(value).buildPartial();
        } else {
          settings_ = value;
        }
        onChanged();
      } else {
        settingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = null;
        onChanged();
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
     */
    public com.appdirect.event.MFASettings.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
     */
    public com.appdirect.event.MFASettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            com.appdirect.event.MFASettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.MFASettings settings = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.MFASettings, com.appdirect.event.MFASettings.Builder, com.appdirect.event.MFASettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.MFASettings, com.appdirect.event.MFASettings.Builder, com.appdirect.event.MFASettingsOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.MFASettingsUpdated)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.MFASettingsUpdated)
  private static final com.appdirect.event.MFASettingsUpdated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.MFASettingsUpdated();
  }

  public static com.appdirect.event.MFASettingsUpdated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MFASettingsUpdated>
      PARSER = new com.google.protobuf.AbstractParser<MFASettingsUpdated>() {
    public MFASettingsUpdated parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MFASettingsUpdated(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MFASettingsUpdated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MFASettingsUpdated> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.MFASettingsUpdated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

