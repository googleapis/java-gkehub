// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkehub/v1alpha/metering/metering.proto

package com.google.cloud.gkehub.metering.v1alpha;

/**
 * <pre>
 * **Metering**: Per-Membership Feature State.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.metering.v1alpha.MembershipState}
 */
public final class MembershipState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.metering.v1alpha.MembershipState)
    MembershipStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MembershipState.newBuilder() to construct.
  private MembershipState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MembershipState() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MembershipState();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MembershipState(
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
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (lastMeasurementTime_ != null) {
              subBuilder = lastMeasurementTime_.toBuilder();
            }
            lastMeasurementTime_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(lastMeasurementTime_);
              lastMeasurementTime_ = subBuilder.buildPartial();
            }

            break;
          }
          case 29: {

            preciseLastMeasuredClusterVcpuCapacity_ = input.readFloat();
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
    return com.google.cloud.gkehub.metering.v1alpha.MeteringProto.internal_static_google_cloud_gkehub_metering_v1alpha_MembershipState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.metering.v1alpha.MeteringProto.internal_static_google_cloud_gkehub_metering_v1alpha_MembershipState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.metering.v1alpha.MembershipState.class, com.google.cloud.gkehub.metering.v1alpha.MembershipState.Builder.class);
  }

  public static final int LAST_MEASUREMENT_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp lastMeasurementTime_;
  /**
   * <pre>
   * The time stamp of the most recent measurement of the number of vCPUs
   * in the cluster.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
   * @return Whether the lastMeasurementTime field is set.
   */
  @java.lang.Override
  public boolean hasLastMeasurementTime() {
    return lastMeasurementTime_ != null;
  }
  /**
   * <pre>
   * The time stamp of the most recent measurement of the number of vCPUs
   * in the cluster.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
   * @return The lastMeasurementTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getLastMeasurementTime() {
    return lastMeasurementTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastMeasurementTime_;
  }
  /**
   * <pre>
   * The time stamp of the most recent measurement of the number of vCPUs
   * in the cluster.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getLastMeasurementTimeOrBuilder() {
    return getLastMeasurementTime();
  }

  public static final int PRECISE_LAST_MEASURED_CLUSTER_VCPU_CAPACITY_FIELD_NUMBER = 3;
  private float preciseLastMeasuredClusterVcpuCapacity_;
  /**
   * <pre>
   * The vCPUs capacity in the cluster according to the most recent
   * measurement (1/1000 precision).
   * </pre>
   *
   * <code>float precise_last_measured_cluster_vcpu_capacity = 3;</code>
   * @return The preciseLastMeasuredClusterVcpuCapacity.
   */
  @java.lang.Override
  public float getPreciseLastMeasuredClusterVcpuCapacity() {
    return preciseLastMeasuredClusterVcpuCapacity_;
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
    if (lastMeasurementTime_ != null) {
      output.writeMessage(1, getLastMeasurementTime());
    }
    if (preciseLastMeasuredClusterVcpuCapacity_ != 0F) {
      output.writeFloat(3, preciseLastMeasuredClusterVcpuCapacity_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lastMeasurementTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLastMeasurementTime());
    }
    if (preciseLastMeasuredClusterVcpuCapacity_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, preciseLastMeasuredClusterVcpuCapacity_);
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
    if (!(obj instanceof com.google.cloud.gkehub.metering.v1alpha.MembershipState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.metering.v1alpha.MembershipState other = (com.google.cloud.gkehub.metering.v1alpha.MembershipState) obj;

    if (hasLastMeasurementTime() != other.hasLastMeasurementTime()) return false;
    if (hasLastMeasurementTime()) {
      if (!getLastMeasurementTime()
          .equals(other.getLastMeasurementTime())) return false;
    }
    if (java.lang.Float.floatToIntBits(getPreciseLastMeasuredClusterVcpuCapacity())
        != java.lang.Float.floatToIntBits(
            other.getPreciseLastMeasuredClusterVcpuCapacity())) return false;
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
    if (hasLastMeasurementTime()) {
      hash = (37 * hash) + LAST_MEASUREMENT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastMeasurementTime().hashCode();
    }
    hash = (37 * hash) + PRECISE_LAST_MEASURED_CLUSTER_VCPU_CAPACITY_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getPreciseLastMeasuredClusterVcpuCapacity());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState parseFrom(
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
  public static Builder newBuilder(com.google.cloud.gkehub.metering.v1alpha.MembershipState prototype) {
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
   * **Metering**: Per-Membership Feature State.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.metering.v1alpha.MembershipState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.metering.v1alpha.MembershipState)
      com.google.cloud.gkehub.metering.v1alpha.MembershipStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.gkehub.metering.v1alpha.MeteringProto.internal_static_google_cloud_gkehub_metering_v1alpha_MembershipState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.metering.v1alpha.MeteringProto.internal_static_google_cloud_gkehub_metering_v1alpha_MembershipState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.metering.v1alpha.MembershipState.class, com.google.cloud.gkehub.metering.v1alpha.MembershipState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.metering.v1alpha.MembershipState.newBuilder()
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
      if (lastMeasurementTimeBuilder_ == null) {
        lastMeasurementTime_ = null;
      } else {
        lastMeasurementTime_ = null;
        lastMeasurementTimeBuilder_ = null;
      }
      preciseLastMeasuredClusterVcpuCapacity_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.gkehub.metering.v1alpha.MeteringProto.internal_static_google_cloud_gkehub_metering_v1alpha_MembershipState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.metering.v1alpha.MembershipState getDefaultInstanceForType() {
      return com.google.cloud.gkehub.metering.v1alpha.MembershipState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.metering.v1alpha.MembershipState build() {
      com.google.cloud.gkehub.metering.v1alpha.MembershipState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.metering.v1alpha.MembershipState buildPartial() {
      com.google.cloud.gkehub.metering.v1alpha.MembershipState result = new com.google.cloud.gkehub.metering.v1alpha.MembershipState(this);
      if (lastMeasurementTimeBuilder_ == null) {
        result.lastMeasurementTime_ = lastMeasurementTime_;
      } else {
        result.lastMeasurementTime_ = lastMeasurementTimeBuilder_.build();
      }
      result.preciseLastMeasuredClusterVcpuCapacity_ = preciseLastMeasuredClusterVcpuCapacity_;
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
      if (other instanceof com.google.cloud.gkehub.metering.v1alpha.MembershipState) {
        return mergeFrom((com.google.cloud.gkehub.metering.v1alpha.MembershipState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.metering.v1alpha.MembershipState other) {
      if (other == com.google.cloud.gkehub.metering.v1alpha.MembershipState.getDefaultInstance()) return this;
      if (other.hasLastMeasurementTime()) {
        mergeLastMeasurementTime(other.getLastMeasurementTime());
      }
      if (other.getPreciseLastMeasuredClusterVcpuCapacity() != 0F) {
        setPreciseLastMeasuredClusterVcpuCapacity(other.getPreciseLastMeasuredClusterVcpuCapacity());
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
      com.google.cloud.gkehub.metering.v1alpha.MembershipState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.gkehub.metering.v1alpha.MembershipState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.Timestamp lastMeasurementTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> lastMeasurementTimeBuilder_;
    /**
     * <pre>
     * The time stamp of the most recent measurement of the number of vCPUs
     * in the cluster.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
     * @return Whether the lastMeasurementTime field is set.
     */
    public boolean hasLastMeasurementTime() {
      return lastMeasurementTimeBuilder_ != null || lastMeasurementTime_ != null;
    }
    /**
     * <pre>
     * The time stamp of the most recent measurement of the number of vCPUs
     * in the cluster.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
     * @return The lastMeasurementTime.
     */
    public com.google.protobuf.Timestamp getLastMeasurementTime() {
      if (lastMeasurementTimeBuilder_ == null) {
        return lastMeasurementTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : lastMeasurementTime_;
      } else {
        return lastMeasurementTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The time stamp of the most recent measurement of the number of vCPUs
     * in the cluster.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
     */
    public Builder setLastMeasurementTime(com.google.protobuf.Timestamp value) {
      if (lastMeasurementTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        lastMeasurementTime_ = value;
        onChanged();
      } else {
        lastMeasurementTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The time stamp of the most recent measurement of the number of vCPUs
     * in the cluster.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
     */
    public Builder setLastMeasurementTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (lastMeasurementTimeBuilder_ == null) {
        lastMeasurementTime_ = builderForValue.build();
        onChanged();
      } else {
        lastMeasurementTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The time stamp of the most recent measurement of the number of vCPUs
     * in the cluster.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
     */
    public Builder mergeLastMeasurementTime(com.google.protobuf.Timestamp value) {
      if (lastMeasurementTimeBuilder_ == null) {
        if (lastMeasurementTime_ != null) {
          lastMeasurementTime_ =
            com.google.protobuf.Timestamp.newBuilder(lastMeasurementTime_).mergeFrom(value).buildPartial();
        } else {
          lastMeasurementTime_ = value;
        }
        onChanged();
      } else {
        lastMeasurementTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The time stamp of the most recent measurement of the number of vCPUs
     * in the cluster.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
     */
    public Builder clearLastMeasurementTime() {
      if (lastMeasurementTimeBuilder_ == null) {
        lastMeasurementTime_ = null;
        onChanged();
      } else {
        lastMeasurementTime_ = null;
        lastMeasurementTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The time stamp of the most recent measurement of the number of vCPUs
     * in the cluster.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getLastMeasurementTimeBuilder() {
      
      onChanged();
      return getLastMeasurementTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The time stamp of the most recent measurement of the number of vCPUs
     * in the cluster.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getLastMeasurementTimeOrBuilder() {
      if (lastMeasurementTimeBuilder_ != null) {
        return lastMeasurementTimeBuilder_.getMessageOrBuilder();
      } else {
        return lastMeasurementTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : lastMeasurementTime_;
      }
    }
    /**
     * <pre>
     * The time stamp of the most recent measurement of the number of vCPUs
     * in the cluster.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp last_measurement_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getLastMeasurementTimeFieldBuilder() {
      if (lastMeasurementTimeBuilder_ == null) {
        lastMeasurementTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getLastMeasurementTime(),
                getParentForChildren(),
                isClean());
        lastMeasurementTime_ = null;
      }
      return lastMeasurementTimeBuilder_;
    }

    private float preciseLastMeasuredClusterVcpuCapacity_ ;
    /**
     * <pre>
     * The vCPUs capacity in the cluster according to the most recent
     * measurement (1/1000 precision).
     * </pre>
     *
     * <code>float precise_last_measured_cluster_vcpu_capacity = 3;</code>
     * @return The preciseLastMeasuredClusterVcpuCapacity.
     */
    @java.lang.Override
    public float getPreciseLastMeasuredClusterVcpuCapacity() {
      return preciseLastMeasuredClusterVcpuCapacity_;
    }
    /**
     * <pre>
     * The vCPUs capacity in the cluster according to the most recent
     * measurement (1/1000 precision).
     * </pre>
     *
     * <code>float precise_last_measured_cluster_vcpu_capacity = 3;</code>
     * @param value The preciseLastMeasuredClusterVcpuCapacity to set.
     * @return This builder for chaining.
     */
    public Builder setPreciseLastMeasuredClusterVcpuCapacity(float value) {
      
      preciseLastMeasuredClusterVcpuCapacity_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The vCPUs capacity in the cluster according to the most recent
     * measurement (1/1000 precision).
     * </pre>
     *
     * <code>float precise_last_measured_cluster_vcpu_capacity = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPreciseLastMeasuredClusterVcpuCapacity() {
      
      preciseLastMeasuredClusterVcpuCapacity_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.metering.v1alpha.MembershipState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.metering.v1alpha.MembershipState)
  private static final com.google.cloud.gkehub.metering.v1alpha.MembershipState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.metering.v1alpha.MembershipState();
  }

  public static com.google.cloud.gkehub.metering.v1alpha.MembershipState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MembershipState>
      PARSER = new com.google.protobuf.AbstractParser<MembershipState>() {
    @java.lang.Override
    public MembershipState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MembershipState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MembershipState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MembershipState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.metering.v1alpha.MembershipState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

