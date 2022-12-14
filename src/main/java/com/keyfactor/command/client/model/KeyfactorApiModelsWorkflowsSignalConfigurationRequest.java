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
import java.util.ArrayList;
import java.util.List;

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
 * KeyfactorApiModelsWorkflowsSignalConfigurationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsWorkflowsSignalConfigurationRequest {
  public static final String SERIALIZED_NAME_SIGNAL_NAME = "SignalName";
  @SerializedName(SERIALIZED_NAME_SIGNAL_NAME)
  private String signalName;

  public static final String SERIALIZED_NAME_ROLE_IDS = "RoleIds";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<Integer> roleIds = null;

  public KeyfactorApiModelsWorkflowsSignalConfigurationRequest() {
  }

  public KeyfactorApiModelsWorkflowsSignalConfigurationRequest signalName(String signalName) {
    
    this.signalName = signalName;
    return this;
  }

   /**
   * The name of the signal.
   * @return signalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the signal.")

  public String getSignalName() {
    return signalName;
  }


  public void setSignalName(String signalName) {
    this.signalName = signalName;
  }


  public KeyfactorApiModelsWorkflowsSignalConfigurationRequest roleIds(List<Integer> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public KeyfactorApiModelsWorkflowsSignalConfigurationRequest addRoleIdsItem(Integer roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * The roles that are allowed to send the signal.
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The roles that are allowed to send the signal.")

  public List<Integer> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(List<Integer> roleIds) {
    this.roleIds = roleIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsWorkflowsSignalConfigurationRequest keyfactorApiModelsWorkflowsSignalConfigurationRequest = (KeyfactorApiModelsWorkflowsSignalConfigurationRequest) o;
    return Objects.equals(this.signalName, keyfactorApiModelsWorkflowsSignalConfigurationRequest.signalName) &&
        Objects.equals(this.roleIds, keyfactorApiModelsWorkflowsSignalConfigurationRequest.roleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signalName, roleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsWorkflowsSignalConfigurationRequest {\n");
    sb.append("    signalName: ").append(toIndentedString(signalName)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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
    openapiFields.add("SignalName");
    openapiFields.add("RoleIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsWorkflowsSignalConfigurationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsWorkflowsSignalConfigurationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsWorkflowsSignalConfigurationRequest is not found in the empty JSON string", KeyfactorApiModelsWorkflowsSignalConfigurationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsWorkflowsSignalConfigurationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsWorkflowsSignalConfigurationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SignalName") != null && !jsonObj.get("SignalName").isJsonNull()) && !jsonObj.get("SignalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SignalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SignalName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("RoleIds") != null && !jsonObj.get("RoleIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RoleIds` to be an array in the JSON string but got `%s`", jsonObj.get("RoleIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsWorkflowsSignalConfigurationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsWorkflowsSignalConfigurationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsWorkflowsSignalConfigurationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsWorkflowsSignalConfigurationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsWorkflowsSignalConfigurationRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsWorkflowsSignalConfigurationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsWorkflowsSignalConfigurationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsWorkflowsSignalConfigurationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsWorkflowsSignalConfigurationRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsWorkflowsSignalConfigurationRequest
  */
  public static KeyfactorApiModelsWorkflowsSignalConfigurationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsWorkflowsSignalConfigurationRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsWorkflowsSignalConfigurationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

