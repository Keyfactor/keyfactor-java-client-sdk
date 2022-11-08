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
 * ModelsAgentsAgentPoolAgent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsAgentsAgentPoolAgent {
  public static final String SERIALIZED_NAME_AGENT_ID = "AgentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private UUID agentId;

  public static final String SERIALIZED_NAME_ENABLE_DISCOVER = "EnableDiscover";
  @SerializedName(SERIALIZED_NAME_ENABLE_DISCOVER)
  private Boolean enableDiscover;

  public static final String SERIALIZED_NAME_ENABLE_MONITOR = "EnableMonitor";
  @SerializedName(SERIALIZED_NAME_ENABLE_MONITOR)
  private Boolean enableMonitor;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ALLOWS_DISCOVER = "AllowsDiscover";
  @SerializedName(SERIALIZED_NAME_ALLOWS_DISCOVER)
  private Boolean allowsDiscover;

  public static final String SERIALIZED_NAME_ALLOWS_MONITOR = "AllowsMonitor";
  @SerializedName(SERIALIZED_NAME_ALLOWS_MONITOR)
  private Boolean allowsMonitor;

  public static final String SERIALIZED_NAME_CLIENT_MACHINE = "ClientMachine";
  @SerializedName(SERIALIZED_NAME_CLIENT_MACHINE)
  private String clientMachine;

  public ModelsAgentsAgentPoolAgent() {
  }

  public ModelsAgentsAgentPoolAgent agentId(UUID agentId) {
    
    this.agentId = agentId;
    return this;
  }

   /**
   * Get agentId
   * @return agentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getAgentId() {
    return agentId;
  }


  public void setAgentId(UUID agentId) {
    this.agentId = agentId;
  }


  public ModelsAgentsAgentPoolAgent enableDiscover(Boolean enableDiscover) {
    
    this.enableDiscover = enableDiscover;
    return this;
  }

   /**
   * Get enableDiscover
   * @return enableDiscover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableDiscover() {
    return enableDiscover;
  }


  public void setEnableDiscover(Boolean enableDiscover) {
    this.enableDiscover = enableDiscover;
  }


  public ModelsAgentsAgentPoolAgent enableMonitor(Boolean enableMonitor) {
    
    this.enableMonitor = enableMonitor;
    return this;
  }

   /**
   * Get enableMonitor
   * @return enableMonitor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnableMonitor() {
    return enableMonitor;
  }


  public void setEnableMonitor(Boolean enableMonitor) {
    this.enableMonitor = enableMonitor;
  }


  public ModelsAgentsAgentPoolAgent version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public ModelsAgentsAgentPoolAgent allowsDiscover(Boolean allowsDiscover) {
    
    this.allowsDiscover = allowsDiscover;
    return this;
  }

   /**
   * Get allowsDiscover
   * @return allowsDiscover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowsDiscover() {
    return allowsDiscover;
  }


  public void setAllowsDiscover(Boolean allowsDiscover) {
    this.allowsDiscover = allowsDiscover;
  }


  public ModelsAgentsAgentPoolAgent allowsMonitor(Boolean allowsMonitor) {
    
    this.allowsMonitor = allowsMonitor;
    return this;
  }

   /**
   * Get allowsMonitor
   * @return allowsMonitor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAllowsMonitor() {
    return allowsMonitor;
  }


  public void setAllowsMonitor(Boolean allowsMonitor) {
    this.allowsMonitor = allowsMonitor;
  }


  public ModelsAgentsAgentPoolAgent clientMachine(String clientMachine) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsAgentsAgentPoolAgent modelsAgentsAgentPoolAgent = (ModelsAgentsAgentPoolAgent) o;
    return Objects.equals(this.agentId, modelsAgentsAgentPoolAgent.agentId) &&
        Objects.equals(this.enableDiscover, modelsAgentsAgentPoolAgent.enableDiscover) &&
        Objects.equals(this.enableMonitor, modelsAgentsAgentPoolAgent.enableMonitor) &&
        Objects.equals(this.version, modelsAgentsAgentPoolAgent.version) &&
        Objects.equals(this.allowsDiscover, modelsAgentsAgentPoolAgent.allowsDiscover) &&
        Objects.equals(this.allowsMonitor, modelsAgentsAgentPoolAgent.allowsMonitor) &&
        Objects.equals(this.clientMachine, modelsAgentsAgentPoolAgent.clientMachine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, enableDiscover, enableMonitor, version, allowsDiscover, allowsMonitor, clientMachine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsAgentsAgentPoolAgent {\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    enableDiscover: ").append(toIndentedString(enableDiscover)).append("\n");
    sb.append("    enableMonitor: ").append(toIndentedString(enableMonitor)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    allowsDiscover: ").append(toIndentedString(allowsDiscover)).append("\n");
    sb.append("    allowsMonitor: ").append(toIndentedString(allowsMonitor)).append("\n");
    sb.append("    clientMachine: ").append(toIndentedString(clientMachine)).append("\n");
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
    openapiFields.add("EnableDiscover");
    openapiFields.add("EnableMonitor");
    openapiFields.add("Version");
    openapiFields.add("AllowsDiscover");
    openapiFields.add("AllowsMonitor");
    openapiFields.add("ClientMachine");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsAgentsAgentPoolAgent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsAgentsAgentPoolAgent.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsAgentsAgentPoolAgent is not found in the empty JSON string", ModelsAgentsAgentPoolAgent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsAgentsAgentPoolAgent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsAgentsAgentPoolAgent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("AgentId") != null && !jsonObj.get("AgentId").isJsonNull()) && !jsonObj.get("AgentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentId").toString()));
      }
      if ((jsonObj.get("Version") != null && !jsonObj.get("Version").isJsonNull()) && !jsonObj.get("Version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Version").toString()));
      }
      if ((jsonObj.get("ClientMachine") != null && !jsonObj.get("ClientMachine").isJsonNull()) && !jsonObj.get("ClientMachine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ClientMachine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ClientMachine").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsAgentsAgentPoolAgent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsAgentsAgentPoolAgent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsAgentsAgentPoolAgent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsAgentsAgentPoolAgent.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsAgentsAgentPoolAgent>() {
           @Override
           public void write(JsonWriter out, ModelsAgentsAgentPoolAgent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsAgentsAgentPoolAgent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsAgentsAgentPoolAgent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsAgentsAgentPoolAgent
  * @throws IOException if the JSON string is invalid with respect to ModelsAgentsAgentPoolAgent
  */
  public static ModelsAgentsAgentPoolAgent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsAgentsAgentPoolAgent.class);
  }

 /**
  * Convert an instance of ModelsAgentsAgentPoolAgent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
