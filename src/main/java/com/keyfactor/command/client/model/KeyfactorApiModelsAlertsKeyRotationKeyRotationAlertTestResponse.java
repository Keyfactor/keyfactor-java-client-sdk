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
import com.keyfactor.command.client.model.KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse;
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
 * KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse {
  public static final String SERIALIZED_NAME_KEY_ROTATION_ALERTS = "KeyRotationAlerts";
  @SerializedName(SERIALIZED_NAME_KEY_ROTATION_ALERTS)
  private List<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse> keyRotationAlerts = null;

  /**
   * Gets or Sets alertBuildResult
   */
  @JsonAdapter(AlertBuildResultEnum.Adapter.class)
  public enum AlertBuildResultEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5);

    private Integer value;

    AlertBuildResultEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AlertBuildResultEnum fromValue(Integer value) {
      for (AlertBuildResultEnum b : AlertBuildResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AlertBuildResultEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AlertBuildResultEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AlertBuildResultEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return AlertBuildResultEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALERT_BUILD_RESULT = "AlertBuildResult";
  @SerializedName(SERIALIZED_NAME_ALERT_BUILD_RESULT)
  private AlertBuildResultEnum alertBuildResult;

  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse() {
  }

  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse keyRotationAlerts(List<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse> keyRotationAlerts) {
    
    this.keyRotationAlerts = keyRotationAlerts;
    return this;
  }

  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse addKeyRotationAlertsItem(KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse keyRotationAlertsItem) {
    if (this.keyRotationAlerts == null) {
      this.keyRotationAlerts = new ArrayList<>();
    }
    this.keyRotationAlerts.add(keyRotationAlertsItem);
    return this;
  }

   /**
   * Get keyRotationAlerts
   * @return keyRotationAlerts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse> getKeyRotationAlerts() {
    return keyRotationAlerts;
  }


  public void setKeyRotationAlerts(List<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse> keyRotationAlerts) {
    this.keyRotationAlerts = keyRotationAlerts;
  }


  public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse alertBuildResult(AlertBuildResultEnum alertBuildResult) {
    
    this.alertBuildResult = alertBuildResult;
    return this;
  }

   /**
   * Get alertBuildResult
   * @return alertBuildResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlertBuildResultEnum getAlertBuildResult() {
    return alertBuildResult;
  }


  public void setAlertBuildResult(AlertBuildResultEnum alertBuildResult) {
    this.alertBuildResult = alertBuildResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse keyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse = (KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse) o;
    return Objects.equals(this.keyRotationAlerts, keyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.keyRotationAlerts) &&
        Objects.equals(this.alertBuildResult, keyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.alertBuildResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyRotationAlerts, alertBuildResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse {\n");
    sb.append("    keyRotationAlerts: ").append(toIndentedString(keyRotationAlerts)).append("\n");
    sb.append("    alertBuildResult: ").append(toIndentedString(alertBuildResult)).append("\n");
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
    openapiFields.add("KeyRotationAlerts");
    openapiFields.add("AlertBuildResult");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse is not found in the empty JSON string", KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("KeyRotationAlerts") != null && !jsonObj.get("KeyRotationAlerts").isJsonNull()) {
        JsonArray jsonArraykeyRotationAlerts = jsonObj.getAsJsonArray("KeyRotationAlerts");
        if (jsonArraykeyRotationAlerts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("KeyRotationAlerts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `KeyRotationAlerts` to be an array in the JSON string but got `%s`", jsonObj.get("KeyRotationAlerts").toString()));
          }

          // validate the optional field `KeyRotationAlerts` (array)
          for (int i = 0; i < jsonArraykeyRotationAlerts.size(); i++) {
            KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertResponse.validateJsonObject(jsonArraykeyRotationAlerts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse
  */
  public static KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsAlertsKeyRotationKeyRotationAlertTestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

