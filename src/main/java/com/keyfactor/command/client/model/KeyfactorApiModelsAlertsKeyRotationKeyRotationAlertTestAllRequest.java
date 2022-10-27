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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

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
 * KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest {
  public static final String SERIALIZED_NAME_EVALUATION_DATE = "EvaluationDate";
  @SerializedName(SERIALIZED_NAME_EVALUATION_DATE)
  private OffsetDateTime evaluationDate;

  public static final String SERIALIZED_NAME_PREVIOUS_EVALUATION_DATE = "PreviousEvaluationDate";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_EVALUATION_DATE)
  private OffsetDateTime previousEvaluationDate;

  public static final String SERIALIZED_NAME_SEND_ALERTS = "SendAlerts";
  @SerializedName(SERIALIZED_NAME_SEND_ALERTS)
  private Boolean sendAlerts;

  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest() {
  }

  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest evaluationDate(OffsetDateTime evaluationDate) {
    
    this.evaluationDate = evaluationDate;
    return this;
  }

   /**
   * Get evaluationDate
   * @return evaluationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEvaluationDate() {
    return evaluationDate;
  }


  public void setEvaluationDate(OffsetDateTime evaluationDate) {
    this.evaluationDate = evaluationDate;
  }


  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest previousEvaluationDate(OffsetDateTime previousEvaluationDate) {
    
    this.previousEvaluationDate = previousEvaluationDate;
    return this;
  }

   /**
   * Get previousEvaluationDate
   * @return previousEvaluationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getPreviousEvaluationDate() {
    return previousEvaluationDate;
  }


  public void setPreviousEvaluationDate(OffsetDateTime previousEvaluationDate) {
    this.previousEvaluationDate = previousEvaluationDate;
  }


  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest sendAlerts(Boolean sendAlerts) {
    
    this.sendAlerts = sendAlerts;
    return this;
  }

   /**
   * Get sendAlerts
   * @return sendAlerts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSendAlerts() {
    return sendAlerts;
  }


  public void setSendAlerts(Boolean sendAlerts) {
    this.sendAlerts = sendAlerts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest keyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest = (KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest) o;
    return Objects.equals(this.evaluationDate, keyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.evaluationDate) &&
        Objects.equals(this.previousEvaluationDate, keyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.previousEvaluationDate) &&
        Objects.equals(this.sendAlerts, keyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.sendAlerts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationDate, previousEvaluationDate, sendAlerts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest {\n");
    sb.append("    evaluationDate: ").append(toIndentedString(evaluationDate)).append("\n");
    sb.append("    previousEvaluationDate: ").append(toIndentedString(previousEvaluationDate)).append("\n");
    sb.append("    sendAlerts: ").append(toIndentedString(sendAlerts)).append("\n");
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
    openapiFields.add("EvaluationDate");
    openapiFields.add("PreviousEvaluationDate");
    openapiFields.add("SendAlerts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest is not found in the empty JSON string", KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest
  */
  public static KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestAllRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

