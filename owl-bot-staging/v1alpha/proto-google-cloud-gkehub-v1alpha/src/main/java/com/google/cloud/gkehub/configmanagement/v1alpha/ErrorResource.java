// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1alpha;

/**
 * <pre>
 * Model for a config file in the git repo with an associated Sync error
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.ErrorResource}
 */
public final class ErrorResource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1alpha.ErrorResource)
    ErrorResourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorResource.newBuilder() to construct.
  private ErrorResource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorResource() {
    sourcePath_ = "";
    resourceName_ = "";
    resourceNamespace_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ErrorResource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ErrorResource(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            sourcePath_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceNamespace_ = s;
            break;
          }
          case 34: {
            com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.Builder subBuilder = null;
            if (resourceGvk_ != null) {
              subBuilder = resourceGvk_.toBuilder();
            }
            resourceGvk_ = input.readMessage(com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(resourceGvk_);
              resourceGvk_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_ErrorResource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_ErrorResource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource.class, com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource.Builder.class);
  }

  public static final int SOURCE_PATH_FIELD_NUMBER = 1;
  private volatile java.lang.Object sourcePath_;
  /**
   * <pre>
   * Path in the git repo of the erroneous config
   * </pre>
   *
   * <code>string source_path = 1;</code>
   * @return The sourcePath.
   */
  @java.lang.Override
  public java.lang.String getSourcePath() {
    java.lang.Object ref = sourcePath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourcePath_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Path in the git repo of the erroneous config
   * </pre>
   *
   * <code>string source_path = 1;</code>
   * @return The bytes for sourcePath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourcePathBytes() {
    java.lang.Object ref = sourcePath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourcePath_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Metadata name of the resource that is causing an error
   * </pre>
   *
   * <code>string resource_name = 2;</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Metadata name of the resource that is causing an error
   * </pre>
   *
   * <code>string resource_name = 2;</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_NAMESPACE_FIELD_NUMBER = 3;
  private volatile java.lang.Object resourceNamespace_;
  /**
   * <pre>
   * Namespace of the resource that is causing an error
   * </pre>
   *
   * <code>string resource_namespace = 3;</code>
   * @return The resourceNamespace.
   */
  @java.lang.Override
  public java.lang.String getResourceNamespace() {
    java.lang.Object ref = resourceNamespace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceNamespace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Namespace of the resource that is causing an error
   * </pre>
   *
   * <code>string resource_namespace = 3;</code>
   * @return The bytes for resourceNamespace.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNamespaceBytes() {
    java.lang.Object ref = resourceNamespace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceNamespace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_GVK_FIELD_NUMBER = 4;
  private com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resourceGvk_;
  /**
   * <pre>
   * Group/version/kind of the resource that is causing an error
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
   * @return Whether the resourceGvk field is set.
   */
  @java.lang.Override
  public boolean hasResourceGvk() {
    return resourceGvk_ != null;
  }
  /**
   * <pre>
   * Group/version/kind of the resource that is causing an error
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
   * @return The resourceGvk.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind getResourceGvk() {
    return resourceGvk_ == null ? com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.getDefaultInstance() : resourceGvk_;
  }
  /**
   * <pre>
   * Group/version/kind of the resource that is causing an error
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKindOrBuilder getResourceGvkOrBuilder() {
    return getResourceGvk();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSourcePathBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourcePath_);
    }
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceName_);
    }
    if (!getResourceNamespaceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resourceNamespace_);
    }
    if (resourceGvk_ != null) {
      output.writeMessage(4, getResourceGvk());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSourcePathBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourcePath_);
    }
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceName_);
    }
    if (!getResourceNamespaceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resourceNamespace_);
    }
    if (resourceGvk_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getResourceGvk());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource other = (com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource) obj;

    if (!getSourcePath()
        .equals(other.getSourcePath())) return false;
    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getResourceNamespace()
        .equals(other.getResourceNamespace())) return false;
    if (hasResourceGvk() != other.hasResourceGvk()) return false;
    if (hasResourceGvk()) {
      if (!getResourceGvk()
          .equals(other.getResourceGvk())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SOURCE_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getSourcePath().hashCode();
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + RESOURCE_NAMESPACE_FIELD_NUMBER;
    hash = (53 * hash) + getResourceNamespace().hashCode();
    if (hasResourceGvk()) {
      hash = (37 * hash) + RESOURCE_GVK_FIELD_NUMBER;
      hash = (53 * hash) + getResourceGvk().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * <pre>
   * Model for a config file in the git repo with an associated Sync error
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.ErrorResource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1alpha.ErrorResource)
      com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_ErrorResource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_ErrorResource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource.class, com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      sourcePath_ = "";

      resourceName_ = "";

      resourceNamespace_ = "";

      if (resourceGvkBuilder_ == null) {
        resourceGvk_ = null;
      } else {
        resourceGvk_ = null;
        resourceGvkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1alpha_ErrorResource_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource build() {
      com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource result = new com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource(this);
      result.sourcePath_ = sourcePath_;
      result.resourceName_ = resourceName_;
      result.resourceNamespace_ = resourceNamespace_;
      if (resourceGvkBuilder_ == null) {
        result.resourceGvk_ = resourceGvk_;
      } else {
        result.resourceGvk_ = resourceGvkBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource) {
        return mergeFrom((com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource other) {
      if (other == com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource.getDefaultInstance()) return this;
      if (!other.getSourcePath().isEmpty()) {
        sourcePath_ = other.sourcePath_;
        onChanged();
      }
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (!other.getResourceNamespace().isEmpty()) {
        resourceNamespace_ = other.resourceNamespace_;
        onChanged();
      }
      if (other.hasResourceGvk()) {
        mergeResourceGvk(other.getResourceGvk());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sourcePath_ = "";
    /**
     * <pre>
     * Path in the git repo of the erroneous config
     * </pre>
     *
     * <code>string source_path = 1;</code>
     * @return The sourcePath.
     */
    public java.lang.String getSourcePath() {
      java.lang.Object ref = sourcePath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourcePath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Path in the git repo of the erroneous config
     * </pre>
     *
     * <code>string source_path = 1;</code>
     * @return The bytes for sourcePath.
     */
    public com.google.protobuf.ByteString
        getSourcePathBytes() {
      java.lang.Object ref = sourcePath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourcePath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Path in the git repo of the erroneous config
     * </pre>
     *
     * <code>string source_path = 1;</code>
     * @param value The sourcePath to set.
     * @return This builder for chaining.
     */
    public Builder setSourcePath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourcePath_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path in the git repo of the erroneous config
     * </pre>
     *
     * <code>string source_path = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSourcePath() {
      
      sourcePath_ = getDefaultInstance().getSourcePath();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Path in the git repo of the erroneous config
     * </pre>
     *
     * <code>string source_path = 1;</code>
     * @param value The bytes for sourcePath to set.
     * @return This builder for chaining.
     */
    public Builder setSourcePathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourcePath_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Metadata name of the resource that is causing an error
     * </pre>
     *
     * <code>string resource_name = 2;</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Metadata name of the resource that is causing an error
     * </pre>
     *
     * <code>string resource_name = 2;</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Metadata name of the resource that is causing an error
     * </pre>
     *
     * <code>string resource_name = 2;</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata name of the resource that is causing an error
     * </pre>
     *
     * <code>string resource_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata name of the resource that is causing an error
     * </pre>
     *
     * <code>string resource_name = 2;</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourceNamespace_ = "";
    /**
     * <pre>
     * Namespace of the resource that is causing an error
     * </pre>
     *
     * <code>string resource_namespace = 3;</code>
     * @return The resourceNamespace.
     */
    public java.lang.String getResourceNamespace() {
      java.lang.Object ref = resourceNamespace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceNamespace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Namespace of the resource that is causing an error
     * </pre>
     *
     * <code>string resource_namespace = 3;</code>
     * @return The bytes for resourceNamespace.
     */
    public com.google.protobuf.ByteString
        getResourceNamespaceBytes() {
      java.lang.Object ref = resourceNamespace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceNamespace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Namespace of the resource that is causing an error
     * </pre>
     *
     * <code>string resource_namespace = 3;</code>
     * @param value The resourceNamespace to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNamespace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceNamespace_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Namespace of the resource that is causing an error
     * </pre>
     *
     * <code>string resource_namespace = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceNamespace() {
      
      resourceNamespace_ = getDefaultInstance().getResourceNamespace();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Namespace of the resource that is causing an error
     * </pre>
     *
     * <code>string resource_namespace = 3;</code>
     * @param value The bytes for resourceNamespace to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNamespaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceNamespace_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resourceGvk_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind, com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKindOrBuilder> resourceGvkBuilder_;
    /**
     * <pre>
     * Group/version/kind of the resource that is causing an error
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
     * @return Whether the resourceGvk field is set.
     */
    public boolean hasResourceGvk() {
      return resourceGvkBuilder_ != null || resourceGvk_ != null;
    }
    /**
     * <pre>
     * Group/version/kind of the resource that is causing an error
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
     * @return The resourceGvk.
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind getResourceGvk() {
      if (resourceGvkBuilder_ == null) {
        return resourceGvk_ == null ? com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.getDefaultInstance() : resourceGvk_;
      } else {
        return resourceGvkBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Group/version/kind of the resource that is causing an error
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
     */
    public Builder setResourceGvk(com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind value) {
      if (resourceGvkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resourceGvk_ = value;
        onChanged();
      } else {
        resourceGvkBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Group/version/kind of the resource that is causing an error
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
     */
    public Builder setResourceGvk(
        com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.Builder builderForValue) {
      if (resourceGvkBuilder_ == null) {
        resourceGvk_ = builderForValue.build();
        onChanged();
      } else {
        resourceGvkBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Group/version/kind of the resource that is causing an error
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
     */
    public Builder mergeResourceGvk(com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind value) {
      if (resourceGvkBuilder_ == null) {
        if (resourceGvk_ != null) {
          resourceGvk_ =
            com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.newBuilder(resourceGvk_).mergeFrom(value).buildPartial();
        } else {
          resourceGvk_ = value;
        }
        onChanged();
      } else {
        resourceGvkBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Group/version/kind of the resource that is causing an error
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
     */
    public Builder clearResourceGvk() {
      if (resourceGvkBuilder_ == null) {
        resourceGvk_ = null;
        onChanged();
      } else {
        resourceGvk_ = null;
        resourceGvkBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Group/version/kind of the resource that is causing an error
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.Builder getResourceGvkBuilder() {
      
      onChanged();
      return getResourceGvkFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Group/version/kind of the resource that is causing an error
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKindOrBuilder getResourceGvkOrBuilder() {
      if (resourceGvkBuilder_ != null) {
        return resourceGvkBuilder_.getMessageOrBuilder();
      } else {
        return resourceGvk_ == null ?
            com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.getDefaultInstance() : resourceGvk_;
      }
    }
    /**
     * <pre>
     * Group/version/kind of the resource that is causing an error
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind resource_gvk = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind, com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKindOrBuilder> 
        getResourceGvkFieldBuilder() {
      if (resourceGvkBuilder_ == null) {
        resourceGvkBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind, com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKind.Builder, com.google.cloud.gkehub.configmanagement.v1alpha.GroupVersionKindOrBuilder>(
                getResourceGvk(),
                getParentForChildren(),
                isClean());
        resourceGvk_ = null;
      }
      return resourceGvkBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1alpha.ErrorResource)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1alpha.ErrorResource)
  private static final com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource();
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorResource>
      PARSER = new com.google.protobuf.AbstractParser<ErrorResource>() {
    @java.lang.Override
    public ErrorResource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ErrorResource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ErrorResource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorResource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.ErrorResource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

