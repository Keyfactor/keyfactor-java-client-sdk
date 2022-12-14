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
import java.util.List;
import java.util.Map;

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
 * ModelsEnrollmentCSRGenerationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsEnrollmentCSRGenerationRequest {
  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_KEY_TYPE = "KeyType";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private String keyType;

  public static final String SERIALIZED_NAME_KEY_LENGTH = "KeyLength";
  @SerializedName(SERIALIZED_NAME_KEY_LENGTH)
  private Integer keyLength;

  public static final String SERIALIZED_NAME_TEMPLATE = "Template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_SA_NS = "SANs";
  @SerializedName(SERIALIZED_NAME_SA_NS)
  private Map<String, List<String>> saNs = null;

  public ModelsEnrollmentCSRGenerationRequest() {
  }

  public ModelsEnrollmentCSRGenerationRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject for the requested certificate
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Subject for the requested certificate")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public ModelsEnrollmentCSRGenerationRequest keyType(String keyType) {
    
    this.keyType = keyType;
    return this;
  }

   /**
   * Certificate key type [RSA, ECC]
   * @return keyType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Certificate key type [RSA, ECC]")

  public String getKeyType() {
    return keyType;
  }


  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }


  public ModelsEnrollmentCSRGenerationRequest keyLength(Integer keyLength) {
    
    this.keyLength = keyLength;
    return this;
  }

   /**
   * Size of the certificate key (ex: RSA 1024, 2048, 4096/ECC 256, 384, 521)
   * @return keyLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Size of the certificate key (ex: RSA 1024, 2048, 4096/ECC 256, 384, 521)")

  public Integer getKeyLength() {
    return keyLength;
  }


  public void setKeyLength(Integer keyLength) {
    this.keyLength = keyLength;
  }


  public ModelsEnrollmentCSRGenerationRequest template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public ModelsEnrollmentCSRGenerationRequest saNs(Map<String, List<String>> saNs) {
    
    this.saNs = saNs;
    return this;
  }

  public ModelsEnrollmentCSRGenerationRequest putSaNsItem(String key, List<String> saNsItem) {
    if (this.saNs == null) {
      this.saNs = new HashMap<>();
    }
    this.saNs.put(key, saNsItem);
    return this;
  }

   /**
   * Get saNs
   * @return saNs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getSaNs() {
    return saNs;
  }


  public void setSaNs(Map<String, List<String>> saNs) {
    this.saNs = saNs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsEnrollmentCSRGenerationRequest modelsEnrollmentCSRGenerationRequest = (ModelsEnrollmentCSRGenerationRequest) o;
    return Objects.equals(this.subject, modelsEnrollmentCSRGenerationRequest.subject) &&
        Objects.equals(this.keyType, modelsEnrollmentCSRGenerationRequest.keyType) &&
        Objects.equals(this.keyLength, modelsEnrollmentCSRGenerationRequest.keyLength) &&
        Objects.equals(this.template, modelsEnrollmentCSRGenerationRequest.template) &&
        Objects.equals(this.saNs, modelsEnrollmentCSRGenerationRequest.saNs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, keyType, keyLength, template, saNs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsEnrollmentCSRGenerationRequest {\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    keyLength: ").append(toIndentedString(keyLength)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    saNs: ").append(toIndentedString(saNs)).append("\n");
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
    openapiFields.add("Subject");
    openapiFields.add("KeyType");
    openapiFields.add("KeyLength");
    openapiFields.add("Template");
    openapiFields.add("SANs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Subject");
    openapiRequiredFields.add("KeyType");
    openapiRequiredFields.add("KeyLength");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsEnrollmentCSRGenerationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsEnrollmentCSRGenerationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsEnrollmentCSRGenerationRequest is not found in the empty JSON string", ModelsEnrollmentCSRGenerationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsEnrollmentCSRGenerationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsEnrollmentCSRGenerationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsEnrollmentCSRGenerationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("Subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subject").toString()));
      }
      if (!jsonObj.get("KeyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeyType").toString()));
      }
      if ((jsonObj.get("Template") != null && !jsonObj.get("Template").isJsonNull()) && !jsonObj.get("Template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsEnrollmentCSRGenerationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsEnrollmentCSRGenerationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsEnrollmentCSRGenerationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsEnrollmentCSRGenerationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsEnrollmentCSRGenerationRequest>() {
           @Override
           public void write(JsonWriter out, ModelsEnrollmentCSRGenerationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsEnrollmentCSRGenerationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsEnrollmentCSRGenerationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsEnrollmentCSRGenerationRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsEnrollmentCSRGenerationRequest
  */
  public static ModelsEnrollmentCSRGenerationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsEnrollmentCSRGenerationRequest.class);
  }

 /**
  * Convert an instance of ModelsEnrollmentCSRGenerationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

