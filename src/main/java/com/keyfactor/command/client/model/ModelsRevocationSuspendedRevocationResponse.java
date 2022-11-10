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
 * ModelsRevocationSuspendedRevocationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsRevocationSuspendedRevocationResponse {
  public static final String SERIALIZED_NAME_CERT_ID = "CertId";
  @SerializedName(SERIALIZED_NAME_CERT_ID)
  private Integer certId;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "WorkflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private UUID workflowId;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public ModelsRevocationSuspendedRevocationResponse() {
  }

  public ModelsRevocationSuspendedRevocationResponse certId(Integer certId) {
    
    this.certId = certId;
    return this;
  }

   /**
   * Get certId
   * @return certId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCertId() {
    return certId;
  }


  public void setCertId(Integer certId) {
    this.certId = certId;
  }


  public ModelsRevocationSuspendedRevocationResponse workflowId(UUID workflowId) {
    
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Get workflowId
   * @return workflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getWorkflowId() {
    return workflowId;
  }


  public void setWorkflowId(UUID workflowId) {
    this.workflowId = workflowId;
  }


  public ModelsRevocationSuspendedRevocationResponse message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsRevocationSuspendedRevocationResponse modelsRevocationSuspendedRevocationResponse = (ModelsRevocationSuspendedRevocationResponse) o;
    return Objects.equals(this.certId, modelsRevocationSuspendedRevocationResponse.certId) &&
        Objects.equals(this.workflowId, modelsRevocationSuspendedRevocationResponse.workflowId) &&
        Objects.equals(this.message, modelsRevocationSuspendedRevocationResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certId, workflowId, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsRevocationSuspendedRevocationResponse {\n");
    sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("CertId");
    openapiFields.add("WorkflowId");
    openapiFields.add("Message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsRevocationSuspendedRevocationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsRevocationSuspendedRevocationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsRevocationSuspendedRevocationResponse is not found in the empty JSON string", ModelsRevocationSuspendedRevocationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsRevocationSuspendedRevocationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsRevocationSuspendedRevocationResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("WorkflowId") != null && !jsonObj.get("WorkflowId").isJsonNull()) && !jsonObj.get("WorkflowId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkflowId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkflowId").toString()));
      }
      if ((jsonObj.get("Message") != null && !jsonObj.get("Message").isJsonNull()) && !jsonObj.get("Message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsRevocationSuspendedRevocationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsRevocationSuspendedRevocationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsRevocationSuspendedRevocationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsRevocationSuspendedRevocationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsRevocationSuspendedRevocationResponse>() {
           @Override
           public void write(JsonWriter out, ModelsRevocationSuspendedRevocationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsRevocationSuspendedRevocationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsRevocationSuspendedRevocationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsRevocationSuspendedRevocationResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsRevocationSuspendedRevocationResponse
  */
  public static ModelsRevocationSuspendedRevocationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsRevocationSuspendedRevocationResponse.class);
  }

 /**
  * Convert an instance of ModelsRevocationSuspendedRevocationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

