/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/service.proto

package com.google.cloud.gkehub.v1alpha;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_ListFeaturesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_ListFeaturesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_ListFeaturesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_ListFeaturesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_GetFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_GetFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_CreateFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_CreateFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_DeleteFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_DeleteFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_UpdateFeatureRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_UpdateFeatureRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1alpha_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1alpha_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/gkehub/v1alpha/service.pr"
          + "oto\022\033google.cloud.gkehub.v1alpha\032\034google"
          + "/api/annotations.proto\032\027google/api/clien"
          + "t.proto\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\032)google/clou"
          + "d/gkehub/v1alpha/feature.proto\032#google/l"
          + "ongrunning/operations.proto\032 google/prot"
          + "obuf/field_mask.proto\032\037google/protobuf/t"
          + "imestamp.proto\"n\n\023ListFeaturesRequest\022\016\n"
          + "\006parent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage"
          + "_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by"
          + "\030\005 \001(\t\"h\n\024ListFeaturesResponse\0227\n\tresour"
          + "ces\030\001 \003(\0132$.google.cloud.gkehub.v1alpha."
          + "Feature\022\027\n\017next_page_token\030\002 \001(\t\"!\n\021GetF"
          + "eatureRequest\022\014\n\004name\030\001 \001(\t\"\213\001\n\024CreateFe"
          + "atureRequest\022\016\n\006parent\030\001 \001(\t\022\022\n\nfeature_"
          + "id\030\002 \001(\t\0226\n\010resource\030\003 \001(\0132$.google.clou"
          + "d.gkehub.v1alpha.Feature\022\027\n\nrequest_id\030\004"
          + " \001(\tB\003\340A\001\"L\n\024DeleteFeatureRequest\022\014\n\004nam"
          + "e\030\001 \001(\t\022\r\n\005force\030\002 \001(\010\022\027\n\nrequest_id\030\003 \001"
          + "(\tB\003\340A\001\"\246\001\n\024UpdateFeatureRequest\022\014\n\004name"
          + "\030\001 \001(\t\022/\n\013update_mask\030\002 \001(\0132\032.google.pro"
          + "tobuf.FieldMask\0226\n\010resource\030\003 \001(\0132$.goog"
          + "le.cloud.gkehub.v1alpha.Feature\022\027\n\nreque"
          + "st_id\030\004 \001(\tB\003\340A\001\"\371\001\n\021OperationMetadata\0224"
          + "\n\013create_time\030\001 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 \001(\tB"
          + "\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\032\n\rstatus_detail"
          + "\030\005 \001(\tB\003\340A\003\022\035\n\020cancel_requested\030\006 \001(\010B\003\340"
          + "A\003\022\030\n\013api_version\030\007 \001(\tB\003\340A\0032\320\010\n\006GkeHub\022"
          + "\267\001\n\014ListFeatures\0220.google.cloud.gkehub.v"
          + "1alpha.ListFeaturesRequest\0321.google.clou"
          + "d.gkehub.v1alpha.ListFeaturesResponse\"B\202"
          + "\323\344\223\0023\0221/v1alpha/{parent=projects/*/locat"
          + "ions/*}/features\332A\006parent\022\244\001\n\nGetFeature"
          + "\022..google.cloud.gkehub.v1alpha.GetFeatur"
          + "eRequest\032$.google.cloud.gkehub.v1alpha.F"
          + "eature\"@\202\323\344\223\0023\0221/v1alpha/{name=projects/"
          + "*/locations/*/features/*}\332A\004name\022\342\001\n\rCre"
          + "ateFeature\0221.google.cloud.gkehub.v1alpha"
          + ".CreateFeatureRequest\032\035.google.longrunni"
          + "ng.Operation\"\177\202\323\344\223\002=\"1/v1alpha/{parent=p"
          + "rojects/*/locations/*}/features:\010resourc"
          + "e\332A\032parent,resource,feature_id\312A\034\n\007Featu"
          + "re\022\021OperationMetadata\022\320\001\n\rDeleteFeature\022"
          + "1.google.cloud.gkehub.v1alpha.DeleteFeat"
          + "ureRequest\032\035.google.longrunning.Operatio"
          + "n\"m\202\323\344\223\0023*1/v1alpha/{name=projects/*/loc"
          + "ations/*/features/*}\332A\004name\312A*\n\025google.p"
          + "rotobuf.Empty\022\021OperationMetadata\022\341\001\n\rUpd"
          + "ateFeature\0221.google.cloud.gkehub.v1alpha"
          + ".UpdateFeatureRequest\032\035.google.longrunni"
          + "ng.Operation\"~\202\323\344\223\002=21/v1alpha/{name=pro"
          + "jects/*/locations/*/features/*}:\010resourc"
          + "e\332A\031name,resource,update_mask\312A\034\n\007Featur"
          + "e\022\021OperationMetadata\032I\312A\025gkehub.googleap"
          + "is.com\322A.https://www.googleapis.com/auth"
          + "/cloud-platformB\321\001\n\037com.google.cloud.gke"
          + "hub.v1alphaB\014ServiceProtoP\001ZAgoogle.gola"
          + "ng.org/genproto/googleapis/cloud/gkehub/"
          + "v1alpha;gkehub\252\002\033Google.Cloud.GkeHub.V1A"
          + "lpha\312\002\033Google\\Cloud\\GkeHub\\V1alpha\352\002\036Goo"
          + "gle::Cloud::GkeHub::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkehub.v1alpha.FeatureProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkehub_v1alpha_ListFeaturesRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_v1alpha_ListFeaturesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_ListFeaturesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gkehub_v1alpha_ListFeaturesResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkehub_v1alpha_ListFeaturesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_ListFeaturesResponse_descriptor,
            new java.lang.String[] {
              "Resources", "NextPageToken",
            });
    internal_static_google_cloud_gkehub_v1alpha_GetFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkehub_v1alpha_GetFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_GetFeatureRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gkehub_v1alpha_CreateFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkehub_v1alpha_CreateFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_CreateFeatureRequest_descriptor,
            new java.lang.String[] {
              "Parent", "FeatureId", "Resource", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1alpha_DeleteFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkehub_v1alpha_DeleteFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_DeleteFeatureRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1alpha_UpdateFeatureRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkehub_v1alpha_UpdateFeatureRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_UpdateFeatureRequest_descriptor,
            new java.lang.String[] {
              "Name", "UpdateMask", "Resource", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1alpha_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkehub_v1alpha_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1alpha_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusDetail",
              "CancelRequested",
              "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkehub.v1alpha.FeatureProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
