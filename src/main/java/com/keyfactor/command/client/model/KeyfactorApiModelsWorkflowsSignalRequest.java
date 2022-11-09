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
import java.util.HashMap;
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
 * KeyfactorApiModelsWorkflowsSignalRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsWorkflowsSignalRequest {
  public static final String SERIALIZED_NAME_SIGNAL_KEY = "SignalKey";
  @SerializedName(SERIALIZED_NAME_SIGNAL_KEY)
  private String signalKey;

  public static final String SERIALIZED_NAME_DATA = "Data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Map<String, Object> data = null;

  public KeyfactorApiModelsWorkflowsSignalRequest() {
  }

  public KeyfactorApiModelsWorkflowsSignalRequest signalKey(String signalKey) {
    
    this.signalKey = signalKey;
    return this;
  }

   /**
   * The signal key. This is expected to be in a format like \&quot;STEP_NAME.SIGNAL_NAME\&quot;
   * @return signalKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The signal key. This is expected to be in a format like \"STEP_NAME.SIGNAL_NAME\"")

  public String getSignalKey() {
    return signalKey;
  }


  public void setSignalKey(String signalKey) {
    this.signalKey = signalKey;
  }


  public KeyfactorApiModelsWorkflowsSignalRequest data(Map<String, Object> data) {
    
    this.data = data;
    return this;
  }

  public KeyfactorApiModelsWorkflowsSignalRequest putDataItem(String key, Object dataItem) {
    if (this.data == null) {
      this.data = new HashMap<>();
    }
    this.data.put(key, dataItem);
    return this;
  }

   /**
   * Arbitrary data to associate with the signal.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arbitrary data to associate with the signal.")

  public Map<String, Object> getData() {
    return data;
  }


  public void setData(Map<String, Object> data) {
    this.data = data;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsWorkflowsSignalRequest keyfactorApiModelsWorkflowsSignalRequest = (KeyfactorApiModelsWorkflowsSignalRequest) o;
    return Objects.equals(this.signalKey, keyfactorApiModelsWorkflowsSignalRequest.signalKey) &&
        Objects.equals(this.data, keyfactorApiModelsWorkflowsSignalRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signalKey, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsWorkflowsSignalRequest {\n");
    sb.append("    signalKey: ").append(toIndentedString(signalKey)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
    openapiFields.add("SignalKey");
    openapiFields.add("Data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsWorkflowsSignalRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsWorkflowsSignalRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsWorkflowsSignalRequest is not found in the empty JSON string", KeyfactorApiModelsWorkflowsSignalRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsWorkflowsSignalRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsWorkflowsSignalRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SignalKey") != null && !jsonObj.get("SignalKey").isJsonNull()) && !jsonObj.get("SignalKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SignalKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SignalKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsWorkflowsSignalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsWorkflowsSignalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsWorkflowsSignalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsWorkflowsSignalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsWorkflowsSignalRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsWorkflowsSignalRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsWorkflowsSignalRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsWorkflowsSignalRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsWorkflowsSignalRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsWorkflowsSignalRequest
  */
  public static KeyfactorApiModelsWorkflowsSignalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsWorkflowsSignalRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsWorkflowsSignalRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

