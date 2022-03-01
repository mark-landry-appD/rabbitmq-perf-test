// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: invoice.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.InvoiceLine}
 */
public  final class InvoiceLine extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.InvoiceLine)
    InvoiceLineOrBuilder {
  // Use InvoiceLine.newBuilder() to construct.
  private InvoiceLine(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InvoiceLine() {
    invoiceLineType_ = "";
    quantity_ = 0L;
    price_ = 0D;
    total_ = 0D;
    periodStart_ = 0L;
    periodEnd_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private InvoiceLine(
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
            com.appdirect.event.Resource.Builder subBuilder = null;
            if (resource_ != null) {
              subBuilder = resource_.toBuilder();
            }
            resource_ = input.readMessage(com.appdirect.event.Resource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resource_);
              resource_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            invoiceLineType_ = s;
            break;
          }
          case 24: {

            quantity_ = input.readInt64();
            break;
          }
          case 33: {

            price_ = input.readDouble();
            break;
          }
          case 41: {

            total_ = input.readDouble();
            break;
          }
          case 48: {

            periodStart_ = input.readInt64();
            break;
          }
          case 56: {

            periodEnd_ = input.readInt64();
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
    return com.appdirect.event.InvoiceOuterClass.internal_static_com_appdirect_event_InvoiceLine_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.InvoiceOuterClass.internal_static_com_appdirect_event_InvoiceLine_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.InvoiceLine.class, com.appdirect.event.InvoiceLine.Builder.class);
  }

  public static final int RESOURCE_FIELD_NUMBER = 1;
  private com.appdirect.event.Resource resource_;
  /**
   * <code>optional .com.appdirect.event.Resource resource = 1;</code>
   */
  public boolean hasResource() {
    return resource_ != null;
  }
  /**
   * <code>optional .com.appdirect.event.Resource resource = 1;</code>
   */
  public com.appdirect.event.Resource getResource() {
    return resource_ == null ? com.appdirect.event.Resource.getDefaultInstance() : resource_;
  }
  /**
   * <code>optional .com.appdirect.event.Resource resource = 1;</code>
   */
  public com.appdirect.event.ResourceOrBuilder getResourceOrBuilder() {
    return getResource();
  }

  public static final int INVOICELINETYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object invoiceLineType_;
  /**
   * <code>optional string invoiceLineType = 2;</code>
   */
  public java.lang.String getInvoiceLineType() {
    java.lang.Object ref = invoiceLineType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      invoiceLineType_ = s;
      return s;
    }
  }
  /**
   * <code>optional string invoiceLineType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getInvoiceLineTypeBytes() {
    java.lang.Object ref = invoiceLineType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      invoiceLineType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUANTITY_FIELD_NUMBER = 3;
  private long quantity_;
  /**
   * <code>optional int64 quantity = 3;</code>
   */
  public long getQuantity() {
    return quantity_;
  }

  public static final int PRICE_FIELD_NUMBER = 4;
  private double price_;
  /**
   * <code>optional double price = 4;</code>
   */
  public double getPrice() {
    return price_;
  }

  public static final int TOTAL_FIELD_NUMBER = 5;
  private double total_;
  /**
   * <code>optional double total = 5;</code>
   */
  public double getTotal() {
    return total_;
  }

  public static final int PERIODSTART_FIELD_NUMBER = 6;
  private long periodStart_;
  /**
   * <code>optional int64 periodStart = 6;</code>
   */
  public long getPeriodStart() {
    return periodStart_;
  }

  public static final int PERIODEND_FIELD_NUMBER = 7;
  private long periodEnd_;
  /**
   * <code>optional int64 periodEnd = 7;</code>
   */
  public long getPeriodEnd() {
    return periodEnd_;
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
    if (resource_ != null) {
      output.writeMessage(1, getResource());
    }
    if (!getInvoiceLineTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, invoiceLineType_);
    }
    if (quantity_ != 0L) {
      output.writeInt64(3, quantity_);
    }
    if (price_ != 0D) {
      output.writeDouble(4, price_);
    }
    if (total_ != 0D) {
      output.writeDouble(5, total_);
    }
    if (periodStart_ != 0L) {
      output.writeInt64(6, periodStart_);
    }
    if (periodEnd_ != 0L) {
      output.writeInt64(7, periodEnd_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resource_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResource());
    }
    if (!getInvoiceLineTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, invoiceLineType_);
    }
    if (quantity_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, quantity_);
    }
    if (price_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, price_);
    }
    if (total_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, total_);
    }
    if (periodStart_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, periodStart_);
    }
    if (periodEnd_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, periodEnd_);
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
    if (!(obj instanceof com.appdirect.event.InvoiceLine)) {
      return super.equals(obj);
    }
    com.appdirect.event.InvoiceLine other = (com.appdirect.event.InvoiceLine) obj;

    boolean result = true;
    result = result && (hasResource() == other.hasResource());
    if (hasResource()) {
      result = result && getResource()
          .equals(other.getResource());
    }
    result = result && getInvoiceLineType()
        .equals(other.getInvoiceLineType());
    result = result && (getQuantity()
        == other.getQuantity());
    result = result && (
        java.lang.Double.doubleToLongBits(getPrice())
        == java.lang.Double.doubleToLongBits(
            other.getPrice()));
    result = result && (
        java.lang.Double.doubleToLongBits(getTotal())
        == java.lang.Double.doubleToLongBits(
            other.getTotal()));
    result = result && (getPeriodStart()
        == other.getPeriodStart());
    result = result && (getPeriodEnd()
        == other.getPeriodEnd());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasResource()) {
      hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getResource().hashCode();
    }
    hash = (37 * hash) + INVOICELINETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getInvoiceLineType().hashCode();
    hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQuantity());
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (37 * hash) + TOTAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTotal()));
    hash = (37 * hash) + PERIODSTART_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPeriodStart());
    hash = (37 * hash) + PERIODEND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPeriodEnd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.InvoiceLine parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.InvoiceLine parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.InvoiceLine parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.InvoiceLine parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.InvoiceLine parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.InvoiceLine parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.InvoiceLine parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.InvoiceLine parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.InvoiceLine parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.InvoiceLine parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.InvoiceLine prototype) {
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
   * Protobuf type {@code com.appdirect.event.InvoiceLine}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.InvoiceLine)
      com.appdirect.event.InvoiceLineOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.InvoiceOuterClass.internal_static_com_appdirect_event_InvoiceLine_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.InvoiceOuterClass.internal_static_com_appdirect_event_InvoiceLine_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.InvoiceLine.class, com.appdirect.event.InvoiceLine.Builder.class);
    }

    // Construct using com.appdirect.event.InvoiceLine.newBuilder()
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
      if (resourceBuilder_ == null) {
        resource_ = null;
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }
      invoiceLineType_ = "";

      quantity_ = 0L;

      price_ = 0D;

      total_ = 0D;

      periodStart_ = 0L;

      periodEnd_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appdirect.event.InvoiceOuterClass.internal_static_com_appdirect_event_InvoiceLine_descriptor;
    }

    public com.appdirect.event.InvoiceLine getDefaultInstanceForType() {
      return com.appdirect.event.InvoiceLine.getDefaultInstance();
    }

    public com.appdirect.event.InvoiceLine build() {
      com.appdirect.event.InvoiceLine result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.InvoiceLine buildPartial() {
      com.appdirect.event.InvoiceLine result = new com.appdirect.event.InvoiceLine(this);
      if (resourceBuilder_ == null) {
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
      }
      result.invoiceLineType_ = invoiceLineType_;
      result.quantity_ = quantity_;
      result.price_ = price_;
      result.total_ = total_;
      result.periodStart_ = periodStart_;
      result.periodEnd_ = periodEnd_;
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
      if (other instanceof com.appdirect.event.InvoiceLine) {
        return mergeFrom((com.appdirect.event.InvoiceLine)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.InvoiceLine other) {
      if (other == com.appdirect.event.InvoiceLine.getDefaultInstance()) return this;
      if (other.hasResource()) {
        mergeResource(other.getResource());
      }
      if (!other.getInvoiceLineType().isEmpty()) {
        invoiceLineType_ = other.invoiceLineType_;
        onChanged();
      }
      if (other.getQuantity() != 0L) {
        setQuantity(other.getQuantity());
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
      }
      if (other.getTotal() != 0D) {
        setTotal(other.getTotal());
      }
      if (other.getPeriodStart() != 0L) {
        setPeriodStart(other.getPeriodStart());
      }
      if (other.getPeriodEnd() != 0L) {
        setPeriodEnd(other.getPeriodEnd());
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
      com.appdirect.event.InvoiceLine parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.InvoiceLine) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.appdirect.event.Resource resource_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Resource, com.appdirect.event.Resource.Builder, com.appdirect.event.ResourceOrBuilder> resourceBuilder_;
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public boolean hasResource() {
      return resourceBuilder_ != null || resource_ != null;
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public com.appdirect.event.Resource getResource() {
      if (resourceBuilder_ == null) {
        return resource_ == null ? com.appdirect.event.Resource.getDefaultInstance() : resource_;
      } else {
        return resourceBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public Builder setResource(com.appdirect.event.Resource value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resource_ = value;
        onChanged();
      } else {
        resourceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public Builder setResource(
        com.appdirect.event.Resource.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        resource_ = builderForValue.build();
        onChanged();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public Builder mergeResource(com.appdirect.event.Resource value) {
      if (resourceBuilder_ == null) {
        if (resource_ != null) {
          resource_ =
            com.appdirect.event.Resource.newBuilder(resource_).mergeFrom(value).buildPartial();
        } else {
          resource_ = value;
        }
        onChanged();
      } else {
        resourceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        resource_ = null;
        onChanged();
      } else {
        resource_ = null;
        resourceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public com.appdirect.event.Resource.Builder getResourceBuilder() {
      
      onChanged();
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    public com.appdirect.event.ResourceOrBuilder getResourceOrBuilder() {
      if (resourceBuilder_ != null) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        return resource_ == null ?
            com.appdirect.event.Resource.getDefaultInstance() : resource_;
      }
    }
    /**
     * <code>optional .com.appdirect.event.Resource resource = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.appdirect.event.Resource, com.appdirect.event.Resource.Builder, com.appdirect.event.ResourceOrBuilder> 
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        resourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.appdirect.event.Resource, com.appdirect.event.Resource.Builder, com.appdirect.event.ResourceOrBuilder>(
                getResource(),
                getParentForChildren(),
                isClean());
        resource_ = null;
      }
      return resourceBuilder_;
    }

    private java.lang.Object invoiceLineType_ = "";
    /**
     * <code>optional string invoiceLineType = 2;</code>
     */
    public java.lang.String getInvoiceLineType() {
      java.lang.Object ref = invoiceLineType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        invoiceLineType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string invoiceLineType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getInvoiceLineTypeBytes() {
      java.lang.Object ref = invoiceLineType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        invoiceLineType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string invoiceLineType = 2;</code>
     */
    public Builder setInvoiceLineType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      invoiceLineType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string invoiceLineType = 2;</code>
     */
    public Builder clearInvoiceLineType() {
      
      invoiceLineType_ = getDefaultInstance().getInvoiceLineType();
      onChanged();
      return this;
    }
    /**
     * <code>optional string invoiceLineType = 2;</code>
     */
    public Builder setInvoiceLineTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      invoiceLineType_ = value;
      onChanged();
      return this;
    }

    private long quantity_ ;
    /**
     * <code>optional int64 quantity = 3;</code>
     */
    public long getQuantity() {
      return quantity_;
    }
    /**
     * <code>optional int64 quantity = 3;</code>
     */
    public Builder setQuantity(long value) {
      
      quantity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 quantity = 3;</code>
     */
    public Builder clearQuantity() {
      
      quantity_ = 0L;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>optional double price = 4;</code>
     */
    public double getPrice() {
      return price_;
    }
    /**
     * <code>optional double price = 4;</code>
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double price = 4;</code>
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }

    private double total_ ;
    /**
     * <code>optional double total = 5;</code>
     */
    public double getTotal() {
      return total_;
    }
    /**
     * <code>optional double total = 5;</code>
     */
    public Builder setTotal(double value) {
      
      total_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional double total = 5;</code>
     */
    public Builder clearTotal() {
      
      total_ = 0D;
      onChanged();
      return this;
    }

    private long periodStart_ ;
    /**
     * <code>optional int64 periodStart = 6;</code>
     */
    public long getPeriodStart() {
      return periodStart_;
    }
    /**
     * <code>optional int64 periodStart = 6;</code>
     */
    public Builder setPeriodStart(long value) {
      
      periodStart_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 periodStart = 6;</code>
     */
    public Builder clearPeriodStart() {
      
      periodStart_ = 0L;
      onChanged();
      return this;
    }

    private long periodEnd_ ;
    /**
     * <code>optional int64 periodEnd = 7;</code>
     */
    public long getPeriodEnd() {
      return periodEnd_;
    }
    /**
     * <code>optional int64 periodEnd = 7;</code>
     */
    public Builder setPeriodEnd(long value) {
      
      periodEnd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 periodEnd = 7;</code>
     */
    public Builder clearPeriodEnd() {
      
      periodEnd_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.InvoiceLine)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.InvoiceLine)
  private static final com.appdirect.event.InvoiceLine DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.InvoiceLine();
  }

  public static com.appdirect.event.InvoiceLine getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvoiceLine>
      PARSER = new com.google.protobuf.AbstractParser<InvoiceLine>() {
    public InvoiceLine parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InvoiceLine(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InvoiceLine> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvoiceLine> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.InvoiceLine getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

