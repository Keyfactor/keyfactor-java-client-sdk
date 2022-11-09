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
 * KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse {
  public static final String SERIALIZED_NAME_SUBJECT_PART = "SubjectPart";
  @SerializedName(SERIALIZED_NAME_SUBJECT_PART)
  private String subjectPart;

  public static final String SERIALIZED_NAME_REGEX = "Regex";
  @SerializedName(SERIALIZED_NAME_REGEX)
  private String regex;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse() {
  }

  public KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse subjectPart(String subjectPart) {
    
    this.subjectPart = subjectPart;
    return this;
  }

   /**
   * The subject part to apply the regular expression to.
   * @return subjectPart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject part to apply the regular expression to.")

  public String getSubjectPart() {
    return subjectPart;
  }


  public void setSubjectPart(String subjectPart) {
    this.subjectPart = subjectPart;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse regex(String regex) {
    
    this.regex = regex;
    return this;
  }

   /**
   * The regular expression to apply to the subject part.
   * @return regex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The regular expression to apply to the subject part.")

  public String getRegex() {
    return regex;
  }


  public void setRegex(String regex) {
    this.regex = regex;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * The error message to show when the regex validation fails.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The error message to show when the regex validation fails.")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse keyfactorApiModelsTemplatesGlobalTemplateRegexResponse = (KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse) o;
    return Objects.equals(this.subjectPart, keyfactorApiModelsTemplatesGlobalTemplateRegexResponse.subjectPart) &&
        Objects.equals(this.regex, keyfactorApiModelsTemplatesGlobalTemplateRegexResponse.regex) &&
        Objects.equals(this.error, keyfactorApiModelsTemplatesGlobalTemplateRegexResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectPart, regex, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse {\n");
    sb.append("    subjectPart: ").append(toIndentedString(subjectPart)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
    openapiFields.add("Regex");
    openapiFields.add("Error");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse is not found in the empty JSON string", KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SubjectPart") != null && !jsonObj.get("SubjectPart").isJsonNull()) && !jsonObj.get("SubjectPart").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SubjectPart` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SubjectPart").toString()));
      }
      if ((jsonObj.get("Regex") != null && !jsonObj.get("Regex").isJsonNull()) && !jsonObj.get("Regex").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Regex` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Regex").toString()));
      }
      if ((jsonObj.get("Error") != null && !jsonObj.get("Error").isJsonNull()) && !jsonObj.get("Error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Error").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse
  */
  public static KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

