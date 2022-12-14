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
import com.keyfactor.command.client.model.ModelsKeyfactorAPISecret;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CONTAINER_ID = "ContainerId";
  @SerializedName(SERIALIZED_NAME_CONTAINER_ID)
  private Integer containerId;

  public static final String SERIALIZED_NAME_CERT_STORE_TYPE = "CertStoreType";
  @SerializedName(SERIALIZED_NAME_CERT_STORE_TYPE)
  private Integer certStoreType;

  public static final String SERIALIZED_NAME_PROPERTIES = "Properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private String properties;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private ModelsKeyfactorAPISecret password;

  public KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest() {
  }

  public KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest containerId(Integer containerId) {
    
    this.containerId = containerId;
    return this;
  }

   /**
   * Get containerId
   * @return containerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getContainerId() {
    return containerId;
  }


  public void setContainerId(Integer containerId) {
    this.containerId = containerId;
  }


  public KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest certStoreType(Integer certStoreType) {
    
    this.certStoreType = certStoreType;
    return this;
  }

   /**
   * Get certStoreType
   * @return certStoreType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCertStoreType() {
    return certStoreType;
  }


  public void setCertStoreType(Integer certStoreType) {
    this.certStoreType = certStoreType;
  }


  public KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest properties(String properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProperties() {
    return properties;
  }


  public void setProperties(String properties) {
    this.properties = properties;
  }


  public KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest password(ModelsKeyfactorAPISecret password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelsKeyfactorAPISecret getPassword() {
    return password;
  }


  public void setPassword(ModelsKeyfactorAPISecret password) {
    this.password = password;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest keyfactorApiModelsCertificateStoresCertificateStoreApproveRequest = (KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest) o;
    return Objects.equals(this.id, keyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.id) &&
        Objects.equals(this.containerId, keyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.containerId) &&
        Objects.equals(this.certStoreType, keyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.certStoreType) &&
        Objects.equals(this.properties, keyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.properties) &&
        Objects.equals(this.password, keyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, containerId, certStoreType, properties, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    certStoreType: ").append(toIndentedString(certStoreType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("ContainerId");
    openapiFields.add("CertStoreType");
    openapiFields.add("Properties");
    openapiFields.add("Password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest is not found in the empty JSON string", KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if ((jsonObj.get("Properties") != null && !jsonObj.get("Properties").isJsonNull()) && !jsonObj.get("Properties").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Properties` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Properties").toString()));
      }
      // validate the optional field `Password`
      if (jsonObj.get("Password") != null && !jsonObj.get("Password").isJsonNull()) {
        ModelsKeyfactorAPISecret.validateJsonObject(jsonObj.getAsJsonObject("Password"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest
  */
  public static KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsCertificateStoresCertificateStoreApproveRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

