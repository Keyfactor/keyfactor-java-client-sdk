/*
 * Copyright 2022 Keyfactor
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  You may obtain a
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0.  Unless
 * required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for
 * thespecific language governing permissions and limitations under the
 * License.
 *
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
 * ModelsTemplateCollectionRetrievalResponseTemplateRegexModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsTemplateCollectionRetrievalResponseTemplateRegexModel {
  public static final String SERIALIZED_NAME_TEMPLATE_ID = "TemplateId";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private Integer templateId;

  public static final String SERIALIZED_NAME_SUBJECT_PART = "SubjectPart";
  @SerializedName(SERIALIZED_NAME_SUBJECT_PART)
  private String subjectPart;

  public static final String SERIALIZED_NAME_REGEX = "Regex";
  @SerializedName(SERIALIZED_NAME_REGEX)
  private String regex;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public ModelsTemplateCollectionRetrievalResponseTemplateRegexModel() {
  }

  public ModelsTemplateCollectionRetrievalResponseTemplateRegexModel templateId(Integer templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTemplateId() {
    return templateId;
  }


  public void setTemplateId(Integer templateId) {
    this.templateId = templateId;
  }


  public ModelsTemplateCollectionRetrievalResponseTemplateRegexModel subjectPart(String subjectPart) {
    
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


  public ModelsTemplateCollectionRetrievalResponseTemplateRegexModel regex(String regex) {
    
    this.regex = regex;
    return this;
  }

   /**
   * Get regex
   * @return regex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegex() {
    return regex;
  }


  public void setRegex(String regex) {
    this.regex = regex;
  }


  public ModelsTemplateCollectionRetrievalResponseTemplateRegexModel error(String error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
    ModelsTemplateCollectionRetrievalResponseTemplateRegexModel modelsTemplateCollectionRetrievalResponseTemplateRegexModel = (ModelsTemplateCollectionRetrievalResponseTemplateRegexModel) o;
    return Objects.equals(this.templateId, modelsTemplateCollectionRetrievalResponseTemplateRegexModel.templateId) &&
        Objects.equals(this.subjectPart, modelsTemplateCollectionRetrievalResponseTemplateRegexModel.subjectPart) &&
        Objects.equals(this.regex, modelsTemplateCollectionRetrievalResponseTemplateRegexModel.regex) &&
        Objects.equals(this.error, modelsTemplateCollectionRetrievalResponseTemplateRegexModel.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, subjectPart, regex, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsTemplateCollectionRetrievalResponseTemplateRegexModel {\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("TemplateId");
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
  * @throws IOException if the JSON Object is invalid with respect to ModelsTemplateCollectionRetrievalResponseTemplateRegexModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsTemplateCollectionRetrievalResponseTemplateRegexModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsTemplateCollectionRetrievalResponseTemplateRegexModel is not found in the empty JSON string", ModelsTemplateCollectionRetrievalResponseTemplateRegexModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsTemplateCollectionRetrievalResponseTemplateRegexModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsTemplateCollectionRetrievalResponseTemplateRegexModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!ModelsTemplateCollectionRetrievalResponseTemplateRegexModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsTemplateCollectionRetrievalResponseTemplateRegexModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsTemplateCollectionRetrievalResponseTemplateRegexModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsTemplateCollectionRetrievalResponseTemplateRegexModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsTemplateCollectionRetrievalResponseTemplateRegexModel>() {
           @Override
           public void write(JsonWriter out, ModelsTemplateCollectionRetrievalResponseTemplateRegexModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsTemplateCollectionRetrievalResponseTemplateRegexModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsTemplateCollectionRetrievalResponseTemplateRegexModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsTemplateCollectionRetrievalResponseTemplateRegexModel
  * @throws IOException if the JSON string is invalid with respect to ModelsTemplateCollectionRetrievalResponseTemplateRegexModel
  */
  public static ModelsTemplateCollectionRetrievalResponseTemplateRegexModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsTemplateCollectionRetrievalResponseTemplateRegexModel.class);
  }

 /**
  * Convert an instance of ModelsTemplateCollectionRetrievalResponseTemplateRegexModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

