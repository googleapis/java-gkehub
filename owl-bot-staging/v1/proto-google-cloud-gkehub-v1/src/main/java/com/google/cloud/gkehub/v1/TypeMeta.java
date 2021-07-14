// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1/service.proto

package com.google.cloud.gkehub.v1;

/**
 * <pre>
 * TypeMeta is the type information needed for content unmarshalling of
 * Kubernetes resources in the manifest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1.TypeMeta}
 */
public final class TypeMeta extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1.TypeMeta)
    TypeMetaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TypeMeta.newBuilder() to construct.
  private TypeMeta(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TypeMeta() {
    kind_ = "";
    apiVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TypeMeta();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TypeMeta(
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

            kind_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            apiVersion_ = s;
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
    return com.google.cloud.gkehub.v1.ServiceProto.internal_static_google_cloud_gkehub_v1_TypeMeta_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1.ServiceProto.internal_static_google_cloud_gkehub_v1_TypeMeta_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1.TypeMeta.class, com.google.cloud.gkehub.v1.TypeMeta.Builder.class);
  }

  public static final int KIND_FIELD_NUMBER = 1;
  private volatile java.lang.Object kind_;
  /**
   * <pre>
   * Kind of the resource (e.g. Deployment).
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The kind.
   */
  @java.lang.Override
  public java.lang.String getKind() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      kind_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Kind of the resource (e.g. Deployment).
   * </pre>
   *
   * <code>string kind = 1;</code>
   * @return The bytes for kind.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKindBytes() {
    java.lang.Object ref = kind_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      kind_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int API_VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object apiVersion_;
  /**
   * <pre>
   * APIVersion of the resource (e.g. v1).
   * </pre>
   *
   * <code>string api_version = 2;</code>
   * @return The apiVersion.
   */
  @java.lang.Override
  public java.lang.String getApiVersion() {
    java.lang.Object ref = apiVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * APIVersion of the resource (e.g. v1).
   * </pre>
   *
   * <code>string api_version = 2;</code>
   * @return The bytes for apiVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getApiVersionBytes() {
    java.lang.Object ref = apiVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      apiVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getKindBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, kind_);
    }
    if (!getApiVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, apiVersion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getKindBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, kind_);
    }
    if (!getApiVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, apiVersion_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1.TypeMeta)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1.TypeMeta other = (com.google.cloud.gkehub.v1.TypeMeta) obj;

    if (!getKind()
        .equals(other.getKind())) return false;
    if (!getApiVersion()
        .equals(other.getApiVersion())) return false;
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
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + getKind().hashCode();
    hash = (37 * hash) + API_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getApiVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1.TypeMeta parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.v1.TypeMeta parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.v1.TypeMeta prototype) {
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
   * TypeMeta is the type information needed for content unmarshalling of
   * Kubernetes resources in the manifest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1.TypeMeta}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1.TypeMeta)
      com.google.cloud.gkehub.v1.TypeMetaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.v1.ServiceProto.internal_static_google_cloud_gkehub_v1_TypeMeta_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1.ServiceProto.internal_static_google_cloud_gkehub_v1_TypeMeta_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1.TypeMeta.class, com.google.cloud.gkehub.v1.TypeMeta.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1.TypeMeta.newBuilder()
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
      kind_ = "";

      apiVersion_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.v1.ServiceProto.internal_static_google_cloud_gkehub_v1_TypeMeta_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.TypeMeta getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1.TypeMeta.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.TypeMeta build() {
      com.google.cloud.gkehub.v1.TypeMeta result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.TypeMeta buildPartial() {
      com.google.cloud.gkehub.v1.TypeMeta result = new com.google.cloud.gkehub.v1.TypeMeta(this);
      result.kind_ = kind_;
      result.apiVersion_ = apiVersion_;
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
      if (other instanceof com.google.cloud.gkehub.v1.TypeMeta) {
        return mergeFrom((com.google.cloud.gkehub.v1.TypeMeta)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1.TypeMeta other) {
      if (other == com.google.cloud.gkehub.v1.TypeMeta.getDefaultInstance()) return this;
      if (!other.getKind().isEmpty()) {
        kind_ = other.kind_;
        onChanged();
      }
      if (!other.getApiVersion().isEmpty()) {
        apiVersion_ = other.apiVersion_;
        onChanged();
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
      com.google.cloud.gkehub.v1.TypeMeta parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.gkehub.v1.TypeMeta) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object kind_ = "";
    /**
     * <pre>
     * Kind of the resource (e.g. Deployment).
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @return The kind.
     */
    public java.lang.String getKind() {
      java.lang.Object ref = kind_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        kind_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Kind of the resource (e.g. Deployment).
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @return The bytes for kind.
     */
    public com.google.protobuf.ByteString
        getKindBytes() {
      java.lang.Object ref = kind_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        kind_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Kind of the resource (e.g. Deployment).
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Kind of the resource (e.g. Deployment).
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      
      kind_ = getDefaultInstance().getKind();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Kind of the resource (e.g. Deployment).
     * </pre>
     *
     * <code>string kind = 1;</code>
     * @param value The bytes for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      kind_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object apiVersion_ = "";
    /**
     * <pre>
     * APIVersion of the resource (e.g. v1).
     * </pre>
     *
     * <code>string api_version = 2;</code>
     * @return The apiVersion.
     */
    public java.lang.String getApiVersion() {
      java.lang.Object ref = apiVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * APIVersion of the resource (e.g. v1).
     * </pre>
     *
     * <code>string api_version = 2;</code>
     * @return The bytes for apiVersion.
     */
    public com.google.protobuf.ByteString
        getApiVersionBytes() {
      java.lang.Object ref = apiVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        apiVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * APIVersion of the resource (e.g. v1).
     * </pre>
     *
     * <code>string api_version = 2;</code>
     * @param value The apiVersion to set.
     * @return This builder for chaining.
     */
    public Builder setApiVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      apiVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * APIVersion of the resource (e.g. v1).
     * </pre>
     *
     * <code>string api_version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearApiVersion() {
      
      apiVersion_ = getDefaultInstance().getApiVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * APIVersion of the resource (e.g. v1).
     * </pre>
     *
     * <code>string api_version = 2;</code>
     * @param value The bytes for apiVersion to set.
     * @return This builder for chaining.
     */
    public Builder setApiVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      apiVersion_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1.TypeMeta)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.TypeMeta)
  private static final com.google.cloud.gkehub.v1.TypeMeta DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1.TypeMeta();
  }

  public static com.google.cloud.gkehub.v1.TypeMeta getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TypeMeta>
      PARSER = new com.google.protobuf.AbstractParser<TypeMeta>() {
    @java.lang.Override
    public TypeMeta parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TypeMeta(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TypeMeta> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TypeMeta> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1.TypeMeta getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

