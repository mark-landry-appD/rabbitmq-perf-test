// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dataConnection.event.proto

package com.appdirect.event;

public interface DataConnectionUpdatedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.appdirect.event.DataConnectionUpdated)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.appdirect.event.DataConnection connection = 1;</code>
   */
  boolean hasConnection();
  /**
   * <code>optional .com.appdirect.event.DataConnection connection = 1;</code>
   */
  com.appdirect.event.DataConnection getConnection();
  /**
   * <code>optional .com.appdirect.event.DataConnection connection = 1;</code>
   */
  com.appdirect.event.DataConnectionOrBuilder getConnectionOrBuilder();

  /**
   * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
   */
  boolean hasMetadata();
  /**
   * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
   */
  com.appdirect.event.Metadata getMetadata();
  /**
   * <code>optional .com.appdirect.event.Metadata metadata = 2;</code>
   */
  com.appdirect.event.MetadataOrBuilder getMetadataOrBuilder();
}
