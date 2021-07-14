// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1beta;

/**
 * <pre>
 * State information for an ACM's Operator
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1beta.OperatorState}
 */
public final class OperatorState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1beta.OperatorState)
    OperatorStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OperatorState.newBuilder() to construct.
  private OperatorState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OperatorState() {
    version_ = "";
    deploymentState_ = 0;
    errors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OperatorState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OperatorState(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            version_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            deploymentState_ = rawValue;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              errors_ = new java.util.ArrayList<com.google.cloud.gkehub.configmanagement.v1beta.InstallError>();
              mutable_bitField0_ |= 0x00000001;
            }
            errors_.add(
                input.readMessage(com.google.cloud.gkehub.configmanagement.v1beta.InstallError.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        errors_ = java.util.Collections.unmodifiableList(errors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1beta_OperatorState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1beta_OperatorState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1beta.OperatorState.class, com.google.cloud.gkehub.configmanagement.v1beta.OperatorState.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private volatile java.lang.Object version_;
  /**
   * <pre>
   * The semenatic version number of the operator
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The semenatic version number of the operator
   * </pre>
   *
   * <code>string version = 1;</code>
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPLOYMENT_STATE_FIELD_NUMBER = 2;
  private int deploymentState_;
  /**
   * <pre>
   * The state of the Operator's deployment
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState deployment_state = 2;</code>
   * @return The enum numeric value on the wire for deploymentState.
   */
  @java.lang.Override public int getDeploymentStateValue() {
    return deploymentState_;
  }
  /**
   * <pre>
   * The state of the Operator's deployment
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState deployment_state = 2;</code>
   * @return The deploymentState.
   */
  @java.lang.Override public com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState getDeploymentState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState result = com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.valueOf(deploymentState_);
    return result == null ? com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.UNRECOGNIZED : result;
  }

  public static final int ERRORS_FIELD_NUMBER = 3;
  private java.util.List<com.google.cloud.gkehub.configmanagement.v1beta.InstallError> errors_;
  /**
   * <pre>
   * Install errors.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkehub.configmanagement.v1beta.InstallError> getErrorsList() {
    return errors_;
  }
  /**
   * <pre>
   * Install errors.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gkehub.configmanagement.v1beta.InstallErrorOrBuilder> 
      getErrorsOrBuilderList() {
    return errors_;
  }
  /**
   * <pre>
   * Install errors.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
   */
  @java.lang.Override
  public int getErrorsCount() {
    return errors_.size();
  }
  /**
   * <pre>
   * Install errors.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.InstallError getErrors(int index) {
    return errors_.get(index);
  }
  /**
   * <pre>
   * Install errors.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.InstallErrorOrBuilder getErrorsOrBuilder(
      int index) {
    return errors_.get(index);
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
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, version_);
    }
    if (deploymentState_ != com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.DEPLOYMENT_STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, deploymentState_);
    }
    for (int i = 0; i < errors_.size(); i++) {
      output.writeMessage(3, errors_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, version_);
    }
    if (deploymentState_ != com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.DEPLOYMENT_STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, deploymentState_);
    }
    for (int i = 0; i < errors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, errors_.get(i));
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
    if (!(obj instanceof com.google.cloud.gkehub.configmanagement.v1beta.OperatorState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1beta.OperatorState other = (com.google.cloud.gkehub.configmanagement.v1beta.OperatorState) obj;

    if (!getVersion()
        .equals(other.getVersion())) return false;
    if (deploymentState_ != other.deploymentState_) return false;
    if (!getErrorsList()
        .equals(other.getErrorsList())) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + DEPLOYMENT_STATE_FIELD_NUMBER;
    hash = (53 * hash) + deploymentState_;
    if (getErrorsCount() > 0) {
      hash = (37 * hash) + ERRORS_FIELD_NUMBER;
      hash = (53 * hash) + getErrorsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.configmanagement.v1beta.OperatorState prototype) {
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
   * State information for an ACM's Operator
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1beta.OperatorState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1beta.OperatorState)
      com.google.cloud.gkehub.configmanagement.v1beta.OperatorStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1beta_OperatorState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1beta_OperatorState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1beta.OperatorState.class, com.google.cloud.gkehub.configmanagement.v1beta.OperatorState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.configmanagement.v1beta.OperatorState.newBuilder()
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
        getErrorsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      version_ = "";

      deploymentState_ = 0;

      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1beta.ConfigManagementProto.internal_static_google_cloud_gkehub_configmanagement_v1beta_OperatorState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.OperatorState getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1beta.OperatorState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.OperatorState build() {
      com.google.cloud.gkehub.configmanagement.v1beta.OperatorState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.OperatorState buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1beta.OperatorState result = new com.google.cloud.gkehub.configmanagement.v1beta.OperatorState(this);
      int from_bitField0_ = bitField0_;
      result.version_ = version_;
      result.deploymentState_ = deploymentState_;
      if (errorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          errors_ = java.util.Collections.unmodifiableList(errors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.errors_ = errors_;
      } else {
        result.errors_ = errorsBuilder_.build();
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
      if (other instanceof com.google.cloud.gkehub.configmanagement.v1beta.OperatorState) {
        return mergeFrom((com.google.cloud.gkehub.configmanagement.v1beta.OperatorState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.configmanagement.v1beta.OperatorState other) {
      if (other == com.google.cloud.gkehub.configmanagement.v1beta.OperatorState.getDefaultInstance()) return this;
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      if (other.deploymentState_ != 0) {
        setDeploymentStateValue(other.getDeploymentStateValue());
      }
      if (errorsBuilder_ == null) {
        if (!other.errors_.isEmpty()) {
          if (errors_.isEmpty()) {
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureErrorsIsMutable();
            errors_.addAll(other.errors_);
          }
          onChanged();
        }
      } else {
        if (!other.errors_.isEmpty()) {
          if (errorsBuilder_.isEmpty()) {
            errorsBuilder_.dispose();
            errorsBuilder_ = null;
            errors_ = other.errors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            errorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getErrorsFieldBuilder() : null;
          } else {
            errorsBuilder_.addAllMessages(other.errors_);
          }
        }
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
      com.google.cloud.gkehub.configmanagement.v1beta.OperatorState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.gkehub.configmanagement.v1beta.OperatorState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object version_ = "";
    /**
     * <pre>
     * The semenatic version number of the operator
     * </pre>
     *
     * <code>string version = 1;</code>
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The semenatic version number of the operator
     * </pre>
     *
     * <code>string version = 1;</code>
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The semenatic version number of the operator
     * </pre>
     *
     * <code>string version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The semenatic version number of the operator
     * </pre>
     *
     * <code>string version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The semenatic version number of the operator
     * </pre>
     *
     * <code>string version = 1;</code>
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }

    private int deploymentState_ = 0;
    /**
     * <pre>
     * The state of the Operator's deployment
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState deployment_state = 2;</code>
     * @return The enum numeric value on the wire for deploymentState.
     */
    @java.lang.Override public int getDeploymentStateValue() {
      return deploymentState_;
    }
    /**
     * <pre>
     * The state of the Operator's deployment
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState deployment_state = 2;</code>
     * @param value The enum numeric value on the wire for deploymentState to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentStateValue(int value) {
      
      deploymentState_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the Operator's deployment
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState deployment_state = 2;</code>
     * @return The deploymentState.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState getDeploymentState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState result = com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.valueOf(deploymentState_);
      return result == null ? com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The state of the Operator's deployment
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState deployment_state = 2;</code>
     * @param value The deploymentState to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentState(com.google.cloud.gkehub.configmanagement.v1beta.DeploymentState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      deploymentState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the Operator's deployment
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1beta.DeploymentState deployment_state = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeploymentState() {
      
      deploymentState_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.cloud.gkehub.configmanagement.v1beta.InstallError> errors_ =
      java.util.Collections.emptyList();
    private void ensureErrorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        errors_ = new java.util.ArrayList<com.google.cloud.gkehub.configmanagement.v1beta.InstallError>(errors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1beta.InstallError, com.google.cloud.gkehub.configmanagement.v1beta.InstallError.Builder, com.google.cloud.gkehub.configmanagement.v1beta.InstallErrorOrBuilder> errorsBuilder_;

    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public java.util.List<com.google.cloud.gkehub.configmanagement.v1beta.InstallError> getErrorsList() {
      if (errorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(errors_);
      } else {
        return errorsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public int getErrorsCount() {
      if (errorsBuilder_ == null) {
        return errors_.size();
      } else {
        return errorsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1beta.InstallError getErrors(int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);
      } else {
        return errorsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public Builder setErrors(
        int index, com.google.cloud.gkehub.configmanagement.v1beta.InstallError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.set(index, value);
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public Builder setErrors(
        int index, com.google.cloud.gkehub.configmanagement.v1beta.InstallError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.set(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public Builder addErrors(com.google.cloud.gkehub.configmanagement.v1beta.InstallError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public Builder addErrors(
        int index, com.google.cloud.gkehub.configmanagement.v1beta.InstallError value) {
      if (errorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureErrorsIsMutable();
        errors_.add(index, value);
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public Builder addErrors(
        com.google.cloud.gkehub.configmanagement.v1beta.InstallError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public Builder addErrors(
        int index, com.google.cloud.gkehub.configmanagement.v1beta.InstallError.Builder builderForValue) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.add(index, builderForValue.build());
        onChanged();
      } else {
        errorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public Builder addAllErrors(
        java.lang.Iterable<? extends com.google.cloud.gkehub.configmanagement.v1beta.InstallError> values) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, errors_);
        onChanged();
      } else {
        errorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public Builder clearErrors() {
      if (errorsBuilder_ == null) {
        errors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        errorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public Builder removeErrors(int index) {
      if (errorsBuilder_ == null) {
        ensureErrorsIsMutable();
        errors_.remove(index);
        onChanged();
      } else {
        errorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1beta.InstallError.Builder getErrorsBuilder(
        int index) {
      return getErrorsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1beta.InstallErrorOrBuilder getErrorsOrBuilder(
        int index) {
      if (errorsBuilder_ == null) {
        return errors_.get(index);  } else {
        return errorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public java.util.List<? extends com.google.cloud.gkehub.configmanagement.v1beta.InstallErrorOrBuilder> 
         getErrorsOrBuilderList() {
      if (errorsBuilder_ != null) {
        return errorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(errors_);
      }
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1beta.InstallError.Builder addErrorsBuilder() {
      return getErrorsFieldBuilder().addBuilder(
          com.google.cloud.gkehub.configmanagement.v1beta.InstallError.getDefaultInstance());
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public com.google.cloud.gkehub.configmanagement.v1beta.InstallError.Builder addErrorsBuilder(
        int index) {
      return getErrorsFieldBuilder().addBuilder(
          index, com.google.cloud.gkehub.configmanagement.v1beta.InstallError.getDefaultInstance());
    }
    /**
     * <pre>
     * Install errors.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.configmanagement.v1beta.InstallError errors = 3;</code>
     */
    public java.util.List<com.google.cloud.gkehub.configmanagement.v1beta.InstallError.Builder> 
         getErrorsBuilderList() {
      return getErrorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.cloud.gkehub.configmanagement.v1beta.InstallError, com.google.cloud.gkehub.configmanagement.v1beta.InstallError.Builder, com.google.cloud.gkehub.configmanagement.v1beta.InstallErrorOrBuilder> 
        getErrorsFieldBuilder() {
      if (errorsBuilder_ == null) {
        errorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkehub.configmanagement.v1beta.InstallError, com.google.cloud.gkehub.configmanagement.v1beta.InstallError.Builder, com.google.cloud.gkehub.configmanagement.v1beta.InstallErrorOrBuilder>(
                errors_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        errors_ = null;
      }
      return errorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1beta.OperatorState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1beta.OperatorState)
  private static final com.google.cloud.gkehub.configmanagement.v1beta.OperatorState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.configmanagement.v1beta.OperatorState();
  }

  public static com.google.cloud.gkehub.configmanagement.v1beta.OperatorState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperatorState>
      PARSER = new com.google.protobuf.AbstractParser<OperatorState>() {
    @java.lang.Override
    public OperatorState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OperatorState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OperatorState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperatorState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1beta.OperatorState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

