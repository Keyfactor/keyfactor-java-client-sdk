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
 * KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest {
  public static final String SERIALIZED_NAME_ALERT_ID = "AlertId";
  @SerializedName(SERIALIZED_NAME_ALERT_ID)
  private Integer alertId;

  public static final String SERIALIZED_NAME_EVALUATION_DATE = "EvaluationDate";
  @SerializedName(SERIALIZED_NAME_EVALUATION_DATE)
  private OffsetDateTime evaluationDate;

  public static final String SERIALIZED_NAME_PREVIOUS_EVALUATION_DATE = "PreviousEvaluationDate";
  @SerializedName(SERIALIZED_NAME_PREVIOUS_EVALUATION_DATE)
  private OffsetDateTime previousEvaluationDate;

  public static final String SERIALIZED_NAME_SEND_ALERTS = "SendAlerts";
  @SerializedName(SERIALIZED_NAME_SEND_ALERTS)
  private Boolean sendAlerts;

  public KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest() {
  }

  public KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest alertId(Integer alertId) {
    
    this.alertId = alertId;
    return this;
  }

   /**
   * Get alertId
   * @return alertId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAlertId() {
    return alertId;
  }


  public void setAlertId(Integer alertId) {
    this.alertId = alertId;
  }


  public KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest evaluationDate(OffsetDateTime evaluationDate) {
    
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


  public KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest previousEvaluationDate(OffsetDateTime previousEvaluationDate) {
    
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


  public KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest sendAlerts(Boolean sendAlerts) {
    
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
    KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest keyfactorApiModelsAlertsExpirationExpirationAlertTestRequest = (KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest) o;
    return Objects.equals(this.alertId, keyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.alertId) &&
        Objects.equals(this.evaluationDate, keyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.evaluationDate) &&
        Objects.equals(this.previousEvaluationDate, keyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.previousEvaluationDate) &&
        Objects.equals(this.sendAlerts, keyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.sendAlerts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId, evaluationDate, previousEvaluationDate, sendAlerts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest {\n");
    sb.append("    alertId: ").append(toIndentedString(alertId)).append("\n");
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
    openapiFields.add("AlertId");
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
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest is not found in the empty JSON string", KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest
  */
  public static KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsAlertsExpirationExpirationAlertTestRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

