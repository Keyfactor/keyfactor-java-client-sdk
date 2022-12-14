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
import com.keyfactor.command.client.model.ModelsKeyfactorAPISecret;
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
 * ModelsDiscoveryJobRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsDiscoveryJobRequest {
  public static final String SERIALIZED_NAME_CLIENT_MACHINE = "ClientMachine";
  @SerializedName(SERIALIZED_NAME_CLIENT_MACHINE)
  private String clientMachine;

  public static final String SERIALIZED_NAME_AGENT_ID = "AgentId";
  @SerializedName(SERIALIZED_NAME_AGENT_ID)
  private UUID agentId;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_JOB_EXECUTION_TIMESTAMP = "JobExecutionTimestamp";
  @SerializedName(SERIALIZED_NAME_JOB_EXECUTION_TIMESTAMP)
  private OffsetDateTime jobExecutionTimestamp;

  public static final String SERIALIZED_NAME_DIRS = "Dirs";
  @SerializedName(SERIALIZED_NAME_DIRS)
  private String dirs;

  public static final String SERIALIZED_NAME_IGNORED_DIRS = "IgnoredDirs";
  @SerializedName(SERIALIZED_NAME_IGNORED_DIRS)
  private String ignoredDirs;

  public static final String SERIALIZED_NAME_EXTENSIONS = "Extensions";
  @SerializedName(SERIALIZED_NAME_EXTENSIONS)
  private String extensions;

  public static final String SERIALIZED_NAME_NAME_PATTERNS = "NamePatterns";
  @SerializedName(SERIALIZED_NAME_NAME_PATTERNS)
  private String namePatterns;

  public static final String SERIALIZED_NAME_SYM_LINKS = "SymLinks";
  @SerializedName(SERIALIZED_NAME_SYM_LINKS)
  private Boolean symLinks;

  public static final String SERIALIZED_NAME_COMPATIBILITY = "Compatibility";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY)
  private Boolean compatibility;

  public static final String SERIALIZED_NAME_SERVER_USERNAME = "ServerUsername";
  @SerializedName(SERIALIZED_NAME_SERVER_USERNAME)
  private ModelsKeyfactorAPISecret serverUsername;

  public static final String SERIALIZED_NAME_SERVER_PASSWORD = "ServerPassword";
  @SerializedName(SERIALIZED_NAME_SERVER_PASSWORD)
  private ModelsKeyfactorAPISecret serverPassword;

  public static final String SERIALIZED_NAME_SERVER_USE_SSL = "ServerUseSsl";
  @SerializedName(SERIALIZED_NAME_SERVER_USE_SSL)
  private Boolean serverUseSsl;

  public ModelsDiscoveryJobRequest() {
  }

  public ModelsDiscoveryJobRequest clientMachine(String clientMachine) {
    
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


  public ModelsDiscoveryJobRequest agentId(UUID agentId) {
    
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


  public ModelsDiscoveryJobRequest type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public ModelsDiscoveryJobRequest jobExecutionTimestamp(OffsetDateTime jobExecutionTimestamp) {
    
    this.jobExecutionTimestamp = jobExecutionTimestamp;
    return this;
  }

   /**
   * Get jobExecutionTimestamp
   * @return jobExecutionTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getJobExecutionTimestamp() {
    return jobExecutionTimestamp;
  }


  public void setJobExecutionTimestamp(OffsetDateTime jobExecutionTimestamp) {
    this.jobExecutionTimestamp = jobExecutionTimestamp;
  }


  public ModelsDiscoveryJobRequest dirs(String dirs) {
    
    this.dirs = dirs;
    return this;
  }

   /**
   * Get dirs
   * @return dirs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDirs() {
    return dirs;
  }


  public void setDirs(String dirs) {
    this.dirs = dirs;
  }


  public ModelsDiscoveryJobRequest ignoredDirs(String ignoredDirs) {
    
    this.ignoredDirs = ignoredDirs;
    return this;
  }

   /**
   * Get ignoredDirs
   * @return ignoredDirs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIgnoredDirs() {
    return ignoredDirs;
  }


  public void setIgnoredDirs(String ignoredDirs) {
    this.ignoredDirs = ignoredDirs;
  }


  public ModelsDiscoveryJobRequest extensions(String extensions) {
    
    this.extensions = extensions;
    return this;
  }

   /**
   * Get extensions
   * @return extensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExtensions() {
    return extensions;
  }


  public void setExtensions(String extensions) {
    this.extensions = extensions;
  }


  public ModelsDiscoveryJobRequest namePatterns(String namePatterns) {
    
    this.namePatterns = namePatterns;
    return this;
  }

   /**
   * Get namePatterns
   * @return namePatterns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamePatterns() {
    return namePatterns;
  }


  public void setNamePatterns(String namePatterns) {
    this.namePatterns = namePatterns;
  }


  public ModelsDiscoveryJobRequest symLinks(Boolean symLinks) {
    
    this.symLinks = symLinks;
    return this;
  }

   /**
   * Get symLinks
   * @return symLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSymLinks() {
    return symLinks;
  }


  public void setSymLinks(Boolean symLinks) {
    this.symLinks = symLinks;
  }


  public ModelsDiscoveryJobRequest compatibility(Boolean compatibility) {
    
    this.compatibility = compatibility;
    return this;
  }

   /**
   * Get compatibility
   * @return compatibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCompatibility() {
    return compatibility;
  }


  public void setCompatibility(Boolean compatibility) {
    this.compatibility = compatibility;
  }


  public ModelsDiscoveryJobRequest serverUsername(ModelsKeyfactorAPISecret serverUsername) {
    
    this.serverUsername = serverUsername;
    return this;
  }

   /**
   * Get serverUsername
   * @return serverUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelsKeyfactorAPISecret getServerUsername() {
    return serverUsername;
  }


  public void setServerUsername(ModelsKeyfactorAPISecret serverUsername) {
    this.serverUsername = serverUsername;
  }


  public ModelsDiscoveryJobRequest serverPassword(ModelsKeyfactorAPISecret serverPassword) {
    
    this.serverPassword = serverPassword;
    return this;
  }

   /**
   * Get serverPassword
   * @return serverPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelsKeyfactorAPISecret getServerPassword() {
    return serverPassword;
  }


  public void setServerPassword(ModelsKeyfactorAPISecret serverPassword) {
    this.serverPassword = serverPassword;
  }


  public ModelsDiscoveryJobRequest serverUseSsl(Boolean serverUseSsl) {
    
    this.serverUseSsl = serverUseSsl;
    return this;
  }

   /**
   * Get serverUseSsl
   * @return serverUseSsl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getServerUseSsl() {
    return serverUseSsl;
  }


  public void setServerUseSsl(Boolean serverUseSsl) {
    this.serverUseSsl = serverUseSsl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsDiscoveryJobRequest modelsDiscoveryJobRequest = (ModelsDiscoveryJobRequest) o;
    return Objects.equals(this.clientMachine, modelsDiscoveryJobRequest.clientMachine) &&
        Objects.equals(this.agentId, modelsDiscoveryJobRequest.agentId) &&
        Objects.equals(this.type, modelsDiscoveryJobRequest.type) &&
        Objects.equals(this.jobExecutionTimestamp, modelsDiscoveryJobRequest.jobExecutionTimestamp) &&
        Objects.equals(this.dirs, modelsDiscoveryJobRequest.dirs) &&
        Objects.equals(this.ignoredDirs, modelsDiscoveryJobRequest.ignoredDirs) &&
        Objects.equals(this.extensions, modelsDiscoveryJobRequest.extensions) &&
        Objects.equals(this.namePatterns, modelsDiscoveryJobRequest.namePatterns) &&
        Objects.equals(this.symLinks, modelsDiscoveryJobRequest.symLinks) &&
        Objects.equals(this.compatibility, modelsDiscoveryJobRequest.compatibility) &&
        Objects.equals(this.serverUsername, modelsDiscoveryJobRequest.serverUsername) &&
        Objects.equals(this.serverPassword, modelsDiscoveryJobRequest.serverPassword) &&
        Objects.equals(this.serverUseSsl, modelsDiscoveryJobRequest.serverUseSsl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientMachine, agentId, type, jobExecutionTimestamp, dirs, ignoredDirs, extensions, namePatterns, symLinks, compatibility, serverUsername, serverPassword, serverUseSsl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsDiscoveryJobRequest {\n");
    sb.append("    clientMachine: ").append(toIndentedString(clientMachine)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    jobExecutionTimestamp: ").append(toIndentedString(jobExecutionTimestamp)).append("\n");
    sb.append("    dirs: ").append(toIndentedString(dirs)).append("\n");
    sb.append("    ignoredDirs: ").append(toIndentedString(ignoredDirs)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    namePatterns: ").append(toIndentedString(namePatterns)).append("\n");
    sb.append("    symLinks: ").append(toIndentedString(symLinks)).append("\n");
    sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
    sb.append("    serverUsername: ").append(toIndentedString(serverUsername)).append("\n");
    sb.append("    serverPassword: ").append(toIndentedString(serverPassword)).append("\n");
    sb.append("    serverUseSsl: ").append(toIndentedString(serverUseSsl)).append("\n");
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
    openapiFields.add("ClientMachine");
    openapiFields.add("AgentId");
    openapiFields.add("Type");
    openapiFields.add("JobExecutionTimestamp");
    openapiFields.add("Dirs");
    openapiFields.add("IgnoredDirs");
    openapiFields.add("Extensions");
    openapiFields.add("NamePatterns");
    openapiFields.add("SymLinks");
    openapiFields.add("Compatibility");
    openapiFields.add("ServerUsername");
    openapiFields.add("ServerPassword");
    openapiFields.add("ServerUseSsl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsDiscoveryJobRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsDiscoveryJobRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsDiscoveryJobRequest is not found in the empty JSON string", ModelsDiscoveryJobRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsDiscoveryJobRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsDiscoveryJobRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsDiscoveryJobRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ClientMachine") != null && !jsonObj.get("ClientMachine").isJsonNull()) && !jsonObj.get("ClientMachine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ClientMachine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ClientMachine").toString()));
      }
      if ((jsonObj.get("AgentId") != null && !jsonObj.get("AgentId").isJsonNull()) && !jsonObj.get("AgentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentId").toString()));
      }
      if ((jsonObj.get("Dirs") != null && !jsonObj.get("Dirs").isJsonNull()) && !jsonObj.get("Dirs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Dirs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Dirs").toString()));
      }
      if ((jsonObj.get("IgnoredDirs") != null && !jsonObj.get("IgnoredDirs").isJsonNull()) && !jsonObj.get("IgnoredDirs").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IgnoredDirs` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IgnoredDirs").toString()));
      }
      if ((jsonObj.get("Extensions") != null && !jsonObj.get("Extensions").isJsonNull()) && !jsonObj.get("Extensions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Extensions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Extensions").toString()));
      }
      if ((jsonObj.get("NamePatterns") != null && !jsonObj.get("NamePatterns").isJsonNull()) && !jsonObj.get("NamePatterns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NamePatterns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NamePatterns").toString()));
      }
      // validate the optional field `ServerUsername`
      if (jsonObj.get("ServerUsername") != null && !jsonObj.get("ServerUsername").isJsonNull()) {
        ModelsKeyfactorAPISecret.validateJsonObject(jsonObj.getAsJsonObject("ServerUsername"));
      }
      // validate the optional field `ServerPassword`
      if (jsonObj.get("ServerPassword") != null && !jsonObj.get("ServerPassword").isJsonNull()) {
        ModelsKeyfactorAPISecret.validateJsonObject(jsonObj.getAsJsonObject("ServerPassword"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsDiscoveryJobRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsDiscoveryJobRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsDiscoveryJobRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsDiscoveryJobRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsDiscoveryJobRequest>() {
           @Override
           public void write(JsonWriter out, ModelsDiscoveryJobRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsDiscoveryJobRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsDiscoveryJobRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsDiscoveryJobRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsDiscoveryJobRequest
  */
  public static ModelsDiscoveryJobRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsDiscoveryJobRequest.class);
  }

 /**
  * Convert an instance of ModelsDiscoveryJobRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

