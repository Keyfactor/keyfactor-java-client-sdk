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
import com.keyfactor.command.client.model.KeyfactorApiModelsSslQuietHourResponse;
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
 * KeyfactorApiModelsSslNetworkResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsSslNetworkResponse {
  public static final String SERIALIZED_NAME_NETWORK_ID = "NetworkId";
  @SerializedName(SERIALIZED_NAME_NETWORK_ID)
  private UUID networkId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_AGENT_POOL_NAME = "AgentPoolName";
  @SerializedName(SERIALIZED_NAME_AGENT_POOL_NAME)
  private String agentPoolName;

  public static final String SERIALIZED_NAME_AGENT_POOL_ID = "AgentPoolId";
  @SerializedName(SERIALIZED_NAME_AGENT_POOL_ID)
  private UUID agentPoolId;

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

  public static final String SERIALIZED_NAME_DISCOVER_PERCENT_COMPLETE = "DiscoverPercentComplete";
  @SerializedName(SERIALIZED_NAME_DISCOVER_PERCENT_COMPLETE)
  private Double discoverPercentComplete;

  public static final String SERIALIZED_NAME_MONITOR_PERCENT_COMPLETE = "MonitorPercentComplete";
  @SerializedName(SERIALIZED_NAME_MONITOR_PERCENT_COMPLETE)
  private Double monitorPercentComplete;

  /**
   * Gets or Sets discoverStatus
   */
  @JsonAdapter(DiscoverStatusEnum.Adapter.class)
  public enum DiscoverStatusEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

    private Integer value;

    DiscoverStatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DiscoverStatusEnum fromValue(Integer value) {
      for (DiscoverStatusEnum b : DiscoverStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DiscoverStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DiscoverStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DiscoverStatusEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DiscoverStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DISCOVER_STATUS = "DiscoverStatus";
  @SerializedName(SERIALIZED_NAME_DISCOVER_STATUS)
  private DiscoverStatusEnum discoverStatus;

  /**
   * Gets or Sets monitorStatus
   */
  @JsonAdapter(MonitorStatusEnum.Adapter.class)
  public enum MonitorStatusEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6);

    private Integer value;

    MonitorStatusEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonitorStatusEnum fromValue(Integer value) {
      for (MonitorStatusEnum b : MonitorStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<MonitorStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonitorStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonitorStatusEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return MonitorStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_MONITOR_STATUS = "MonitorStatus";
  @SerializedName(SERIALIZED_NAME_MONITOR_STATUS)
  private MonitorStatusEnum monitorStatus;

  public static final String SERIALIZED_NAME_DISCOVER_LAST_SCANNED = "DiscoverLastScanned";
  @SerializedName(SERIALIZED_NAME_DISCOVER_LAST_SCANNED)
  private OffsetDateTime discoverLastScanned;

  public static final String SERIALIZED_NAME_MONITOR_LAST_SCANNED = "MonitorLastScanned";
  @SerializedName(SERIALIZED_NAME_MONITOR_LAST_SCANNED)
  private OffsetDateTime monitorLastScanned;

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

  public static final String SERIALIZED_NAME_DISCOVER_JOB_PARTS = "DiscoverJobParts";
  @SerializedName(SERIALIZED_NAME_DISCOVER_JOB_PARTS)
  private Integer discoverJobParts;

  public static final String SERIALIZED_NAME_MONITOR_JOB_PARTS = "MonitorJobParts";
  @SerializedName(SERIALIZED_NAME_MONITOR_JOB_PARTS)
  private Integer monitorJobParts;

  public static final String SERIALIZED_NAME_QUIET_HOURS = "QuietHours";
  @SerializedName(SERIALIZED_NAME_QUIET_HOURS)
  private List<KeyfactorApiModelsSslQuietHourResponse> quietHours = null;

  public KeyfactorApiModelsSslNetworkResponse() {
  }

  public KeyfactorApiModelsSslNetworkResponse networkId(UUID networkId) {
    
    this.networkId = networkId;
    return this;
  }

   /**
   * Get networkId
   * @return networkId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getNetworkId() {
    return networkId;
  }


  public void setNetworkId(UUID networkId) {
    this.networkId = networkId;
  }


  public KeyfactorApiModelsSslNetworkResponse name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public KeyfactorApiModelsSslNetworkResponse agentPoolName(String agentPoolName) {
    
    this.agentPoolName = agentPoolName;
    return this;
  }

   /**
   * Get agentPoolName
   * @return agentPoolName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAgentPoolName() {
    return agentPoolName;
  }


  public void setAgentPoolName(String agentPoolName) {
    this.agentPoolName = agentPoolName;
  }


  public KeyfactorApiModelsSslNetworkResponse agentPoolId(UUID agentPoolId) {
    
    this.agentPoolId = agentPoolId;
    return this;
  }

   /**
   * Get agentPoolId
   * @return agentPoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getAgentPoolId() {
    return agentPoolId;
  }


  public void setAgentPoolId(UUID agentPoolId) {
    this.agentPoolId = agentPoolId;
  }


  public KeyfactorApiModelsSslNetworkResponse description(String description) {
    
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


  public KeyfactorApiModelsSslNetworkResponse enabled(Boolean enabled) {
    
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


  public KeyfactorApiModelsSslNetworkResponse discoverSchedule(KeyfactorCommonSchedulingKeyfactorSchedule discoverSchedule) {
    
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


  public KeyfactorApiModelsSslNetworkResponse monitorSchedule(KeyfactorCommonSchedulingKeyfactorSchedule monitorSchedule) {
    
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


  public KeyfactorApiModelsSslNetworkResponse discoverPercentComplete(Double discoverPercentComplete) {
    
    this.discoverPercentComplete = discoverPercentComplete;
    return this;
  }

   /**
   * Get discoverPercentComplete
   * @return discoverPercentComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getDiscoverPercentComplete() {
    return discoverPercentComplete;
  }


  public void setDiscoverPercentComplete(Double discoverPercentComplete) {
    this.discoverPercentComplete = discoverPercentComplete;
  }


  public KeyfactorApiModelsSslNetworkResponse monitorPercentComplete(Double monitorPercentComplete) {
    
    this.monitorPercentComplete = monitorPercentComplete;
    return this;
  }

   /**
   * Get monitorPercentComplete
   * @return monitorPercentComplete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getMonitorPercentComplete() {
    return monitorPercentComplete;
  }


  public void setMonitorPercentComplete(Double monitorPercentComplete) {
    this.monitorPercentComplete = monitorPercentComplete;
  }


  public KeyfactorApiModelsSslNetworkResponse discoverStatus(DiscoverStatusEnum discoverStatus) {
    
    this.discoverStatus = discoverStatus;
    return this;
  }

   /**
   * Get discoverStatus
   * @return discoverStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiscoverStatusEnum getDiscoverStatus() {
    return discoverStatus;
  }


  public void setDiscoverStatus(DiscoverStatusEnum discoverStatus) {
    this.discoverStatus = discoverStatus;
  }


  public KeyfactorApiModelsSslNetworkResponse monitorStatus(MonitorStatusEnum monitorStatus) {
    
    this.monitorStatus = monitorStatus;
    return this;
  }

   /**
   * Get monitorStatus
   * @return monitorStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MonitorStatusEnum getMonitorStatus() {
    return monitorStatus;
  }


  public void setMonitorStatus(MonitorStatusEnum monitorStatus) {
    this.monitorStatus = monitorStatus;
  }


  public KeyfactorApiModelsSslNetworkResponse discoverLastScanned(OffsetDateTime discoverLastScanned) {
    
    this.discoverLastScanned = discoverLastScanned;
    return this;
  }

   /**
   * Get discoverLastScanned
   * @return discoverLastScanned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getDiscoverLastScanned() {
    return discoverLastScanned;
  }


  public void setDiscoverLastScanned(OffsetDateTime discoverLastScanned) {
    this.discoverLastScanned = discoverLastScanned;
  }


  public KeyfactorApiModelsSslNetworkResponse monitorLastScanned(OffsetDateTime monitorLastScanned) {
    
    this.monitorLastScanned = monitorLastScanned;
    return this;
  }

   /**
   * Get monitorLastScanned
   * @return monitorLastScanned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getMonitorLastScanned() {
    return monitorLastScanned;
  }


  public void setMonitorLastScanned(OffsetDateTime monitorLastScanned) {
    this.monitorLastScanned = monitorLastScanned;
  }


  public KeyfactorApiModelsSslNetworkResponse sslAlertRecipients(List<String> sslAlertRecipients) {
    
    this.sslAlertRecipients = sslAlertRecipients;
    return this;
  }

  public KeyfactorApiModelsSslNetworkResponse addSslAlertRecipientsItem(String sslAlertRecipientsItem) {
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


  public KeyfactorApiModelsSslNetworkResponse autoMonitor(Boolean autoMonitor) {
    
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


  public KeyfactorApiModelsSslNetworkResponse getRobots(Boolean getRobots) {
    
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


  public KeyfactorApiModelsSslNetworkResponse discoverTimeoutMs(Double discoverTimeoutMs) {
    
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


  public KeyfactorApiModelsSslNetworkResponse monitorTimeoutMs(Double monitorTimeoutMs) {
    
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


  public KeyfactorApiModelsSslNetworkResponse expirationAlertDays(Double expirationAlertDays) {
    
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


  public KeyfactorApiModelsSslNetworkResponse discoverJobParts(Integer discoverJobParts) {
    
    this.discoverJobParts = discoverJobParts;
    return this;
  }

   /**
   * Get discoverJobParts
   * @return discoverJobParts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiscoverJobParts() {
    return discoverJobParts;
  }


  public void setDiscoverJobParts(Integer discoverJobParts) {
    this.discoverJobParts = discoverJobParts;
  }


  public KeyfactorApiModelsSslNetworkResponse monitorJobParts(Integer monitorJobParts) {
    
    this.monitorJobParts = monitorJobParts;
    return this;
  }

   /**
   * Get monitorJobParts
   * @return monitorJobParts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMonitorJobParts() {
    return monitorJobParts;
  }


  public void setMonitorJobParts(Integer monitorJobParts) {
    this.monitorJobParts = monitorJobParts;
  }


  public KeyfactorApiModelsSslNetworkResponse quietHours(List<KeyfactorApiModelsSslQuietHourResponse> quietHours) {
    
    this.quietHours = quietHours;
    return this;
  }

  public KeyfactorApiModelsSslNetworkResponse addQuietHoursItem(KeyfactorApiModelsSslQuietHourResponse quietHoursItem) {
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

  public List<KeyfactorApiModelsSslQuietHourResponse> getQuietHours() {
    return quietHours;
  }


  public void setQuietHours(List<KeyfactorApiModelsSslQuietHourResponse> quietHours) {
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
    KeyfactorApiModelsSslNetworkResponse keyfactorApiModelsSslNetworkResponse = (KeyfactorApiModelsSslNetworkResponse) o;
    return Objects.equals(this.networkId, keyfactorApiModelsSslNetworkResponse.networkId) &&
        Objects.equals(this.name, keyfactorApiModelsSslNetworkResponse.name) &&
        Objects.equals(this.agentPoolName, keyfactorApiModelsSslNetworkResponse.agentPoolName) &&
        Objects.equals(this.agentPoolId, keyfactorApiModelsSslNetworkResponse.agentPoolId) &&
        Objects.equals(this.description, keyfactorApiModelsSslNetworkResponse.description) &&
        Objects.equals(this.enabled, keyfactorApiModelsSslNetworkResponse.enabled) &&
        Objects.equals(this.discoverSchedule, keyfactorApiModelsSslNetworkResponse.discoverSchedule) &&
        Objects.equals(this.monitorSchedule, keyfactorApiModelsSslNetworkResponse.monitorSchedule) &&
        Objects.equals(this.discoverPercentComplete, keyfactorApiModelsSslNetworkResponse.discoverPercentComplete) &&
        Objects.equals(this.monitorPercentComplete, keyfactorApiModelsSslNetworkResponse.monitorPercentComplete) &&
        Objects.equals(this.discoverStatus, keyfactorApiModelsSslNetworkResponse.discoverStatus) &&
        Objects.equals(this.monitorStatus, keyfactorApiModelsSslNetworkResponse.monitorStatus) &&
        Objects.equals(this.discoverLastScanned, keyfactorApiModelsSslNetworkResponse.discoverLastScanned) &&
        Objects.equals(this.monitorLastScanned, keyfactorApiModelsSslNetworkResponse.monitorLastScanned) &&
        Objects.equals(this.sslAlertRecipients, keyfactorApiModelsSslNetworkResponse.sslAlertRecipients) &&
        Objects.equals(this.autoMonitor, keyfactorApiModelsSslNetworkResponse.autoMonitor) &&
        Objects.equals(this.getRobots, keyfactorApiModelsSslNetworkResponse.getRobots) &&
        Objects.equals(this.discoverTimeoutMs, keyfactorApiModelsSslNetworkResponse.discoverTimeoutMs) &&
        Objects.equals(this.monitorTimeoutMs, keyfactorApiModelsSslNetworkResponse.monitorTimeoutMs) &&
        Objects.equals(this.expirationAlertDays, keyfactorApiModelsSslNetworkResponse.expirationAlertDays) &&
        Objects.equals(this.discoverJobParts, keyfactorApiModelsSslNetworkResponse.discoverJobParts) &&
        Objects.equals(this.monitorJobParts, keyfactorApiModelsSslNetworkResponse.monitorJobParts) &&
        Objects.equals(this.quietHours, keyfactorApiModelsSslNetworkResponse.quietHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkId, name, agentPoolName, agentPoolId, description, enabled, discoverSchedule, monitorSchedule, discoverPercentComplete, monitorPercentComplete, discoverStatus, monitorStatus, discoverLastScanned, monitorLastScanned, sslAlertRecipients, autoMonitor, getRobots, discoverTimeoutMs, monitorTimeoutMs, expirationAlertDays, discoverJobParts, monitorJobParts, quietHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsSslNetworkResponse {\n");
    sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    agentPoolName: ").append(toIndentedString(agentPoolName)).append("\n");
    sb.append("    agentPoolId: ").append(toIndentedString(agentPoolId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    discoverSchedule: ").append(toIndentedString(discoverSchedule)).append("\n");
    sb.append("    monitorSchedule: ").append(toIndentedString(monitorSchedule)).append("\n");
    sb.append("    discoverPercentComplete: ").append(toIndentedString(discoverPercentComplete)).append("\n");
    sb.append("    monitorPercentComplete: ").append(toIndentedString(monitorPercentComplete)).append("\n");
    sb.append("    discoverStatus: ").append(toIndentedString(discoverStatus)).append("\n");
    sb.append("    monitorStatus: ").append(toIndentedString(monitorStatus)).append("\n");
    sb.append("    discoverLastScanned: ").append(toIndentedString(discoverLastScanned)).append("\n");
    sb.append("    monitorLastScanned: ").append(toIndentedString(monitorLastScanned)).append("\n");
    sb.append("    sslAlertRecipients: ").append(toIndentedString(sslAlertRecipients)).append("\n");
    sb.append("    autoMonitor: ").append(toIndentedString(autoMonitor)).append("\n");
    sb.append("    getRobots: ").append(toIndentedString(getRobots)).append("\n");
    sb.append("    discoverTimeoutMs: ").append(toIndentedString(discoverTimeoutMs)).append("\n");
    sb.append("    monitorTimeoutMs: ").append(toIndentedString(monitorTimeoutMs)).append("\n");
    sb.append("    expirationAlertDays: ").append(toIndentedString(expirationAlertDays)).append("\n");
    sb.append("    discoverJobParts: ").append(toIndentedString(discoverJobParts)).append("\n");
    sb.append("    monitorJobParts: ").append(toIndentedString(monitorJobParts)).append("\n");
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
    openapiFields.add("AgentPoolId");
    openapiFields.add("Description");
    openapiFields.add("Enabled");
    openapiFields.add("DiscoverSchedule");
    openapiFields.add("MonitorSchedule");
    openapiFields.add("DiscoverPercentComplete");
    openapiFields.add("MonitorPercentComplete");
    openapiFields.add("DiscoverStatus");
    openapiFields.add("MonitorStatus");
    openapiFields.add("DiscoverLastScanned");
    openapiFields.add("MonitorLastScanned");
    openapiFields.add("SslAlertRecipients");
    openapiFields.add("AutoMonitor");
    openapiFields.add("GetRobots");
    openapiFields.add("DiscoverTimeoutMs");
    openapiFields.add("MonitorTimeoutMs");
    openapiFields.add("ExpirationAlertDays");
    openapiFields.add("DiscoverJobParts");
    openapiFields.add("MonitorJobParts");
    openapiFields.add("QuietHours");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsSslNetworkResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsSslNetworkResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsSslNetworkResponse is not found in the empty JSON string", KeyfactorApiModelsSslNetworkResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsSslNetworkResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsSslNetworkResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("NetworkId") != null && !jsonObj.get("NetworkId").isJsonNull()) && !jsonObj.get("NetworkId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetworkId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetworkId").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("AgentPoolName") != null && !jsonObj.get("AgentPoolName").isJsonNull()) && !jsonObj.get("AgentPoolName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentPoolName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentPoolName").toString()));
      }
      if ((jsonObj.get("AgentPoolId") != null && !jsonObj.get("AgentPoolId").isJsonNull()) && !jsonObj.get("AgentPoolId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentPoolId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentPoolId").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
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
            KeyfactorApiModelsSslQuietHourResponse.validateJsonObject(jsonArrayquietHours.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsSslNetworkResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsSslNetworkResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsSslNetworkResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsSslNetworkResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsSslNetworkResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsSslNetworkResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsSslNetworkResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsSslNetworkResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsSslNetworkResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsSslNetworkResponse
  */
  public static KeyfactorApiModelsSslNetworkResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsSslNetworkResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsSslNetworkResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

