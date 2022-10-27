/*
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
import com.keyfactor.command.client.model.KeyfactorApiModelsAlertsAlertCertificateQueryAlertCertificateQueryResponse;
import com.keyfactor.command.client.model.KeyfactorApiModelsEventHandlerEventHandlerParameterResponse;
import com.keyfactor.command.client.model.KeyfactorApiModelsEventHandlerRegisteredEventHandlerResponse;
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
 * KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_EXPIRATION_WARNING_DAYS = "ExpirationWarningDays";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_WARNING_DAYS)
  private Integer expirationWarningDays;

  public static final String SERIALIZED_NAME_RECIPIENTS = "Recipients";
  @SerializedName(SERIALIZED_NAME_RECIPIENTS)
  private List<String> recipients = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_QUERY = "CertificateQuery";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_QUERY)
  private KeyfactorApiModelsAlertsAlertCertificateQueryAlertCertificateQueryResponse certificateQuery;

  public static final String SERIALIZED_NAME_REGISTERED_EVENT_HANDLER = "RegisteredEventHandler";
  @SerializedName(SERIALIZED_NAME_REGISTERED_EVENT_HANDLER)
  private KeyfactorApiModelsEventHandlerRegisteredEventHandlerResponse registeredEventHandler;

  public static final String SERIALIZED_NAME_EVENT_HANDLER_PARAMETERS = "EventHandlerParameters";
  @SerializedName(SERIALIZED_NAME_EVENT_HANDLER_PARAMETERS)
  private List<KeyfactorApiModelsEventHandlerEventHandlerParameterResponse> eventHandlerParameters = null;

  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse() {
  }

  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse id(Integer id) {
    
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


  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse displayName(String displayName) {
    
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


  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse subject(String subject) {
    
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


  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse message(String message) {
    
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


  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse expirationWarningDays(Integer expirationWarningDays) {
    
    this.expirationWarningDays = expirationWarningDays;
    return this;
  }

   /**
   * Get expirationWarningDays
   * @return expirationWarningDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getExpirationWarningDays() {
    return expirationWarningDays;
  }


  public void setExpirationWarningDays(Integer expirationWarningDays) {
    this.expirationWarningDays = expirationWarningDays;
  }


  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse recipients(List<String> recipients) {
    
    this.recipients = recipients;
    return this;
  }

  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse addRecipientsItem(String recipientsItem) {
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


  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse certificateQuery(KeyfactorApiModelsAlertsAlertCertificateQueryAlertCertificateQueryResponse certificateQuery) {
    
    this.certificateQuery = certificateQuery;
    return this;
  }

   /**
   * Get certificateQuery
   * @return certificateQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorApiModelsAlertsAlertCertificateQueryAlertCertificateQueryResponse getCertificateQuery() {
    return certificateQuery;
  }


  public void setCertificateQuery(KeyfactorApiModelsAlertsAlertCertificateQueryAlertCertificateQueryResponse certificateQuery) {
    this.certificateQuery = certificateQuery;
  }


  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse registeredEventHandler(KeyfactorApiModelsEventHandlerRegisteredEventHandlerResponse registeredEventHandler) {
    
    this.registeredEventHandler = registeredEventHandler;
    return this;
  }

   /**
   * Get registeredEventHandler
   * @return registeredEventHandler
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorApiModelsEventHandlerRegisteredEventHandlerResponse getRegisteredEventHandler() {
    return registeredEventHandler;
  }


  public void setRegisteredEventHandler(KeyfactorApiModelsEventHandlerRegisteredEventHandlerResponse registeredEventHandler) {
    this.registeredEventHandler = registeredEventHandler;
  }


  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse eventHandlerParameters(List<KeyfactorApiModelsEventHandlerEventHandlerParameterResponse> eventHandlerParameters) {
    
    this.eventHandlerParameters = eventHandlerParameters;
    return this;
  }

  public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse addEventHandlerParametersItem(KeyfactorApiModelsEventHandlerEventHandlerParameterResponse eventHandlerParametersItem) {
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

  public List<KeyfactorApiModelsEventHandlerEventHandlerParameterResponse> getEventHandlerParameters() {
    return eventHandlerParameters;
  }


  public void setEventHandlerParameters(List<KeyfactorApiModelsEventHandlerEventHandlerParameterResponse> eventHandlerParameters) {
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
    KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse keyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse = (KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse) o;
    return Objects.equals(this.id, keyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.id) &&
        Objects.equals(this.displayName, keyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.displayName) &&
        Objects.equals(this.subject, keyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.subject) &&
        Objects.equals(this.message, keyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.message) &&
        Objects.equals(this.expirationWarningDays, keyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.expirationWarningDays) &&
        Objects.equals(this.recipients, keyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.recipients) &&
        Objects.equals(this.certificateQuery, keyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.certificateQuery) &&
        Objects.equals(this.registeredEventHandler, keyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.registeredEventHandler) &&
        Objects.equals(this.eventHandlerParameters, keyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.eventHandlerParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, subject, message, expirationWarningDays, recipients, certificateQuery, registeredEventHandler, eventHandlerParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    expirationWarningDays: ").append(toIndentedString(expirationWarningDays)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    certificateQuery: ").append(toIndentedString(certificateQuery)).append("\n");
    sb.append("    registeredEventHandler: ").append(toIndentedString(registeredEventHandler)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("DisplayName");
    openapiFields.add("Subject");
    openapiFields.add("Message");
    openapiFields.add("ExpirationWarningDays");
    openapiFields.add("Recipients");
    openapiFields.add("CertificateQuery");
    openapiFields.add("RegisteredEventHandler");
    openapiFields.add("EventHandlerParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse is not found in the empty JSON string", KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("DisplayName") != null && !jsonObj.get("DisplayName").isJsonNull()) && !jsonObj.get("DisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DisplayName").toString()));
      }
      if ((jsonObj.get("Subject") != null && !jsonObj.get("Subject").isJsonNull()) && !jsonObj.get("Subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subject").toString()));
      }
      if ((jsonObj.get("Message") != null && !jsonObj.get("Message").isJsonNull()) && !jsonObj.get("Message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Message").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Recipients") != null && !jsonObj.get("Recipients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Recipients` to be an array in the JSON string but got `%s`", jsonObj.get("Recipients").toString()));
      }
      // validate the optional field `CertificateQuery`
      if (jsonObj.get("CertificateQuery") != null && !jsonObj.get("CertificateQuery").isJsonNull()) {
        KeyfactorApiModelsAlertsAlertCertificateQueryAlertCertificateQueryResponse.validateJsonObject(jsonObj.getAsJsonObject("CertificateQuery"));
      }
      // validate the optional field `RegisteredEventHandler`
      if (jsonObj.get("RegisteredEventHandler") != null && !jsonObj.get("RegisteredEventHandler").isJsonNull()) {
        KeyfactorApiModelsEventHandlerRegisteredEventHandlerResponse.validateJsonObject(jsonObj.getAsJsonObject("RegisteredEventHandler"));
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
            KeyfactorApiModelsEventHandlerEventHandlerParameterResponse.validateJsonObject(jsonArrayeventHandlerParameters.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse
  */
  public static KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsAlertsExpirationExpirationAlertDefinitionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

