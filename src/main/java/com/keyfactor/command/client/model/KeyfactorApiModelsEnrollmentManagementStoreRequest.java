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
 * KeyfactorApiModelsEnrollmentManagementStoreRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsEnrollmentManagementStoreRequest {
  public static final String SERIALIZED_NAME_STORE_ID = "StoreId";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private UUID storeId;

  public static final String SERIALIZED_NAME_ALIAS = "Alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_OVERWRITE = "Overwrite";
  @SerializedName(SERIALIZED_NAME_OVERWRITE)
  private Boolean overwrite;

  public static final String SERIALIZED_NAME_PROPERTIES = "Properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Object> properties = null;

  public KeyfactorApiModelsEnrollmentManagementStoreRequest() {
  }

  public KeyfactorApiModelsEnrollmentManagementStoreRequest storeId(UUID storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * Get storeId
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getStoreId() {
    return storeId;
  }


  public void setStoreId(UUID storeId) {
    this.storeId = storeId;
  }


  public KeyfactorApiModelsEnrollmentManagementStoreRequest alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public KeyfactorApiModelsEnrollmentManagementStoreRequest overwrite(Boolean overwrite) {
    
    this.overwrite = overwrite;
    return this;
  }

   /**
   * Get overwrite
   * @return overwrite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOverwrite() {
    return overwrite;
  }


  public void setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
  }


  public KeyfactorApiModelsEnrollmentManagementStoreRequest properties(Map<String, Object> properties) {
    
    this.properties = properties;
    return this;
  }

  public KeyfactorApiModelsEnrollmentManagementStoreRequest putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsEnrollmentManagementStoreRequest keyfactorApiModelsEnrollmentManagementStoreRequest = (KeyfactorApiModelsEnrollmentManagementStoreRequest) o;
    return Objects.equals(this.storeId, keyfactorApiModelsEnrollmentManagementStoreRequest.storeId) &&
        Objects.equals(this.alias, keyfactorApiModelsEnrollmentManagementStoreRequest.alias) &&
        Objects.equals(this.overwrite, keyfactorApiModelsEnrollmentManagementStoreRequest.overwrite) &&
        Objects.equals(this.properties, keyfactorApiModelsEnrollmentManagementStoreRequest.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, alias, overwrite, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsEnrollmentManagementStoreRequest {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("StoreId");
    openapiFields.add("Alias");
    openapiFields.add("Overwrite");
    openapiFields.add("Properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsEnrollmentManagementStoreRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsEnrollmentManagementStoreRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsEnrollmentManagementStoreRequest is not found in the empty JSON string", KeyfactorApiModelsEnrollmentManagementStoreRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsEnrollmentManagementStoreRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsEnrollmentManagementStoreRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("StoreId") != null && !jsonObj.get("StoreId").isJsonNull()) && !jsonObj.get("StoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StoreId").toString()));
      }
      if ((jsonObj.get("Alias") != null && !jsonObj.get("Alias").isJsonNull()) && !jsonObj.get("Alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Alias").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsEnrollmentManagementStoreRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsEnrollmentManagementStoreRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsEnrollmentManagementStoreRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsEnrollmentManagementStoreRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsEnrollmentManagementStoreRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsEnrollmentManagementStoreRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsEnrollmentManagementStoreRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsEnrollmentManagementStoreRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsEnrollmentManagementStoreRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsEnrollmentManagementStoreRequest
  */
  public static KeyfactorApiModelsEnrollmentManagementStoreRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsEnrollmentManagementStoreRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsEnrollmentManagementStoreRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

