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
 * ModelsSecuritySecurityRolesSecurityRoleResponseBase
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsSecuritySecurityRolesSecurityRoleResponseBase {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PERMISSIONS = "Permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = null;

  public ModelsSecuritySecurityRolesSecurityRoleResponseBase() {
  }

  public ModelsSecuritySecurityRolesSecurityRoleResponseBase name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the created role
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the created role")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ModelsSecuritySecurityRolesSecurityRoleResponseBase permissions(List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public ModelsSecuritySecurityRolesSecurityRoleResponseBase addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * The permissions included in the created security role
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The permissions included in the created security role")

  public List<String> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSecuritySecurityRolesSecurityRoleResponseBase modelsSecuritySecurityRolesSecurityRoleResponseBase = (ModelsSecuritySecurityRolesSecurityRoleResponseBase) o;
    return Objects.equals(this.name, modelsSecuritySecurityRolesSecurityRoleResponseBase.name) &&
        Objects.equals(this.permissions, modelsSecuritySecurityRolesSecurityRoleResponseBase.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSecuritySecurityRolesSecurityRoleResponseBase {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Permissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSecuritySecurityRolesSecurityRoleResponseBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSecuritySecurityRolesSecurityRoleResponseBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSecuritySecurityRolesSecurityRoleResponseBase is not found in the empty JSON string", ModelsSecuritySecurityRolesSecurityRoleResponseBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSecuritySecurityRolesSecurityRoleResponseBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSecuritySecurityRolesSecurityRoleResponseBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Permissions") != null && !jsonObj.get("Permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Permissions` to be an array in the JSON string but got `%s`", jsonObj.get("Permissions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSecuritySecurityRolesSecurityRoleResponseBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSecuritySecurityRolesSecurityRoleResponseBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSecuritySecurityRolesSecurityRoleResponseBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSecuritySecurityRolesSecurityRoleResponseBase.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSecuritySecurityRolesSecurityRoleResponseBase>() {
           @Override
           public void write(JsonWriter out, ModelsSecuritySecurityRolesSecurityRoleResponseBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSecuritySecurityRolesSecurityRoleResponseBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSecuritySecurityRolesSecurityRoleResponseBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSecuritySecurityRolesSecurityRoleResponseBase
  * @throws IOException if the JSON string is invalid with respect to ModelsSecuritySecurityRolesSecurityRoleResponseBase
  */
  public static ModelsSecuritySecurityRolesSecurityRoleResponseBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSecuritySecurityRolesSecurityRoleResponseBase.class);
  }

 /**
  * Convert an instance of ModelsSecuritySecurityRolesSecurityRoleResponseBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

