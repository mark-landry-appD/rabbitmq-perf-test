// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscription.lifecycle.service.event.proto

package com.appdirect.event.subscription.service;

public interface SubscriptionFailedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.appdirect.event.subscription.service.SubscriptionFailed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 eventTimestamp = 1;</code>
   */
  long getEventTimestamp();

  /**
   * <code>optional .com.appdirect.event.subscription.SubscriptionInfo subscription = 3;</code>
   */
  boolean hasSubscription();
  /**
   * <code>optional .com.appdirect.event.subscription.SubscriptionInfo subscription = 3;</code>
   */
  com.appdirect.event.subscription.SubscriptionInfo getSubscription();
  /**
   * <code>optional .com.appdirect.event.subscription.SubscriptionInfo subscription = 3;</code>
   */
  com.appdirect.event.subscription.SubscriptionInfoOrBuilder getSubscriptionOrBuilder();
}
