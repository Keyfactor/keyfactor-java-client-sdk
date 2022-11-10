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
import com.keyfactor.command.client.model.KeyfactorApiModelsWorkflowsDefinitionStepResponse;
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
 * KeyfactorApiModelsWorkflowsDefinitionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsWorkflowsDefinitionResponse {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_KEY = "Key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_KEY_DISPLAY_NAME = "KeyDisplayName";
  @SerializedName(SERIALIZED_NAME_KEY_DISPLAY_NAME)
  private String keyDisplayName;

  public static final String SERIALIZED_NAME_IS_PUBLISHED = "IsPublished";
  @SerializedName(SERIALIZED_NAME_IS_PUBLISHED)
  private Boolean isPublished;

  public static final String SERIALIZED_NAME_WORKFLOW_TYPE = "WorkflowType";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE)
  private String workflowType;

  public static final String SERIALIZED_NAME_STEPS = "Steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<KeyfactorApiModelsWorkflowsDefinitionStepResponse> steps = null;

  public static final String SERIALIZED_NAME_DRAFT_VERSION = "DraftVersion";
  @SerializedName(SERIALIZED_NAME_DRAFT_VERSION)
  private Integer draftVersion;

  public static final String SERIALIZED_NAME_PUBLISHED_VERSION = "PublishedVersion";
  @SerializedName(SERIALIZED_NAME_PUBLISHED_VERSION)
  private Integer publishedVersion;

  public KeyfactorApiModelsWorkflowsDefinitionResponse() {
  }

  public KeyfactorApiModelsWorkflowsDefinitionResponse id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public KeyfactorApiModelsWorkflowsDefinitionResponse displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public KeyfactorApiModelsWorkflowsDefinitionResponse description(String description) {
    
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


  public KeyfactorApiModelsWorkflowsDefinitionResponse key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public KeyfactorApiModelsWorkflowsDefinitionResponse keyDisplayName(String keyDisplayName) {
    
    this.keyDisplayName = keyDisplayName;
    return this;
  }

   /**
   * Get keyDisplayName
   * @return keyDisplayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyDisplayName() {
    return keyDisplayName;
  }


  public void setKeyDisplayName(String keyDisplayName) {
    this.keyDisplayName = keyDisplayName;
  }


  public KeyfactorApiModelsWorkflowsDefinitionResponse isPublished(Boolean isPublished) {
    
    this.isPublished = isPublished;
    return this;
  }

   /**
   * Get isPublished
   * @return isPublished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPublished() {
    return isPublished;
  }


  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }


  public KeyfactorApiModelsWorkflowsDefinitionResponse workflowType(String workflowType) {
    
    this.workflowType = workflowType;
    return this;
  }

   /**
   * Get workflowType
   * @return workflowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkflowType() {
    return workflowType;
  }


  public void setWorkflowType(String workflowType) {
    this.workflowType = workflowType;
  }


  public KeyfactorApiModelsWorkflowsDefinitionResponse steps(List<KeyfactorApiModelsWorkflowsDefinitionStepResponse> steps) {
    
    this.steps = steps;
    return this;
  }

  public KeyfactorApiModelsWorkflowsDefinitionResponse addStepsItem(KeyfactorApiModelsWorkflowsDefinitionStepResponse stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeyfactorApiModelsWorkflowsDefinitionStepResponse> getSteps() {
    return steps;
  }


  public void setSteps(List<KeyfactorApiModelsWorkflowsDefinitionStepResponse> steps) {
    this.steps = steps;
  }


  public KeyfactorApiModelsWorkflowsDefinitionResponse draftVersion(Integer draftVersion) {
    
    this.draftVersion = draftVersion;
    return this;
  }

   /**
   * Get draftVersion
   * @return draftVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDraftVersion() {
    return draftVersion;
  }


  public void setDraftVersion(Integer draftVersion) {
    this.draftVersion = draftVersion;
  }


  public KeyfactorApiModelsWorkflowsDefinitionResponse publishedVersion(Integer publishedVersion) {
    
    this.publishedVersion = publishedVersion;
    return this;
  }

   /**
   * Get publishedVersion
   * @return publishedVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPublishedVersion() {
    return publishedVersion;
  }


  public void setPublishedVersion(Integer publishedVersion) {
    this.publishedVersion = publishedVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsWorkflowsDefinitionResponse keyfactorApiModelsWorkflowsDefinitionResponse = (KeyfactorApiModelsWorkflowsDefinitionResponse) o;
    return Objects.equals(this.id, keyfactorApiModelsWorkflowsDefinitionResponse.id) &&
        Objects.equals(this.displayName, keyfactorApiModelsWorkflowsDefinitionResponse.displayName) &&
        Objects.equals(this.description, keyfactorApiModelsWorkflowsDefinitionResponse.description) &&
        Objects.equals(this.key, keyfactorApiModelsWorkflowsDefinitionResponse.key) &&
        Objects.equals(this.keyDisplayName, keyfactorApiModelsWorkflowsDefinitionResponse.keyDisplayName) &&
        Objects.equals(this.isPublished, keyfactorApiModelsWorkflowsDefinitionResponse.isPublished) &&
        Objects.equals(this.workflowType, keyfactorApiModelsWorkflowsDefinitionResponse.workflowType) &&
        Objects.equals(this.steps, keyfactorApiModelsWorkflowsDefinitionResponse.steps) &&
        Objects.equals(this.draftVersion, keyfactorApiModelsWorkflowsDefinitionResponse.draftVersion) &&
        Objects.equals(this.publishedVersion, keyfactorApiModelsWorkflowsDefinitionResponse.publishedVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, description, key, keyDisplayName, isPublished, workflowType, steps, draftVersion, publishedVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsWorkflowsDefinitionResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyDisplayName: ").append(toIndentedString(keyDisplayName)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    draftVersion: ").append(toIndentedString(draftVersion)).append("\n");
    sb.append("    publishedVersion: ").append(toIndentedString(publishedVersion)).append("\n");
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
    openapiFields.add("Id");
    openapiFields.add("DisplayName");
    openapiFields.add("Description");
    openapiFields.add("Key");
    openapiFields.add("KeyDisplayName");
    openapiFields.add("IsPublished");
    openapiFields.add("WorkflowType");
    openapiFields.add("Steps");
    openapiFields.add("DraftVersion");
    openapiFields.add("PublishedVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsWorkflowsDefinitionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsWorkflowsDefinitionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsWorkflowsDefinitionResponse is not found in the empty JSON string", KeyfactorApiModelsWorkflowsDefinitionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsWorkflowsDefinitionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsWorkflowsDefinitionResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if ((jsonObj.get("DisplayName") != null && !jsonObj.get("DisplayName").isJsonNull()) && !jsonObj.get("DisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DisplayName").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("Key") != null && !jsonObj.get("Key").isJsonNull()) && !jsonObj.get("Key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Key").toString()));
      }
      if ((jsonObj.get("KeyDisplayName") != null && !jsonObj.get("KeyDisplayName").isJsonNull()) && !jsonObj.get("KeyDisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeyDisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeyDisplayName").toString()));
      }
      if ((jsonObj.get("WorkflowType") != null && !jsonObj.get("WorkflowType").isJsonNull()) && !jsonObj.get("WorkflowType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkflowType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkflowType").toString()));
      }
      if (jsonObj.get("Steps") != null && !jsonObj.get("Steps").isJsonNull()) {
        JsonArray jsonArraysteps = jsonObj.getAsJsonArray("Steps");
        if (jsonArraysteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Steps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Steps` to be an array in the JSON string but got `%s`", jsonObj.get("Steps").toString()));
          }

          // validate the optional field `Steps` (array)
          for (int i = 0; i < jsonArraysteps.size(); i++) {
            KeyfactorApiModelsWorkflowsDefinitionStepResponse.validateJsonObject(jsonArraysteps.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsWorkflowsDefinitionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsWorkflowsDefinitionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsWorkflowsDefinitionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsWorkflowsDefinitionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsWorkflowsDefinitionResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsWorkflowsDefinitionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsWorkflowsDefinitionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsWorkflowsDefinitionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsWorkflowsDefinitionResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsWorkflowsDefinitionResponse
  */
  public static KeyfactorApiModelsWorkflowsDefinitionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsWorkflowsDefinitionResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsWorkflowsDefinitionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

