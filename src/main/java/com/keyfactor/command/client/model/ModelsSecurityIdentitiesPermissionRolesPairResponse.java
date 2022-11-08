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
import java.util.ArrayList;
import java.util.List;

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
 * ModelsSecurityIdentitiesPermissionRolesPairResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsSecurityIdentitiesPermissionRolesPairResponse {
  public static final String SERIALIZED_NAME_PERMISSION = "Permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private String permission;

  public static final String SERIALIZED_NAME_GRANTED_BY_ROLES = "GrantedByRoles";
  @SerializedName(SERIALIZED_NAME_GRANTED_BY_ROLES)
  private List<String> grantedByRoles = null;

  public ModelsSecurityIdentitiesPermissionRolesPairResponse() {
  }

  public ModelsSecurityIdentitiesPermissionRolesPairResponse permission(String permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Get permission
   * @return permission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPermission() {
    return permission;
  }


  public void setPermission(String permission) {
    this.permission = permission;
  }


  public ModelsSecurityIdentitiesPermissionRolesPairResponse grantedByRoles(List<String> grantedByRoles) {
    
    this.grantedByRoles = grantedByRoles;
    return this;
  }

  public ModelsSecurityIdentitiesPermissionRolesPairResponse addGrantedByRolesItem(String grantedByRolesItem) {
    if (this.grantedByRoles == null) {
      this.grantedByRoles = new ArrayList<>();
    }
    this.grantedByRoles.add(grantedByRolesItem);
    return this;
  }

   /**
   * Get grantedByRoles
   * @return grantedByRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGrantedByRoles() {
    return grantedByRoles;
  }


  public void setGrantedByRoles(List<String> grantedByRoles) {
    this.grantedByRoles = grantedByRoles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSecurityIdentitiesPermissionRolesPairResponse modelsSecurityIdentitiesPermissionRolesPairResponse = (ModelsSecurityIdentitiesPermissionRolesPairResponse) o;
    return Objects.equals(this.permission, modelsSecurityIdentitiesPermissionRolesPairResponse.permission) &&
        Objects.equals(this.grantedByRoles, modelsSecurityIdentitiesPermissionRolesPairResponse.grantedByRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permission, grantedByRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSecurityIdentitiesPermissionRolesPairResponse {\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    grantedByRoles: ").append(toIndentedString(grantedByRoles)).append("\n");
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
    openapiFields.add("Permission");
    openapiFields.add("GrantedByRoles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSecurityIdentitiesPermissionRolesPairResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSecurityIdentitiesPermissionRolesPairResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSecurityIdentitiesPermissionRolesPairResponse is not found in the empty JSON string", ModelsSecurityIdentitiesPermissionRolesPairResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSecurityIdentitiesPermissionRolesPairResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSecurityIdentitiesPermissionRolesPairResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Permission") != null && !jsonObj.get("Permission").isJsonNull()) && !jsonObj.get("Permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Permission").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("GrantedByRoles") != null && !jsonObj.get("GrantedByRoles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `GrantedByRoles` to be an array in the JSON string but got `%s`", jsonObj.get("GrantedByRoles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSecurityIdentitiesPermissionRolesPairResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSecurityIdentitiesPermissionRolesPairResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSecurityIdentitiesPermissionRolesPairResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSecurityIdentitiesPermissionRolesPairResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSecurityIdentitiesPermissionRolesPairResponse>() {
           @Override
           public void write(JsonWriter out, ModelsSecurityIdentitiesPermissionRolesPairResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSecurityIdentitiesPermissionRolesPairResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSecurityIdentitiesPermissionRolesPairResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSecurityIdentitiesPermissionRolesPairResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsSecurityIdentitiesPermissionRolesPairResponse
  */
  public static ModelsSecurityIdentitiesPermissionRolesPairResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSecurityIdentitiesPermissionRolesPairResponse.class);
  }

 /**
  * Convert an instance of ModelsSecurityIdentitiesPermissionRolesPairResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

