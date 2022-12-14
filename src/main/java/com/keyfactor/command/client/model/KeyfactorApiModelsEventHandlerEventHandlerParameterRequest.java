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
 * KeyfactorApiModelsEventHandlerEventHandlerParameterRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsEventHandlerEventHandlerParameterRequest {
  public static final String SERIALIZED_NAME_KEY = "Key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "DefaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_PARAMETER_TYPE = "ParameterType";
  @SerializedName(SERIALIZED_NAME_PARAMETER_TYPE)
  private String parameterType;

  public KeyfactorApiModelsEventHandlerEventHandlerParameterRequest() {
  }

  public KeyfactorApiModelsEventHandlerEventHandlerParameterRequest key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public KeyfactorApiModelsEventHandlerEventHandlerParameterRequest defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public KeyfactorApiModelsEventHandlerEventHandlerParameterRequest parameterType(String parameterType) {
    
    this.parameterType = parameterType;
    return this;
  }

   /**
   * Get parameterType
   * @return parameterType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getParameterType() {
    return parameterType;
  }


  public void setParameterType(String parameterType) {
    this.parameterType = parameterType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsEventHandlerEventHandlerParameterRequest keyfactorApiModelsEventHandlerEventHandlerParameterRequest = (KeyfactorApiModelsEventHandlerEventHandlerParameterRequest) o;
    return Objects.equals(this.key, keyfactorApiModelsEventHandlerEventHandlerParameterRequest.key) &&
        Objects.equals(this.defaultValue, keyfactorApiModelsEventHandlerEventHandlerParameterRequest.defaultValue) &&
        Objects.equals(this.parameterType, keyfactorApiModelsEventHandlerEventHandlerParameterRequest.parameterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, defaultValue, parameterType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsEventHandlerEventHandlerParameterRequest {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    parameterType: ").append(toIndentedString(parameterType)).append("\n");
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
    openapiFields.add("Key");
    openapiFields.add("DefaultValue");
    openapiFields.add("ParameterType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Key");
    openapiRequiredFields.add("DefaultValue");
    openapiRequiredFields.add("ParameterType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsEventHandlerEventHandlerParameterRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsEventHandlerEventHandlerParameterRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsEventHandlerEventHandlerParameterRequest is not found in the empty JSON string", KeyfactorApiModelsEventHandlerEventHandlerParameterRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsEventHandlerEventHandlerParameterRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsEventHandlerEventHandlerParameterRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeyfactorApiModelsEventHandlerEventHandlerParameterRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("Key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Key").toString()));
      }
      if (!jsonObj.get("DefaultValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DefaultValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DefaultValue").toString()));
      }
      if (!jsonObj.get("ParameterType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ParameterType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ParameterType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsEventHandlerEventHandlerParameterRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsEventHandlerEventHandlerParameterRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsEventHandlerEventHandlerParameterRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsEventHandlerEventHandlerParameterRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsEventHandlerEventHandlerParameterRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsEventHandlerEventHandlerParameterRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsEventHandlerEventHandlerParameterRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsEventHandlerEventHandlerParameterRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsEventHandlerEventHandlerParameterRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsEventHandlerEventHandlerParameterRequest
  */
  public static KeyfactorApiModelsEventHandlerEventHandlerParameterRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsEventHandlerEventHandlerParameterRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsEventHandlerEventHandlerParameterRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

