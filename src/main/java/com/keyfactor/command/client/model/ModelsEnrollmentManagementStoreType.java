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
 * ModelsEnrollmentManagementStoreType
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsEnrollmentManagementStoreType {
  public static final String SERIALIZED_NAME_STORE_TYPE_ID = "StoreTypeId";
  @SerializedName(SERIALIZED_NAME_STORE_TYPE_ID)
  private Integer storeTypeId;

  public static final String SERIALIZED_NAME_ALIAS = "Alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_OVERWRITE = "Overwrite";
  @SerializedName(SERIALIZED_NAME_OVERWRITE)
  private Boolean overwrite;

  public static final String SERIALIZED_NAME_PROPERTIES = "Properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<Object> properties = null;

  public ModelsEnrollmentManagementStoreType() {
  }

  public ModelsEnrollmentManagementStoreType storeTypeId(Integer storeTypeId) {
    
    this.storeTypeId = storeTypeId;
    return this;
  }

   /**
   * Get storeTypeId
   * @return storeTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoreTypeId() {
    return storeTypeId;
  }


  public void setStoreTypeId(Integer storeTypeId) {
    this.storeTypeId = storeTypeId;
  }


  public ModelsEnrollmentManagementStoreType alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public ModelsEnrollmentManagementStoreType overwrite(Boolean overwrite) {
    
    this.overwrite = overwrite;
    return this;
  }

   /**
   * Get overwrite
   * @return overwrite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOverwrite() {
    return overwrite;
  }


  public void setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
  }


  public ModelsEnrollmentManagementStoreType properties(List<Object> properties) {
    
    this.properties = properties;
    return this;
  }

  public ModelsEnrollmentManagementStoreType addPropertiesItem(Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getProperties() {
    return properties;
  }


  public void setProperties(List<Object> properties) {
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
    ModelsEnrollmentManagementStoreType modelsEnrollmentManagementStoreType = (ModelsEnrollmentManagementStoreType) o;
    return Objects.equals(this.storeTypeId, modelsEnrollmentManagementStoreType.storeTypeId) &&
        Objects.equals(this.alias, modelsEnrollmentManagementStoreType.alias) &&
        Objects.equals(this.overwrite, modelsEnrollmentManagementStoreType.overwrite) &&
        Objects.equals(this.properties, modelsEnrollmentManagementStoreType.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeTypeId, alias, overwrite, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsEnrollmentManagementStoreType {\n");
    sb.append("    storeTypeId: ").append(toIndentedString(storeTypeId)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
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
    openapiFields.add("StoreTypeId");
    openapiFields.add("Alias");
    openapiFields.add("Overwrite");
    openapiFields.add("Properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsEnrollmentManagementStoreType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsEnrollmentManagementStoreType.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsEnrollmentManagementStoreType is not found in the empty JSON string", ModelsEnrollmentManagementStoreType.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsEnrollmentManagementStoreType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsEnrollmentManagementStoreType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Alias") != null && !jsonObj.get("Alias").isJsonNull()) && !jsonObj.get("Alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Alias").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Properties") != null && !jsonObj.get("Properties").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Properties` to be an array in the JSON string but got `%s`", jsonObj.get("Properties").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsEnrollmentManagementStoreType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsEnrollmentManagementStoreType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsEnrollmentManagementStoreType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsEnrollmentManagementStoreType.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsEnrollmentManagementStoreType>() {
           @Override
           public void write(JsonWriter out, ModelsEnrollmentManagementStoreType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsEnrollmentManagementStoreType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsEnrollmentManagementStoreType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsEnrollmentManagementStoreType
  * @throws IOException if the JSON string is invalid with respect to ModelsEnrollmentManagementStoreType
  */
  public static ModelsEnrollmentManagementStoreType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsEnrollmentManagementStoreType.class);
  }

 /**
  * Convert an instance of ModelsEnrollmentManagementStoreType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

