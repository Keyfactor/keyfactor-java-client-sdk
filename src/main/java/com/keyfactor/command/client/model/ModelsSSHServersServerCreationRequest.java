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
 * ModelsSSHServersServerCreationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsSSHServersServerCreationRequest {
  public static final String SERIALIZED_NAME_AGENT_ID = "AgentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private UUID agentId;

  public static final String SERIALIZED_NAME_HOSTNAME = "Hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_SERVER_GROUP_ID = "ServerGroupId";
  @SerializedName(SERIALIZED_NAME_SERVER_GROUP_ID)
  private UUID serverGroupId;

  public static final String SERIALIZED_NAME_UNDER_MANAGEMENT = "UnderManagement";
  @SerializedName(SERIALIZED_NAME_UNDER_MANAGEMENT)
  private Boolean underManagement;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public ModelsSSHServersServerCreationRequest() {
  }

  public ModelsSSHServersServerCreationRequest agentId(UUID agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * Get agentId
   * @return agentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "")

  public UUID getAgentId() {
    return agentId;
  }


  public void setAgentId(UUID agentId) {
    this.agentId = agentId;
  }


  public ModelsSSHServersServerCreationRequest hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public ModelsSSHServersServerCreationRequest serverGroupId(UUID serverGroupId) {
    
    this.serverGroupId = serverGroupId;
    return this;
  }

   /**
   * Get serverGroupId
   * @return serverGroupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "")

  public UUID getServerGroupId() {
    return serverGroupId;
  }


  public void setServerGroupId(UUID serverGroupId) {
    this.serverGroupId = serverGroupId;
  }


  public ModelsSSHServersServerCreationRequest underManagement(Boolean underManagement) {
    
    this.underManagement = underManagement;
    return this;
  }

   /**
   * Get underManagement
   * @return underManagement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUnderManagement() {
    return underManagement;
  }


  public void setUnderManagement(Boolean underManagement) {
    this.underManagement = underManagement;
  }


  public ModelsSSHServersServerCreationRequest port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSHServersServerCreationRequest modelsSSHServersServerCreationRequest = (ModelsSSHServersServerCreationRequest) o;
    return Objects.equals(this.agentId, modelsSSHServersServerCreationRequest.agentId) &&
        Objects.equals(this.hostname, modelsSSHServersServerCreationRequest.hostname) &&
        Objects.equals(this.serverGroupId, modelsSSHServersServerCreationRequest.serverGroupId) &&
        Objects.equals(this.underManagement, modelsSSHServersServerCreationRequest.underManagement) &&
        Objects.equals(this.port, modelsSSHServersServerCreationRequest.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, hostname, serverGroupId, underManagement, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSHServersServerCreationRequest {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    serverGroupId: ").append(toIndentedString(serverGroupId)).append("\n");
    sb.append("    underManagement: ").append(toIndentedString(underManagement)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
    openapiFields.add("AgentId");
    openapiFields.add("Hostname");
    openapiFields.add("ServerGroupId");
    openapiFields.add("UnderManagement");
    openapiFields.add("Port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AgentId");
    openapiRequiredFields.add("Hostname");
    openapiRequiredFields.add("ServerGroupId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSHServersServerCreationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSHServersServerCreationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSHServersServerCreationRequest is not found in the empty JSON string", ModelsSSHServersServerCreationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSHServersServerCreationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSHServersServerCreationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsSSHServersServerCreationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("AgentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentId").toString()));
      }
      if (!jsonObj.get("Hostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Hostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Hostname").toString()));
      }
      if (!jsonObj.get("ServerGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ServerGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ServerGroupId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSHServersServerCreationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSHServersServerCreationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSHServersServerCreationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSHServersServerCreationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSHServersServerCreationRequest>() {
           @Override
           public void write(JsonWriter out, ModelsSSHServersServerCreationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSHServersServerCreationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSHServersServerCreationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSHServersServerCreationRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsSSHServersServerCreationRequest
  */
  public static ModelsSSHServersServerCreationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSHServersServerCreationRequest.class);
  }

 /**
  * Convert an instance of ModelsSSHServersServerCreationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

