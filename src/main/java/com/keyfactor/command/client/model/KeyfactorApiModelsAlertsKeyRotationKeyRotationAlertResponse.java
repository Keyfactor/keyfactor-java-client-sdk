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
 * KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse {
  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_RECIPIENT = "Recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse() {
  }

  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse message(String message) {
    
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


  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * Get recipient
   * @return recipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse keyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse = (KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse) o;
    return Objects.equals(this.subject, keyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.subject) &&
        Objects.equals(this.message, keyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.message) &&
        Objects.equals(this.recipient, keyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.recipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, message, recipient);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse {\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
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
    openapiFields.add("Message");
    openapiFields.add("Recipient");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse is not found in the empty JSON string", KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Subject") != null && !jsonObj.get("Subject").isJsonNull()) && !jsonObj.get("Subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subject").toString()));
      }
      if ((jsonObj.get("Message") != null && !jsonObj.get("Message").isJsonNull()) && !jsonObj.get("Message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Message").toString()));
      }
      if ((jsonObj.get("Recipient") != null && !jsonObj.get("Recipient").isJsonNull()) && !jsonObj.get("Recipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Recipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Recipient").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse
  */
  public static KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

