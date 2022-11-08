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
import com.keyfactor.command.client.model.KeyfactorApiModelsSslQuietHourRequest;
import com.keyfactor.command.client.model.KeyfactorCommonSchedulingKeyfactorSchedule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * KeyfactorApiModelsSslUpdateNetworkRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsSslUpdateNetworkRequest {
  public static final String SERIALIZED_NAME_NETWORK_ID = "NetworkId";
  @SerializedName(SERIALIZED_NAME_NETWORK_ID)
  private UUID networkId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AGENT_POOL_NAME = "AgentPoolName";
  @SerializedName(SERIALIZED_NAME_AGENT_POOL_NAME)
  private String agentPoolName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_DISCOVER_SCHEDULE = "DiscoverSchedule";
  @SerializedName(SERIALIZED_NAME_DISCOVER_SCHEDULE)
  private KeyfactorCommonSchedulingKeyfactorSchedule discoverSchedule;

  public static final String SERIALIZED_NAME_MONITOR_SCHEDULE = "MonitorSchedule";
  @SerializedName(SERIALIZED_NAME_MONITOR_SCHEDULE)
  private KeyfactorCommonSchedulingKeyfactorSchedule monitorSchedule;

  public static final String SERIALIZED_NAME_SSL_ALERT_RECIPIENTS = "SslAlertRecipients";
  @SerializedName(SERIALIZED_NAME_SSL_ALERT_RECIPIENTS)
  private List<String> sslAlertRecipients = null;

  public static final String SERIALIZED_NAME_AUTO_MONITOR = "AutoMonitor";
  @SerializedName(SERIALIZED_NAME_AUTO_MONITOR)
  private Boolean autoMonitor;

  public static final String SERIALIZED_NAME_GET_ROBOTS = "GetRobots";
  @SerializedName(SERIALIZED_NAME_GET_ROBOTS)
  private Boolean getRobots;

  public static final String SERIALIZED_NAME_DISCOVER_TIMEOUT_MS = "DiscoverTimeoutMs";
  @SerializedName(SERIALIZED_NAME_DISCOVER_TIMEOUT_MS)
  private Double discoverTimeoutMs;

  public static final String SERIALIZED_NAME_MONITOR_TIMEOUT_MS = "MonitorTimeoutMs";
  @SerializedName(SERIALIZED_NAME_MONITOR_TIMEOUT_MS)
  private Double monitorTimeoutMs;

  public static final String SERIALIZED_NAME_EXPIRATION_ALERT_DAYS = "ExpirationAlertDays";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_ALERT_DAYS)
  private Double expirationAlertDays;

  public static final String SERIALIZED_NAME_QUIET_HOURS = "QuietHours";
  @SerializedName(SERIALIZED_NAME_QUIET_HOURS)
  private List<KeyfactorApiModelsSslQuietHourRequest> quietHours = null;

  public KeyfactorApiModelsSslUpdateNetworkRequest() {
  }

  public KeyfactorApiModelsSslUpdateNetworkRequest networkId(UUID networkId) {
    
    this.networkId = networkId;
    return this;
  }

   /**
   * Get networkId
   * @return networkId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "")

  public UUID getNetworkId() {
    return networkId;
  }


  public void setNetworkId(UUID networkId) {
    this.networkId = networkId;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest agentPoolName(String agentPoolName) {
    
    this.agentPoolName = agentPoolName;
    return this;
  }

   /**
   * Get agentPoolName
   * @return agentPoolName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getAgentPoolName() {
    return agentPoolName;
  }


  public void setAgentPoolName(String agentPoolName) {
    this.agentPoolName = agentPoolName;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest discoverSchedule(KeyfactorCommonSchedulingKeyfactorSchedule discoverSchedule) {
    
    this.discoverSchedule = discoverSchedule;
    return this;
  }

   /**
   * Get discoverSchedule
   * @return discoverSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorCommonSchedulingKeyfactorSchedule getDiscoverSchedule() {
    return discoverSchedule;
  }


  public void setDiscoverSchedule(KeyfactorCommonSchedulingKeyfactorSchedule discoverSchedule) {
    this.discoverSchedule = discoverSchedule;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest monitorSchedule(KeyfactorCommonSchedulingKeyfactorSchedule monitorSchedule) {
    
    this.monitorSchedule = monitorSchedule;
    return this;
  }

   /**
   * Get monitorSchedule
   * @return monitorSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorCommonSchedulingKeyfactorSchedule getMonitorSchedule() {
    return monitorSchedule;
  }


  public void setMonitorSchedule(KeyfactorCommonSchedulingKeyfactorSchedule monitorSchedule) {
    this.monitorSchedule = monitorSchedule;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest sslAlertRecipients(List<String> sslAlertRecipients) {
    
    this.sslAlertRecipients = sslAlertRecipients;
    return this;
  }

  public KeyfactorApiModelsSslUpdateNetworkRequest addSslAlertRecipientsItem(String sslAlertRecipientsItem) {
    if (this.sslAlertRecipients == null) {
      this.sslAlertRecipients = new ArrayList<>();
    }
    this.sslAlertRecipients.add(sslAlertRecipientsItem);
    return this;
  }

   /**
   * Get sslAlertRecipients
   * @return sslAlertRecipients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSslAlertRecipients() {
    return sslAlertRecipients;
  }


  public void setSslAlertRecipients(List<String> sslAlertRecipients) {
    this.sslAlertRecipients = sslAlertRecipients;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest autoMonitor(Boolean autoMonitor) {
    
    this.autoMonitor = autoMonitor;
    return this;
  }

   /**
   * Get autoMonitor
   * @return autoMonitor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAutoMonitor() {
    return autoMonitor;
  }


  public void setAutoMonitor(Boolean autoMonitor) {
    this.autoMonitor = autoMonitor;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest getRobots(Boolean getRobots) {
    
    this.getRobots = getRobots;
    return this;
  }

   /**
   * Get getRobots
   * @return getRobots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getGetRobots() {
    return getRobots;
  }


  public void setGetRobots(Boolean getRobots) {
    this.getRobots = getRobots;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest discoverTimeoutMs(Double discoverTimeoutMs) {
    
    this.discoverTimeoutMs = discoverTimeoutMs;
    return this;
  }

   /**
   * Get discoverTimeoutMs
   * @return discoverTimeoutMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getDiscoverTimeoutMs() {
    return discoverTimeoutMs;
  }


  public void setDiscoverTimeoutMs(Double discoverTimeoutMs) {
    this.discoverTimeoutMs = discoverTimeoutMs;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest monitorTimeoutMs(Double monitorTimeoutMs) {
    
    this.monitorTimeoutMs = monitorTimeoutMs;
    return this;
  }

   /**
   * Get monitorTimeoutMs
   * @return monitorTimeoutMs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMonitorTimeoutMs() {
    return monitorTimeoutMs;
  }


  public void setMonitorTimeoutMs(Double monitorTimeoutMs) {
    this.monitorTimeoutMs = monitorTimeoutMs;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest expirationAlertDays(Double expirationAlertDays) {
    
    this.expirationAlertDays = expirationAlertDays;
    return this;
  }

   /**
   * Get expirationAlertDays
   * @return expirationAlertDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getExpirationAlertDays() {
    return expirationAlertDays;
  }


  public void setExpirationAlertDays(Double expirationAlertDays) {
    this.expirationAlertDays = expirationAlertDays;
  }


  public KeyfactorApiModelsSslUpdateNetworkRequest quietHours(List<KeyfactorApiModelsSslQuietHourRequest> quietHours) {
    
    this.quietHours = quietHours;
    return this;
  }

  public KeyfactorApiModelsSslUpdateNetworkRequest addQuietHoursItem(KeyfactorApiModelsSslQuietHourRequest quietHoursItem) {
    if (this.quietHours == null) {
      this.quietHours = new ArrayList<>();
    }
    this.quietHours.add(quietHoursItem);
    return this;
  }

   /**
   * Get quietHours
   * @return quietHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeyfactorApiModelsSslQuietHourRequest> getQuietHours() {
    return quietHours;
  }


  public void setQuietHours(List<KeyfactorApiModelsSslQuietHourRequest> quietHours) {
    this.quietHours = quietHours;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsSslUpdateNetworkRequest keyfactorApiModelsSslUpdateNetworkRequest = (KeyfactorApiModelsSslUpdateNetworkRequest) o;
    return Objects.equals(this.networkId, keyfactorApiModelsSslUpdateNetworkRequest.networkId) &&
        Objects.equals(this.name, keyfactorApiModelsSslUpdateNetworkRequest.name) &&
        Objects.equals(this.agentPoolName, keyfactorApiModelsSslUpdateNetworkRequest.agentPoolName) &&
        Objects.equals(this.description, keyfactorApiModelsSslUpdateNetworkRequest.description) &&
        Objects.equals(this.enabled, keyfactorApiModelsSslUpdateNetworkRequest.enabled) &&
        Objects.equals(this.discoverSchedule, keyfactorApiModelsSslUpdateNetworkRequest.discoverSchedule) &&
        Objects.equals(this.monitorSchedule, keyfactorApiModelsSslUpdateNetworkRequest.monitorSchedule) &&
        Objects.equals(this.sslAlertRecipients, keyfactorApiModelsSslUpdateNetworkRequest.sslAlertRecipients) &&
        Objects.equals(this.autoMonitor, keyfactorApiModelsSslUpdateNetworkRequest.autoMonitor) &&
        Objects.equals(this.getRobots, keyfactorApiModelsSslUpdateNetworkRequest.getRobots) &&
        Objects.equals(this.discoverTimeoutMs, keyfactorApiModelsSslUpdateNetworkRequest.discoverTimeoutMs) &&
        Objects.equals(this.monitorTimeoutMs, keyfactorApiModelsSslUpdateNetworkRequest.monitorTimeoutMs) &&
        Objects.equals(this.expirationAlertDays, keyfactorApiModelsSslUpdateNetworkRequest.expirationAlertDays) &&
        Objects.equals(this.quietHours, keyfactorApiModelsSslUpdateNetworkRequest.quietHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, name, agentPoolName, description, enabled, discoverSchedule, monitorSchedule, sslAlertRecipients, autoMonitor, getRobots, discoverTimeoutMs, monitorTimeoutMs, expirationAlertDays, quietHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsSslUpdateNetworkRequest {\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agentPoolName: ").append(toIndentedString(agentPoolName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    discoverSchedule: ").append(toIndentedString(discoverSchedule)).append("\n");
    sb.append("    monitorSchedule: ").append(toIndentedString(monitorSchedule)).append("\n");
    sb.append("    sslAlertRecipients: ").append(toIndentedString(sslAlertRecipients)).append("\n");
    sb.append("    autoMonitor: ").append(toIndentedString(autoMonitor)).append("\n");
    sb.append("    getRobots: ").append(toIndentedString(getRobots)).append("\n");
    sb.append("    discoverTimeoutMs: ").append(toIndentedString(discoverTimeoutMs)).append("\n");
    sb.append("    monitorTimeoutMs: ").append(toIndentedString(monitorTimeoutMs)).append("\n");
    sb.append("    expirationAlertDays: ").append(toIndentedString(expirationAlertDays)).append("\n");
    sb.append("    quietHours: ").append(toIndentedString(quietHours)).append("\n");
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
    openapiFields.add("NetworkId");
    openapiFields.add("Name");
    openapiFields.add("AgentPoolName");
    openapiFields.add("Description");
    openapiFields.add("Enabled");
    openapiFields.add("DiscoverSchedule");
    openapiFields.add("MonitorSchedule");
    openapiFields.add("SslAlertRecipients");
    openapiFields.add("AutoMonitor");
    openapiFields.add("GetRobots");
    openapiFields.add("DiscoverTimeoutMs");
    openapiFields.add("MonitorTimeoutMs");
    openapiFields.add("ExpirationAlertDays");
    openapiFields.add("QuietHours");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("NetworkId");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("AgentPoolName");
    openapiRequiredFields.add("Description");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsSslUpdateNetworkRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsSslUpdateNetworkRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsSslUpdateNetworkRequest is not found in the empty JSON string", KeyfactorApiModelsSslUpdateNetworkRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsSslUpdateNetworkRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsSslUpdateNetworkRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeyfactorApiModelsSslUpdateNetworkRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("NetworkId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetworkId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetworkId").toString()));
      }
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (!jsonObj.get("AgentPoolName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentPoolName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentPoolName").toString()));
      }
      if (!jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      // validate the optional field `DiscoverSchedule`
      if (jsonObj.get("DiscoverSchedule") != null && !jsonObj.get("DiscoverSchedule").isJsonNull()) {
        KeyfactorCommonSchedulingKeyfactorSchedule.validateJsonObject(jsonObj.getAsJsonObject("DiscoverSchedule"));
      }
      // validate the optional field `MonitorSchedule`
      if (jsonObj.get("MonitorSchedule") != null && !jsonObj.get("MonitorSchedule").isJsonNull()) {
        KeyfactorCommonSchedulingKeyfactorSchedule.validateJsonObject(jsonObj.getAsJsonObject("MonitorSchedule"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("SslAlertRecipients") != null && !jsonObj.get("SslAlertRecipients").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `SslAlertRecipients` to be an array in the JSON string but got `%s`", jsonObj.get("SslAlertRecipients").toString()));
      }
      if (jsonObj.get("QuietHours") != null && !jsonObj.get("QuietHours").isJsonNull()) {
        JsonArray jsonArrayquietHours = jsonObj.getAsJsonArray("QuietHours");
        if (jsonArrayquietHours != null) {
          // ensure the json data is an array
          if (!jsonObj.get("QuietHours").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `QuietHours` to be an array in the JSON string but got `%s`", jsonObj.get("QuietHours").toString()));
          }

          // validate the optional field `QuietHours` (array)
          for (int i = 0; i < jsonArrayquietHours.size(); i++) {
            KeyfactorApiModelsSslQuietHourRequest.validateJsonObject(jsonArrayquietHours.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsSslUpdateNetworkRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsSslUpdateNetworkRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsSslUpdateNetworkRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsSslUpdateNetworkRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsSslUpdateNetworkRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsSslUpdateNetworkRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsSslUpdateNetworkRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsSslUpdateNetworkRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsSslUpdateNetworkRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsSslUpdateNetworkRequest
  */
  public static KeyfactorApiModelsSslUpdateNetworkRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsSslUpdateNetworkRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsSslUpdateNetworkRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

