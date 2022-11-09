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
import java.util.ArrayList;
import java.util.List;
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
 * KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse {
  public static final String SERIALIZED_NAME_SUCCESSFUL_STORES = "SuccessfulStores";
  @SerializedName(SERIALIZED_NAME_SUCCESSFUL_STORES)
  private List<UUID> successfulStores = null;

  public static final String SERIALIZED_NAME_FAILED_STORES = "FailedStores";
  @SerializedName(SERIALIZED_NAME_FAILED_STORES)
  private List<UUID> failedStores = null;

  public KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse() {
  }

  public KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse successfulStores(List<UUID> successfulStores) {
    
    this.successfulStores = successfulStores;
    return this;
  }

  public KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse addSuccessfulStoresItem(UUID successfulStoresItem) {
    if (this.successfulStores == null) {
      this.successfulStores = new ArrayList<>();
    }
    this.successfulStores.add(successfulStoresItem);
    return this;
  }

   /**
   * Get successfulStores
   * @return successfulStores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getSuccessfulStores() {
    return successfulStores;
  }


  public void setSuccessfulStores(List<UUID> successfulStores) {
    this.successfulStores = successfulStores;
  }


  public KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse failedStores(List<UUID> failedStores) {
    
    this.failedStores = failedStores;
    return this;
  }

  public KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse addFailedStoresItem(UUID failedStoresItem) {
    if (this.failedStores == null) {
      this.failedStores = new ArrayList<>();
    }
    this.failedStores.add(failedStoresItem);
    return this;
  }

   /**
   * Get failedStores
   * @return failedStores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getFailedStores() {
    return failedStores;
  }


  public void setFailedStores(List<UUID> failedStores) {
    this.failedStores = failedStores;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse keyfactorAPIModelsEnrollmentEnrollmentManagementResponse = (KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse) o;
    return Objects.equals(this.successfulStores, keyfactorAPIModelsEnrollmentEnrollmentManagementResponse.successfulStores) &&
        Objects.equals(this.failedStores, keyfactorAPIModelsEnrollmentEnrollmentManagementResponse.failedStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successfulStores, failedStores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse {\n");
    sb.append("    successfulStores: ").append(toIndentedString(successfulStores)).append("\n");
    sb.append("    failedStores: ").append(toIndentedString(failedStores)).append("\n");
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
    openapiFields.add("SuccessfulStores");
    openapiFields.add("FailedStores");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse is not found in the empty JSON string", KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("SuccessfulStores") != null && !jsonObj.get("SuccessfulStores").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SuccessfulStores` to be an array in the JSON string but got `%s`", jsonObj.get("SuccessfulStores").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("FailedStores") != null && !jsonObj.get("FailedStores").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `FailedStores` to be an array in the JSON string but got `%s`", jsonObj.get("FailedStores").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse
  */
  public static KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse.class);
  }

 /**
  * Convert an instance of KeyfactorAPIModelsEnrollmentEnrollmentManagementResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

