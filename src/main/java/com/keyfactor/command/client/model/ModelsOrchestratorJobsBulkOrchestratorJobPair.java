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
 * ModelsOrchestratorJobsBulkOrchestratorJobPair
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsOrchestratorJobsBulkOrchestratorJobPair {
  public static final String SERIALIZED_NAME_JOB_ID = "JobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private UUID jobId;

  public static final String SERIALIZED_NAME_ORCHESTRATOR_ID = "OrchestratorId";
  @SerializedName(SERIALIZED_NAME_ORCHESTRATOR_ID)
  private UUID orchestratorId;

  public ModelsOrchestratorJobsBulkOrchestratorJobPair() {
  }

  public ModelsOrchestratorJobsBulkOrchestratorJobPair jobId(UUID jobId) {
    
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


  public ModelsOrchestratorJobsBulkOrchestratorJobPair orchestratorId(UUID orchestratorId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsOrchestratorJobsBulkOrchestratorJobPair modelsOrchestratorJobsBulkOrchestratorJobPair = (ModelsOrchestratorJobsBulkOrchestratorJobPair) o;
    return Objects.equals(this.jobId, modelsOrchestratorJobsBulkOrchestratorJobPair.jobId) &&
        Objects.equals(this.orchestratorId, modelsOrchestratorJobsBulkOrchestratorJobPair.orchestratorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, orchestratorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsOrchestratorJobsBulkOrchestratorJobPair {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    orchestratorId: ").append(toIndentedString(orchestratorId)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsOrchestratorJobsBulkOrchestratorJobPair
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsOrchestratorJobsBulkOrchestratorJobPair.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsOrchestratorJobsBulkOrchestratorJobPair is not found in the empty JSON string", ModelsOrchestratorJobsBulkOrchestratorJobPair.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsOrchestratorJobsBulkOrchestratorJobPair.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsOrchestratorJobsBulkOrchestratorJobPair` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("JobId") != null && !jsonObj.get("JobId").isJsonNull()) && !jsonObj.get("JobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobId").toString()));
      }
      if ((jsonObj.get("OrchestratorId") != null && !jsonObj.get("OrchestratorId").isJsonNull()) && !jsonObj.get("OrchestratorId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OrchestratorId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OrchestratorId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsOrchestratorJobsBulkOrchestratorJobPair.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsOrchestratorJobsBulkOrchestratorJobPair' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsOrchestratorJobsBulkOrchestratorJobPair> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsOrchestratorJobsBulkOrchestratorJobPair.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsOrchestratorJobsBulkOrchestratorJobPair>() {
           @Override
           public void write(JsonWriter out, ModelsOrchestratorJobsBulkOrchestratorJobPair value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsOrchestratorJobsBulkOrchestratorJobPair read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsOrchestratorJobsBulkOrchestratorJobPair given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsOrchestratorJobsBulkOrchestratorJobPair
  * @throws IOException if the JSON string is invalid with respect to ModelsOrchestratorJobsBulkOrchestratorJobPair
  */
  public static ModelsOrchestratorJobsBulkOrchestratorJobPair fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsOrchestratorJobsBulkOrchestratorJobPair.class);
  }

 /**
  * Convert an instance of ModelsOrchestratorJobsBulkOrchestratorJobPair to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

