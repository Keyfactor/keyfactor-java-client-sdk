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
import com.keyfactor.command.client.model.KeyfactorCommonSchedulingKeyfactorSchedule;
import com.keyfactor.command.client.model.ModelsSSHUsersSshUserResponse;
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
 * ModelsSSHServerGroupsServerGroupResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsSSHServerGroupsServerGroupResponse {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_OWNER = "Owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private ModelsSSHUsersSshUserResponse owner;

  public static final String SERIALIZED_NAME_GROUP_NAME = "GroupName";
  @SerializedName(SERIALIZED_NAME_GROUP_NAME)
  private String groupName;

  public static final String SERIALIZED_NAME_SYNC_SCHEDULE = "SyncSchedule";
  @SerializedName(SERIALIZED_NAME_SYNC_SCHEDULE)
  private KeyfactorCommonSchedulingKeyfactorSchedule syncSchedule;

  public static final String SERIALIZED_NAME_UNDER_MANAGEMENT = "UnderManagement";
  @SerializedName(SERIALIZED_NAME_UNDER_MANAGEMENT)
  private Boolean underManagement;

  public static final String SERIALIZED_NAME_SERVER_COUNT = "ServerCount";
  @SerializedName(SERIALIZED_NAME_SERVER_COUNT)
  private Integer serverCount;

  public ModelsSSHServerGroupsServerGroupResponse() {
  }

  public ModelsSSHServerGroupsServerGroupResponse id(UUID id) {
    
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


  public ModelsSSHServerGroupsServerGroupResponse owner(ModelsSSHUsersSshUserResponse owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelsSSHUsersSshUserResponse getOwner() {
    return owner;
  }


  public void setOwner(ModelsSSHUsersSshUserResponse owner) {
    this.owner = owner;
  }


  public ModelsSSHServerGroupsServerGroupResponse groupName(String groupName) {
    
    this.groupName = groupName;
    return this;
  }

   /**
   * Get groupName
   * @return groupName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroupName() {
    return groupName;
  }


  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }


  public ModelsSSHServerGroupsServerGroupResponse syncSchedule(KeyfactorCommonSchedulingKeyfactorSchedule syncSchedule) {
    
    this.syncSchedule = syncSchedule;
    return this;
  }

   /**
   * Get syncSchedule
   * @return syncSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorCommonSchedulingKeyfactorSchedule getSyncSchedule() {
    return syncSchedule;
  }


  public void setSyncSchedule(KeyfactorCommonSchedulingKeyfactorSchedule syncSchedule) {
    this.syncSchedule = syncSchedule;
  }


  public ModelsSSHServerGroupsServerGroupResponse underManagement(Boolean underManagement) {
    
    this.underManagement = underManagement;
    return this;
  }

   /**
   * Get underManagement
   * @return underManagement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUnderManagement() {
    return underManagement;
  }


  public void setUnderManagement(Boolean underManagement) {
    this.underManagement = underManagement;
  }


  public ModelsSSHServerGroupsServerGroupResponse serverCount(Integer serverCount) {
    
    this.serverCount = serverCount;
    return this;
  }

   /**
   * Get serverCount
   * @return serverCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getServerCount() {
    return serverCount;
  }


  public void setServerCount(Integer serverCount) {
    this.serverCount = serverCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSHServerGroupsServerGroupResponse modelsSSHServerGroupsServerGroupResponse = (ModelsSSHServerGroupsServerGroupResponse) o;
    return Objects.equals(this.id, modelsSSHServerGroupsServerGroupResponse.id) &&
        Objects.equals(this.owner, modelsSSHServerGroupsServerGroupResponse.owner) &&
        Objects.equals(this.groupName, modelsSSHServerGroupsServerGroupResponse.groupName) &&
        Objects.equals(this.syncSchedule, modelsSSHServerGroupsServerGroupResponse.syncSchedule) &&
        Objects.equals(this.underManagement, modelsSSHServerGroupsServerGroupResponse.underManagement) &&
        Objects.equals(this.serverCount, modelsSSHServerGroupsServerGroupResponse.serverCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, groupName, syncSchedule, underManagement, serverCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSHServerGroupsServerGroupResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    syncSchedule: ").append(toIndentedString(syncSchedule)).append("\n");
    sb.append("    underManagement: ").append(toIndentedString(underManagement)).append("\n");
    sb.append("    serverCount: ").append(toIndentedString(serverCount)).append("\n");
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
    openapiFields.add("Owner");
    openapiFields.add("GroupName");
    openapiFields.add("SyncSchedule");
    openapiFields.add("UnderManagement");
    openapiFields.add("ServerCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSHServerGroupsServerGroupResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSHServerGroupsServerGroupResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSHServerGroupsServerGroupResponse is not found in the empty JSON string", ModelsSSHServerGroupsServerGroupResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSHServerGroupsServerGroupResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSHServerGroupsServerGroupResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      // validate the optional field `Owner`
      if (jsonObj.get("Owner") != null && !jsonObj.get("Owner").isJsonNull()) {
        ModelsSSHUsersSshUserResponse.validateJsonObject(jsonObj.getAsJsonObject("Owner"));
      }
      if ((jsonObj.get("GroupName") != null && !jsonObj.get("GroupName").isJsonNull()) && !jsonObj.get("GroupName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GroupName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GroupName").toString()));
      }
      // validate the optional field `SyncSchedule`
      if (jsonObj.get("SyncSchedule") != null && !jsonObj.get("SyncSchedule").isJsonNull()) {
        KeyfactorCommonSchedulingKeyfactorSchedule.validateJsonObject(jsonObj.getAsJsonObject("SyncSchedule"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSHServerGroupsServerGroupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSHServerGroupsServerGroupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSHServerGroupsServerGroupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSHServerGroupsServerGroupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSHServerGroupsServerGroupResponse>() {
           @Override
           public void write(JsonWriter out, ModelsSSHServerGroupsServerGroupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSHServerGroupsServerGroupResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSHServerGroupsServerGroupResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSHServerGroupsServerGroupResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsSSHServerGroupsServerGroupResponse
  */
  public static ModelsSSHServerGroupsServerGroupResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSHServerGroupsServerGroupResponse.class);
  }

 /**
  * Convert an instance of ModelsSSHServerGroupsServerGroupResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

