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
 * KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest {
  public static final String SERIALIZED_NAME_SUBJECT_PART = "SubjectPart";
  @SerializedName(SERIALIZED_NAME_SUBJECT_PART)
  private String subjectPart;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest() {
  }

  public KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest subjectPart(String subjectPart) {
    
    this.subjectPart = subjectPart;
    return this;
  }

   /**
   * The subject part to apply the default to.
   * @return subjectPart
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The subject part to apply the default to.")

  public String getSubjectPart() {
    return subjectPart;
  }


  public void setSubjectPart(String subjectPart) {
    this.subjectPart = subjectPart;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value to apply by default.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value to apply by default.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest keyfactorApiModelsTemplatesGlobalTemplateDefaultRequest = (KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest) o;
    return Objects.equals(this.subjectPart, keyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.subjectPart) &&
        Objects.equals(this.value, keyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectPart, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest {\n");
    sb.append("    subjectPart: ").append(toIndentedString(subjectPart)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("SubjectPart");
    openapiFields.add("Value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("SubjectPart");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest is not found in the empty JSON string", KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("SubjectPart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubjectPart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SubjectPart").toString()));
      }
      if ((jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonNull()) && !jsonObj.get("Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest
  */
  public static KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
