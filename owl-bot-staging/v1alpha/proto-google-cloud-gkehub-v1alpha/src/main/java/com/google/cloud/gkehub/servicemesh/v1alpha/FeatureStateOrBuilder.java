// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/servicemesh/servicemesh.proto

package com.google.cloud.gkehub.servicemesh.v1alpha;

public interface FeatureStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.servicemesh.v1alpha.FeatureState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage> 
      getAnalysisMessagesList();
  /**
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage getAnalysisMessages(int index);
  /**
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getAnalysisMessagesCount();
  /**
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder> 
      getAnalysisMessagesOrBuilderList();
  /**
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder getAnalysisMessagesOrBuilder(
      int index);
}
