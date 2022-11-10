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
 * ModelsCertificateRetrievalResponseExtendedKeyUsageModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsCertificateRetrievalResponseExtendedKeyUsageModel {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_OID = "Oid";
  @SerializedName(SERIALIZED_NAME_OID)
  private String oid;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public ModelsCertificateRetrievalResponseExtendedKeyUsageModel() {
  }

  public ModelsCertificateRetrievalResponseExtendedKeyUsageModel id(Integer id) {
    
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


  public ModelsCertificateRetrievalResponseExtendedKeyUsageModel oid(String oid) {
    
    this.oid = oid;
    return this;
  }

   /**
   * Get oid
   * @return oid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOid() {
    return oid;
  }


  public void setOid(String oid) {
    this.oid = oid;
  }


  public ModelsCertificateRetrievalResponseExtendedKeyUsageModel displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertificateRetrievalResponseExtendedKeyUsageModel modelsCertificateRetrievalResponseExtendedKeyUsageModel = (ModelsCertificateRetrievalResponseExtendedKeyUsageModel) o;
    return Objects.equals(this.id, modelsCertificateRetrievalResponseExtendedKeyUsageModel.id) &&
        Objects.equals(this.oid, modelsCertificateRetrievalResponseExtendedKeyUsageModel.oid) &&
        Objects.equals(this.displayName, modelsCertificateRetrievalResponseExtendedKeyUsageModel.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, oid, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCertificateRetrievalResponseExtendedKeyUsageModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
    openapiFields.add("Oid");
    openapiFields.add("DisplayName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertificateRetrievalResponseExtendedKeyUsageModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertificateRetrievalResponseExtendedKeyUsageModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertificateRetrievalResponseExtendedKeyUsageModel is not found in the empty JSON string", ModelsCertificateRetrievalResponseExtendedKeyUsageModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertificateRetrievalResponseExtendedKeyUsageModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertificateRetrievalResponseExtendedKeyUsageModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Oid") != null && !jsonObj.get("Oid").isJsonNull()) && !jsonObj.get("Oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Oid").toString()));
      }
      if ((jsonObj.get("DisplayName") != null && !jsonObj.get("DisplayName").isJsonNull()) && !jsonObj.get("DisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DisplayName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertificateRetrievalResponseExtendedKeyUsageModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertificateRetrievalResponseExtendedKeyUsageModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertificateRetrievalResponseExtendedKeyUsageModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertificateRetrievalResponseExtendedKeyUsageModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertificateRetrievalResponseExtendedKeyUsageModel>() {
           @Override
           public void write(JsonWriter out, ModelsCertificateRetrievalResponseExtendedKeyUsageModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertificateRetrievalResponseExtendedKeyUsageModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertificateRetrievalResponseExtendedKeyUsageModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertificateRetrievalResponseExtendedKeyUsageModel
  * @throws IOException if the JSON string is invalid with respect to ModelsCertificateRetrievalResponseExtendedKeyUsageModel
  */
  public static ModelsCertificateRetrievalResponseExtendedKeyUsageModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertificateRetrievalResponseExtendedKeyUsageModel.class);
  }

 /**
  * Convert an instance of ModelsCertificateRetrievalResponseExtendedKeyUsageModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

