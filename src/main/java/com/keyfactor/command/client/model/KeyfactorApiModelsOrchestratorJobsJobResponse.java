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
import com.keyfactor.command.client.model.KeyfactorApiModelsOrchestratorJobsJobFieldResponse;
import com.keyfactor.command.client.model.KeyfactorCommonSchedulingKeyfactorSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * KeyfactorApiModelsOrchestratorJobsJobResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsOrchestratorJobsJobResponse {
  public static final String SERIALIZED_NAME_JOB_ID = "JobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private UUID jobId;

  public static final String SERIALIZED_NAME_ORCHESTRATOR_ID = "OrchestratorId";
  @SerializedName(SERIALIZED_NAME_ORCHESTRATOR_ID)
  private UUID orchestratorId;

  public static final String SERIALIZED_NAME_JOB_TYPE_NAME = "JobTypeName";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE_NAME)
  private String jobTypeName;

  public static final String SERIALIZED_NAME_SCHEDULE = "Schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private KeyfactorCommonSchedulingKeyfactorSchedule schedule;

  public static final String SERIALIZED_NAME_JOB_FIELDS = "JobFields";
  @SerializedName(SERIALIZED_NAME_JOB_FIELDS)
  private List<KeyfactorApiModelsOrchestratorJobsJobFieldResponse> jobFields = null;

  public static final String SERIALIZED_NAME_REQUEST_TIMESTAMP = "RequestTimestamp";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIMESTAMP)
  private OffsetDateTime requestTimestamp;

  public KeyfactorApiModelsOrchestratorJobsJobResponse() {
  }

  public KeyfactorApiModelsOrchestratorJobsJobResponse jobId(UUID jobId) {
    
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getJobId() {
    return jobId;
  }


  public void setJobId(UUID jobId) {
    this.jobId = jobId;
  }


  public KeyfactorApiModelsOrchestratorJobsJobResponse orchestratorId(UUID orchestratorId) {
    
    this.orchestratorId = orchestratorId;
    return this;
  }

   /**
   * Get orchestratorId
   * @return orchestratorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getOrchestratorId() {
    return orchestratorId;
  }


  public void setOrchestratorId(UUID orchestratorId) {
    this.orchestratorId = orchestratorId;
  }


  public KeyfactorApiModelsOrchestratorJobsJobResponse jobTypeName(String jobTypeName) {
    
    this.jobTypeName = jobTypeName;
    return this;
  }

   /**
   * Get jobTypeName
   * @return jobTypeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobTypeName() {
    return jobTypeName;
  }


  public void setJobTypeName(String jobTypeName) {
    this.jobTypeName = jobTypeName;
  }


  public KeyfactorApiModelsOrchestratorJobsJobResponse schedule(KeyfactorCommonSchedulingKeyfactorSchedule schedule) {
    
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


  public KeyfactorApiModelsOrchestratorJobsJobResponse jobFields(List<KeyfactorApiModelsOrchestratorJobsJobFieldResponse> jobFields) {
    
    this.jobFields = jobFields;
    return this;
  }

  public KeyfactorApiModelsOrchestratorJobsJobResponse addJobFieldsItem(KeyfactorApiModelsOrchestratorJobsJobFieldResponse jobFieldsItem) {
    if (this.jobFields == null) {
      this.jobFields = new ArrayList<>();
    }
    this.jobFields.add(jobFieldsItem);
    return this;
  }

   /**
   * Get jobFields
   * @return jobFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeyfactorApiModelsOrchestratorJobsJobFieldResponse> getJobFields() {
    return jobFields;
  }


  public void setJobFields(List<KeyfactorApiModelsOrchestratorJobsJobFieldResponse> jobFields) {
    this.jobFields = jobFields;
  }


  public KeyfactorApiModelsOrchestratorJobsJobResponse requestTimestamp(OffsetDateTime requestTimestamp) {
    
    this.requestTimestamp = requestTimestamp;
    return this;
  }

   /**
   * Get requestTimestamp
   * @return requestTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getRequestTimestamp() {
    return requestTimestamp;
  }


  public void setRequestTimestamp(OffsetDateTime requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsOrchestratorJobsJobResponse keyfactorApiModelsOrchestratorJobsJobResponse = (KeyfactorApiModelsOrchestratorJobsJobResponse) o;
    return Objects.equals(this.jobId, keyfactorApiModelsOrchestratorJobsJobResponse.jobId) &&
        Objects.equals(this.orchestratorId, keyfactorApiModelsOrchestratorJobsJobResponse.orchestratorId) &&
        Objects.equals(this.jobTypeName, keyfactorApiModelsOrchestratorJobsJobResponse.jobTypeName) &&
        Objects.equals(this.schedule, keyfactorApiModelsOrchestratorJobsJobResponse.schedule) &&
        Objects.equals(this.jobFields, keyfactorApiModelsOrchestratorJobsJobResponse.jobFields) &&
        Objects.equals(this.requestTimestamp, keyfactorApiModelsOrchestratorJobsJobResponse.requestTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, orchestratorId, jobTypeName, schedule, jobFields, requestTimestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsOrchestratorJobsJobResponse {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    orchestratorId: ").append(toIndentedString(orchestratorId)).append("\n");
    sb.append("    jobTypeName: ").append(toIndentedString(jobTypeName)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    jobFields: ").append(toIndentedString(jobFields)).append("\n");
    sb.append("    requestTimestamp: ").append(toIndentedString(requestTimestamp)).append("\n");
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
    openapiFields.add("JobId");
    openapiFields.add("OrchestratorId");
    openapiFields.add("JobTypeName");
    openapiFields.add("Schedule");
    openapiFields.add("JobFields");
    openapiFields.add("RequestTimestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsOrchestratorJobsJobResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsOrchestratorJobsJobResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsOrchestratorJobsJobResponse is not found in the empty JSON string", KeyfactorApiModelsOrchestratorJobsJobResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsOrchestratorJobsJobResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsOrchestratorJobsJobResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("JobId") != null && !jsonObj.get("JobId").isJsonNull()) && !jsonObj.get("JobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobId").toString()));
      }
      if ((jsonObj.get("OrchestratorId") != null && !jsonObj.get("OrchestratorId").isJsonNull()) && !jsonObj.get("OrchestratorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OrchestratorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OrchestratorId").toString()));
      }
      if ((jsonObj.get("JobTypeName") != null && !jsonObj.get("JobTypeName").isJsonNull()) && !jsonObj.get("JobTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobTypeName").toString()));
      }
      // validate the optional field `Schedule`
      if (jsonObj.get("Schedule") != null && !jsonObj.get("Schedule").isJsonNull()) {
        KeyfactorCommonSchedulingKeyfactorSchedule.validateJsonObject(jsonObj.getAsJsonObject("Schedule"));
      }
      if (jsonObj.get("JobFields") != null && !jsonObj.get("JobFields").isJsonNull()) {
        JsonArray jsonArrayjobFields = jsonObj.getAsJsonArray("JobFields");
        if (jsonArrayjobFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("JobFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `JobFields` to be an array in the JSON string but got `%s`", jsonObj.get("JobFields").toString()));
          }

          // validate the optional field `JobFields` (array)
          for (int i = 0; i < jsonArrayjobFields.size(); i++) {
            KeyfactorApiModelsOrchestratorJobsJobFieldResponse.validateJsonObject(jsonArrayjobFields.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsOrchestratorJobsJobResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsOrchestratorJobsJobResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsOrchestratorJobsJobResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsOrchestratorJobsJobResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsOrchestratorJobsJobResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsOrchestratorJobsJobResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsOrchestratorJobsJobResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsOrchestratorJobsJobResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsOrchestratorJobsJobResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsOrchestratorJobsJobResponse
  */
  public static KeyfactorApiModelsOrchestratorJobsJobResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsOrchestratorJobsJobResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsOrchestratorJobsJobResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
