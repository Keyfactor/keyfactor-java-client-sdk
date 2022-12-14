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
 * ModelsTemplateMetadataField
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsTemplateMetadataField {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "DefaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_METADATA_ID = "MetadataId";
  @SerializedName(SERIALIZED_NAME_METADATA_ID)
  private Integer metadataId;

  public static final String SERIALIZED_NAME_VALIDATION = "Validation";
  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private String validation;

  /**
   * Gets or Sets enrollment
   */
  @JsonAdapter(EnrollmentEnum.Adapter.class)
  public enum EnrollmentEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    EnrollmentEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnrollmentEnum fromValue(Integer value) {
      for (EnrollmentEnum b : EnrollmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnrollmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnrollmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnrollmentEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return EnrollmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENROLLMENT = "Enrollment";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT)
  private EnrollmentEnum enrollment;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public ModelsTemplateMetadataField() {
  }

  public ModelsTemplateMetadataField id(Integer id) {
    
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


  public ModelsTemplateMetadataField defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public ModelsTemplateMetadataField metadataId(Integer metadataId) {
    
    this.metadataId = metadataId;
    return this;
  }

   /**
   * Get metadataId
   * @return metadataId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMetadataId() {
    return metadataId;
  }


  public void setMetadataId(Integer metadataId) {
    this.metadataId = metadataId;
  }


  public ModelsTemplateMetadataField validation(String validation) {
    
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValidation() {
    return validation;
  }


  public void setValidation(String validation) {
    this.validation = validation;
  }


  public ModelsTemplateMetadataField enrollment(EnrollmentEnum enrollment) {
    
    this.enrollment = enrollment;
    return this;
  }

   /**
   * Get enrollment
   * @return enrollment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnrollmentEnum getEnrollment() {
    return enrollment;
  }


  public void setEnrollment(EnrollmentEnum enrollment) {
    this.enrollment = enrollment;
  }


  public ModelsTemplateMetadataField message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsTemplateMetadataField modelsTemplateMetadataField = (ModelsTemplateMetadataField) o;
    return Objects.equals(this.id, modelsTemplateMetadataField.id) &&
        Objects.equals(this.defaultValue, modelsTemplateMetadataField.defaultValue) &&
        Objects.equals(this.metadataId, modelsTemplateMetadataField.metadataId) &&
        Objects.equals(this.validation, modelsTemplateMetadataField.validation) &&
        Objects.equals(this.enrollment, modelsTemplateMetadataField.enrollment) &&
        Objects.equals(this.message, modelsTemplateMetadataField.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, defaultValue, metadataId, validation, enrollment, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsTemplateMetadataField {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    metadataId: ").append(toIndentedString(metadataId)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    enrollment: ").append(toIndentedString(enrollment)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("DefaultValue");
    openapiFields.add("MetadataId");
    openapiFields.add("Validation");
    openapiFields.add("Enrollment");
    openapiFields.add("Message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsTemplateMetadataField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsTemplateMetadataField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsTemplateMetadataField is not found in the empty JSON string", ModelsTemplateMetadataField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsTemplateMetadataField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsTemplateMetadataField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("DefaultValue") != null && !jsonObj.get("DefaultValue").isJsonNull()) && !jsonObj.get("DefaultValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DefaultValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DefaultValue").toString()));
      }
      if ((jsonObj.get("Validation") != null && !jsonObj.get("Validation").isJsonNull()) && !jsonObj.get("Validation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Validation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Validation").toString()));
      }
      if ((jsonObj.get("Message") != null && !jsonObj.get("Message").isJsonNull()) && !jsonObj.get("Message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsTemplateMetadataField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsTemplateMetadataField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsTemplateMetadataField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsTemplateMetadataField.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsTemplateMetadataField>() {
           @Override
           public void write(JsonWriter out, ModelsTemplateMetadataField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsTemplateMetadataField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsTemplateMetadataField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsTemplateMetadataField
  * @throws IOException if the JSON string is invalid with respect to ModelsTemplateMetadataField
  */
  public static ModelsTemplateMetadataField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsTemplateMetadataField.class);
  }

 /**
  * Convert an instance of ModelsTemplateMetadataField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

