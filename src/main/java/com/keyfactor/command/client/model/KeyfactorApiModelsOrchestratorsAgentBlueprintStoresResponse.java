/*
 * Copyright 2022 Keyfactor
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  You may obtain a
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0.  Unless
 * required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for
 * thespecific language governing permissions and limitations under the
 * License.
 *
 * Keyfactor-v1
 * This reference serves to document REST-based methods to manage and integrate with Keyfactor. In addition, an embedded interface allows for the execution of calls against the current Keyfactor API instance.
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.keyfactor.command.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.keyfactor.command.client.JSON;

/**
 * KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse {
  public static final String SERIALIZED_NAME_AGENT_BLUEPRINT_STORE_ID = "AgentBlueprintStoreId";
  @SerializedName(SERIALIZED_NAME_AGENT_BLUEPRINT_STORE_ID)
  private UUID agentBlueprintStoreId;

  public static final String SERIALIZED_NAME_AGENT_BLUEPRINT_ID = "AgentBlueprintId";
  @SerializedName(SERIALIZED_NAME_AGENT_BLUEPRINT_ID)
  private UUID agentBlueprintId;

  public static final String SERIALIZED_NAME_STORE_PATH = "StorePath";
  @SerializedName(SERIALIZED_NAME_STORE_PATH)
  private String storePath;

  public static final String SERIALIZED_NAME_CONTAINER_ID = "ContainerId";
  @SerializedName(SERIALIZED_NAME_CONTAINER_ID)
  private Integer containerId;

  public static final String SERIALIZED_NAME_CERT_STORE_TYPE = "CertStoreType";
  @SerializedName(SERIALIZED_NAME_CERT_STORE_TYPE)
  private Integer certStoreType;

  public static final String SERIALIZED_NAME_CERT_STORE_TYPE_NAME = "CertStoreTypeName";
  @SerializedName(SERIALIZED_NAME_CERT_STORE_TYPE_NAME)
  private String certStoreTypeName;

  public static final String SERIALIZED_NAME_APPROVED = "Approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved;

  public static final String SERIALIZED_NAME_CREATE_IF_MISSING = "CreateIfMissing";
  @SerializedName(SERIALIZED_NAME_CREATE_IF_MISSING)
  private Boolean createIfMissing;

  public static final String SERIALIZED_NAME_PROPERTIES = "Properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private String properties;

  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse() {
  }

  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse agentBlueprintStoreId(UUID agentBlueprintStoreId) {
    
    this.agentBlueprintStoreId = agentBlueprintStoreId;
    return this;
  }

   /**
   * Get agentBlueprintStoreId
   * @return agentBlueprintStoreId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getAgentBlueprintStoreId() {
    return agentBlueprintStoreId;
  }


  public void setAgentBlueprintStoreId(UUID agentBlueprintStoreId) {
    this.agentBlueprintStoreId = agentBlueprintStoreId;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse agentBlueprintId(UUID agentBlueprintId) {
    
    this.agentBlueprintId = agentBlueprintId;
    return this;
  }

   /**
   * Get agentBlueprintId
   * @return agentBlueprintId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getAgentBlueprintId() {
    return agentBlueprintId;
  }


  public void setAgentBlueprintId(UUID agentBlueprintId) {
    this.agentBlueprintId = agentBlueprintId;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse storePath(String storePath) {
    
    this.storePath = storePath;
    return this;
  }

   /**
   * Get storePath
   * @return storePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorePath() {
    return storePath;
  }


  public void setStorePath(String storePath) {
    this.storePath = storePath;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse containerId(Integer containerId) {
    
    this.containerId = containerId;
    return this;
  }

   /**
   * Get containerId
   * @return containerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContainerId() {
    return containerId;
  }


  public void setContainerId(Integer containerId) {
    this.containerId = containerId;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse certStoreType(Integer certStoreType) {
    
    this.certStoreType = certStoreType;
    return this;
  }

   /**
   * Get certStoreType
   * @return certStoreType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCertStoreType() {
    return certStoreType;
  }


  public void setCertStoreType(Integer certStoreType) {
    this.certStoreType = certStoreType;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse certStoreTypeName(String certStoreTypeName) {
    
    this.certStoreTypeName = certStoreTypeName;
    return this;
  }

   /**
   * Get certStoreTypeName
   * @return certStoreTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertStoreTypeName() {
    return certStoreTypeName;
  }


  public void setCertStoreTypeName(String certStoreTypeName) {
    this.certStoreTypeName = certStoreTypeName;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse approved(Boolean approved) {
    
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse createIfMissing(Boolean createIfMissing) {
    
    this.createIfMissing = createIfMissing;
    return this;
  }

   /**
   * Get createIfMissing
   * @return createIfMissing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCreateIfMissing() {
    return createIfMissing;
  }


  public void setCreateIfMissing(Boolean createIfMissing) {
    this.createIfMissing = createIfMissing;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse properties(String properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProperties() {
    return properties;
  }


  public void setProperties(String properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse keyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse = (KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse) o;
    return Objects.equals(this.agentBlueprintStoreId, keyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.agentBlueprintStoreId) &&
        Objects.equals(this.agentBlueprintId, keyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.agentBlueprintId) &&
        Objects.equals(this.storePath, keyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.storePath) &&
        Objects.equals(this.containerId, keyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.containerId) &&
        Objects.equals(this.certStoreType, keyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.certStoreType) &&
        Objects.equals(this.certStoreTypeName, keyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.certStoreTypeName) &&
        Objects.equals(this.approved, keyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.approved) &&
        Objects.equals(this.createIfMissing, keyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.createIfMissing) &&
        Objects.equals(this.properties, keyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentBlueprintStoreId, agentBlueprintId, storePath, containerId, certStoreType, certStoreTypeName, approved, createIfMissing, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse {\n");
    sb.append("    agentBlueprintStoreId: ").append(toIndentedString(agentBlueprintStoreId)).append("\n");
    sb.append("    agentBlueprintId: ").append(toIndentedString(agentBlueprintId)).append("\n");
    sb.append("    storePath: ").append(toIndentedString(storePath)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    certStoreType: ").append(toIndentedString(certStoreType)).append("\n");
    sb.append("    certStoreTypeName: ").append(toIndentedString(certStoreTypeName)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    createIfMissing: ").append(toIndentedString(createIfMissing)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("AgentBlueprintStoreId");
    openapiFields.add("AgentBlueprintId");
    openapiFields.add("StorePath");
    openapiFields.add("ContainerId");
    openapiFields.add("CertStoreType");
    openapiFields.add("CertStoreTypeName");
    openapiFields.add("Approved");
    openapiFields.add("CreateIfMissing");
    openapiFields.add("Properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse is not found in the empty JSON string", KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("AgentBlueprintStoreId") != null && !jsonObj.get("AgentBlueprintStoreId").isJsonNull()) && !jsonObj.get("AgentBlueprintStoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentBlueprintStoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentBlueprintStoreId").toString()));
      }
      if ((jsonObj.get("AgentBlueprintId") != null && !jsonObj.get("AgentBlueprintId").isJsonNull()) && !jsonObj.get("AgentBlueprintId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentBlueprintId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentBlueprintId").toString()));
      }
      if ((jsonObj.get("StorePath") != null && !jsonObj.get("StorePath").isJsonNull()) && !jsonObj.get("StorePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StorePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StorePath").toString()));
      }
      if ((jsonObj.get("CertStoreTypeName") != null && !jsonObj.get("CertStoreTypeName").isJsonNull()) && !jsonObj.get("CertStoreTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CertStoreTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CertStoreTypeName").toString()));
      }
      if ((jsonObj.get("Properties") != null && !jsonObj.get("Properties").isJsonNull()) && !jsonObj.get("Properties").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Properties` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Properties").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse
  */
  public static KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

