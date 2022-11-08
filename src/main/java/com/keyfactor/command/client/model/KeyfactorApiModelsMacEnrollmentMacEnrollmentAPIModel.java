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
 * KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_INTERVAL = "Interval";
  @SerializedName(SERIALIZED_NAME_INTERVAL)
  private Integer interval;

  public static final String SERIALIZED_NAME_USE_METADATA = "UseMetadata";
  @SerializedName(SERIALIZED_NAME_USE_METADATA)
  private Boolean useMetadata;

  public static final String SERIALIZED_NAME_METADATA_FIELD = "MetadataField";
  @SerializedName(SERIALIZED_NAME_METADATA_FIELD)
  private String metadataField;

  public static final String SERIALIZED_NAME_METADATA_VALUE = "MetadataValue";
  @SerializedName(SERIALIZED_NAME_METADATA_VALUE)
  private String metadataValue;

  public KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel() {
  }

  public KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel id(Integer id) {
    
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


  public KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel interval(Integer interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInterval() {
    return interval;
  }


  public void setInterval(Integer interval) {
    this.interval = interval;
  }


  public KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel useMetadata(Boolean useMetadata) {
    
    this.useMetadata = useMetadata;
    return this;
  }

   /**
   * Get useMetadata
   * @return useMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseMetadata() {
    return useMetadata;
  }


  public void setUseMetadata(Boolean useMetadata) {
    this.useMetadata = useMetadata;
  }


  public KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel metadataField(String metadataField) {
    
    this.metadataField = metadataField;
    return this;
  }

   /**
   * Get metadataField
   * @return metadataField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMetadataField() {
    return metadataField;
  }


  public void setMetadataField(String metadataField) {
    this.metadataField = metadataField;
  }


  public KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel metadataValue(String metadataValue) {
    
    this.metadataValue = metadataValue;
    return this;
  }

   /**
   * Get metadataValue
   * @return metadataValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMetadataValue() {
    return metadataValue;
  }


  public void setMetadataValue(String metadataValue) {
    this.metadataValue = metadataValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel keyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel = (KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel) o;
    return Objects.equals(this.id, keyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.id) &&
        Objects.equals(this.enabled, keyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.enabled) &&
        Objects.equals(this.interval, keyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.interval) &&
        Objects.equals(this.useMetadata, keyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.useMetadata) &&
        Objects.equals(this.metadataField, keyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.metadataField) &&
        Objects.equals(this.metadataValue, keyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.metadataValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, enabled, interval, useMetadata, metadataField, metadataValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    useMetadata: ").append(toIndentedString(useMetadata)).append("\n");
    sb.append("    metadataField: ").append(toIndentedString(metadataField)).append("\n");
    sb.append("    metadataValue: ").append(toIndentedString(metadataValue)).append("\n");
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
    openapiFields.add("Enabled");
    openapiFields.add("Interval");
    openapiFields.add("UseMetadata");
    openapiFields.add("MetadataField");
    openapiFields.add("MetadataValue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel is not found in the empty JSON string", KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("MetadataField") != null && !jsonObj.get("MetadataField").isJsonNull()) && !jsonObj.get("MetadataField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MetadataField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MetadataField").toString()));
      }
      if ((jsonObj.get("MetadataValue") != null && !jsonObj.get("MetadataValue").isJsonNull()) && !jsonObj.get("MetadataValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MetadataValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MetadataValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel
  */
  public static KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsMacEnrollmentMacEnrollmentAPIModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

