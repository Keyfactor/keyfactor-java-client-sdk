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
 * ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel {
  public static final String SERIALIZED_NAME_STORE_PATH = "StorePath";
  @SerializedName(SERIALIZED_NAME_STORE_PATH)
  private String storePath;

  public static final String SERIALIZED_NAME_AGENT_POOL = "AgentPool";
  @SerializedName(SERIALIZED_NAME_AGENT_POOL)
  private String agentPool;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "IPAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_NETWORK_NAME = "NetworkName";
  @SerializedName(SERIALIZED_NAME_NETWORK_NAME)
  private String networkName;

  public ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel() {
  }

  public ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel storePath(String storePath) {
    
    this.storePath = storePath;
    return this;
  }

   /**
   * Get storePath
   * @return storePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorePath() {
    return storePath;
  }


  public void setStorePath(String storePath) {
    this.storePath = storePath;
  }


  public ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel agentPool(String agentPool) {
    
    this.agentPool = agentPool;
    return this;
  }

   /**
   * Get agentPool
   * @return agentPool
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAgentPool() {
    return agentPool;
  }


  public void setAgentPool(String agentPool) {
    this.agentPool = agentPool;
  }


  public ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel ipAddress(String ipAddress) {
    
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


  public ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel port(Integer port) {
    
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


  public ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel networkName(String networkName) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel modelsCertificateRetrievalResponseCertificateStoreLocationDetailModel = (ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel) o;
    return Objects.equals(this.storePath, modelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.storePath) &&
        Objects.equals(this.agentPool, modelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.agentPool) &&
        Objects.equals(this.ipAddress, modelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.ipAddress) &&
        Objects.equals(this.port, modelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.port) &&
        Objects.equals(this.networkName, modelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.networkName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storePath, agentPool, ipAddress, port, networkName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel {\n");
    sb.append("    storePath: ").append(toIndentedString(storePath)).append("\n");
    sb.append("    agentPool: ").append(toIndentedString(agentPool)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    networkName: ").append(toIndentedString(networkName)).append("\n");
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
    openapiFields.add("StorePath");
    openapiFields.add("AgentPool");
    openapiFields.add("IPAddress");
    openapiFields.add("Port");
    openapiFields.add("NetworkName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel is not found in the empty JSON string", ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("StorePath") != null && !jsonObj.get("StorePath").isJsonNull()) && !jsonObj.get("StorePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StorePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StorePath").toString()));
      }
      if ((jsonObj.get("AgentPool") != null && !jsonObj.get("AgentPool").isJsonNull()) && !jsonObj.get("AgentPool").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentPool` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentPool").toString()));
      }
      if ((jsonObj.get("IPAddress") != null && !jsonObj.get("IPAddress").isJsonNull()) && !jsonObj.get("IPAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPAddress").toString()));
      }
      if ((jsonObj.get("NetworkName") != null && !jsonObj.get("NetworkName").isJsonNull()) && !jsonObj.get("NetworkName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NetworkName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NetworkName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel>() {
           @Override
           public void write(JsonWriter out, ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel
  * @throws IOException if the JSON string is invalid with respect to ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel
  */
  public static ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel.class);
  }

 /**
  * Convert an instance of ModelsCertificateRetrievalResponseCertificateStoreLocationDetailModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

