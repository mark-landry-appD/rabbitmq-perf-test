// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customAttribute.proto

package com.appdirect.event;

public interface CustomAttributeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.appdirect.event.CustomAttribute)
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
   * <code>optional string key = 2;</code>
   */
  java.lang.String getKey();
  /**
   * <code>optional string key = 2;</code>
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <code>map&lt;string, string&gt; label = 3;</code>
   */
  int getLabelCount();
  /**
   * <code>map&lt;string, string&gt; label = 3;</code>
   */
  boolean containsLabel(
      java.lang.String key);
  /**
   * Use {@link #getLabelMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabel();
  /**
   * <code>map&lt;string, string&gt; label = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelMap();
  /**
   * <code>map&lt;string, string&gt; label = 3;</code>
   */

  java.lang.String getLabelOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; label = 3;</code>
   */

  java.lang.String getLabelOrThrow(
      java.lang.String key);

  /**
   * <code>map&lt;string, string&gt; hint = 4;</code>
   */
  int getHintCount();
  /**
   * <code>map&lt;string, string&gt; hint = 4;</code>
   */
  boolean containsHint(
      java.lang.String key);
  /**
   * Use {@link #getHintMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHint();
  /**
   * <code>map&lt;string, string&gt; hint = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHintMap();
  /**
   * <code>map&lt;string, string&gt; hint = 4;</code>
   */

  java.lang.String getHintOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; hint = 4;</code>
   */

  java.lang.String getHintOrThrow(
      java.lang.String key);

  /**
   * <code>optional string companyUUID = 5;</code>
   */
  java.lang.String getCompanyUUID();
  /**
   * <code>optional string companyUUID = 5;</code>
   */
  com.google.protobuf.ByteString
      getCompanyUUIDBytes();

  /**
   * <code>optional .com.appdirect.event.EntityType entityType = 6;</code>
   */
  int getEntityTypeValue();
  /**
   * <code>optional .com.appdirect.event.EntityType entityType = 6;</code>
   */
  com.appdirect.event.EntityType getEntityType();

  /**
   * <code>optional string partner = 7;</code>
   */
  java.lang.String getPartner();
  /**
   * <code>optional string partner = 7;</code>
   */
  com.google.protobuf.ByteString
      getPartnerBytes();

  /**
   * <code>optional bool system = 8;</code>
   */
  boolean getSystem();

  /**
   * <code>optional .com.appdirect.event.AttributeType attributeType = 9;</code>
   */
  int getAttributeTypeValue();
  /**
   * <code>optional .com.appdirect.event.AttributeType attributeType = 9;</code>
   */
  com.appdirect.event.AttributeType getAttributeType();
}
