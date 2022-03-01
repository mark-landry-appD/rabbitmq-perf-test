// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: segmentGroup.event.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.SegmentGroupUpdated}
 */
public  final class SegmentGroupUpdated extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.SegmentGroupUpdated)
    SegmentGroupUpdatedOrBuilder {
  // Use SegmentGroupUpdated.newBuilder() to construct.
  private SegmentGroupUpdated(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SegmentGroupUpdated() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SegmentGroupUpdated(
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
            com.appdirect.event.SegmentGroup.Builder subBuilder = null;
            if (segmentGroup_ != null) {
              subBuilder = segmentGroup_.toBuilder();
            }
            segmentGroup_ = input.readMessage(com.appdirect.event.SegmentGroup.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(segmentGroup_);
              segmentGroup_ = subBuilder.buildPartial();
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
    return com.appdirect.event.SegmentGroupEvent.internal_static_com_appdirect_event_SegmentGroupUpdated_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.SegmentGroupEvent.internal_static_com_appdirect_event_SegmentGroupUpdated_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.SegmentGroupUpdated.class, com.appdirect.event.SegmentGroupUpdated.Builder.class);
  }

  public static final int SEGMENTGROUP_FIELD_NUMBER = 1;
  private com.appdirect.event.SegmentGroup segmentGroup_;
  /**
   * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
   */
  public boolean hasSegmentGroup() {
    return segmentGroup_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
   */
  public com.appdirect.event.SegmentGroup getSegmentGroup() {
    return segmentGroup_ == null ? com.appdirect.event.SegmentGroup.getDefaultInstance() : segmentGroup_;
  }
  /**
   * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
   */
  public com.appdirect.event.SegmentGroupOrBuilder getSegmentGroupOrBuilder() {
    return getSegmentGroup();
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
    if (segmentGroup_ != null) {
      output.writeMessage(1, getSegmentGroup());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (segmentGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSegmentGroup());
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
    if (!(obj instanceof com.appdirect.event.SegmentGroupUpdated)) {
      return super.equals(obj);
    }
    com.appdirect.event.SegmentGroupUpdated other = (com.appdirect.event.SegmentGroupUpdated) obj;

    boolean result = true;
    result = result && (hasSegmentGroup() == other.hasSegmentGroup());
    if (hasSegmentGroup()) {
      result = result && getSegmentGroup()
          .equals(other.getSegmentGroup());
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
    if (hasSegmentGroup()) {
      hash = (37 * hash) + SEGMENTGROUP_FIELD_NUMBER;
      hash = (53 * hash) + getSegmentGroup().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.SegmentGroupUpdated parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.SegmentGroupUpdated parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.SegmentGroupUpdated parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.SegmentGroupUpdated parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.SegmentGroupUpdated parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.SegmentGroupUpdated parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.SegmentGroupUpdated parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.SegmentGroupUpdated parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.SegmentGroupUpdated parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.SegmentGroupUpdated parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.SegmentGroupUpdated prototype) {
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
   * Protobuf type {@code com.appdirect.event.SegmentGroupUpdated}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.SegmentGroupUpdated)
      com.appdirect.event.SegmentGroupUpdatedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.SegmentGroupEvent.internal_static_com_appdirect_event_SegmentGroupUpdated_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.SegmentGroupEvent.internal_static_com_appdirect_event_SegmentGroupUpdated_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.SegmentGroupUpdated.class, com.appdirect.event.SegmentGroupUpdated.Builder.class);
    }

    // Construct using com.appdirect.event.SegmentGroupUpdated.newBuilder()
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
      if (segmentGroupBuilder_ == null) {
        segmentGroup_ = null;
      } else {
        segmentGroup_ = null;
        segmentGroupBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appdirect.event.SegmentGroupEvent.internal_static_com_appdirect_event_SegmentGroupUpdated_descriptor;
    }

    public com.appdirect.event.SegmentGroupUpdated getDefaultInstanceForType() {
      return com.appdirect.event.SegmentGroupUpdated.getDefaultInstance();
    }

    public com.appdirect.event.SegmentGroupUpdated build() {
      com.appdirect.event.SegmentGroupUpdated result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.SegmentGroupUpdated buildPartial() {
      com.appdirect.event.SegmentGroupUpdated result = new com.appdirect.event.SegmentGroupUpdated(this);
      if (segmentGroupBuilder_ == null) {
        result.segmentGroup_ = segmentGroup_;
      } else {
        result.segmentGroup_ = segmentGroupBuilder_.build();
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
      if (other instanceof com.appdirect.event.SegmentGroupUpdated) {
        return mergeFrom((com.appdirect.event.SegmentGroupUpdated)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.SegmentGroupUpdated other) {
      if (other == com.appdirect.event.SegmentGroupUpdated.getDefaultInstance()) return this;
      if (other.hasSegmentGroup()) {
        mergeSegmentGroup(other.getSegmentGroup());
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
      com.appdirect.event.SegmentGroupUpdated parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.SegmentGroupUpdated) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.SegmentGroup segmentGroup_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.SegmentGroup, com.appdirect.event.SegmentGroup.Builder, com.appdirect.event.SegmentGroupOrBuilder> segmentGroupBuilder_;
    /**
     * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
     */
    public boolean hasSegmentGroup() {
      return segmentGroupBuilder_ != null || segmentGroup_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
     */
    public com.appdirect.event.SegmentGroup getSegmentGroup() {
      if (segmentGroupBuilder_ == null) {
        return segmentGroup_ == null ? com.appdirect.event.SegmentGroup.getDefaultInstance() : segmentGroup_;
      } else {
        return segmentGroupBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
     */
    public Builder setSegmentGroup(com.appdirect.event.SegmentGroup value) {
      if (segmentGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        segmentGroup_ = value;
        onChanged();
      } else {
        segmentGroupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
     */
    public Builder setSegmentGroup(
        com.appdirect.event.SegmentGroup.Builder builderForValue) {
      if (segmentGroupBuilder_ == null) {
        segmentGroup_ = builderForValue.build();
        onChanged();
      } else {
        segmentGroupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
     */
    public Builder mergeSegmentGroup(com.appdirect.event.SegmentGroup value) {
      if (segmentGroupBuilder_ == null) {
        if (segmentGroup_ != null) {
          segmentGroup_ =
            com.appdirect.event.SegmentGroup.newBuilder(segmentGroup_).mergeFrom(value).buildPartial();
        } else {
          segmentGroup_ = value;
        }
        onChanged();
      } else {
        segmentGroupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
     */
    public Builder clearSegmentGroup() {
      if (segmentGroupBuilder_ == null) {
        segmentGroup_ = null;
        onChanged();
      } else {
        segmentGroup_ = null;
        segmentGroupBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
     */
    public com.appdirect.event.SegmentGroup.Builder getSegmentGroupBuilder() {
      
      onChanged();
      return getSegmentGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
     */
    public com.appdirect.event.SegmentGroupOrBuilder getSegmentGroupOrBuilder() {
      if (segmentGroupBuilder_ != null) {
        return segmentGroupBuilder_.getMessageOrBuilder();
      } else {
        return segmentGroup_ == null ?
            com.appdirect.event.SegmentGroup.getDefaultInstance() : segmentGroup_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.SegmentGroup segmentGroup = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.SegmentGroup, com.appdirect.event.SegmentGroup.Builder, com.appdirect.event.SegmentGroupOrBuilder> 
        getSegmentGroupFieldBuilder() {
      if (segmentGroupBuilder_ == null) {
        segmentGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.SegmentGroup, com.appdirect.event.SegmentGroup.Builder, com.appdirect.event.SegmentGroupOrBuilder>(
                getSegmentGroup(),
                getParentForChildren(),
                isClean());
        segmentGroup_ = null;
      }
      return segmentGroupBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.SegmentGroupUpdated)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.SegmentGroupUpdated)
  private static final com.appdirect.event.SegmentGroupUpdated DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.SegmentGroupUpdated();
  }

  public static com.appdirect.event.SegmentGroupUpdated getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SegmentGroupUpdated>
      PARSER = new com.google.protobuf.AbstractParser<SegmentGroupUpdated>() {
    public SegmentGroupUpdated parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SegmentGroupUpdated(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SegmentGroupUpdated> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SegmentGroupUpdated> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.SegmentGroupUpdated getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

