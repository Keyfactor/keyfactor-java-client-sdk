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
import com.keyfactor.command.client.model.ModelsAgentsAgentPoolAgent;
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
 * Class representing an SSL agent pool
 */
@ApiModel(description = "Class representing an SSL agent pool")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsAgentsAgentPool {
  public static final String SERIALIZED_NAME_AGENT_POOL_ID = "AgentPoolId";
  @SerializedName(SERIALIZED_NAME_AGENT_POOL_ID)
  private UUID agentPoolId;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISCOVER_AGENTS_COUNT = "DiscoverAgentsCount";
  @SerializedName(SERIALIZED_NAME_DISCOVER_AGENTS_COUNT)
  private Integer discoverAgentsCount;

  public static final String SERIALIZED_NAME_MONITOR_AGENTS_COUNT = "MonitorAgentsCount";
  @SerializedName(SERIALIZED_NAME_MONITOR_AGENTS_COUNT)
  private Integer monitorAgentsCount;

  public static final String SERIALIZED_NAME_AGENTS = "Agents";
  @SerializedName(SERIALIZED_NAME_AGENTS)
  private List<ModelsAgentsAgentPoolAgent> agents = null;

  public ModelsAgentsAgentPool() {
  }

  public ModelsAgentsAgentPool agentPoolId(UUID agentPoolId) {
    
    this.agentPoolId = agentPoolId;
    return this;
  }

   /**
   * GUID identifier of the agent pool
   * @return agentPoolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "GUID identifier of the agent pool")

  public UUID getAgentPoolId() {
    return agentPoolId;
  }


  public void setAgentPoolId(UUID agentPoolId) {
    this.agentPoolId = agentPoolId;
  }


  public ModelsAgentsAgentPool name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the agent pool
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the agent pool")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ModelsAgentsAgentPool discoverAgentsCount(Integer discoverAgentsCount) {
    
    this.discoverAgentsCount = discoverAgentsCount;
    return this;
  }

   /**
   * Number of agents that can perform discovery jobs
   * @return discoverAgentsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of agents that can perform discovery jobs")

  public Integer getDiscoverAgentsCount() {
    return discoverAgentsCount;
  }


  public void setDiscoverAgentsCount(Integer discoverAgentsCount) {
    this.discoverAgentsCount = discoverAgentsCount;
  }


  public ModelsAgentsAgentPool monitorAgentsCount(Integer monitorAgentsCount) {
    
    this.monitorAgentsCount = monitorAgentsCount;
    return this;
  }

   /**
   * Number of agents that can perform monitoring jobs
   * @return monitorAgentsCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of agents that can perform monitoring jobs")

  public Integer getMonitorAgentsCount() {
    return monitorAgentsCount;
  }


  public void setMonitorAgentsCount(Integer monitorAgentsCount) {
    this.monitorAgentsCount = monitorAgentsCount;
  }


  public ModelsAgentsAgentPool agents(List<ModelsAgentsAgentPoolAgent> agents) {
    
    this.agents = agents;
    return this;
  }

  public ModelsAgentsAgentPool addAgentsItem(ModelsAgentsAgentPoolAgent agentsItem) {
    if (this.agents == null) {
      this.agents = new ArrayList<>();
    }
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * List of the agents assigned to the pool
   * @return agents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the agents assigned to the pool")

  public List<ModelsAgentsAgentPoolAgent> getAgents() {
    return agents;
  }


  public void setAgents(List<ModelsAgentsAgentPoolAgent> agents) {
    this.agents = agents;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsAgentsAgentPool modelsAgentsAgentPool = (ModelsAgentsAgentPool) o;
    return Objects.equals(this.agentPoolId, modelsAgentsAgentPool.agentPoolId) &&
        Objects.equals(this.name, modelsAgentsAgentPool.name) &&
        Objects.equals(this.discoverAgentsCount, modelsAgentsAgentPool.discoverAgentsCount) &&
        Objects.equals(this.monitorAgentsCount, modelsAgentsAgentPool.monitorAgentsCount) &&
        Objects.equals(this.agents, modelsAgentsAgentPool.agents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentPoolId, name, discoverAgentsCount, monitorAgentsCount, agents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsAgentsAgentPool {\n");
    sb.append("    agentPoolId: ").append(toIndentedString(agentPoolId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    discoverAgentsCount: ").append(toIndentedString(discoverAgentsCount)).append("\n");
    sb.append("    monitorAgentsCount: ").append(toIndentedString(monitorAgentsCount)).append("\n");
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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
    openapiFields.add("AgentPoolId");
    openapiFields.add("Name");
    openapiFields.add("DiscoverAgentsCount");
    openapiFields.add("MonitorAgentsCount");
    openapiFields.add("Agents");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsAgentsAgentPool
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsAgentsAgentPool.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsAgentsAgentPool is not found in the empty JSON string", ModelsAgentsAgentPool.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsAgentsAgentPool.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsAgentsAgentPool` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsAgentsAgentPool.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("AgentPoolId") != null && !jsonObj.get("AgentPoolId").isJsonNull()) && !jsonObj.get("AgentPoolId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentPoolId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentPoolId").toString()));
      }
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("Agents") != null && !jsonObj.get("Agents").isJsonNull()) {
        JsonArray jsonArrayagents = jsonObj.getAsJsonArray("Agents");
        if (jsonArrayagents != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Agents").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Agents` to be an array in the JSON string but got `%s`", jsonObj.get("Agents").toString()));
          }

          // validate the optional field `Agents` (array)
          for (int i = 0; i < jsonArrayagents.size(); i++) {
            ModelsAgentsAgentPoolAgent.validateJsonObject(jsonArrayagents.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsAgentsAgentPool.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsAgentsAgentPool' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsAgentsAgentPool> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsAgentsAgentPool.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsAgentsAgentPool>() {
           @Override
           public void write(JsonWriter out, ModelsAgentsAgentPool value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsAgentsAgentPool read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsAgentsAgentPool given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsAgentsAgentPool
  * @throws IOException if the JSON string is invalid with respect to ModelsAgentsAgentPool
  */
  public static ModelsAgentsAgentPool fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsAgentsAgentPool.class);
  }

 /**
  * Convert an instance of ModelsAgentsAgentPool to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

