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
import com.keyfactor.command.client.model.ModelsOrchestratorJobsJobTypeFieldRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ModelsOrchestratorJobsJobTypeCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsOrchestratorJobsJobTypeCreateRequest {
  public static final String SERIALIZED_NAME_JOB_TYPE_NAME = "JobTypeName";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE_NAME)
  private String jobTypeName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JOB_TYPE_FIELDS = "JobTypeFields";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE_FIELDS)
  private List<ModelsOrchestratorJobsJobTypeFieldRequest> jobTypeFields = null;

  public ModelsOrchestratorJobsJobTypeCreateRequest() {
  }

  public ModelsOrchestratorJobsJobTypeCreateRequest jobTypeName(String jobTypeName) {
    
    this.jobTypeName = jobTypeName;
    return this;
  }

   /**
   * Get jobTypeName
   * @return jobTypeName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getJobTypeName() {
    return jobTypeName;
  }


  public void setJobTypeName(String jobTypeName) {
    this.jobTypeName = jobTypeName;
  }


  public ModelsOrchestratorJobsJobTypeCreateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ModelsOrchestratorJobsJobTypeCreateRequest jobTypeFields(List<ModelsOrchestratorJobsJobTypeFieldRequest> jobTypeFields) {
    
    this.jobTypeFields = jobTypeFields;
    return this;
  }

  public ModelsOrchestratorJobsJobTypeCreateRequest addJobTypeFieldsItem(ModelsOrchestratorJobsJobTypeFieldRequest jobTypeFieldsItem) {
    if (this.jobTypeFields == null) {
      this.jobTypeFields = new ArrayList<>();
    }
    this.jobTypeFields.add(jobTypeFieldsItem);
    return this;
  }

   /**
   * Get jobTypeFields
   * @return jobTypeFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelsOrchestratorJobsJobTypeFieldRequest> getJobTypeFields() {
    return jobTypeFields;
  }


  public void setJobTypeFields(List<ModelsOrchestratorJobsJobTypeFieldRequest> jobTypeFields) {
    this.jobTypeFields = jobTypeFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsOrchestratorJobsJobTypeCreateRequest modelsOrchestratorJobsJobTypeCreateRequest = (ModelsOrchestratorJobsJobTypeCreateRequest) o;
    return Objects.equals(this.jobTypeName, modelsOrchestratorJobsJobTypeCreateRequest.jobTypeName) &&
        Objects.equals(this.description, modelsOrchestratorJobsJobTypeCreateRequest.description) &&
        Objects.equals(this.jobTypeFields, modelsOrchestratorJobsJobTypeCreateRequest.jobTypeFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTypeName, description, jobTypeFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsOrchestratorJobsJobTypeCreateRequest {\n");
    sb.append("    jobTypeName: ").append(toIndentedString(jobTypeName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    jobTypeFields: ").append(toIndentedString(jobTypeFields)).append("\n");
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
    openapiFields.add("JobTypeName");
    openapiFields.add("Description");
    openapiFields.add("JobTypeFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("JobTypeName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsOrchestratorJobsJobTypeCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsOrchestratorJobsJobTypeCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsOrchestratorJobsJobTypeCreateRequest is not found in the empty JSON string", ModelsOrchestratorJobsJobTypeCreateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsOrchestratorJobsJobTypeCreateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsOrchestratorJobsJobTypeCreateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsOrchestratorJobsJobTypeCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("JobTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobTypeName").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if (jsonObj.get("JobTypeFields") != null && !jsonObj.get("JobTypeFields").isJsonNull()) {
        JsonArray jsonArrayjobTypeFields = jsonObj.getAsJsonArray("JobTypeFields");
        if (jsonArrayjobTypeFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("JobTypeFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `JobTypeFields` to be an array in the JSON string but got `%s`", jsonObj.get("JobTypeFields").toString()));
          }

          // validate the optional field `JobTypeFields` (array)
          for (int i = 0; i < jsonArrayjobTypeFields.size(); i++) {
            ModelsOrchestratorJobsJobTypeFieldRequest.validateJsonObject(jsonArrayjobTypeFields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsOrchestratorJobsJobTypeCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsOrchestratorJobsJobTypeCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsOrchestratorJobsJobTypeCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsOrchestratorJobsJobTypeCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsOrchestratorJobsJobTypeCreateRequest>() {
           @Override
           public void write(JsonWriter out, ModelsOrchestratorJobsJobTypeCreateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsOrchestratorJobsJobTypeCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsOrchestratorJobsJobTypeCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsOrchestratorJobsJobTypeCreateRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsOrchestratorJobsJobTypeCreateRequest
  */
  public static ModelsOrchestratorJobsJobTypeCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsOrchestratorJobsJobTypeCreateRequest.class);
  }

 /**
  * Convert an instance of ModelsOrchestratorJobsJobTypeCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

