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
import com.keyfactor.command.client.model.KeyfactorApiModelsEventHandlerEventHandlerParameterRequest;
import com.keyfactor.command.client.model.KeyfactorApiModelsEventHandlerRegisteredEventHandlerRequest;
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
 * KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "TemplateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_REGISTERED_EVENT_HANDLER = "RegisteredEventHandler";
  @SerializedName(SERIALIZED_NAME_REGISTERED_EVENT_HANDLER)
  private KeyfactorApiModelsEventHandlerRegisteredEventHandlerRequest registeredEventHandler;

  public static final String SERIALIZED_NAME_RECIPIENTS = "Recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<String> recipients = null;

  public static final String SERIALIZED_NAME_EVENT_HANDLER_PARAMETERS = "EventHandlerParameters";
  @SerializedName(SERIALIZED_NAME_EVENT_HANDLER_PARAMETERS)
  private List<KeyfactorApiModelsEventHandlerEventHandlerParameterRequest> eventHandlerParameters = null;

  public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest() {
  }

  public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest registeredEventHandler(KeyfactorApiModelsEventHandlerRegisteredEventHandlerRequest registeredEventHandler) {
    
    this.registeredEventHandler = registeredEventHandler;
    return this;
  }

   /**
   * Get registeredEventHandler
   * @return registeredEventHandler
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorApiModelsEventHandlerRegisteredEventHandlerRequest getRegisteredEventHandler() {
    return registeredEventHandler;
  }


  public void setRegisteredEventHandler(KeyfactorApiModelsEventHandlerRegisteredEventHandlerRequest registeredEventHandler) {
    this.registeredEventHandler = registeredEventHandler;
  }


  public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest recipients(List<String> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest addRecipientsItem(String recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRecipients() {
    return recipients;
  }


  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }


  public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest eventHandlerParameters(List<KeyfactorApiModelsEventHandlerEventHandlerParameterRequest> eventHandlerParameters) {
    
    this.eventHandlerParameters = eventHandlerParameters;
    return this;
  }

  public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest addEventHandlerParametersItem(KeyfactorApiModelsEventHandlerEventHandlerParameterRequest eventHandlerParametersItem) {
    if (this.eventHandlerParameters == null) {
      this.eventHandlerParameters = new ArrayList<>();
    }
    this.eventHandlerParameters.add(eventHandlerParametersItem);
    return this;
  }

   /**
   * Get eventHandlerParameters
   * @return eventHandlerParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeyfactorApiModelsEventHandlerEventHandlerParameterRequest> getEventHandlerParameters() {
    return eventHandlerParameters;
  }


  public void setEventHandlerParameters(List<KeyfactorApiModelsEventHandlerEventHandlerParameterRequest> eventHandlerParameters) {
    this.eventHandlerParameters = eventHandlerParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest keyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest = (KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest) o;
    return Objects.equals(this.displayName, keyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.displayName) &&
        Objects.equals(this.subject, keyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.subject) &&
        Objects.equals(this.message, keyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.message) &&
        Objects.equals(this.templateId, keyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.templateId) &&
        Objects.equals(this.registeredEventHandler, keyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.registeredEventHandler) &&
        Objects.equals(this.recipients, keyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.recipients) &&
        Objects.equals(this.eventHandlerParameters, keyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.eventHandlerParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, subject, message, templateId, registeredEventHandler, recipients, eventHandlerParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    registeredEventHandler: ").append(toIndentedString(registeredEventHandler)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    eventHandlerParameters: ").append(toIndentedString(eventHandlerParameters)).append("\n");
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
    openapiFields.add("DisplayName");
    openapiFields.add("Subject");
    openapiFields.add("Message");
    openapiFields.add("TemplateId");
    openapiFields.add("RegisteredEventHandler");
    openapiFields.add("Recipients");
    openapiFields.add("EventHandlerParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("DisplayName");
    openapiRequiredFields.add("Subject");
    openapiRequiredFields.add("Message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest is not found in the empty JSON string", KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("DisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DisplayName").toString()));
      }
      if (!jsonObj.get("Subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subject").toString()));
      }
      if (!jsonObj.get("Message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Message").toString()));
      }
      // validate the optional field `RegisteredEventHandler`
      if (jsonObj.get("RegisteredEventHandler") != null && !jsonObj.get("RegisteredEventHandler").isJsonNull()) {
        KeyfactorApiModelsEventHandlerRegisteredEventHandlerRequest.validateJsonObject(jsonObj.getAsJsonObject("RegisteredEventHandler"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Recipients") != null && !jsonObj.get("Recipients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Recipients` to be an array in the JSON string but got `%s`", jsonObj.get("Recipients").toString()));
      }
      if (jsonObj.get("EventHandlerParameters") != null && !jsonObj.get("EventHandlerParameters").isJsonNull()) {
        JsonArray jsonArrayeventHandlerParameters = jsonObj.getAsJsonArray("EventHandlerParameters");
        if (jsonArrayeventHandlerParameters != null) {
          // ensure the json data is an array
          if (!jsonObj.get("EventHandlerParameters").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `EventHandlerParameters` to be an array in the JSON string but got `%s`", jsonObj.get("EventHandlerParameters").toString()));
          }

          // validate the optional field `EventHandlerParameters` (array)
          for (int i = 0; i < jsonArrayeventHandlerParameters.size(); i++) {
            KeyfactorApiModelsEventHandlerEventHandlerParameterRequest.validateJsonObject(jsonArrayeventHandlerParameters.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest
  */
  public static KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsAlertsDeniedDeniedAlertCreationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

