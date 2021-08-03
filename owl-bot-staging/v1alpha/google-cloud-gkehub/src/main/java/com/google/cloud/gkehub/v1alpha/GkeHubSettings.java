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

package com.google.cloud.gkehub.v1alpha;

import static com.google.cloud.gkehub.v1alpha.GkeHubClient.ListFeaturesPagedResponse;

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
import com.google.cloud.gkehub.v1alpha.stub.GkeHubStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link GkeHubClient}.
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
 * <p>For example, to set the total timeout of getFeature to 30 seconds:
 *
 * <pre>{@code
 * GkeHubSettings.Builder gkeHubSettingsBuilder = GkeHubSettings.newBuilder();
 * gkeHubSettingsBuilder
 *     .getFeatureSettings()
 *     .setRetrySettings(
 *         gkeHubSettingsBuilder
 *             .getFeatureSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * GkeHubSettings gkeHubSettings = gkeHubSettingsBuilder.build();
 * }</pre>
 */
@BetaApi
@Generated("by gapic-generator-java")
public class GkeHubSettings extends ClientSettings<GkeHubSettings> {

  /** Returns the object with the settings used for calls to listFeatures. */
  public PagedCallSettings<ListFeaturesRequest, ListFeaturesResponse, ListFeaturesPagedResponse>
      listFeaturesSettings() {
    return ((GkeHubStubSettings) getStubSettings()).listFeaturesSettings();
  }

  /** Returns the object with the settings used for calls to getFeature. */
  public UnaryCallSettings<GetFeatureRequest, Feature> getFeatureSettings() {
    return ((GkeHubStubSettings) getStubSettings()).getFeatureSettings();
  }

  /** Returns the object with the settings used for calls to createFeature. */
  public UnaryCallSettings<CreateFeatureRequest, Operation> createFeatureSettings() {
    return ((GkeHubStubSettings) getStubSettings()).createFeatureSettings();
  }

  /** Returns the object with the settings used for calls to createFeature. */
  public OperationCallSettings<CreateFeatureRequest, Feature, OperationMetadata>
      createFeatureOperationSettings() {
    return ((GkeHubStubSettings) getStubSettings()).createFeatureOperationSettings();
  }

  /** Returns the object with the settings used for calls to deleteFeature. */
  public UnaryCallSettings<DeleteFeatureRequest, Operation> deleteFeatureSettings() {
    return ((GkeHubStubSettings) getStubSettings()).deleteFeatureSettings();
  }

  /** Returns the object with the settings used for calls to deleteFeature. */
  public OperationCallSettings<DeleteFeatureRequest, Empty, OperationMetadata>
      deleteFeatureOperationSettings() {
    return ((GkeHubStubSettings) getStubSettings()).deleteFeatureOperationSettings();
  }

  /** Returns the object with the settings used for calls to updateFeature. */
  public UnaryCallSettings<UpdateFeatureRequest, Operation> updateFeatureSettings() {
    return ((GkeHubStubSettings) getStubSettings()).updateFeatureSettings();
  }

  /** Returns the object with the settings used for calls to updateFeature. */
  public OperationCallSettings<UpdateFeatureRequest, Feature, OperationMetadata>
      updateFeatureOperationSettings() {
    return ((GkeHubStubSettings) getStubSettings()).updateFeatureOperationSettings();
  }

  public static final GkeHubSettings create(GkeHubStubSettings stub) throws IOException {
    return new GkeHubSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return GkeHubStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return GkeHubStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return GkeHubStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GkeHubStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return GkeHubStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return GkeHubStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return GkeHubStubSettings.defaultApiClientHeaderProviderBuilder();
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

  protected GkeHubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for GkeHubSettings. */
  public static class Builder extends ClientSettings.Builder<GkeHubSettings, Builder> {

    protected Builder() throws IOException {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(GkeHubStubSettings.newBuilder(clientContext));
    }

    protected Builder(GkeHubSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(GkeHubStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    private static Builder createDefault() {
      return new Builder(GkeHubStubSettings.newBuilder());
    }

    public GkeHubStubSettings.Builder getStubSettingsBuilder() {
      return ((GkeHubStubSettings.Builder) getStubSettings());
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

    /** Returns the builder for the settings used for calls to listFeatures. */
    public PagedCallSettings.Builder<
            ListFeaturesRequest, ListFeaturesResponse, ListFeaturesPagedResponse>
        listFeaturesSettings() {
      return getStubSettingsBuilder().listFeaturesSettings();
    }

    /** Returns the builder for the settings used for calls to getFeature. */
    public UnaryCallSettings.Builder<GetFeatureRequest, Feature> getFeatureSettings() {
      return getStubSettingsBuilder().getFeatureSettings();
    }

    /** Returns the builder for the settings used for calls to createFeature. */
    public UnaryCallSettings.Builder<CreateFeatureRequest, Operation> createFeatureSettings() {
      return getStubSettingsBuilder().createFeatureSettings();
    }

    /** Returns the builder for the settings used for calls to createFeature. */
    public OperationCallSettings.Builder<CreateFeatureRequest, Feature, OperationMetadata>
        createFeatureOperationSettings() {
      return getStubSettingsBuilder().createFeatureOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deleteFeature. */
    public UnaryCallSettings.Builder<DeleteFeatureRequest, Operation> deleteFeatureSettings() {
      return getStubSettingsBuilder().deleteFeatureSettings();
    }

    /** Returns the builder for the settings used for calls to deleteFeature. */
    public OperationCallSettings.Builder<DeleteFeatureRequest, Empty, OperationMetadata>
        deleteFeatureOperationSettings() {
      return getStubSettingsBuilder().deleteFeatureOperationSettings();
    }

    /** Returns the builder for the settings used for calls to updateFeature. */
    public UnaryCallSettings.Builder<UpdateFeatureRequest, Operation> updateFeatureSettings() {
      return getStubSettingsBuilder().updateFeatureSettings();
    }

    /** Returns the builder for the settings used for calls to updateFeature. */
    public OperationCallSettings.Builder<UpdateFeatureRequest, Feature, OperationMetadata>
        updateFeatureOperationSettings() {
      return getStubSettingsBuilder().updateFeatureOperationSettings();
    }

    @Override
    public GkeHubSettings build() throws IOException {
      return new GkeHubSettings(this);
    }
  }
}
