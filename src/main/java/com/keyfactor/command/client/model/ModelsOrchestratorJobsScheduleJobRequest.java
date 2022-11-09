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
import com.keyfactor.command.client.model.KeyfactorCommonSchedulingKeyfactorSchedule;
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
 * ModelsOrchestratorJobsScheduleJobRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsOrchestratorJobsScheduleJobRequest {
  public static final String SERIALIZED_NAME_AGENT_ID = "AgentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private UUID agentId;

  public static final String SERIALIZED_NAME_JOB_TYPE_NAME = "JobTypeName";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE_NAME)
  private String jobTypeName;

  public static final String SERIALIZED_NAME_SCHEDULE = "Schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private KeyfactorCommonSchedulingKeyfactorSchedule schedule;

  public static final String SERIALIZED_NAME_JOB_FIELDS = "JobFields";
  @SerializedName(SERIALIZED_NAME_JOB_FIELDS)
  private Map<String, String> jobFields = null;

  public ModelsOrchestratorJobsScheduleJobRequest() {
  }

  public ModelsOrchestratorJobsScheduleJobRequest agentId(UUID agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * Get agentId
   * @return agentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "")

  public UUID getAgentId() {
    return agentId;
  }


  public void setAgentId(UUID agentId) {
    this.agentId = agentId;
  }


  public ModelsOrchestratorJobsScheduleJobRequest jobTypeName(String jobTypeName) {
    
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


  public ModelsOrchestratorJobsScheduleJobRequest schedule(KeyfactorCommonSchedulingKeyfactorSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorCommonSchedulingKeyfactorSchedule getSchedule() {
    return schedule;
  }


  public void setSchedule(KeyfactorCommonSchedulingKeyfactorSchedule schedule) {
    this.schedule = schedule;
  }


  public ModelsOrchestratorJobsScheduleJobRequest jobFields(Map<String, String> jobFields) {
    
    this.jobFields = jobFields;
    return this;
  }

  public ModelsOrchestratorJobsScheduleJobRequest putJobFieldsItem(String key, String jobFieldsItem) {
    if (this.jobFields == null) {
      this.jobFields = new HashMap<>();
    }
    this.jobFields.put(key, jobFieldsItem);
    return this;
  }

   /**
   * Get jobFields
   * @return jobFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getJobFields() {
    return jobFields;
  }


  public void setJobFields(Map<String, String> jobFields) {
    this.jobFields = jobFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsOrchestratorJobsScheduleJobRequest modelsOrchestratorJobsScheduleJobRequest = (ModelsOrchestratorJobsScheduleJobRequest) o;
    return Objects.equals(this.agentId, modelsOrchestratorJobsScheduleJobRequest.agentId) &&
        Objects.equals(this.jobTypeName, modelsOrchestratorJobsScheduleJobRequest.jobTypeName) &&
        Objects.equals(this.schedule, modelsOrchestratorJobsScheduleJobRequest.schedule) &&
        Objects.equals(this.jobFields, modelsOrchestratorJobsScheduleJobRequest.jobFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, jobTypeName, schedule, jobFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsOrchestratorJobsScheduleJobRequest {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    jobTypeName: ").append(toIndentedString(jobTypeName)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    jobFields: ").append(toIndentedString(jobFields)).append("\n");
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
    openapiFields.add("AgentId");
    openapiFields.add("JobTypeName");
    openapiFields.add("Schedule");
    openapiFields.add("JobFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AgentId");
    openapiRequiredFields.add("JobTypeName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsOrchestratorJobsScheduleJobRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsOrchestratorJobsScheduleJobRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsOrchestratorJobsScheduleJobRequest is not found in the empty JSON string", ModelsOrchestratorJobsScheduleJobRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsOrchestratorJobsScheduleJobRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsOrchestratorJobsScheduleJobRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsOrchestratorJobsScheduleJobRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("AgentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentId").toString()));
      }
      if (!jsonObj.get("JobTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobTypeName").toString()));
      }
      // validate the optional field `Schedule`
      if (jsonObj.get("Schedule") != null && !jsonObj.get("Schedule").isJsonNull()) {
        KeyfactorCommonSchedulingKeyfactorSchedule.validateJsonObject(jsonObj.getAsJsonObject("Schedule"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsOrchestratorJobsScheduleJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsOrchestratorJobsScheduleJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsOrchestratorJobsScheduleJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsOrchestratorJobsScheduleJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsOrchestratorJobsScheduleJobRequest>() {
           @Override
           public void write(JsonWriter out, ModelsOrchestratorJobsScheduleJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsOrchestratorJobsScheduleJobRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsOrchestratorJobsScheduleJobRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsOrchestratorJobsScheduleJobRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsOrchestratorJobsScheduleJobRequest
  */
  public static ModelsOrchestratorJobsScheduleJobRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsOrchestratorJobsScheduleJobRequest.class);
  }

 /**
  * Convert an instance of ModelsOrchestratorJobsScheduleJobRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

