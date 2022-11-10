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
import com.keyfactor.command.client.model.ModelsSSHKeysKeyUpdateRequest;
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
 * ModelsSSHServiceAccountsServiceAccountUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsSSHServiceAccountsServiceAccountUpdateRequest {
  public static final String SERIALIZED_NAME_KEY_UPDATE_REQUEST = "KeyUpdateRequest";
  @SerializedName(SERIALIZED_NAME_KEY_UPDATE_REQUEST)
  private ModelsSSHKeysKeyUpdateRequest keyUpdateRequest;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public ModelsSSHServiceAccountsServiceAccountUpdateRequest() {
  }

  public ModelsSSHServiceAccountsServiceAccountUpdateRequest keyUpdateRequest(ModelsSSHKeysKeyUpdateRequest keyUpdateRequest) {
    
    this.keyUpdateRequest = keyUpdateRequest;
    return this;
  }

   /**
   * Get keyUpdateRequest
   * @return keyUpdateRequest
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ModelsSSHKeysKeyUpdateRequest getKeyUpdateRequest() {
    return keyUpdateRequest;
  }


  public void setKeyUpdateRequest(ModelsSSHKeysKeyUpdateRequest keyUpdateRequest) {
    this.keyUpdateRequest = keyUpdateRequest;
  }


  public ModelsSSHServiceAccountsServiceAccountUpdateRequest id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSHServiceAccountsServiceAccountUpdateRequest modelsSSHServiceAccountsServiceAccountUpdateRequest = (ModelsSSHServiceAccountsServiceAccountUpdateRequest) o;
    return Objects.equals(this.keyUpdateRequest, modelsSSHServiceAccountsServiceAccountUpdateRequest.keyUpdateRequest) &&
        Objects.equals(this.id, modelsSSHServiceAccountsServiceAccountUpdateRequest.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyUpdateRequest, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSHServiceAccountsServiceAccountUpdateRequest {\n");
    sb.append("    keyUpdateRequest: ").append(toIndentedString(keyUpdateRequest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("KeyUpdateRequest");
    openapiFields.add("Id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("KeyUpdateRequest");
    openapiRequiredFields.add("Id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSHServiceAccountsServiceAccountUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSHServiceAccountsServiceAccountUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSHServiceAccountsServiceAccountUpdateRequest is not found in the empty JSON string", ModelsSSHServiceAccountsServiceAccountUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSHServiceAccountsServiceAccountUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSHServiceAccountsServiceAccountUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsSSHServiceAccountsServiceAccountUpdateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `KeyUpdateRequest`
      ModelsSSHKeysKeyUpdateRequest.validateJsonObject(jsonObj.getAsJsonObject("KeyUpdateRequest"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSHServiceAccountsServiceAccountUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSHServiceAccountsServiceAccountUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSHServiceAccountsServiceAccountUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSHServiceAccountsServiceAccountUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSHServiceAccountsServiceAccountUpdateRequest>() {
           @Override
           public void write(JsonWriter out, ModelsSSHServiceAccountsServiceAccountUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSHServiceAccountsServiceAccountUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSHServiceAccountsServiceAccountUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSHServiceAccountsServiceAccountUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsSSHServiceAccountsServiceAccountUpdateRequest
  */
  public static ModelsSSHServiceAccountsServiceAccountUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSHServiceAccountsServiceAccountUpdateRequest.class);
  }

 /**
  * Convert an instance of ModelsSSHServiceAccountsServiceAccountUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

