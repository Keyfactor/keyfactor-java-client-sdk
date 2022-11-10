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
import com.keyfactor.command.client.model.KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse;
import com.keyfactor.command.client.model.KeyfactorCommonSchedulingKeyfactorSchedule;
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
 * KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse {
  public static final String SERIALIZED_NAME_AGENT_BLUEPRINT_JOB_ID = "AgentBlueprintJobId";
  @SerializedName(SERIALIZED_NAME_AGENT_BLUEPRINT_JOB_ID)
  private UUID agentBlueprintJobId;

  public static final String SERIALIZED_NAME_AGENT_BLUEPRINT_STORE_ID = "AgentBlueprintStoreId";
  @SerializedName(SERIALIZED_NAME_AGENT_BLUEPRINT_STORE_ID)
  private UUID agentBlueprintStoreId;

  public static final String SERIALIZED_NAME_AGENT_BLUEPRINT_ID = "AgentBlueprintId";
  @SerializedName(SERIALIZED_NAME_AGENT_BLUEPRINT_ID)
  private UUID agentBlueprintId;

  public static final String SERIALIZED_NAME_JOB_TYPE = "JobType";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE)
  private UUID jobType;

  public static final String SERIALIZED_NAME_JOB_TYPE_NAME = "JobTypeName";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE_NAME)
  private String jobTypeName;

  public static final String SERIALIZED_NAME_OPERATION_TYPE = "OperationType";
  @SerializedName(SERIALIZED_NAME_OPERATION_TYPE)
  private Integer operationType;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT)
  private String thumbprint;

  public static final String SERIALIZED_NAME_CONTENTS = "Contents";
  @SerializedName(SERIALIZED_NAME_CONTENTS)
  private String contents;

  public static final String SERIALIZED_NAME_ALIAS = "Alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_ENTRY = "PrivateKeyEntry";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_ENTRY)
  private Boolean privateKeyEntry;

  public static final String SERIALIZED_NAME_OVERWRITE = "Overwrite";
  @SerializedName(SERIALIZED_NAME_OVERWRITE)
  private Boolean overwrite;

  public static final String SERIALIZED_NAME_HAS_ENTRY_PASSWORD = "HasEntryPassword";
  @SerializedName(SERIALIZED_NAME_HAS_ENTRY_PASSWORD)
  private Boolean hasEntryPassword;

  public static final String SERIALIZED_NAME_HAS_PFX_PASSWORD = "HasPfxPassword";
  @SerializedName(SERIALIZED_NAME_HAS_PFX_PASSWORD)
  private Boolean hasPfxPassword;

  public static final String SERIALIZED_NAME_REQUEST_TIMESTAMP = "RequestTimestamp";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIMESTAMP)
  private OffsetDateTime requestTimestamp;

  public static final String SERIALIZED_NAME_KEYFACTOR_SCHEDULE = "KeyfactorSchedule";
  @SerializedName(SERIALIZED_NAME_KEYFACTOR_SCHEDULE)
  private KeyfactorCommonSchedulingKeyfactorSchedule keyfactorSchedule;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_DIRECTORIES = "Directories";
  @SerializedName(SERIALIZED_NAME_DIRECTORIES)
  private String directories;

  public static final String SERIALIZED_NAME_IGNORED_DIRECTORIES = "IgnoredDirectories";
  @SerializedName(SERIALIZED_NAME_IGNORED_DIRECTORIES)
  private String ignoredDirectories;

  public static final String SERIALIZED_NAME_SYM_LINKS = "SymLinks";
  @SerializedName(SERIALIZED_NAME_SYM_LINKS)
  private Boolean symLinks;

  public static final String SERIALIZED_NAME_COMPATIBILITY = "Compatibility";
  @SerializedName(SERIALIZED_NAME_COMPATIBILITY)
  private Boolean compatibility;

  public static final String SERIALIZED_NAME_FILE_EXTENSIONS = "FileExtensions";
  @SerializedName(SERIALIZED_NAME_FILE_EXTENSIONS)
  private String fileExtensions;

  public static final String SERIALIZED_NAME_FILE_NAME_PATTERNS = "FileNamePatterns";
  @SerializedName(SERIALIZED_NAME_FILE_NAME_PATTERNS)
  private String fileNamePatterns;

  public static final String SERIALIZED_NAME_AGENT_BLUEPRINT_STORES = "AgentBlueprintStores";
  @SerializedName(SERIALIZED_NAME_AGENT_BLUEPRINT_STORES)
  private KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse agentBlueprintStores;

  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse() {
  }

  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse agentBlueprintJobId(UUID agentBlueprintJobId) {
    
    this.agentBlueprintJobId = agentBlueprintJobId;
    return this;
  }

   /**
   * Get agentBlueprintJobId
   * @return agentBlueprintJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getAgentBlueprintJobId() {
    return agentBlueprintJobId;
  }


  public void setAgentBlueprintJobId(UUID agentBlueprintJobId) {
    this.agentBlueprintJobId = agentBlueprintJobId;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse agentBlueprintStoreId(UUID agentBlueprintStoreId) {
    
    this.agentBlueprintStoreId = agentBlueprintStoreId;
    return this;
  }

   /**
   * Get agentBlueprintStoreId
   * @return agentBlueprintStoreId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getAgentBlueprintStoreId() {
    return agentBlueprintStoreId;
  }


  public void setAgentBlueprintStoreId(UUID agentBlueprintStoreId) {
    this.agentBlueprintStoreId = agentBlueprintStoreId;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse agentBlueprintId(UUID agentBlueprintId) {
    
    this.agentBlueprintId = agentBlueprintId;
    return this;
  }

   /**
   * Get agentBlueprintId
   * @return agentBlueprintId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getAgentBlueprintId() {
    return agentBlueprintId;
  }


  public void setAgentBlueprintId(UUID agentBlueprintId) {
    this.agentBlueprintId = agentBlueprintId;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse jobType(UUID jobType) {
    
    this.jobType = jobType;
    return this;
  }

   /**
   * Get jobType
   * @return jobType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getJobType() {
    return jobType;
  }


  public void setJobType(UUID jobType) {
    this.jobType = jobType;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse jobTypeName(String jobTypeName) {
    
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


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse operationType(Integer operationType) {
    
    this.operationType = operationType;
    return this;
  }

   /**
   * Get operationType
   * @return operationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOperationType() {
    return operationType;
  }


  public void setOperationType(Integer operationType) {
    this.operationType = operationType;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse thumbprint(String thumbprint) {
    
    this.thumbprint = thumbprint;
    return this;
  }

   /**
   * Get thumbprint
   * @return thumbprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThumbprint() {
    return thumbprint;
  }


  public void setThumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse contents(String contents) {
    
    this.contents = contents;
    return this;
  }

   /**
   * Get contents
   * @return contents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContents() {
    return contents;
  }


  public void setContents(String contents) {
    this.contents = contents;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse privateKeyEntry(Boolean privateKeyEntry) {
    
    this.privateKeyEntry = privateKeyEntry;
    return this;
  }

   /**
   * Get privateKeyEntry
   * @return privateKeyEntry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPrivateKeyEntry() {
    return privateKeyEntry;
  }


  public void setPrivateKeyEntry(Boolean privateKeyEntry) {
    this.privateKeyEntry = privateKeyEntry;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse overwrite(Boolean overwrite) {
    
    this.overwrite = overwrite;
    return this;
  }

   /**
   * Get overwrite
   * @return overwrite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOverwrite() {
    return overwrite;
  }


  public void setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse hasEntryPassword(Boolean hasEntryPassword) {
    
    this.hasEntryPassword = hasEntryPassword;
    return this;
  }

   /**
   * Get hasEntryPassword
   * @return hasEntryPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasEntryPassword() {
    return hasEntryPassword;
  }


  public void setHasEntryPassword(Boolean hasEntryPassword) {
    this.hasEntryPassword = hasEntryPassword;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse hasPfxPassword(Boolean hasPfxPassword) {
    
    this.hasPfxPassword = hasPfxPassword;
    return this;
  }

   /**
   * Get hasPfxPassword
   * @return hasPfxPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasPfxPassword() {
    return hasPfxPassword;
  }


  public void setHasPfxPassword(Boolean hasPfxPassword) {
    this.hasPfxPassword = hasPfxPassword;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse requestTimestamp(OffsetDateTime requestTimestamp) {
    
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


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse keyfactorSchedule(KeyfactorCommonSchedulingKeyfactorSchedule keyfactorSchedule) {
    
    this.keyfactorSchedule = keyfactorSchedule;
    return this;
  }

   /**
   * Get keyfactorSchedule
   * @return keyfactorSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorCommonSchedulingKeyfactorSchedule getKeyfactorSchedule() {
    return keyfactorSchedule;
  }


  public void setKeyfactorSchedule(KeyfactorCommonSchedulingKeyfactorSchedule keyfactorSchedule) {
    this.keyfactorSchedule = keyfactorSchedule;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse directories(String directories) {
    
    this.directories = directories;
    return this;
  }

   /**
   * Get directories
   * @return directories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDirectories() {
    return directories;
  }


  public void setDirectories(String directories) {
    this.directories = directories;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse ignoredDirectories(String ignoredDirectories) {
    
    this.ignoredDirectories = ignoredDirectories;
    return this;
  }

   /**
   * Get ignoredDirectories
   * @return ignoredDirectories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIgnoredDirectories() {
    return ignoredDirectories;
  }


  public void setIgnoredDirectories(String ignoredDirectories) {
    this.ignoredDirectories = ignoredDirectories;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse symLinks(Boolean symLinks) {
    
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


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse compatibility(Boolean compatibility) {
    
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


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse fileExtensions(String fileExtensions) {
    
    this.fileExtensions = fileExtensions;
    return this;
  }

   /**
   * Get fileExtensions
   * @return fileExtensions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileExtensions() {
    return fileExtensions;
  }


  public void setFileExtensions(String fileExtensions) {
    this.fileExtensions = fileExtensions;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse fileNamePatterns(String fileNamePatterns) {
    
    this.fileNamePatterns = fileNamePatterns;
    return this;
  }

   /**
   * Get fileNamePatterns
   * @return fileNamePatterns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileNamePatterns() {
    return fileNamePatterns;
  }


  public void setFileNamePatterns(String fileNamePatterns) {
    this.fileNamePatterns = fileNamePatterns;
  }


  public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse agentBlueprintStores(KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse agentBlueprintStores) {
    
    this.agentBlueprintStores = agentBlueprintStores;
    return this;
  }

   /**
   * Get agentBlueprintStores
   * @return agentBlueprintStores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse getAgentBlueprintStores() {
    return agentBlueprintStores;
  }


  public void setAgentBlueprintStores(KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse agentBlueprintStores) {
    this.agentBlueprintStores = agentBlueprintStores;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse = (KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse) o;
    return Objects.equals(this.agentBlueprintJobId, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.agentBlueprintJobId) &&
        Objects.equals(this.agentBlueprintStoreId, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.agentBlueprintStoreId) &&
        Objects.equals(this.agentBlueprintId, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.agentBlueprintId) &&
        Objects.equals(this.jobType, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.jobType) &&
        Objects.equals(this.jobTypeName, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.jobTypeName) &&
        Objects.equals(this.operationType, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.operationType) &&
        Objects.equals(this.thumbprint, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.thumbprint) &&
        Objects.equals(this.contents, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.contents) &&
        Objects.equals(this.alias, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.alias) &&
        Objects.equals(this.privateKeyEntry, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.privateKeyEntry) &&
        Objects.equals(this.overwrite, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.overwrite) &&
        Objects.equals(this.hasEntryPassword, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.hasEntryPassword) &&
        Objects.equals(this.hasPfxPassword, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.hasPfxPassword) &&
        Objects.equals(this.requestTimestamp, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.requestTimestamp) &&
        Objects.equals(this.keyfactorSchedule, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.keyfactorSchedule) &&
        Objects.equals(this.subject, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.subject) &&
        Objects.equals(this.directories, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.directories) &&
        Objects.equals(this.ignoredDirectories, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.ignoredDirectories) &&
        Objects.equals(this.symLinks, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.symLinks) &&
        Objects.equals(this.compatibility, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.compatibility) &&
        Objects.equals(this.fileExtensions, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.fileExtensions) &&
        Objects.equals(this.fileNamePatterns, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.fileNamePatterns) &&
        Objects.equals(this.agentBlueprintStores, keyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.agentBlueprintStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentBlueprintJobId, agentBlueprintStoreId, agentBlueprintId, jobType, jobTypeName, operationType, thumbprint, contents, alias, privateKeyEntry, overwrite, hasEntryPassword, hasPfxPassword, requestTimestamp, keyfactorSchedule, subject, directories, ignoredDirectories, symLinks, compatibility, fileExtensions, fileNamePatterns, agentBlueprintStores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse {\n");
    sb.append("    agentBlueprintJobId: ").append(toIndentedString(agentBlueprintJobId)).append("\n");
    sb.append("    agentBlueprintStoreId: ").append(toIndentedString(agentBlueprintStoreId)).append("\n");
    sb.append("    agentBlueprintId: ").append(toIndentedString(agentBlueprintId)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    jobTypeName: ").append(toIndentedString(jobTypeName)).append("\n");
    sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
    sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    privateKeyEntry: ").append(toIndentedString(privateKeyEntry)).append("\n");
    sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
    sb.append("    hasEntryPassword: ").append(toIndentedString(hasEntryPassword)).append("\n");
    sb.append("    hasPfxPassword: ").append(toIndentedString(hasPfxPassword)).append("\n");
    sb.append("    requestTimestamp: ").append(toIndentedString(requestTimestamp)).append("\n");
    sb.append("    keyfactorSchedule: ").append(toIndentedString(keyfactorSchedule)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    directories: ").append(toIndentedString(directories)).append("\n");
    sb.append("    ignoredDirectories: ").append(toIndentedString(ignoredDirectories)).append("\n");
    sb.append("    symLinks: ").append(toIndentedString(symLinks)).append("\n");
    sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
    sb.append("    fileExtensions: ").append(toIndentedString(fileExtensions)).append("\n");
    sb.append("    fileNamePatterns: ").append(toIndentedString(fileNamePatterns)).append("\n");
    sb.append("    agentBlueprintStores: ").append(toIndentedString(agentBlueprintStores)).append("\n");
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
    openapiFields.add("AgentBlueprintJobId");
    openapiFields.add("AgentBlueprintStoreId");
    openapiFields.add("AgentBlueprintId");
    openapiFields.add("JobType");
    openapiFields.add("JobTypeName");
    openapiFields.add("OperationType");
    openapiFields.add("Thumbprint");
    openapiFields.add("Contents");
    openapiFields.add("Alias");
    openapiFields.add("PrivateKeyEntry");
    openapiFields.add("Overwrite");
    openapiFields.add("HasEntryPassword");
    openapiFields.add("HasPfxPassword");
    openapiFields.add("RequestTimestamp");
    openapiFields.add("KeyfactorSchedule");
    openapiFields.add("Subject");
    openapiFields.add("Directories");
    openapiFields.add("IgnoredDirectories");
    openapiFields.add("SymLinks");
    openapiFields.add("Compatibility");
    openapiFields.add("FileExtensions");
    openapiFields.add("FileNamePatterns");
    openapiFields.add("AgentBlueprintStores");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse is not found in the empty JSON string", KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("AgentBlueprintJobId") != null && !jsonObj.get("AgentBlueprintJobId").isJsonNull()) && !jsonObj.get("AgentBlueprintJobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentBlueprintJobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentBlueprintJobId").toString()));
      }
      if ((jsonObj.get("AgentBlueprintStoreId") != null && !jsonObj.get("AgentBlueprintStoreId").isJsonNull()) && !jsonObj.get("AgentBlueprintStoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentBlueprintStoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentBlueprintStoreId").toString()));
      }
      if ((jsonObj.get("AgentBlueprintId") != null && !jsonObj.get("AgentBlueprintId").isJsonNull()) && !jsonObj.get("AgentBlueprintId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AgentBlueprintId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AgentBlueprintId").toString()));
      }
      if ((jsonObj.get("JobType") != null && !jsonObj.get("JobType").isJsonNull()) && !jsonObj.get("JobType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobType").toString()));
      }
      if ((jsonObj.get("JobTypeName") != null && !jsonObj.get("JobTypeName").isJsonNull()) && !jsonObj.get("JobTypeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `JobTypeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("JobTypeName").toString()));
      }
      if ((jsonObj.get("Thumbprint") != null && !jsonObj.get("Thumbprint").isJsonNull()) && !jsonObj.get("Thumbprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Thumbprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Thumbprint").toString()));
      }
      if ((jsonObj.get("Contents") != null && !jsonObj.get("Contents").isJsonNull()) && !jsonObj.get("Contents").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Contents` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Contents").toString()));
      }
      if ((jsonObj.get("Alias") != null && !jsonObj.get("Alias").isJsonNull()) && !jsonObj.get("Alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Alias").toString()));
      }
      // validate the optional field `KeyfactorSchedule`
      if (jsonObj.get("KeyfactorSchedule") != null && !jsonObj.get("KeyfactorSchedule").isJsonNull()) {
        KeyfactorCommonSchedulingKeyfactorSchedule.validateJsonObject(jsonObj.getAsJsonObject("KeyfactorSchedule"));
      }
      if ((jsonObj.get("Subject") != null && !jsonObj.get("Subject").isJsonNull()) && !jsonObj.get("Subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subject").toString()));
      }
      if ((jsonObj.get("Directories") != null && !jsonObj.get("Directories").isJsonNull()) && !jsonObj.get("Directories").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Directories` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Directories").toString()));
      }
      if ((jsonObj.get("IgnoredDirectories") != null && !jsonObj.get("IgnoredDirectories").isJsonNull()) && !jsonObj.get("IgnoredDirectories").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IgnoredDirectories` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IgnoredDirectories").toString()));
      }
      if ((jsonObj.get("FileExtensions") != null && !jsonObj.get("FileExtensions").isJsonNull()) && !jsonObj.get("FileExtensions").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FileExtensions` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FileExtensions").toString()));
      }
      if ((jsonObj.get("FileNamePatterns") != null && !jsonObj.get("FileNamePatterns").isJsonNull()) && !jsonObj.get("FileNamePatterns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FileNamePatterns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FileNamePatterns").toString()));
      }
      // validate the optional field `AgentBlueprintStores`
      if (jsonObj.get("AgentBlueprintStores") != null && !jsonObj.get("AgentBlueprintStores").isJsonNull()) {
        KeyfactorApiModelsOrchestratorsAgentBlueprintStoresResponse.validateJsonObject(jsonObj.getAsJsonObject("AgentBlueprintStores"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse
  */
  public static KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsOrchestratorsAgentBlueprintJobsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

