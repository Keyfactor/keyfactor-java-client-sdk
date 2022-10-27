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
 * ModelsTemplateUpdateRequestTemplateDefaultModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class ModelsTemplateUpdateRequestTemplateDefaultModel {
  public static final String SERIALIZED_NAME_SUBJECT_PART = "SubjectPart";
  @SerializedName(SERIALIZED_NAME_SUBJECT_PART)
  private String subjectPart;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ModelsTemplateUpdateRequestTemplateDefaultModel() {
  }

  public ModelsTemplateUpdateRequestTemplateDefaultModel subjectPart(String subjectPart) {
    
    this.subjectPart = subjectPart;
    return this;
  }

   /**
   * Get subjectPart
   * @return subjectPart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubjectPart() {
    return subjectPart;
  }


  public void setSubjectPart(String subjectPart) {
    this.subjectPart = subjectPart;
  }


  public ModelsTemplateUpdateRequestTemplateDefaultModel value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    ModelsTemplateUpdateRequestTemplateDefaultModel modelsTemplateUpdateRequestTemplateDefaultModel = (ModelsTemplateUpdateRequestTemplateDefaultModel) o;
    return Objects.equals(this.subjectPart, modelsTemplateUpdateRequestTemplateDefaultModel.subjectPart) &&
        Objects.equals(this.value, modelsTemplateUpdateRequestTemplateDefaultModel.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectPart, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsTemplateUpdateRequestTemplateDefaultModel {\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsTemplateUpdateRequestTemplateDefaultModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsTemplateUpdateRequestTemplateDefaultModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsTemplateUpdateRequestTemplateDefaultModel is not found in the empty JSON string", ModelsTemplateUpdateRequestTemplateDefaultModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsTemplateUpdateRequestTemplateDefaultModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsTemplateUpdateRequestTemplateDefaultModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SubjectPart") != null && !jsonObj.get("SubjectPart").isJsonNull()) && !jsonObj.get("SubjectPart").isJsonPrimitive()) {
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
       if (!ModelsTemplateUpdateRequestTemplateDefaultModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsTemplateUpdateRequestTemplateDefaultModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsTemplateUpdateRequestTemplateDefaultModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsTemplateUpdateRequestTemplateDefaultModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsTemplateUpdateRequestTemplateDefaultModel>() {
           @Override
           public void write(JsonWriter out, ModelsTemplateUpdateRequestTemplateDefaultModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsTemplateUpdateRequestTemplateDefaultModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsTemplateUpdateRequestTemplateDefaultModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsTemplateUpdateRequestTemplateDefaultModel
  * @throws IOException if the JSON string is invalid with respect to ModelsTemplateUpdateRequestTemplateDefaultModel
  */
  public static ModelsTemplateUpdateRequestTemplateDefaultModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsTemplateUpdateRequestTemplateDefaultModel.class);
  }

 /**
  * Convert an instance of ModelsTemplateUpdateRequestTemplateDefaultModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

