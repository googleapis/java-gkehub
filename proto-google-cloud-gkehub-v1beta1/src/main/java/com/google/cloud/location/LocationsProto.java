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
// source: google/cloud/location/locations.proto

package com.google.cloud.location;

public final class LocationsProto {
  private LocationsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_location_ListLocationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_location_ListLocationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_location_ListLocationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_location_ListLocationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_location_GetLocationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_location_GetLocationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_location_Location_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_location_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_location_Location_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_location_Location_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "%google/cloud/location/locations.proto\022\025google.cloud.location\032\034google/api/annotations.proto\032\031google/protobuf/any.proto\032\027google/api/client.proto\"[\n"
          + "\024ListLocationsRequest\022\014\n"
          + "\004name\030\001 \001(\t\022\016\n"
          + "\006filter\030\002 \001(\t\022\021\n"
          + "\tpage_size\030\003 \001(\005\022\022\n\n"
          + "page_token\030\004 \001(\t\"d\n"
          + "\025ListLocationsResponse\0222\n"
          + "\tlocations\030\001 \003(\0132\037.google.cloud.location.Location\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"\"\n"
          + "\022GetLocationRequest\022\014\n"
          + "\004name\030\001 \001(\t\"\327\001\n"
          + "\010Location\022\014\n"
          + "\004name\030\001 \001(\t\022\023\n"
          + "\013location_id\030\004 \001(\t\022\024\n"
          + "\014display_name\030\005 \001(\t\022;\n"
          + "\006labels\030\002 \003(\0132+.google.cloud.location.Location.LabelsEntry\022&\n"
          + "\010metadata\030\003 \001(\0132\024.google.protobuf.Any\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\0012\244\003\n"
          + "\tLocations\022\253\001\n\r"
          + "ListLocations\022+.google.cloud.location.ListLocationsRequest\032,.google.cloud.location.ListLocationsResponse\"?\202\323\344\223\0029\022\024/v1/{name=locations}Z!\022\037/v1/{name=projects/*}/locations\022\236\001\n"
          + "\013GetLocation\022).google.cloud.location.GetLocationRequest\032\037.google.cloud.location.Location\"C\202\323\344\223\002=\022\026/v1/{name=locations/*}Z#\022!/v1/{name=projects/*/locations/*}\032H\312A\024cloud.googleapis.com\322A.https://www.googleapis.com/auth/cloud-platformBo\n"
          + "\031com.google.cloud.locationB\016LocationsProtoP\001Z=google.golang.o"
          + "rg/genproto/googleapis/cloud/location;location\370\001\001b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.protobuf.AnyProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    internal_static_google_cloud_location_ListLocationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_location_ListLocationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_location_ListLocationsRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_cloud_location_ListLocationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_location_ListLocationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_location_ListLocationsResponse_descriptor,
            new java.lang.String[] {
              "Locations", "NextPageToken",
            });
    internal_static_google_cloud_location_GetLocationRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_location_GetLocationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_location_GetLocationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_location_Location_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_location_Location_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_location_Location_descriptor,
            new java.lang.String[] {
              "Name", "LocationId", "DisplayName", "Labels", "Metadata",
            });
    internal_static_google_cloud_location_Location_LabelsEntry_descriptor =
        internal_static_google_cloud_location_Location_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_location_Location_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_location_Location_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
