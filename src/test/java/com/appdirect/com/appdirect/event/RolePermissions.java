// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rolePermissions.proto

package com.appdirect.event;

/**
 * Protobuf type {@code com.appdirect.event.RolePermissions}
 */
public  final class RolePermissions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.appdirect.event.RolePermissions)
    RolePermissionsOrBuilder {
  // Use RolePermissions.newBuilder() to construct.
  private RolePermissions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RolePermissions() {
    roleId_ = "";
    permissions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RolePermissions(
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

            roleId_ = s;
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              permissions_ = new java.util.ArrayList<com.appdirect.event.Permission>();
              mutable_bitField0_ |= 0x00000004;
            }
            permissions_.add(
                input.readMessage(com.appdirect.event.Permission.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        permissions_ = java.util.Collections.unmodifiableList(permissions_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.appdirect.event.RolePermissionsOuterClass.internal_static_com_appdirect_event_RolePermissions_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.appdirect.event.RolePermissionsOuterClass.internal_static_com_appdirect_event_RolePermissions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.appdirect.event.RolePermissions.class, com.appdirect.event.RolePermissions.Builder.class);
  }

  private int bitField0_;
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

  public static final int ROLEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object roleId_;
  /**
   * <code>optional string roleId = 2;</code>
   */
  public java.lang.String getRoleId() {
    java.lang.Object ref = roleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roleId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string roleId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getRoleIdBytes() {
    java.lang.Object ref = roleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PERMISSIONS_FIELD_NUMBER = 5;
  private java.util.List<com.appdirect.event.Permission> permissions_;
  /**
   * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
   */
  public java.util.List<com.appdirect.event.Permission> getPermissionsList() {
    return permissions_;
  }
  /**
   * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
   */
  public java.util.List<? extends com.appdirect.event.PermissionOrBuilder> 
      getPermissionsOrBuilderList() {
    return permissions_;
  }
  /**
   * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
   */
  public int getPermissionsCount() {
    return permissions_.size();
  }
  /**
   * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
   */
  public com.appdirect.event.Permission getPermissions(int index) {
    return permissions_.get(index);
  }
  /**
   * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
   */
  public com.appdirect.event.PermissionOrBuilder getPermissionsOrBuilder(
      int index) {
    return permissions_.get(index);
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
    if (!getRoleIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roleId_);
    }
    for (int i = 0; i < permissions_.size(); i++) {
      output.writeMessage(5, permissions_.get(i));
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
    if (!getRoleIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roleId_);
    }
    for (int i = 0; i < permissions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, permissions_.get(i));
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
    if (!(obj instanceof com.appdirect.event.RolePermissions)) {
      return super.equals(obj);
    }
    com.appdirect.event.RolePermissions other = (com.appdirect.event.RolePermissions) obj;

    boolean result = true;
    result = result && (hasResource() == other.hasResource());
    if (hasResource()) {
      result = result && getResource()
          .equals(other.getResource());
    }
    result = result && getRoleId()
        .equals(other.getRoleId());
    result = result && getPermissionsList()
        .equals(other.getPermissionsList());
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
    hash = (37 * hash) + ROLEID_FIELD_NUMBER;
    hash = (53 * hash) + getRoleId().hashCode();
    if (getPermissionsCount() > 0) {
      hash = (37 * hash) + PERMISSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPermissionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.appdirect.event.RolePermissions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.RolePermissions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.RolePermissions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.appdirect.event.RolePermissions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.appdirect.event.RolePermissions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.RolePermissions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.RolePermissions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.appdirect.event.RolePermissions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.appdirect.event.RolePermissions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.appdirect.event.RolePermissions parseFrom(
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
  public static Builder newBuilder(com.appdirect.event.RolePermissions prototype) {
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
   * Protobuf type {@code com.appdirect.event.RolePermissions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.appdirect.event.RolePermissions)
      com.appdirect.event.RolePermissionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.appdirect.event.RolePermissionsOuterClass.internal_static_com_appdirect_event_RolePermissions_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.appdirect.event.RolePermissionsOuterClass.internal_static_com_appdirect_event_RolePermissions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.appdirect.event.RolePermissions.class, com.appdirect.event.RolePermissions.Builder.class);
    }

    // Construct using com.appdirect.event.RolePermissions.newBuilder()
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
        getPermissionsFieldBuilder();
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
      roleId_ = "";

      if (permissionsBuilder_ == null) {
        permissions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        permissionsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.appdirect.event.RolePermissionsOuterClass.internal_static_com_appdirect_event_RolePermissions_descriptor;
    }

    public com.appdirect.event.RolePermissions getDefaultInstanceForType() {
      return com.appdirect.event.RolePermissions.getDefaultInstance();
    }

    public com.appdirect.event.RolePermissions build() {
      com.appdirect.event.RolePermissions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.appdirect.event.RolePermissions buildPartial() {
      com.appdirect.event.RolePermissions result = new com.appdirect.event.RolePermissions(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (resourceBuilder_ == null) {
        result.resource_ = resource_;
      } else {
        result.resource_ = resourceBuilder_.build();
      }
      result.roleId_ = roleId_;
      if (permissionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          permissions_ = java.util.Collections.unmodifiableList(permissions_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.permissions_ = permissions_;
      } else {
        result.permissions_ = permissionsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.appdirect.event.RolePermissions) {
        return mergeFrom((com.appdirect.event.RolePermissions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.appdirect.event.RolePermissions other) {
      if (other == com.appdirect.event.RolePermissions.getDefaultInstance()) return this;
      if (other.hasResource()) {
        mergeResource(other.getResource());
      }
      if (!other.getRoleId().isEmpty()) {
        roleId_ = other.roleId_;
        onChanged();
      }
      if (permissionsBuilder_ == null) {
        if (!other.permissions_.isEmpty()) {
          if (permissions_.isEmpty()) {
            permissions_ = other.permissions_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensurePermissionsIsMutable();
            permissions_.addAll(other.permissions_);
          }
          onChanged();
        }
      } else {
        if (!other.permissions_.isEmpty()) {
          if (permissionsBuilder_.isEmpty()) {
            permissionsBuilder_.dispose();
            permissionsBuilder_ = null;
            permissions_ = other.permissions_;
            bitField0_ = (bitField0_ & ~0x00000004);
            permissionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPermissionsFieldBuilder() : null;
          } else {
            permissionsBuilder_.addAllMessages(other.permissions_);
          }
        }
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
      com.appdirect.event.RolePermissions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.appdirect.event.RolePermissions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

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

    private java.lang.Object roleId_ = "";
    /**
     * <code>optional string roleId = 2;</code>
     */
    public java.lang.String getRoleId() {
      java.lang.Object ref = roleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string roleId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getRoleIdBytes() {
      java.lang.Object ref = roleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string roleId = 2;</code>
     */
    public Builder setRoleId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      roleId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string roleId = 2;</code>
     */
    public Builder clearRoleId() {
      
      roleId_ = getDefaultInstance().getRoleId();
      onChanged();
      return this;
    }
    /**
     * <code>optional string roleId = 2;</code>
     */
    public Builder setRoleIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      roleId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.appdirect.event.Permission> permissions_ =
      java.util.Collections.emptyList();
    private void ensurePermissionsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        permissions_ = new java.util.ArrayList<com.appdirect.event.Permission>(permissions_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appdirect.event.Permission, com.appdirect.event.Permission.Builder, com.appdirect.event.PermissionOrBuilder> permissionsBuilder_;

    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public java.util.List<com.appdirect.event.Permission> getPermissionsList() {
      if (permissionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(permissions_);
      } else {
        return permissionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public int getPermissionsCount() {
      if (permissionsBuilder_ == null) {
        return permissions_.size();
      } else {
        return permissionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public com.appdirect.event.Permission getPermissions(int index) {
      if (permissionsBuilder_ == null) {
        return permissions_.get(index);
      } else {
        return permissionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public Builder setPermissions(
        int index, com.appdirect.event.Permission value) {
      if (permissionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePermissionsIsMutable();
        permissions_.set(index, value);
        onChanged();
      } else {
        permissionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public Builder setPermissions(
        int index, com.appdirect.event.Permission.Builder builderForValue) {
      if (permissionsBuilder_ == null) {
        ensurePermissionsIsMutable();
        permissions_.set(index, builderForValue.build());
        onChanged();
      } else {
        permissionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public Builder addPermissions(com.appdirect.event.Permission value) {
      if (permissionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePermissionsIsMutable();
        permissions_.add(value);
        onChanged();
      } else {
        permissionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public Builder addPermissions(
        int index, com.appdirect.event.Permission value) {
      if (permissionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePermissionsIsMutable();
        permissions_.add(index, value);
        onChanged();
      } else {
        permissionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public Builder addPermissions(
        com.appdirect.event.Permission.Builder builderForValue) {
      if (permissionsBuilder_ == null) {
        ensurePermissionsIsMutable();
        permissions_.add(builderForValue.build());
        onChanged();
      } else {
        permissionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public Builder addPermissions(
        int index, com.appdirect.event.Permission.Builder builderForValue) {
      if (permissionsBuilder_ == null) {
        ensurePermissionsIsMutable();
        permissions_.add(index, builderForValue.build());
        onChanged();
      } else {
        permissionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public Builder addAllPermissions(
        java.lang.Iterable<? extends com.appdirect.event.Permission> values) {
      if (permissionsBuilder_ == null) {
        ensurePermissionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, permissions_);
        onChanged();
      } else {
        permissionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public Builder clearPermissions() {
      if (permissionsBuilder_ == null) {
        permissions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        permissionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public Builder removePermissions(int index) {
      if (permissionsBuilder_ == null) {
        ensurePermissionsIsMutable();
        permissions_.remove(index);
        onChanged();
      } else {
        permissionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public com.appdirect.event.Permission.Builder getPermissionsBuilder(
        int index) {
      return getPermissionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public com.appdirect.event.PermissionOrBuilder getPermissionsOrBuilder(
        int index) {
      if (permissionsBuilder_ == null) {
        return permissions_.get(index);  } else {
        return permissionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public java.util.List<? extends com.appdirect.event.PermissionOrBuilder> 
         getPermissionsOrBuilderList() {
      if (permissionsBuilder_ != null) {
        return permissionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(permissions_);
      }
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public com.appdirect.event.Permission.Builder addPermissionsBuilder() {
      return getPermissionsFieldBuilder().addBuilder(
          com.appdirect.event.Permission.getDefaultInstance());
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public com.appdirect.event.Permission.Builder addPermissionsBuilder(
        int index) {
      return getPermissionsFieldBuilder().addBuilder(
          index, com.appdirect.event.Permission.getDefaultInstance());
    }
    /**
     * <code>repeated .com.appdirect.event.Permission permissions = 5;</code>
     */
    public java.util.List<com.appdirect.event.Permission.Builder> 
         getPermissionsBuilderList() {
      return getPermissionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.appdirect.event.Permission, com.appdirect.event.Permission.Builder, com.appdirect.event.PermissionOrBuilder> 
        getPermissionsFieldBuilder() {
      if (permissionsBuilder_ == null) {
        permissionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.appdirect.event.Permission, com.appdirect.event.Permission.Builder, com.appdirect.event.PermissionOrBuilder>(
                permissions_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        permissions_ = null;
      }
      return permissionsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.appdirect.event.RolePermissions)
  }

  // @@protoc_insertion_point(class_scope:com.appdirect.event.RolePermissions)
  private static final com.appdirect.event.RolePermissions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.appdirect.event.RolePermissions();
  }

  public static com.appdirect.event.RolePermissions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RolePermissions>
      PARSER = new com.google.protobuf.AbstractParser<RolePermissions>() {
    public RolePermissions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RolePermissions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RolePermissions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RolePermissions> getParserForType() {
    return PARSER;
  }

  public com.appdirect.event.RolePermissions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

