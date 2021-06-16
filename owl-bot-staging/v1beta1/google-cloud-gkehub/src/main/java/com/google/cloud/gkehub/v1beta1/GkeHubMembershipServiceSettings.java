/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.gkehub.v1beta1;

import static com.google.cloud.gkehub.v1beta1.GkeHubMembershipServiceClient.ListMembershipsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.gkehub.v1beta1.stub.GkeHubMembershipServiceStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link GkeHubMembershipServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li> The default service address (gkehub.googleapis.com) and default port (443) are used.
 *   <li> Credentials are acquired automatically through Application Default Credentials.
 *   <li> Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getMembership to 30 seconds:
 *
 * <pre>{@code
 * GkeHubMembershipServiceSettings.Builder gkeHubMembershipServiceSettingsBuilder =
 *     GkeHubMembershipServiceSettings.newBuilder();
 * gkeHubMembershipServiceSettingsBuilder
 *     .getMembershipSettings()
 *     .setRetrySettings(
 *         gkeHubMembershipServiceSettingsBuilder
 *             .getMembershipSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * GkeHubMembershipServiceSettings gkeHubMembershipServiceSettings =
 *     gkeHubMembershipServiceSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GkeHubMembershipServiceSettings
    extends ClientSettings<GkeHubMembershipServiceSettings> {

  /** Returns the object with the settings used for calls to listMemberships. */
  public PagedCallSettings<
          ListMembershipsRequest, ListMembershipsResponse, ListMembershipsPagedResponse>
      listMembershipsSettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings()).listMembershipsSettings();
  }

  /** Returns the object with the settings used for calls to getMembership. */
  public UnaryCallSettings<GetMembershipRequest, Membership> getMembershipSettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings()).getMembershipSettings();
  }

  /** Returns the object with the settings used for calls to createMembership. */
  public UnaryCallSettings<CreateMembershipRequest, Operation> createMembershipSettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings()).createMembershipSettings();
  }

  /** Returns the object with the settings used for calls to createMembership. */
  public OperationCallSettings<CreateMembershipRequest, Membership, OperationMetadata>
      createMembershipOperationSettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings())
        .createMembershipOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteMembership. */
  public UnaryCallSettings<DeleteMembershipRequest, Operation> deleteMembershipSettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings()).deleteMembershipSettings();
  }

  /** Returns the object with the settings used for calls to deleteMembership. */
  public OperationCallSettings<DeleteMembershipRequest, Empty, OperationMetadata>
      deleteMembershipOperationSettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings())
        .deleteMembershipOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateMembership. */
  public UnaryCallSettings<UpdateMembershipRequest, Operation> updateMembershipSettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings()).updateMembershipSettings();
  }

  /** Returns the object with the settings used for calls to updateMembership. */
  public OperationCallSettings<UpdateMembershipRequest, Membership, OperationMetadata>
      updateMembershipOperationSettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings())
        .updateMembershipOperationSettings();
  }

  /** Returns the object with the settings used for calls to generateConnectManifest. */
  public UnaryCallSettings<GenerateConnectManifestRequest, GenerateConnectManifestResponse>
      generateConnectManifestSettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings())
        .generateConnectManifestSettings();
  }

  /** Returns the object with the settings used for calls to validateExclusivity. */
  public UnaryCallSettings<ValidateExclusivityRequest, ValidateExclusivityResponse>
      validateExclusivitySettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings()).validateExclusivitySettings();
  }

  /** Returns the object with the settings used for calls to generateExclusivityManifest. */
  public UnaryCallSettings<GenerateExclusivityManifestRequest, GenerateExclusivityManifestResponse>
      generateExclusivityManifestSettings() {
    return ((GkeHubMembershipServiceStubSettings) getStubSettings())
        .generateExclusivityManifestSettings();
  }

  public static final GkeHubMembershipServiceSettings create(
      GkeHubMembershipServiceStubSettings stub) throws IOException {
    return new GkeHubMembershipServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return GkeHubMembershipServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return GkeHubMembershipServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return GkeHubMembershipServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GkeHubMembershipServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return GkeHubMembershipServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return GkeHubMembershipServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return GkeHubMembershipServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected GkeHubMembershipServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for GkeHubMembershipServiceSettings. */
  public static class Builder
      extends ClientSettings.Builder<GkeHubMembershipServiceSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(GkeHubMembershipServiceStubSettings.newBuilder(clientContext));
    }

    protected Builder(GkeHubMembershipServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(GkeHubMembershipServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(GkeHubMembershipServiceStubSettings.newBuilder());
    }

    public GkeHubMembershipServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((GkeHubMembershipServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'.
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to listMemberships. */
    public PagedCallSettings.Builder<
            ListMembershipsRequest, ListMembershipsResponse, ListMembershipsPagedResponse>
        listMembershipsSettings() {
      return getStubSettingsBuilder().listMembershipsSettings();
    }

    /** Returns the builder for the settings used for calls to getMembership. */
    public UnaryCallSettings.Builder<GetMembershipRequest, Membership> getMembershipSettings() {
      return getStubSettingsBuilder().getMembershipSettings();
    }

    /** Returns the builder for the settings used for calls to createMembership. */
    public UnaryCallSettings.Builder<CreateMembershipRequest, Operation>
        createMembershipSettings() {
      return getStubSettingsBuilder().createMembershipSettings();
    }

    /** Returns the builder for the settings used for calls to createMembership. */
    public OperationCallSettings.Builder<CreateMembershipRequest, Membership, OperationMetadata>
        createMembershipOperationSettings() {
      return getStubSettingsBuilder().createMembershipOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteMembership. */
    public UnaryCallSettings.Builder<DeleteMembershipRequest, Operation>
        deleteMembershipSettings() {
      return getStubSettingsBuilder().deleteMembershipSettings();
    }

    /** Returns the builder for the settings used for calls to deleteMembership. */
    public OperationCallSettings.Builder<DeleteMembershipRequest, Empty, OperationMetadata>
        deleteMembershipOperationSettings() {
      return getStubSettingsBuilder().deleteMembershipOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateMembership. */
    public UnaryCallSettings.Builder<UpdateMembershipRequest, Operation>
        updateMembershipSettings() {
      return getStubSettingsBuilder().updateMembershipSettings();
    }

    /** Returns the builder for the settings used for calls to updateMembership. */
    public OperationCallSettings.Builder<UpdateMembershipRequest, Membership, OperationMetadata>
        updateMembershipOperationSettings() {
      return getStubSettingsBuilder().updateMembershipOperationSettings();
    }

    /** Returns the builder for the settings used for calls to generateConnectManifest. */
    public UnaryCallSettings.Builder<
            GenerateConnectManifestRequest, GenerateConnectManifestResponse>
        generateConnectManifestSettings() {
      return getStubSettingsBuilder().generateConnectManifestSettings();
    }

    /** Returns the builder for the settings used for calls to validateExclusivity. */
    public UnaryCallSettings.Builder<ValidateExclusivityRequest, ValidateExclusivityResponse>
        validateExclusivitySettings() {
      return getStubSettingsBuilder().validateExclusivitySettings();
    }

    /** Returns the builder for the settings used for calls to generateExclusivityManifest. */
    public UnaryCallSettings.Builder<
            GenerateExclusivityManifestRequest, GenerateExclusivityManifestResponse>
        generateExclusivityManifestSettings() {
      return getStubSettingsBuilder().generateExclusivityManifestSettings();
    }

    @Override
    public GkeHubMembershipServiceSettings build() throws IOException {
      return new GkeHubMembershipServiceSettings(this);
    }
  }
}
