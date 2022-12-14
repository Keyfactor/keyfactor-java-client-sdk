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
 * ModelsMetadataSingleUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsMetadataSingleUpdateRequest {
  public static final String SERIALIZED_NAME_METADATA_NAME = "MetadataName";
  @SerializedName(SERIALIZED_NAME_METADATA_NAME)
  private String metadataName;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_OVERWRITE_EXISTING = "OverwriteExisting";
  @SerializedName(SERIALIZED_NAME_OVERWRITE_EXISTING)
  private Boolean overwriteExisting;

  public ModelsMetadataSingleUpdateRequest() {
  }

  public ModelsMetadataSingleUpdateRequest metadataName(String metadataName) {
    
    this.metadataName = metadataName;
    return this;
  }

   /**
   * Get metadataName
   * @return metadataName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMetadataName() {
    return metadataName;
  }


  public void setMetadataName(String metadataName) {
    this.metadataName = metadataName;
  }


  public ModelsMetadataSingleUpdateRequest value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ModelsMetadataSingleUpdateRequest overwriteExisting(Boolean overwriteExisting) {
    
    this.overwriteExisting = overwriteExisting;
    return this;
  }

   /**
   * Get overwriteExisting
   * @return overwriteExisting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOverwriteExisting() {
    return overwriteExisting;
  }


  public void setOverwriteExisting(Boolean overwriteExisting) {
    this.overwriteExisting = overwriteExisting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsMetadataSingleUpdateRequest modelsMetadataSingleUpdateRequest = (ModelsMetadataSingleUpdateRequest) o;
    return Objects.equals(this.metadataName, modelsMetadataSingleUpdateRequest.metadataName) &&
        Objects.equals(this.value, modelsMetadataSingleUpdateRequest.value) &&
        Objects.equals(this.overwriteExisting, modelsMetadataSingleUpdateRequest.overwriteExisting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadataName, value, overwriteExisting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsMetadataSingleUpdateRequest {\n");
    sb.append("    metadataName: ").append(toIndentedString(metadataName)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    overwriteExisting: ").append(toIndentedString(overwriteExisting)).append("\n");
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
    openapiFields.add("MetadataName");
    openapiFields.add("Value");
    openapiFields.add("OverwriteExisting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsMetadataSingleUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsMetadataSingleUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsMetadataSingleUpdateRequest is not found in the empty JSON string", ModelsMetadataSingleUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsMetadataSingleUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsMetadataSingleUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("MetadataName") != null && !jsonObj.get("MetadataName").isJsonNull()) && !jsonObj.get("MetadataName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MetadataName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MetadataName").toString()));
      }
      if ((jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonNull()) && !jsonObj.get("Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsMetadataSingleUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsMetadataSingleUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsMetadataSingleUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsMetadataSingleUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsMetadataSingleUpdateRequest>() {
           @Override
           public void write(JsonWriter out, ModelsMetadataSingleUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsMetadataSingleUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsMetadataSingleUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsMetadataSingleUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsMetadataSingleUpdateRequest
  */
  public static ModelsMetadataSingleUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsMetadataSingleUpdateRequest.class);
  }

 /**
  * Convert an instance of ModelsMetadataSingleUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

