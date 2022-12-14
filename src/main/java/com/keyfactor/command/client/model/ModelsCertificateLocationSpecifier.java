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
import java.util.HashMap;
import java.util.Map;
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
 * ModelsCertificateLocationSpecifier
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsCertificateLocationSpecifier {
  public static final String SERIALIZED_NAME_ALIAS = "Alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_CERTIFICATE_STORE_ID = "CertificateStoreId";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_STORE_ID)
  private UUID certificateStoreId;

  public static final String SERIALIZED_NAME_JOB_FIELDS = "JobFields";
  @SerializedName(SERIALIZED_NAME_JOB_FIELDS)
  private Map<String, Object> jobFields = null;

  public ModelsCertificateLocationSpecifier() {
  }

  public ModelsCertificateLocationSpecifier alias(String alias) {
    
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


  public ModelsCertificateLocationSpecifier certificateStoreId(UUID certificateStoreId) {
    
    this.certificateStoreId = certificateStoreId;
    return this;
  }

   /**
   * Get certificateStoreId
   * @return certificateStoreId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getCertificateStoreId() {
    return certificateStoreId;
  }


  public void setCertificateStoreId(UUID certificateStoreId) {
    this.certificateStoreId = certificateStoreId;
  }


  public ModelsCertificateLocationSpecifier jobFields(Map<String, Object> jobFields) {
    
    this.jobFields = jobFields;
    return this;
  }

  public ModelsCertificateLocationSpecifier putJobFieldsItem(String key, Object jobFieldsItem) {
    if (this.jobFields == null) {
      this.jobFields = new HashMap<>();
    }
    this.jobFields.put(key, jobFieldsItem);
    return this;
  }

   /**
   * Get jobFields
   * @return jobFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getJobFields() {
    return jobFields;
  }


  public void setJobFields(Map<String, Object> jobFields) {
    this.jobFields = jobFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertificateLocationSpecifier modelsCertificateLocationSpecifier = (ModelsCertificateLocationSpecifier) o;
    return Objects.equals(this.alias, modelsCertificateLocationSpecifier.alias) &&
        Objects.equals(this.certificateStoreId, modelsCertificateLocationSpecifier.certificateStoreId) &&
        Objects.equals(this.jobFields, modelsCertificateLocationSpecifier.jobFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, certificateStoreId, jobFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCertificateLocationSpecifier {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    certificateStoreId: ").append(toIndentedString(certificateStoreId)).append("\n");
    sb.append("    jobFields: ").append(toIndentedString(jobFields)).append("\n");
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
    openapiFields.add("Alias");
    openapiFields.add("CertificateStoreId");
    openapiFields.add("JobFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertificateLocationSpecifier
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertificateLocationSpecifier.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertificateLocationSpecifier is not found in the empty JSON string", ModelsCertificateLocationSpecifier.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertificateLocationSpecifier.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertificateLocationSpecifier` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Alias") != null && !jsonObj.get("Alias").isJsonNull()) && !jsonObj.get("Alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Alias").toString()));
      }
      if ((jsonObj.get("CertificateStoreId") != null && !jsonObj.get("CertificateStoreId").isJsonNull()) && !jsonObj.get("CertificateStoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CertificateStoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CertificateStoreId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertificateLocationSpecifier.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertificateLocationSpecifier' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertificateLocationSpecifier> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertificateLocationSpecifier.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertificateLocationSpecifier>() {
           @Override
           public void write(JsonWriter out, ModelsCertificateLocationSpecifier value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertificateLocationSpecifier read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertificateLocationSpecifier given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertificateLocationSpecifier
  * @throws IOException if the JSON string is invalid with respect to ModelsCertificateLocationSpecifier
  */
  public static ModelsCertificateLocationSpecifier fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertificateLocationSpecifier.class);
  }

 /**
  * Convert an instance of ModelsCertificateLocationSpecifier to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

