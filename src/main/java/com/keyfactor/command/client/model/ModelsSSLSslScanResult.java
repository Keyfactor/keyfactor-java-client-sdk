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
 * ModelsSSLSslScanResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsSSLSslScanResult {
  public static final String SERIALIZED_NAME_ENDPOINT_ID = "EndpointId";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_ID)
  private UUID endpointId;

  public static final String SERIALIZED_NAME_REVERSE_D_N_S = "ReverseDNS";
  @SerializedName(SERIALIZED_NAME_REVERSE_D_N_S)
  private String reverseDNS;

  public static final String SERIALIZED_NAME_SN_I_NAME = "SNIName";
  @SerializedName(SERIALIZED_NAME_SN_I_NAME)
  private String snIName;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "IpAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_CERTIFICATE_FOUND = "CertificateFound";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_FOUND)
  private Boolean certificateFound;

  public static final String SERIALIZED_NAME_AGENT_POOL_NAME = "AgentPoolName";
  @SerializedName(SERIALIZED_NAME_AGENT_POOL_NAME)
  private String agentPoolName;

  public static final String SERIALIZED_NAME_NETWORK_NAME = "NetworkName";
  @SerializedName(SERIALIZED_NAME_NETWORK_NAME)
  private String networkName;

  public static final String SERIALIZED_NAME_MONITOR_STATUS = "MonitorStatus";
  @SerializedName(SERIALIZED_NAME_MONITOR_STATUS)
  private Boolean monitorStatus;

  public static final String SERIALIZED_NAME_CERTIFICATE_C_N = "CertificateCN";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_C_N)
  private String certificateCN;

  public static final String SERIALIZED_NAME_REVIEWED = "Reviewed";
  @SerializedName(SERIALIZED_NAME_REVIEWED)
  private Boolean reviewed;

  public ModelsSSLSslScanResult() {
  }

  public ModelsSSLSslScanResult endpointId(UUID endpointId) {
    
    this.endpointId = endpointId;
    return this;
  }

   /**
   * Get endpointId
   * @return endpointId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getEndpointId() {
    return endpointId;
  }


  public void setEndpointId(UUID endpointId) {
    this.endpointId = endpointId;
  }


  public ModelsSSLSslScanResult reverseDNS(String reverseDNS) {
    
    this.reverseDNS = reverseDNS;
    return this;
  }

   /**
   * Get reverseDNS
   * @return reverseDNS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReverseDNS() {
    return reverseDNS;
  }


  public void setReverseDNS(String reverseDNS) {
    this.reverseDNS = reverseDNS;
  }


  public ModelsSSLSslScanResult snIName(String snIName) {
    
    this.snIName = snIName;
    return this;
  }

   /**
   * Get snIName
   * @return snIName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSnIName() {
    return snIName;
  }


  public void setSnIName(String snIName) {
    this.snIName = snIName;
  }


  public ModelsSSLSslScanResult ipAddress(String ipAddress) {
    
    this.ipAddress = ipAddress;
    return this;
  }

   /**
   * Get ipAddress
   * @return ipAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIpAddress() {
    return ipAddress;
  }


  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public ModelsSSLSslScanResult port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }


  public ModelsSSLSslScanResult certificateFound(Boolean certificateFound) {
    
    this.certificateFound = certificateFound;
    return this;
  }

   /**
   * Get certificateFound
   * @return certificateFound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCertificateFound() {
    return certificateFound;
  }


  public void setCertificateFound(Boolean certificateFound) {
    this.certificateFound = certificateFound;
  }


  public ModelsSSLSslScanResult agentPoolName(String agentPoolName) {
    
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


  public ModelsSSLSslScanResult networkName(String networkName) {
    
    this.networkName = networkName;
    return this;
  }

   /**
   * Get networkName
   * @return networkName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNetworkName() {
    return networkName;
  }


  public void setNetworkName(String networkName) {
    this.networkName = networkName;
  }


  public ModelsSSLSslScanResult monitorStatus(Boolean monitorStatus) {
    
    this.monitorStatus = monitorStatus;
    return this;
  }

   /**
   * Get monitorStatus
   * @return monitorStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMonitorStatus() {
    return monitorStatus;
  }


  public void setMonitorStatus(Boolean monitorStatus) {
    this.monitorStatus = monitorStatus;
  }


  public ModelsSSLSslScanResult certificateCN(String certificateCN) {
    
    this.certificateCN = certificateCN;
    return this;
  }

   /**
   * Get certificateCN
   * @return certificateCN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateCN() {
    return certificateCN;
  }


  public void setCertificateCN(String certificateCN) {
    this.certificateCN = certificateCN;
  }


  public ModelsSSLSslScanResult reviewed(Boolean reviewed) {
    
    this.reviewed = reviewed;
    return this;
  }

   /**
   * Get reviewed
   * @return reviewed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReviewed() {
    return reviewed;
  }


  public void setReviewed(Boolean reviewed) {
    this.reviewed = reviewed;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSLSslScanResult modelsSSLSslScanResult = (ModelsSSLSslScanResult) o;
    return Objects.equals(this.endpointId, modelsSSLSslScanResult.endpointId) &&
        Objects.equals(this.reverseDNS, modelsSSLSslScanResult.reverseDNS) &&
        Objects.equals(this.snIName, modelsSSLSslScanResult.snIName) &&
        Objects.equals(this.ipAddress, modelsSSLSslScanResult.ipAddress) &&
        Objects.equals(this.port, modelsSSLSslScanResult.port) &&
        Objects.equals(this.certificateFound, modelsSSLSslScanResult.certificateFound) &&
        Objects.equals(this.agentPoolName, modelsSSLSslScanResult.agentPoolName) &&
        Objects.equals(this.networkName, modelsSSLSslScanResult.networkName) &&
        Objects.equals(this.monitorStatus, modelsSSLSslScanResult.monitorStatus) &&
        Objects.equals(this.certificateCN, modelsSSLSslScanResult.certificateCN) &&
        Objects.equals(this.reviewed, modelsSSLSslScanResult.reviewed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointId, reverseDNS, snIName, ipAddress, port, certificateFound, agentPoolName, networkName, monitorStatus, certificateCN, reviewed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSLSslScanResult {\n");
    sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
    sb.append("    reverseDNS: ").append(toIndentedString(reverseDNS)).append("\n");
    sb.append("    snIName: ").append(toIndentedString(snIName)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    certificateFound: ").append(toIndentedString(certificateFound)).append("\n");
    sb.append("    agentPoolName: ").append(toIndentedString(agentPoolName)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
    sb.append("    monitorStatus: ").append(toIndentedString(monitorStatus)).append("\n");
    sb.append("    certificateCN: ").append(toIndentedString(certificateCN)).append("\n");
    sb.append("    reviewed: ").append(toIndentedString(reviewed)).append("\n");
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
    openapiFields.add("EndpointId");
    openapiFields.add("ReverseDNS");
    openapiFields.add("SNIName");
    openapiFields.add("IpAddress");
    openapiFields.add("Port");
    openapiFields.add("CertificateFound");
    openapiFields.add("AgentPoolName");
    openapiFields.add("NetworkName");
    openapiFields.add("MonitorStatus");
    openapiFields.add("CertificateCN");
    openapiFields.add("Reviewed");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSLSslScanResult
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSLSslScanResult.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSLSslScanResult is not found in the empty JSON string", ModelsSSLSslScanResult.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSLSslScanResult.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSLSslScanResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("EndpointId") != null && !jsonObj.get("EndpointId").isJsonNull()) && !jsonObj.get("EndpointId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EndpointId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EndpointId").toString()));
      }
      if ((jsonObj.get("ReverseDNS") != null && !jsonObj.get("ReverseDNS").isJsonNull()) && !jsonObj.get("ReverseDNS").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ReverseDNS` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ReverseDNS").toString()));
      }
      if ((jsonObj.get("SNIName") != null && !jsonObj.get("SNIName").isJsonNull()) && !jsonObj.get("SNIName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SNIName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SNIName").toString()));
      }
      if ((jsonObj.get("IpAddress") != null && !jsonObj.get("IpAddress").isJsonNull()) && !jsonObj.get("IpAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IpAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IpAddress").toString()));
      }
      if ((jsonObj.get("AgentPoolName") != null && !jsonObj.get("AgentPoolName").isJsonNull()) && !jsonObj.get("AgentPoolName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentPoolName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentPoolName").toString()));
      }
      if ((jsonObj.get("NetworkName") != null && !jsonObj.get("NetworkName").isJsonNull()) && !jsonObj.get("NetworkName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetworkName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetworkName").toString()));
      }
      if ((jsonObj.get("CertificateCN") != null && !jsonObj.get("CertificateCN").isJsonNull()) && !jsonObj.get("CertificateCN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CertificateCN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CertificateCN").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSLSslScanResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSLSslScanResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSLSslScanResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSLSslScanResult.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSLSslScanResult>() {
           @Override
           public void write(JsonWriter out, ModelsSSLSslScanResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSLSslScanResult read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSLSslScanResult given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSLSslScanResult
  * @throws IOException if the JSON string is invalid with respect to ModelsSSLSslScanResult
  */
  public static ModelsSSLSslScanResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSLSslScanResult.class);
  }

 /**
  * Convert an instance of ModelsSSLSslScanResult to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

