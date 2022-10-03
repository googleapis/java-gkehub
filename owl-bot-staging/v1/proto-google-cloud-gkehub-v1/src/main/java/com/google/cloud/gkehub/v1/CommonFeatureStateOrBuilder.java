// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1/feature.proto

package com.google.cloud.gkehub.v1;

public interface CommonFeatureStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1.CommonFeatureState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The "running state" of the Feature in this Hub.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   * <pre>
   * Output only. The "running state" of the Feature in this Hub.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.gkehub.v1.FeatureState getState();
  /**
   * <pre>
   * Output only. The "running state" of the Feature in this Hub.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gkehub.v1.FeatureStateOrBuilder getStateOrBuilder();
}
