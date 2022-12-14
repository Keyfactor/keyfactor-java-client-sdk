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
 * ModelsWorkflowProcessedCertificateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsWorkflowProcessedCertificateRequest {
  public static final String SERIALIZED_NAME_CA_ROW_ID = "CARowId";
  @SerializedName(SERIALIZED_NAME_CA_ROW_ID)
  private Integer caRowId;

  public static final String SERIALIZED_NAME_CA_REQUEST_ID = "CARequestId";
  @SerializedName(SERIALIZED_NAME_CA_REQUEST_ID)
  private String caRequestId;

  public static final String SERIALIZED_NAME_CA_HOST = "CAHost";
  @SerializedName(SERIALIZED_NAME_CA_HOST)
  private String caHost;

  public static final String SERIALIZED_NAME_CA_LOGICAL_NAME = "CALogicalName";
  @SerializedName(SERIALIZED_NAME_CA_LOGICAL_NAME)
  private String caLogicalName;

  public static final String SERIALIZED_NAME_KEYFACTOR_REQUEST_ID = "KeyfactorRequestId";
  @SerializedName(SERIALIZED_NAME_KEYFACTOR_REQUEST_ID)
  private Integer keyfactorRequestId;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public ModelsWorkflowProcessedCertificateRequest() {
  }

  
  public ModelsWorkflowProcessedCertificateRequest(
     Integer caRowId
  ) {
    this();
    this.caRowId = caRowId;
  }

   /**
   * Get caRowId
   * @return caRowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCaRowId() {
    return caRowId;
  }




  public ModelsWorkflowProcessedCertificateRequest caRequestId(String caRequestId) {
    
    this.caRequestId = caRequestId;
    return this;
  }

   /**
   * Get caRequestId
   * @return caRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCaRequestId() {
    return caRequestId;
  }


  public void setCaRequestId(String caRequestId) {
    this.caRequestId = caRequestId;
  }


  public ModelsWorkflowProcessedCertificateRequest caHost(String caHost) {
    
    this.caHost = caHost;
    return this;
  }

   /**
   * Get caHost
   * @return caHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCaHost() {
    return caHost;
  }


  public void setCaHost(String caHost) {
    this.caHost = caHost;
  }


  public ModelsWorkflowProcessedCertificateRequest caLogicalName(String caLogicalName) {
    
    this.caLogicalName = caLogicalName;
    return this;
  }

   /**
   * Get caLogicalName
   * @return caLogicalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCaLogicalName() {
    return caLogicalName;
  }


  public void setCaLogicalName(String caLogicalName) {
    this.caLogicalName = caLogicalName;
  }


  public ModelsWorkflowProcessedCertificateRequest keyfactorRequestId(Integer keyfactorRequestId) {
    
    this.keyfactorRequestId = keyfactorRequestId;
    return this;
  }

   /**
   * Get keyfactorRequestId
   * @return keyfactorRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getKeyfactorRequestId() {
    return keyfactorRequestId;
  }


  public void setKeyfactorRequestId(Integer keyfactorRequestId) {
    this.keyfactorRequestId = keyfactorRequestId;
  }


  public ModelsWorkflowProcessedCertificateRequest comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsWorkflowProcessedCertificateRequest modelsWorkflowProcessedCertificateRequest = (ModelsWorkflowProcessedCertificateRequest) o;
    return Objects.equals(this.caRowId, modelsWorkflowProcessedCertificateRequest.caRowId) &&
        Objects.equals(this.caRequestId, modelsWorkflowProcessedCertificateRequest.caRequestId) &&
        Objects.equals(this.caHost, modelsWorkflowProcessedCertificateRequest.caHost) &&
        Objects.equals(this.caLogicalName, modelsWorkflowProcessedCertificateRequest.caLogicalName) &&
        Objects.equals(this.keyfactorRequestId, modelsWorkflowProcessedCertificateRequest.keyfactorRequestId) &&
        Objects.equals(this.comment, modelsWorkflowProcessedCertificateRequest.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caRowId, caRequestId, caHost, caLogicalName, keyfactorRequestId, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsWorkflowProcessedCertificateRequest {\n");
    sb.append("    caRowId: ").append(toIndentedString(caRowId)).append("\n");
    sb.append("    caRequestId: ").append(toIndentedString(caRequestId)).append("\n");
    sb.append("    caHost: ").append(toIndentedString(caHost)).append("\n");
    sb.append("    caLogicalName: ").append(toIndentedString(caLogicalName)).append("\n");
    sb.append("    keyfactorRequestId: ").append(toIndentedString(keyfactorRequestId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
    openapiFields.add("CARowId");
    openapiFields.add("CARequestId");
    openapiFields.add("CAHost");
    openapiFields.add("CALogicalName");
    openapiFields.add("KeyfactorRequestId");
    openapiFields.add("Comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsWorkflowProcessedCertificateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsWorkflowProcessedCertificateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsWorkflowProcessedCertificateRequest is not found in the empty JSON string", ModelsWorkflowProcessedCertificateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsWorkflowProcessedCertificateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsWorkflowProcessedCertificateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("CARequestId") != null && !jsonObj.get("CARequestId").isJsonNull()) && !jsonObj.get("CARequestId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CARequestId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CARequestId").toString()));
      }
      if ((jsonObj.get("CAHost") != null && !jsonObj.get("CAHost").isJsonNull()) && !jsonObj.get("CAHost").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CAHost` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CAHost").toString()));
      }
      if ((jsonObj.get("CALogicalName") != null && !jsonObj.get("CALogicalName").isJsonNull()) && !jsonObj.get("CALogicalName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CALogicalName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CALogicalName").toString()));
      }
      if ((jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull()) && !jsonObj.get("Comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsWorkflowProcessedCertificateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsWorkflowProcessedCertificateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsWorkflowProcessedCertificateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsWorkflowProcessedCertificateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsWorkflowProcessedCertificateRequest>() {
           @Override
           public void write(JsonWriter out, ModelsWorkflowProcessedCertificateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsWorkflowProcessedCertificateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsWorkflowProcessedCertificateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsWorkflowProcessedCertificateRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsWorkflowProcessedCertificateRequest
  */
  public static ModelsWorkflowProcessedCertificateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsWorkflowProcessedCertificateRequest.class);
  }

 /**
  * Convert an instance of ModelsWorkflowProcessedCertificateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

