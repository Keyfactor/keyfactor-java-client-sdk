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
import com.keyfactor.command.client.model.ModelsSecurityIdentitiesSecurityIdentityIdentifier;
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
 * ModelsSecuritySecurityRolesSecurityRoleCreationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsSecuritySecurityRolesSecurityRoleCreationRequest {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_PRIVATE = "Private";
  @SerializedName(SERIALIZED_NAME_PRIVATE)
  private Boolean _private;

  public static final String SERIALIZED_NAME_PERMISSIONS = "Permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<String> permissions = null;

  public static final String SERIALIZED_NAME_IDENTITIES = "Identities";
  @SerializedName(SERIALIZED_NAME_IDENTITIES)
  private List<ModelsSecurityIdentitiesSecurityIdentityIdentifier> identities = null;

  public ModelsSecuritySecurityRolesSecurityRoleCreationRequest() {
  }

  public ModelsSecuritySecurityRolesSecurityRoleCreationRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the security role to create
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the security role to create")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ModelsSecuritySecurityRolesSecurityRoleCreationRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description to be used on the created security role
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The description to be used on the created security role")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ModelsSecuritySecurityRolesSecurityRoleCreationRequest enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether or not the security role should be enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the security role should be enabled")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public ModelsSecuritySecurityRolesSecurityRoleCreationRequest _private(Boolean _private) {
    
    this._private = _private;
    return this;
  }

   /**
   * Whether or not the security role should be private
   * @return _private
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the security role should be private")

  public Boolean getPrivate() {
    return _private;
  }


  public void setPrivate(Boolean _private) {
    this._private = _private;
  }


  public ModelsSecuritySecurityRolesSecurityRoleCreationRequest permissions(List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public ModelsSecuritySecurityRolesSecurityRoleCreationRequest addPermissionsItem(String permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * The permissions to include in the role. These must be supplied in the format \&quot;Area:Permission\&quot;
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The permissions to include in the role. These must be supplied in the format \"Area:Permission\"")

  public List<String> getPermissions() {
    return permissions;
  }


  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  public ModelsSecuritySecurityRolesSecurityRoleCreationRequest identities(List<ModelsSecurityIdentitiesSecurityIdentityIdentifier> identities) {
    
    this.identities = identities;
    return this;
  }

  public ModelsSecuritySecurityRolesSecurityRoleCreationRequest addIdentitiesItem(ModelsSecurityIdentitiesSecurityIdentityIdentifier identitiesItem) {
    if (this.identities == null) {
      this.identities = new ArrayList<>();
    }
    this.identities.add(identitiesItem);
    return this;
  }

   /**
   * The Keyfactor identities to assign to the created role
   * @return identities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Keyfactor identities to assign to the created role")

  public List<ModelsSecurityIdentitiesSecurityIdentityIdentifier> getIdentities() {
    return identities;
  }


  public void setIdentities(List<ModelsSecurityIdentitiesSecurityIdentityIdentifier> identities) {
    this.identities = identities;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSecuritySecurityRolesSecurityRoleCreationRequest modelsSecuritySecurityRolesSecurityRoleCreationRequest = (ModelsSecuritySecurityRolesSecurityRoleCreationRequest) o;
    return Objects.equals(this.name, modelsSecuritySecurityRolesSecurityRoleCreationRequest.name) &&
        Objects.equals(this.description, modelsSecuritySecurityRolesSecurityRoleCreationRequest.description) &&
        Objects.equals(this.enabled, modelsSecuritySecurityRolesSecurityRoleCreationRequest.enabled) &&
        Objects.equals(this._private, modelsSecuritySecurityRolesSecurityRoleCreationRequest._private) &&
        Objects.equals(this.permissions, modelsSecuritySecurityRolesSecurityRoleCreationRequest.permissions) &&
        Objects.equals(this.identities, modelsSecuritySecurityRolesSecurityRoleCreationRequest.identities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, enabled, _private, permissions, identities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSecuritySecurityRolesSecurityRoleCreationRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    identities: ").append(toIndentedString(identities)).append("\n");
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
    openapiFields.add("Description");
    openapiFields.add("Enabled");
    openapiFields.add("Private");
    openapiFields.add("Permissions");
    openapiFields.add("Identities");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("Description");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSecuritySecurityRolesSecurityRoleCreationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSecuritySecurityRolesSecurityRoleCreationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSecuritySecurityRolesSecurityRoleCreationRequest is not found in the empty JSON string", ModelsSecuritySecurityRolesSecurityRoleCreationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSecuritySecurityRolesSecurityRoleCreationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSecuritySecurityRolesSecurityRoleCreationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsSecuritySecurityRolesSecurityRoleCreationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (!jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Permissions") != null && !jsonObj.get("Permissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Permissions` to be an array in the JSON string but got `%s`", jsonObj.get("Permissions").toString()));
      }
      if (jsonObj.get("Identities") != null && !jsonObj.get("Identities").isJsonNull()) {
        JsonArray jsonArrayidentities = jsonObj.getAsJsonArray("Identities");
        if (jsonArrayidentities != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Identities").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Identities` to be an array in the JSON string but got `%s`", jsonObj.get("Identities").toString()));
          }

          // validate the optional field `Identities` (array)
          for (int i = 0; i < jsonArrayidentities.size(); i++) {
            ModelsSecurityIdentitiesSecurityIdentityIdentifier.validateJsonObject(jsonArrayidentities.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSecuritySecurityRolesSecurityRoleCreationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSecuritySecurityRolesSecurityRoleCreationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSecuritySecurityRolesSecurityRoleCreationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSecuritySecurityRolesSecurityRoleCreationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSecuritySecurityRolesSecurityRoleCreationRequest>() {
           @Override
           public void write(JsonWriter out, ModelsSecuritySecurityRolesSecurityRoleCreationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSecuritySecurityRolesSecurityRoleCreationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSecuritySecurityRolesSecurityRoleCreationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSecuritySecurityRolesSecurityRoleCreationRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsSecuritySecurityRolesSecurityRoleCreationRequest
  */
  public static ModelsSecuritySecurityRolesSecurityRoleCreationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSecuritySecurityRolesSecurityRoleCreationRequest.class);
  }

 /**
  * Convert an instance of ModelsSecuritySecurityRolesSecurityRoleCreationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

