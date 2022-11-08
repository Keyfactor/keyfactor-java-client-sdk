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
import com.keyfactor.command.client.model.ModelsSecurityIdentitiesPermissionRolesPairResponse;
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
 * ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse {
  public static final String SERIALIZED_NAME_IDENTITY = "Identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private String identity;

  public static final String SERIALIZED_NAME_SECURED_AREA_PERMISSIONS = "SecuredAreaPermissions";
  @SerializedName(SERIALIZED_NAME_SECURED_AREA_PERMISSIONS)
  private List<ModelsSecurityIdentitiesPermissionRolesPairResponse> securedAreaPermissions = null;

  public static final String SERIALIZED_NAME_COLLECTION_PERMISSIONS = "CollectionPermissions";
  @SerializedName(SERIALIZED_NAME_COLLECTION_PERMISSIONS)
  private List<ModelsSecurityIdentitiesPermissionRolesPairResponse> collectionPermissions = null;

  public static final String SERIALIZED_NAME_CONTAINER_PERMISSIONS = "ContainerPermissions";
  @SerializedName(SERIALIZED_NAME_CONTAINER_PERMISSIONS)
  private List<ModelsSecurityIdentitiesPermissionRolesPairResponse> containerPermissions = null;

  public ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse() {
  }

  public ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse identity(String identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdentity() {
    return identity;
  }


  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse securedAreaPermissions(List<ModelsSecurityIdentitiesPermissionRolesPairResponse> securedAreaPermissions) {
    
    this.securedAreaPermissions = securedAreaPermissions;
    return this;
  }

  public ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse addSecuredAreaPermissionsItem(ModelsSecurityIdentitiesPermissionRolesPairResponse securedAreaPermissionsItem) {
    if (this.securedAreaPermissions == null) {
      this.securedAreaPermissions = new ArrayList<>();
    }
    this.securedAreaPermissions.add(securedAreaPermissionsItem);
    return this;
  }

   /**
   * Get securedAreaPermissions
   * @return securedAreaPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelsSecurityIdentitiesPermissionRolesPairResponse> getSecuredAreaPermissions() {
    return securedAreaPermissions;
  }


  public void setSecuredAreaPermissions(List<ModelsSecurityIdentitiesPermissionRolesPairResponse> securedAreaPermissions) {
    this.securedAreaPermissions = securedAreaPermissions;
  }


  public ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse collectionPermissions(List<ModelsSecurityIdentitiesPermissionRolesPairResponse> collectionPermissions) {
    
    this.collectionPermissions = collectionPermissions;
    return this;
  }

  public ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse addCollectionPermissionsItem(ModelsSecurityIdentitiesPermissionRolesPairResponse collectionPermissionsItem) {
    if (this.collectionPermissions == null) {
      this.collectionPermissions = new ArrayList<>();
    }
    this.collectionPermissions.add(collectionPermissionsItem);
    return this;
  }

   /**
   * Get collectionPermissions
   * @return collectionPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelsSecurityIdentitiesPermissionRolesPairResponse> getCollectionPermissions() {
    return collectionPermissions;
  }


  public void setCollectionPermissions(List<ModelsSecurityIdentitiesPermissionRolesPairResponse> collectionPermissions) {
    this.collectionPermissions = collectionPermissions;
  }


  public ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse containerPermissions(List<ModelsSecurityIdentitiesPermissionRolesPairResponse> containerPermissions) {
    
    this.containerPermissions = containerPermissions;
    return this;
  }

  public ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse addContainerPermissionsItem(ModelsSecurityIdentitiesPermissionRolesPairResponse containerPermissionsItem) {
    if (this.containerPermissions == null) {
      this.containerPermissions = new ArrayList<>();
    }
    this.containerPermissions.add(containerPermissionsItem);
    return this;
  }

   /**
   * Get containerPermissions
   * @return containerPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelsSecurityIdentitiesPermissionRolesPairResponse> getContainerPermissions() {
    return containerPermissions;
  }


  public void setContainerPermissions(List<ModelsSecurityIdentitiesPermissionRolesPairResponse> containerPermissions) {
    this.containerPermissions = containerPermissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse modelsSecurityIdentitiesSecurityIdentityPermissionsResponse = (ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse) o;
    return Objects.equals(this.identity, modelsSecurityIdentitiesSecurityIdentityPermissionsResponse.identity) &&
        Objects.equals(this.securedAreaPermissions, modelsSecurityIdentitiesSecurityIdentityPermissionsResponse.securedAreaPermissions) &&
        Objects.equals(this.collectionPermissions, modelsSecurityIdentitiesSecurityIdentityPermissionsResponse.collectionPermissions) &&
        Objects.equals(this.containerPermissions, modelsSecurityIdentitiesSecurityIdentityPermissionsResponse.containerPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identity, securedAreaPermissions, collectionPermissions, containerPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse {\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    securedAreaPermissions: ").append(toIndentedString(securedAreaPermissions)).append("\n");
    sb.append("    collectionPermissions: ").append(toIndentedString(collectionPermissions)).append("\n");
    sb.append("    containerPermissions: ").append(toIndentedString(containerPermissions)).append("\n");
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
    openapiFields.add("Identity");
    openapiFields.add("SecuredAreaPermissions");
    openapiFields.add("CollectionPermissions");
    openapiFields.add("ContainerPermissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse is not found in the empty JSON string", ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Identity") != null && !jsonObj.get("Identity").isJsonNull()) && !jsonObj.get("Identity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Identity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Identity").toString()));
      }
      if (jsonObj.get("SecuredAreaPermissions") != null && !jsonObj.get("SecuredAreaPermissions").isJsonNull()) {
        JsonArray jsonArraysecuredAreaPermissions = jsonObj.getAsJsonArray("SecuredAreaPermissions");
        if (jsonArraysecuredAreaPermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SecuredAreaPermissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SecuredAreaPermissions` to be an array in the JSON string but got `%s`", jsonObj.get("SecuredAreaPermissions").toString()));
          }

          // validate the optional field `SecuredAreaPermissions` (array)
          for (int i = 0; i < jsonArraysecuredAreaPermissions.size(); i++) {
            ModelsSecurityIdentitiesPermissionRolesPairResponse.validateJsonObject(jsonArraysecuredAreaPermissions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("CollectionPermissions") != null && !jsonObj.get("CollectionPermissions").isJsonNull()) {
        JsonArray jsonArraycollectionPermissions = jsonObj.getAsJsonArray("CollectionPermissions");
        if (jsonArraycollectionPermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("CollectionPermissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `CollectionPermissions` to be an array in the JSON string but got `%s`", jsonObj.get("CollectionPermissions").toString()));
          }

          // validate the optional field `CollectionPermissions` (array)
          for (int i = 0; i < jsonArraycollectionPermissions.size(); i++) {
            ModelsSecurityIdentitiesPermissionRolesPairResponse.validateJsonObject(jsonArraycollectionPermissions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("ContainerPermissions") != null && !jsonObj.get("ContainerPermissions").isJsonNull()) {
        JsonArray jsonArraycontainerPermissions = jsonObj.getAsJsonArray("ContainerPermissions");
        if (jsonArraycontainerPermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ContainerPermissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ContainerPermissions` to be an array in the JSON string but got `%s`", jsonObj.get("ContainerPermissions").toString()));
          }

          // validate the optional field `ContainerPermissions` (array)
          for (int i = 0; i < jsonArraycontainerPermissions.size(); i++) {
            ModelsSecurityIdentitiesPermissionRolesPairResponse.validateJsonObject(jsonArraycontainerPermissions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse>() {
           @Override
           public void write(JsonWriter out, ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse
  */
  public static ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse.class);
  }

 /**
  * Convert an instance of ModelsSecurityIdentitiesSecurityIdentityPermissionsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
