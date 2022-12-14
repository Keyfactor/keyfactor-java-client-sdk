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
import com.keyfactor.command.client.model.KeyfactorCommonSchedulingKeyfactorSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * ModelsOrchestratorJobsJob
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsOrchestratorJobsJob {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_CLIENT_MACHINE = "ClientMachine";
  @SerializedName(SERIALIZED_NAME_CLIENT_MACHINE)
  private String clientMachine;

  public static final String SERIALIZED_NAME_TARGET = "Target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private String target;

  public static final String SERIALIZED_NAME_SCHEDULE = "Schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private KeyfactorCommonSchedulingKeyfactorSchedule schedule;

  public static final String SERIALIZED_NAME_REQUESTED = "Requested";
  @SerializedName(SERIALIZED_NAME_REQUESTED)
  private String requested;

  public static final String SERIALIZED_NAME_JOB_TYPE = "JobType";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE)
  private String jobType;

  public ModelsOrchestratorJobsJob() {
  }

  public ModelsOrchestratorJobsJob id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public ModelsOrchestratorJobsJob clientMachine(String clientMachine) {
    
    this.clientMachine = clientMachine;
    return this;
  }

   /**
   * Get clientMachine
   * @return clientMachine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientMachine() {
    return clientMachine;
  }


  public void setClientMachine(String clientMachine) {
    this.clientMachine = clientMachine;
  }


  public ModelsOrchestratorJobsJob target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public ModelsOrchestratorJobsJob schedule(KeyfactorCommonSchedulingKeyfactorSchedule schedule) {
    
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


  public ModelsOrchestratorJobsJob requested(String requested) {
    
    this.requested = requested;
    return this;
  }

   /**
   * Get requested
   * @return requested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequested() {
    return requested;
  }


  public void setRequested(String requested) {
    this.requested = requested;
  }


  public ModelsOrchestratorJobsJob jobType(String jobType) {
    
    this.jobType = jobType;
    return this;
  }

   /**
   * Get jobType
   * @return jobType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobType() {
    return jobType;
  }


  public void setJobType(String jobType) {
    this.jobType = jobType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsOrchestratorJobsJob modelsOrchestratorJobsJob = (ModelsOrchestratorJobsJob) o;
    return Objects.equals(this.id, modelsOrchestratorJobsJob.id) &&
        Objects.equals(this.clientMachine, modelsOrchestratorJobsJob.clientMachine) &&
        Objects.equals(this.target, modelsOrchestratorJobsJob.target) &&
        Objects.equals(this.schedule, modelsOrchestratorJobsJob.schedule) &&
        Objects.equals(this.requested, modelsOrchestratorJobsJob.requested) &&
        Objects.equals(this.jobType, modelsOrchestratorJobsJob.jobType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clientMachine, target, schedule, requested, jobType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsOrchestratorJobsJob {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clientMachine: ").append(toIndentedString(clientMachine)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    requested: ").append(toIndentedString(requested)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
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
    openapiFields.add("ClientMachine");
    openapiFields.add("Target");
    openapiFields.add("Schedule");
    openapiFields.add("Requested");
    openapiFields.add("JobType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsOrchestratorJobsJob
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsOrchestratorJobsJob.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsOrchestratorJobsJob is not found in the empty JSON string", ModelsOrchestratorJobsJob.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsOrchestratorJobsJob.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsOrchestratorJobsJob` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if ((jsonObj.get("ClientMachine") != null && !jsonObj.get("ClientMachine").isJsonNull()) && !jsonObj.get("ClientMachine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ClientMachine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ClientMachine").toString()));
      }
      if ((jsonObj.get("Target") != null && !jsonObj.get("Target").isJsonNull()) && !jsonObj.get("Target").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Target` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Target").toString()));
      }
      // validate the optional field `Schedule`
      if (jsonObj.get("Schedule") != null && !jsonObj.get("Schedule").isJsonNull()) {
        KeyfactorCommonSchedulingKeyfactorSchedule.validateJsonObject(jsonObj.getAsJsonObject("Schedule"));
      }
      if ((jsonObj.get("Requested") != null && !jsonObj.get("Requested").isJsonNull()) && !jsonObj.get("Requested").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Requested` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Requested").toString()));
      }
      if ((jsonObj.get("JobType") != null && !jsonObj.get("JobType").isJsonNull()) && !jsonObj.get("JobType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsOrchestratorJobsJob.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsOrchestratorJobsJob' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsOrchestratorJobsJob> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsOrchestratorJobsJob.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsOrchestratorJobsJob>() {
           @Override
           public void write(JsonWriter out, ModelsOrchestratorJobsJob value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsOrchestratorJobsJob read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsOrchestratorJobsJob given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsOrchestratorJobsJob
  * @throws IOException if the JSON string is invalid with respect to ModelsOrchestratorJobsJob
  */
  public static ModelsOrchestratorJobsJob fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsOrchestratorJobsJob.class);
  }

 /**
  * Convert an instance of ModelsOrchestratorJobsJob to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

