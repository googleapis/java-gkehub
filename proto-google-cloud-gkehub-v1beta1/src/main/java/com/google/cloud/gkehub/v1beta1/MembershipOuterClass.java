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
// source: google/cloud/gkehub/v1beta1/membership.proto

package com.google.cloud.gkehub.v1beta1;

public final class MembershipOuterClass {
  private MembershipOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_Membership_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_Membership_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_Membership_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_Membership_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_MembershipEndpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_MembershipEndpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_KubernetesResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_KubernetesResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_ResourceOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_ResourceOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_ResourceManifest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_ResourceManifest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_GkeCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_GkeCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_OnPremCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_OnPremCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_MultiCloudCluster_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_MultiCloudCluster_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_KubernetesMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_KubernetesMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_Authority_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_Authority_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_MembershipState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_MembershipState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_ListMembershipsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_ListMembershipsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_ListMembershipsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_ListMembershipsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_GetMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_GetMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_CreateMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_CreateMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_DeleteMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_DeleteMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_UpdateMembershipRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_UpdateMembershipRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_ConnectAgentResource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_ConnectAgentResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_TypeMeta_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_TypeMeta_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_ConnectAgent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_ConnectAgent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkehub_v1beta1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkehub_v1beta1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ",google/cloud/gkehub/v1beta1/membership"
          + ".proto\022\033google.cloud.gkehub.v1beta1\032\034goo"
          + "gle/api/annotations.proto\032\027google/api/cl"
          + "ient.proto\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032#google/longrunning/operations.proto\032"
          + " google/protobuf/field_mask.proto\032\037google/protobuf/t"
          + "imestamp.proto\032\027google/rpc/status.proto\"\271\007\n\n"
          + "Membership\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022H\n"
          + "\006labels\030\002"
          + " \003(\01323.google.cloud.gkehub.v1beta1.Membership.LabelsEntryB\003\340A\001\022\030\n"
          + "\013description\030\003 \001(\tB\003\340A\001\022H\n"
          + "\010endpoint\030\004 \001(\0132/.google"
          + ".cloud.gkehub.v1beta1.MembershipEndpointB\003\340A\001H\000\022@\n"
          + "\005state\030\005"
          + " \001(\0132,.google.cloud.gkehub.v1beta1.MembershipStateB\003\340A\003\022>\n"
          + "\tauthority\030\t"
          + " \001(\0132&.google.cloud.gkehub.v1beta1.AuthorityB\003\340A\001\0224\n"
          + "\013create_time\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\007 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013delete_time\030\010"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\030\n"
          + "\013external_id\030\n"
          + " \001(\tB\003\340A\001\022=\n"
          + "\024last_connection_time\030\013"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\026\n"
          + "\tunique_id\030\014 \001(\tB\003\340A\003\022\\\n"
          + "\023infrastructure_type\030\r"
          + " \001("
          + "\0162:.google.cloud.gkehub.v1beta1.Membership.InfrastructureTypeB\003\340A\001\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"W\n"
          + "\022InfrastructureType\022#\n"
          + "\037INFRASTRUCTURE_TYPE_UNSPECIFIED\020\000\022\013\n"
          + "\007ON_PREM\020\001\022\017\n"
          + "\013MULTI_CLOUD\020\002:g\352Ad\n"
          + " gkehub.googleapis.com/Membershi"
          + "p\022@projects/{project}/locations/{location}/memberships/{membership}B\006\n"
          + "\004type\"\247\003\n"
          + "\022MembershipEndpoint\022C\n"
          + "\013gke_cluster\030\004 \001(\0132"
          + "\'.google.cloud.gkehub.v1beta1.GkeClusterB\003\340A\001H\000\022J\n"
          + "\017on_prem_cluster\030\007 \001(\0132*.googl"
          + "e.cloud.gkehub.v1beta1.OnPremClusterB\003\340A\001H\000\022R\n"
          + "\023multi_cloud_cluster\030\010 \001(\0132..googl"
          + "e.cloud.gkehub.v1beta1.MultiCloudClusterB\003\340A\001H\000\022Q\n"
          + "\023kubernetes_metadata\030\005 \001(\0132/.g"
          + "oogle.cloud.gkehub.v1beta1.KubernetesMetadataB\003\340A\003\022Q\n"
          + "\023kubernetes_resource\030\006 \001(\0132"
          + "/.google.cloud.gkehub.v1beta1.KubernetesResourceB\003\340A\001B\006\n"
          + "\004type\"\247\002\n"
          + "\022KubernetesResource\022#\n"
          + "\026membership_cr_manifest\030\001 \001(\tB\003\340A\004\022P\n"
          + "\024membership_resources\030\002 \003(\0132-.google"
          + ".cloud.gkehub.v1beta1.ResourceManifestB\003\340A\003\022M\n"
          + "\021connect_resources\030\003 \003(\0132-.google."
          + "cloud.gkehub.v1beta1.ResourceManifestB\003\340A\003\022K\n"
          + "\020resource_options\030\004 \001(\0132,.google.cl"
          + "oud.gkehub.v1beta1.ResourceOptionsB\003\340A\001\"I\n"
          + "\017ResourceOptions\022\034\n"
          + "\017connect_version\030\001 \001(\tB\003\340A\001\022\030\n"
          + "\013v1beta1_crd\030\002 \001(\010B\003\340A\001\"<\n"
          + "\020ResourceManifest\022\020\n"
          + "\010manifest\030\001 \001(\t\022\026\n"
          + "\016cluster_scoped\030\002 \001(\010\"F\n\n"
          + "GkeCluster\022\032\n\r"
          + "resource_link\030\001 \001(\tB\003\340A\005\022\034\n"
          + "\017cluster_missing\030\003 \001(\010B\003\340A\003\"e\n\r"
          + "OnPremCluster\022\032\n\r"
          + "resource_link\030\001 \001(\tB\003\340A\005\022\034\n"
          + "\017cluster_missing\030\002 \001(\010B\003\340A\003\022\032\n\r"
          + "admin_cluster\030\003 \001(\010B\003\340A\005\"M\n"
          + "\021MultiCloudCluster\022\032\n\r"
          + "resource_link\030\001 \001(\tB\003\340A\005\022\034\n"
          + "\017cluster_missing\030\002 \001(\010B\003\340A\003\"\337\001\n"
          + "\022KubernetesMetadata\022*\n"
          + "\035kubernetes_api_server_version\030\001 \001(\tB\003\340A\003\022\035\n"
          + "\020node_provider_id\030\002 \001(\tB\003\340A\003\022\027\n\n"
          + "node_count\030\003 \001(\005B\003\340A\003\022\027\n\n"
          + "vcpu_count\030\004 \001(\005B\003\340A\003\022\026\n"
          + "\tmemory_mb\030\005 \001(\005B\003\340A\003\0224\n"
          + "\013update_time\030d \001(\0132\032.google.protobuf.TimestampB\003\340A\003\"}\n"
          + "\tAuthority\022\023\n"
          + "\006issuer\030\001 \001(\tB\003\340A\001\022#\n"
          + "\026workload_identity_pool\030\002 \001(\tB\003\340A\003\022\036\n"
          + "\021identity_provider\030\003 \001(\tB\003\340A\003\022\026\n"
          + "\toidc_jwks\030\004 \001(\014B\003\340A\001\"\216\002\n"
          + "\017MembershipState\022D\n"
          + "\004code\030\001"
          + " \001(\01621.google.cloud.gkehub.v1beta1.MembershipState.CodeB\003\340A\003\022\027\n"
          + "\013description\030\002 \001(\tB\002\030\001\0223\n"
          + "\013update_time\030\003 \001(\0132\032.google.protobuf.TimestampB\002\030\001\"g\n"
          + "\004Code\022\024\n"
          + "\020CODE_UNSPECIFIED\020\000\022\014\n"
          + "\010CREATING\020\001\022\t\n"
          + "\005READY\020\002\022\014\n"
          + "\010DELETING\020\003\022\014\n"
          + "\010UPDATING\020\004\022\024\n"
          + "\020SERVICE_UPDATING\020\005\"\212\001\n"
          + "\026ListMembershipsRequest\022\023\n"
          + "\006parent\030\001 \001(\tB\003\340A\002\022\026\n"
          + "\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\n"
          + "page_token\030\003 \001(\tB\003\340A\001\022\023\n"
          + "\006filter\030\004 \001(\tB\003\340A\001\022\025\n"
          + "\010order_by\030\005 \001(\tB\003\340A\001\"\203\001\n"
          + "\027ListMembershipsResponse\022:\n"
          + "\tresources\030\001 \003(\0132\'.google.cloud.gkehub.v1beta1.Membership\022\027\n"
          + "\017next_page_token\030\002 \001(\t\022\023\n"
          + "\013unreachable\030\003 \003(\t\")\n"
          + "\024GetMembershipRequest\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\"\243\001\n"
          + "\027CreateMembershipRequest\022\023\n"
          + "\006parent\030\001 \001(\tB\003\340A\002\022\032\n\r"
          + "membership_id\030\002 \001(\tB\003\340A\002\022>\n"
          + "\010resource\030\003"
          + " \001(\0132\'.google.cloud.gkehub.v1beta1.MembershipB\003\340A\002\022\027\n\n"
          + "request_id\030\004 \001(\tB\003\340A\001\"E\n"
          + "\027DeleteMembershipRequest\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\022\027\n\n"
          + "request_id\030\004 \001(\tB\003\340A\001\"\273\001\n"
          + "\027UpdateMembershipRequest\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\0224\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\022>\n"
          + "\010resource\030\003"
          + " \001(\0132\'.google.cloud.gkehub.v1beta1.MembershipB\003\340A\002\022\027\n\n"
          + "request_id\030\004 \001(\tB\003\340A\001\"\350\001\n"
          + "\036GenerateConnectManifestRequest\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\022E\n\r"
          + "connect_agent\030\002 \001(\0132)"
          + ".google.cloud.gkehub.v1beta1.ConnectAgentB\003\340A\001\022\024\n"
          + "\007version\030\003 \001(\tB\003\340A\001\022\027\n\n"
          + "is_upgrade\030\004 \001(\010B\003\340A\001\022\025\n"
          + "\010registry\030\005 \001(\tB\003\340A\001\022&\n"
          + "\031image_pull_secret_content\030\006 \001(\014B\003\340A\001\"f\n"
          + "\037GenerateConnectManifestResponse\022C\n"
          + "\010manifest\030\001 \003(\01321.google.cloud.gkehub.v1beta1.ConnectAgentResource\"]\n"
          + "\024ConnectAgentResource\0223\n"
          + "\004type\030\001 \001(\0132%.google.cloud.gkehub.v1beta1.TypeMeta\022\020\n"
          + "\010manifest\030\002 \001(\t\"-\n"
          + "\010TypeMeta\022\014\n"
          + "\004kind\030\001 \001(\t\022\023\n"
          + "\013api_version\030\002 \001(\t\"L\n"
          + "\014ConnectAgent\022\020\n"
          + "\004name\030\001 \001(\tB\002\030\001\022\022\n"
          + "\005proxy\030\002 \001(\014B\003\340A\001\022\026\n"
          + "\tnamespace\030\003 \001(\tB\003\340A\001\"m\n"
          + "\032ValidateExclusivityRequest\022\023\n"
          + "\006parent\030\001 \001(\tB\003\340A\002\022\030\n"
          + "\013cr_manifest\030\002 \001(\tB\003\340A\001\022 \n"
          + "\023intended_membership\030\003 \001(\tB\003\340A\002\"A\n"
          + "\033ValidateExclusivityResponse\022\"\n"
          + "\006status\030\001 \001(\0132\022.google.rpc.Status\"l\n"
          + "\"GenerateExclusivityManifestRequest\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\002\022\031\n"
          + "\014crd_manifest\030\002 \001(\tB\003\340A\001\022\030\n"
          + "\013cr_manifest\030\003 \001(\tB\003\340A\001\"P\n"
          + "#GenerateExclusivityManifestResponse\022\024\n"
          + "\014crd_manifest\030\001 \001(\t\022\023\n"
          + "\013cr_manifest\030\002 \001(\t\"\371\001\n"
          + "\021OperationMetadata\0224\n"
          + "\013create_time\030\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n"
          + "\006target\030\003 \001(\tB\003\340A\003\022\021\n"
          + "\004verb\030\004 \001(\tB\003\340A\003\022\032\n\r"
          + "status_detail\030\005 \001(\tB\003\340A\003\022\035\n"
          + "\020cancel_requested\030\006 \001(\010B\003\340A\003\022\030\n"
          + "\013api_version\030\007 \001(\tB\003\340A\0032\346\016\n"
          + "\027GkeHubMembershipService\022\303\001\n"
          + "\017ListMemberships\0223.google.cloud.gkehub.v1beta1.ListMembershipsRequ"
          + "est\0324.google.cloud.gkehub.v1beta1.ListMe"
          + "mbershipsResponse\"E\202\323\344\223\0026\0224/v1beta1/{par"
          + "ent=projects/*/locations/*}/memberships\332A\006parent\022\260\001\n\r"
          + "GetMembership\0221.google.cloud.gkehub.v1beta1.GetMembershipRequest\032\'."
          + "google.cloud.gkehub.v1beta1.Membership\"C"
          + "\202\323\344\223\0026\0224/v1beta1/{name=projects/*/locations/*/memberships/*}\332A\004name\022\362\001\n"
          + "\020CreateMembership\0224.google.cloud.gkehub.v1beta1.C"
          + "reateMembershipRequest\032\035.google.longrunn"
          + "ing.Operation\"\210\001\202\323\344\223\002@\"4/v1beta1/{parent"
          + "=projects/*/locations/*}/memberships:\010re"
          + "source\332A\035parent,resource,membership_id\312A\037\n\n"
          + "Membership\022\021OperationMetadata\022\331\001\n"
          + "\020DeleteMembership\0224.google.cloud.gkehub.v1be"
          + "ta1.DeleteMembershipRequest\032\035.google.lon"
          + "grunning.Operation\"p\202\323\344\223\0026*4/v1beta1/{na"
          + "me=projects/*/locations/*/memberships/*}\332A\004name\312A*\n"
          + "\025google.protobuf.Empty\022\021OperationMetadata\022\356\001\n"
          + "\020UpdateMembership\0224.google.cloud.gkehub.v1beta1.UpdateMembership"
          + "Request\032\035.google.longrunning.Operation\"\204"
          + "\001\202\323\344\223\002@24/v1beta1/{name=projects/*/locat"
          + "ions/*/memberships/*}:\010resource\332A\031name,resource,update_mask\312A\037\n\n"
          + "Membership\022\021OperationMetadata\022\352\001\n"
          + "\027GenerateConnectManifest\022;.google.cloud.gkehub.v1beta1.Generate"
          + "ConnectManifestRequest\032<.google.cloud.gkehub.v1beta1.GenerateConnectManifestResp"
          + "onse\"T\202\323\344\223\002N\022L/v1beta1/{name=projects/*/"
          + "locations/*/memberships/*}:generateConnectManifest\022\332\001\n"
          + "\023ValidateExclusivity\0227.google.cloud.gkehub.v1beta1.ValidateExclusi"
          + "vityRequest\0328.google.cloud.gkehub.v1beta"
          + "1.ValidateExclusivityResponse\"P\202\323\344\223\002J\022H/"
          + "v1beta1/{parent=projects/*/locations/*}/memberships:validateExclusivity\022\372\001\n"
          + "\033GenerateExclusivityManifest\022?.google.cloud.g"
          + "kehub.v1beta1.GenerateExclusivityManifestRequest\032@.google.cloud.gkehub.v1beta1.G"
          + "enerateExclusivityManifestResponse\"X\202\323\344\223"
          + "\002R\022P/v1beta1/{name=projects/*/locations/*/memberships/*}:generateExclusivityMani"
          + "fest\032I\312A\025gkehub.googleapis.com\322A.https:/"
          + "/www.googleapis.com/auth/cloud-platformB\303\001\n"
          + "\037com.google.cloud.gkehub.v1beta1P\001ZAgoogle.golang.org/genproto/googleapis/clo"
          + "ud/gkehub/v1beta1;gkehub\252\002\033Google.Cloud."
          + "GkeHub.V1Beta1\312\002\033Google\\Cloud\\GkeHub\\V1b"
          + "eta1\352\002\036Google::Cloud::GkeHub::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_gkehub_v1beta1_Membership_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkehub_v1beta1_Membership_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_Membership_descriptor,
            new java.lang.String[] {
              "Name",
              "Labels",
              "Description",
              "Endpoint",
              "State",
              "Authority",
              "CreateTime",
              "UpdateTime",
              "DeleteTime",
              "ExternalId",
              "LastConnectionTime",
              "UniqueId",
              "InfrastructureType",
              "Type",
            });
    internal_static_google_cloud_gkehub_v1beta1_Membership_LabelsEntry_descriptor =
        internal_static_google_cloud_gkehub_v1beta1_Membership_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkehub_v1beta1_Membership_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_Membership_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkehub_v1beta1_MembershipEndpoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkehub_v1beta1_MembershipEndpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_MembershipEndpoint_descriptor,
            new java.lang.String[] {
              "GkeCluster",
              "OnPremCluster",
              "MultiCloudCluster",
              "KubernetesMetadata",
              "KubernetesResource",
              "Type",
            });
    internal_static_google_cloud_gkehub_v1beta1_KubernetesResource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkehub_v1beta1_KubernetesResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_KubernetesResource_descriptor,
            new java.lang.String[] {
              "MembershipCrManifest", "MembershipResources", "ConnectResources", "ResourceOptions",
            });
    internal_static_google_cloud_gkehub_v1beta1_ResourceOptions_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkehub_v1beta1_ResourceOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_ResourceOptions_descriptor,
            new java.lang.String[] {
              "ConnectVersion", "V1Beta1Crd",
            });
    internal_static_google_cloud_gkehub_v1beta1_ResourceManifest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkehub_v1beta1_ResourceManifest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_ResourceManifest_descriptor,
            new java.lang.String[] {
              "Manifest", "ClusterScoped",
            });
    internal_static_google_cloud_gkehub_v1beta1_GkeCluster_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_gkehub_v1beta1_GkeCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_GkeCluster_descriptor,
            new java.lang.String[] {
              "ResourceLink", "ClusterMissing",
            });
    internal_static_google_cloud_gkehub_v1beta1_OnPremCluster_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_gkehub_v1beta1_OnPremCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_OnPremCluster_descriptor,
            new java.lang.String[] {
              "ResourceLink", "ClusterMissing", "AdminCluster",
            });
    internal_static_google_cloud_gkehub_v1beta1_MultiCloudCluster_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_gkehub_v1beta1_MultiCloudCluster_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_MultiCloudCluster_descriptor,
            new java.lang.String[] {
              "ResourceLink", "ClusterMissing",
            });
    internal_static_google_cloud_gkehub_v1beta1_KubernetesMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_gkehub_v1beta1_KubernetesMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_KubernetesMetadata_descriptor,
            new java.lang.String[] {
              "KubernetesApiServerVersion",
              "NodeProviderId",
              "NodeCount",
              "VcpuCount",
              "MemoryMb",
              "UpdateTime",
            });
    internal_static_google_cloud_gkehub_v1beta1_Authority_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_gkehub_v1beta1_Authority_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_Authority_descriptor,
            new java.lang.String[] {
              "Issuer", "WorkloadIdentityPool", "IdentityProvider", "OidcJwks",
            });
    internal_static_google_cloud_gkehub_v1beta1_MembershipState_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_gkehub_v1beta1_MembershipState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_MembershipState_descriptor,
            new java.lang.String[] {
              "Code", "Description", "UpdateTime",
            });
    internal_static_google_cloud_gkehub_v1beta1_ListMembershipsRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_gkehub_v1beta1_ListMembershipsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_ListMembershipsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_gkehub_v1beta1_ListMembershipsResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_gkehub_v1beta1_ListMembershipsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_ListMembershipsResponse_descriptor,
            new java.lang.String[] {
              "Resources", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_gkehub_v1beta1_GetMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_gkehub_v1beta1_GetMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_GetMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_gkehub_v1beta1_CreateMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_gkehub_v1beta1_CreateMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_CreateMembershipRequest_descriptor,
            new java.lang.String[] {
              "Parent", "MembershipId", "Resource", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1beta1_DeleteMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_gkehub_v1beta1_DeleteMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_DeleteMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1beta1_UpdateMembershipRequest_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_gkehub_v1beta1_UpdateMembershipRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_UpdateMembershipRequest_descriptor,
            new java.lang.String[] {
              "Name", "UpdateMask", "Resource", "RequestId",
            });
    internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestRequest_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestRequest_descriptor,
            new java.lang.String[] {
              "Name", "ConnectAgent", "Version", "IsUpgrade", "Registry", "ImagePullSecretContent",
            });
    internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestResponse_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestResponse_descriptor,
            new java.lang.String[] {
              "Manifest",
            });
    internal_static_google_cloud_gkehub_v1beta1_ConnectAgentResource_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_gkehub_v1beta1_ConnectAgentResource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_ConnectAgentResource_descriptor,
            new java.lang.String[] {
              "Type", "Manifest",
            });
    internal_static_google_cloud_gkehub_v1beta1_TypeMeta_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_cloud_gkehub_v1beta1_TypeMeta_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_TypeMeta_descriptor,
            new java.lang.String[] {
              "Kind", "ApiVersion",
            });
    internal_static_google_cloud_gkehub_v1beta1_ConnectAgent_descriptor =
        getDescriptor().getMessageTypes().get(21);
    internal_static_google_cloud_gkehub_v1beta1_ConnectAgent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_ConnectAgent_descriptor,
            new java.lang.String[] {
              "Name", "Proxy", "Namespace",
            });
    internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityRequest_descriptor =
        getDescriptor().getMessageTypes().get(22);
    internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityRequest_descriptor,
            new java.lang.String[] {
              "Parent", "CrManifest", "IntendedMembership",
            });
    internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityResponse_descriptor =
        getDescriptor().getMessageTypes().get(23);
    internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_ValidateExclusivityResponse_descriptor,
            new java.lang.String[] {
              "Status",
            });
    internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestRequest_descriptor =
        getDescriptor().getMessageTypes().get(24);
    internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestRequest_descriptor,
            new java.lang.String[] {
              "Name", "CrdManifest", "CrManifest",
            });
    internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestResponse_descriptor =
        getDescriptor().getMessageTypes().get(25);
    internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_GenerateExclusivityManifestResponse_descriptor,
            new java.lang.String[] {
              "CrdManifest", "CrManifest",
            });
    internal_static_google_cloud_gkehub_v1beta1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(26);
    internal_static_google_cloud_gkehub_v1beta1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkehub_v1beta1_OperationMetadata_descriptor,
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
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
