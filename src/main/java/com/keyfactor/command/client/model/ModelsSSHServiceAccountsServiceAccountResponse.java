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
import com.keyfactor.command.client.model.ModelsSSHServerGroupsServerGroupResponse;
import com.keyfactor.command.client.model.ModelsSSHUsersSshUserResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * ModelsSSHServiceAccountsServiceAccountResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsSSHServiceAccountsServiceAccountResponse {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CLIENT_HOSTNAME = "ClientHostname";
  @SerializedName(SERIALIZED_NAME_CLIENT_HOSTNAME)
  private String clientHostname;

  public static final String SERIALIZED_NAME_SERVER_GROUP = "ServerGroup";
  @SerializedName(SERIALIZED_NAME_SERVER_GROUP)
  private ModelsSSHServerGroupsServerGroupResponse serverGroup;

  public static final String SERIALIZED_NAME_USER = "User";
  @SerializedName(SERIALIZED_NAME_USER)
  private ModelsSSHUsersSshUserResponse user;

  public ModelsSSHServiceAccountsServiceAccountResponse() {
  }

  public ModelsSSHServiceAccountsServiceAccountResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ModelsSSHServiceAccountsServiceAccountResponse clientHostname(String clientHostname) {
    
    this.clientHostname = clientHostname;
    return this;
  }

   /**
   * Get clientHostname
   * @return clientHostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientHostname() {
    return clientHostname;
  }


  public void setClientHostname(String clientHostname) {
    this.clientHostname = clientHostname;
  }


  public ModelsSSHServiceAccountsServiceAccountResponse serverGroup(ModelsSSHServerGroupsServerGroupResponse serverGroup) {
    
    this.serverGroup = serverGroup;
    return this;
  }

   /**
   * Get serverGroup
   * @return serverGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelsSSHServerGroupsServerGroupResponse getServerGroup() {
    return serverGroup;
  }


  public void setServerGroup(ModelsSSHServerGroupsServerGroupResponse serverGroup) {
    this.serverGroup = serverGroup;
  }


  public ModelsSSHServiceAccountsServiceAccountResponse user(ModelsSSHUsersSshUserResponse user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelsSSHUsersSshUserResponse getUser() {
    return user;
  }


  public void setUser(ModelsSSHUsersSshUserResponse user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSHServiceAccountsServiceAccountResponse modelsSSHServiceAccountsServiceAccountResponse = (ModelsSSHServiceAccountsServiceAccountResponse) o;
    return Objects.equals(this.id, modelsSSHServiceAccountsServiceAccountResponse.id) &&
        Objects.equals(this.clientHostname, modelsSSHServiceAccountsServiceAccountResponse.clientHostname) &&
        Objects.equals(this.serverGroup, modelsSSHServiceAccountsServiceAccountResponse.serverGroup) &&
        Objects.equals(this.user, modelsSSHServiceAccountsServiceAccountResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientHostname, serverGroup, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSHServiceAccountsServiceAccountResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientHostname: ").append(toIndentedString(clientHostname)).append("\n");
    sb.append("    serverGroup: ").append(toIndentedString(serverGroup)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("ClientHostname");
    openapiFields.add("ServerGroup");
    openapiFields.add("User");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSHServiceAccountsServiceAccountResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSHServiceAccountsServiceAccountResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSHServiceAccountsServiceAccountResponse is not found in the empty JSON string", ModelsSSHServiceAccountsServiceAccountResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSHServiceAccountsServiceAccountResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSHServiceAccountsServiceAccountResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ClientHostname") != null && !jsonObj.get("ClientHostname").isJsonNull()) && !jsonObj.get("ClientHostname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ClientHostname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ClientHostname").toString()));
      }
      // validate the optional field `ServerGroup`
      if (jsonObj.get("ServerGroup") != null && !jsonObj.get("ServerGroup").isJsonNull()) {
        ModelsSSHServerGroupsServerGroupResponse.validateJsonObject(jsonObj.getAsJsonObject("ServerGroup"));
      }
      // validate the optional field `User`
      if (jsonObj.get("User") != null && !jsonObj.get("User").isJsonNull()) {
        ModelsSSHUsersSshUserResponse.validateJsonObject(jsonObj.getAsJsonObject("User"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSHServiceAccountsServiceAccountResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSHServiceAccountsServiceAccountResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSHServiceAccountsServiceAccountResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSHServiceAccountsServiceAccountResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSHServiceAccountsServiceAccountResponse>() {
           @Override
           public void write(JsonWriter out, ModelsSSHServiceAccountsServiceAccountResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSHServiceAccountsServiceAccountResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSHServiceAccountsServiceAccountResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSHServiceAccountsServiceAccountResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsSSHServiceAccountsServiceAccountResponse
  */
  public static ModelsSSHServiceAccountsServiceAccountResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSHServiceAccountsServiceAccountResponse.class);
  }

 /**
  * Convert an instance of ModelsSSHServiceAccountsServiceAccountResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

