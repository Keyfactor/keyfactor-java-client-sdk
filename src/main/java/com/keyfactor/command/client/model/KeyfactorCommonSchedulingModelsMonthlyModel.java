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
 * KeyfactorCommonSchedulingModelsMonthlyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorCommonSchedulingModelsMonthlyModel {
  public static final String SERIALIZED_NAME_DAY = "Day";
  @SerializedName(SERIALIZED_NAME_DAY)
  private Integer day;

  public static final String SERIALIZED_NAME_TIME = "Time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private OffsetDateTime time;

  public KeyfactorCommonSchedulingModelsMonthlyModel() {
  }

  public KeyfactorCommonSchedulingModelsMonthlyModel day(Integer day) {
    
    this.day = day;
    return this;
  }

   /**
   * Get day
   * @return day
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDay() {
    return day;
  }


  public void setDay(Integer day) {
    this.day = day;
  }


  public KeyfactorCommonSchedulingModelsMonthlyModel time(OffsetDateTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTime() {
    return time;
  }


  public void setTime(OffsetDateTime time) {
    this.time = time;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorCommonSchedulingModelsMonthlyModel keyfactorCommonSchedulingModelsMonthlyModel = (KeyfactorCommonSchedulingModelsMonthlyModel) o;
    return Objects.equals(this.day, keyfactorCommonSchedulingModelsMonthlyModel.day) &&
        Objects.equals(this.time, keyfactorCommonSchedulingModelsMonthlyModel.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorCommonSchedulingModelsMonthlyModel {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
    openapiFields.add("Day");
    openapiFields.add("Time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorCommonSchedulingModelsMonthlyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorCommonSchedulingModelsMonthlyModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorCommonSchedulingModelsMonthlyModel is not found in the empty JSON string", KeyfactorCommonSchedulingModelsMonthlyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorCommonSchedulingModelsMonthlyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorCommonSchedulingModelsMonthlyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorCommonSchedulingModelsMonthlyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorCommonSchedulingModelsMonthlyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorCommonSchedulingModelsMonthlyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorCommonSchedulingModelsMonthlyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorCommonSchedulingModelsMonthlyModel>() {
           @Override
           public void write(JsonWriter out, KeyfactorCommonSchedulingModelsMonthlyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorCommonSchedulingModelsMonthlyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorCommonSchedulingModelsMonthlyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorCommonSchedulingModelsMonthlyModel
  * @throws IOException if the JSON string is invalid with respect to KeyfactorCommonSchedulingModelsMonthlyModel
  */
  public static KeyfactorCommonSchedulingModelsMonthlyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorCommonSchedulingModelsMonthlyModel.class);
  }

 /**
  * Convert an instance of KeyfactorCommonSchedulingModelsMonthlyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
