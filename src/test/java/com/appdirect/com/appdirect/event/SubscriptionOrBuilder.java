// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscription.proto

package com.appdirect.event;

public interface SubscriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.appdirect.event.Subscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.appdirect.event.Resource resource = 1;</code>
   */
  boolean hasResource();
  /**
   * <code>optional .com.appdirect.event.Resource resource = 1;</code>
   */
  com.appdirect.event.Resource getResource();
  /**
   * <code>optional .com.appdirect.event.Resource resource = 1;</code>
   */
  com.appdirect.event.ResourceOrBuilder getResourceOrBuilder();

  /**
   * <code>optional string addonParentSubscriptionId = 2;</code>
   */
  java.lang.String getAddonParentSubscriptionId();
  /**
   * <code>optional string addonParentSubscriptionId = 2;</code>
   */
  com.google.protobuf.ByteString
      getAddonParentSubscriptionIdBytes();

  /**
   * <code>optional int64 creationDate = 3;</code>
   */
  long getCreationDate();

  /**
   * <code>optional int64 endDate = 4;</code>
   */
  long getEndDate();

  /**
   * <code>optional string externalAccountId = 5;</code>
   */
  java.lang.String getExternalAccountId();
  /**
   * <code>optional string externalAccountId = 5;</code>
   */
  com.google.protobuf.ByteString
      getExternalAccountIdBytes();

  /**
   * <code>optional string status = 6;</code>
   */
  java.lang.String getStatus();
  /**
   * <code>optional string status = 6;</code>
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>optional int32 maxUsers = 7;</code>
   */
  int getMaxUsers();

  /**
   * <code>optional int32 assignedUsers = 8;</code>
   */
  int getAssignedUsers();

  /**
   * <code>optional .com.appdirect.event.PurchaseOrder order = 9;</code>
   */
  boolean hasOrder();
  /**
   * <code>optional .com.appdirect.event.PurchaseOrder order = 9;</code>
   */
  com.appdirect.event.PurchaseOrder getOrder();
  /**
   * <code>optional .com.appdirect.event.PurchaseOrder order = 9;</code>
   */
  com.appdirect.event.PurchaseOrderOrBuilder getOrderOrBuilder();

  /**
   * <code>optional string bundleParentSubscriptionId = 10;</code>
   */
  java.lang.String getBundleParentSubscriptionId();
  /**
   * <code>optional string bundleParentSubscriptionId = 10;</code>
   */
  com.google.protobuf.ByteString
      getBundleParentSubscriptionIdBytes();

  /**
   * <code>optional string userUuid = 11;</code>
   */
  java.lang.String getUserUuid();
  /**
   * <code>optional string userUuid = 11;</code>
   */
  com.google.protobuf.ByteString
      getUserUuidBytes();

  /**
   * <code>optional string companyUuid = 12;</code>
   */
  java.lang.String getCompanyUuid();
  /**
   * <code>optional string companyUuid = 12;</code>
   */
  com.google.protobuf.ByteString
      getCompanyUuidBytes();

  /**
   * <code>optional string productUuid = 13;</code>
   */
  java.lang.String getProductUuid();
  /**
   * <code>optional string productUuid = 13;</code>
   */
  com.google.protobuf.ByteString
      getProductUuidBytes();

  /**
   * <code>optional string editionUuid = 14;</code>
   */
  java.lang.String getEditionUuid();
  /**
   * <code>optional string editionUuid = 14;</code>
   */
  com.google.protobuf.ByteString
      getEditionUuidBytes();

  /**
   * <code>optional int64 integrationConfigurationId = 15;</code>
   */
  long getIntegrationConfigurationId();
}
