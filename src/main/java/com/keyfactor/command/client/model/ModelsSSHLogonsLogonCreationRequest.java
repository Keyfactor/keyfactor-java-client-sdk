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
 * ModelsSSHLogonsLogonCreationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsSSHLogonsLogonCreationRequest {
  public static final String SERIALIZED_NAME_USERNAME = "Username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_SERVER_ID = "ServerId";
  @SerializedName(SERIALIZED_NAME_SERVER_ID)
  private Integer serverId;

  public static final String SERIALIZED_NAME_USER_IDS = "UserIds";
  @SerializedName(SERIALIZED_NAME_USER_IDS)
  private List<Integer> userIds = null;

  public ModelsSSHLogonsLogonCreationRequest() {
  }

  public ModelsSSHLogonsLogonCreationRequest username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public ModelsSSHLogonsLogonCreationRequest serverId(Integer serverId) {
    
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getServerId() {
    return serverId;
  }


  public void setServerId(Integer serverId) {
    this.serverId = serverId;
  }


  public ModelsSSHLogonsLogonCreationRequest userIds(List<Integer> userIds) {
    
    this.userIds = userIds;
    return this;
  }

  public ModelsSSHLogonsLogonCreationRequest addUserIdsItem(Integer userIdsItem) {
    if (this.userIds == null) {
      this.userIds = new ArrayList<>();
    }
    this.userIds.add(userIdsItem);
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getUserIds() {
    return userIds;
  }


  public void setUserIds(List<Integer> userIds) {
    this.userIds = userIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSHLogonsLogonCreationRequest modelsSSHLogonsLogonCreationRequest = (ModelsSSHLogonsLogonCreationRequest) o;
    return Objects.equals(this.username, modelsSSHLogonsLogonCreationRequest.username) &&
        Objects.equals(this.serverId, modelsSSHLogonsLogonCreationRequest.serverId) &&
        Objects.equals(this.userIds, modelsSSHLogonsLogonCreationRequest.userIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, serverId, userIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSHLogonsLogonCreationRequest {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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
    openapiFields.add("Username");
    openapiFields.add("ServerId");
    openapiFields.add("UserIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Username");
    openapiRequiredFields.add("ServerId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSHLogonsLogonCreationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSHLogonsLogonCreationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSHLogonsLogonCreationRequest is not found in the empty JSON string", ModelsSSHLogonsLogonCreationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSHLogonsLogonCreationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSHLogonsLogonCreationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsSSHLogonsLogonCreationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("Username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Username").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("UserIds") != null && !jsonObj.get("UserIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `UserIds` to be an array in the JSON string but got `%s`", jsonObj.get("UserIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSHLogonsLogonCreationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSHLogonsLogonCreationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSHLogonsLogonCreationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSHLogonsLogonCreationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSHLogonsLogonCreationRequest>() {
           @Override
           public void write(JsonWriter out, ModelsSSHLogonsLogonCreationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSHLogonsLogonCreationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSHLogonsLogonCreationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSHLogonsLogonCreationRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsSSHLogonsLogonCreationRequest
  */
  public static ModelsSSHLogonsLogonCreationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSHLogonsLogonCreationRequest.class);
  }

 /**
  * Convert an instance of ModelsSSHLogonsLogonCreationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

