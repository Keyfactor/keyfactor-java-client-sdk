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
import java.time.OffsetDateTime;
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
 * ModelsSSLDisplayScanJobPart
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsSSLDisplayScanJobPart {
  public static final String SERIALIZED_NAME_SCAN_JOB_PART_ID = "ScanJobPartId";
  @SerializedName(SERIALIZED_NAME_SCAN_JOB_PART_ID)
  private UUID scanJobPartId;

  public static final String SERIALIZED_NAME_AGENT = "Agent";
  @SerializedName(SERIALIZED_NAME_AGENT)
  private String agent;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    StatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(Integer value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_START_TIME = "StartTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private OffsetDateTime startTime;

  public static final String SERIALIZED_NAME_END_TIME = "EndTime";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private OffsetDateTime endTime;

  public static final String SERIALIZED_NAME_ENDPOINT_COUNT = "EndpointCount";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_COUNT)
  private Integer endpointCount;

  public ModelsSSLDisplayScanJobPart() {
  }

  public ModelsSSLDisplayScanJobPart scanJobPartId(UUID scanJobPartId) {
    
    this.scanJobPartId = scanJobPartId;
    return this;
  }

   /**
   * Get scanJobPartId
   * @return scanJobPartId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getScanJobPartId() {
    return scanJobPartId;
  }


  public void setScanJobPartId(UUID scanJobPartId) {
    this.scanJobPartId = scanJobPartId;
  }


  public ModelsSSLDisplayScanJobPart agent(String agent) {
    
    this.agent = agent;
    return this;
  }

   /**
   * Get agent
   * @return agent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAgent() {
    return agent;
  }


  public void setAgent(String agent) {
    this.agent = agent;
  }


  public ModelsSSLDisplayScanJobPart status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ModelsSSLDisplayScanJobPart startTime(OffsetDateTime startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ModelsSSLDisplayScanJobPart endTime(OffsetDateTime endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public ModelsSSLDisplayScanJobPart endpointCount(Integer endpointCount) {
    
    this.endpointCount = endpointCount;
    return this;
  }

   /**
   * Get endpointCount
   * @return endpointCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEndpointCount() {
    return endpointCount;
  }


  public void setEndpointCount(Integer endpointCount) {
    this.endpointCount = endpointCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSLDisplayScanJobPart modelsSSLDisplayScanJobPart = (ModelsSSLDisplayScanJobPart) o;
    return Objects.equals(this.scanJobPartId, modelsSSLDisplayScanJobPart.scanJobPartId) &&
        Objects.equals(this.agent, modelsSSLDisplayScanJobPart.agent) &&
        Objects.equals(this.status, modelsSSLDisplayScanJobPart.status) &&
        Objects.equals(this.startTime, modelsSSLDisplayScanJobPart.startTime) &&
        Objects.equals(this.endTime, modelsSSLDisplayScanJobPart.endTime) &&
        Objects.equals(this.endpointCount, modelsSSLDisplayScanJobPart.endpointCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scanJobPartId, agent, status, startTime, endTime, endpointCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSLDisplayScanJobPart {\n");
    sb.append("    scanJobPartId: ").append(toIndentedString(scanJobPartId)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    endpointCount: ").append(toIndentedString(endpointCount)).append("\n");
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
    openapiFields.add("ScanJobPartId");
    openapiFields.add("Agent");
    openapiFields.add("Status");
    openapiFields.add("StartTime");
    openapiFields.add("EndTime");
    openapiFields.add("EndpointCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSLDisplayScanJobPart
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSLDisplayScanJobPart.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSLDisplayScanJobPart is not found in the empty JSON string", ModelsSSLDisplayScanJobPart.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSLDisplayScanJobPart.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSLDisplayScanJobPart` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ScanJobPartId") != null && !jsonObj.get("ScanJobPartId").isJsonNull()) && !jsonObj.get("ScanJobPartId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ScanJobPartId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ScanJobPartId").toString()));
      }
      if ((jsonObj.get("Agent") != null && !jsonObj.get("Agent").isJsonNull()) && !jsonObj.get("Agent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Agent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Agent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSLDisplayScanJobPart.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSLDisplayScanJobPart' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSLDisplayScanJobPart> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSLDisplayScanJobPart.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSLDisplayScanJobPart>() {
           @Override
           public void write(JsonWriter out, ModelsSSLDisplayScanJobPart value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSLDisplayScanJobPart read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSLDisplayScanJobPart given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSLDisplayScanJobPart
  * @throws IOException if the JSON string is invalid with respect to ModelsSSLDisplayScanJobPart
  */
  public static ModelsSSLDisplayScanJobPart fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSLDisplayScanJobPart.class);
  }

 /**
  * Convert an instance of ModelsSSLDisplayScanJobPart to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
