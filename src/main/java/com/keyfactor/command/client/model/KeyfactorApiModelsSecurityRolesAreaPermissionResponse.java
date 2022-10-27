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
 * KeyfactorApiModelsSecurityRolesAreaPermissionResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class KeyfactorApiModelsSecurityRolesAreaPermissionResponse {
  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AREA = "Area";
  @SerializedName(SERIALIZED_NAME_AREA)
  private String area;

  public static final String SERIALIZED_NAME_PERMISSION = "Permission";
  @SerializedName(SERIALIZED_NAME_PERMISSION)
  private String permission;

  public KeyfactorApiModelsSecurityRolesAreaPermissionResponse() {
  }

  public KeyfactorApiModelsSecurityRolesAreaPermissionResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public KeyfactorApiModelsSecurityRolesAreaPermissionResponse area(String area) {
    
    this.area = area;
    return this;
  }

   /**
   * Get area
   * @return area
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getArea() {
    return area;
  }


  public void setArea(String area) {
    this.area = area;
  }


  public KeyfactorApiModelsSecurityRolesAreaPermissionResponse permission(String permission) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsSecurityRolesAreaPermissionResponse keyfactorApiModelsSecurityRolesAreaPermissionResponse = (KeyfactorApiModelsSecurityRolesAreaPermissionResponse) o;
    return Objects.equals(this.type, keyfactorApiModelsSecurityRolesAreaPermissionResponse.type) &&
        Objects.equals(this.area, keyfactorApiModelsSecurityRolesAreaPermissionResponse.area) &&
        Objects.equals(this.permission, keyfactorApiModelsSecurityRolesAreaPermissionResponse.permission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, area, permission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsSecurityRolesAreaPermissionResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
    openapiFields.add("Type");
    openapiFields.add("Area");
    openapiFields.add("Permission");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsSecurityRolesAreaPermissionResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsSecurityRolesAreaPermissionResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsSecurityRolesAreaPermissionResponse is not found in the empty JSON string", KeyfactorApiModelsSecurityRolesAreaPermissionResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsSecurityRolesAreaPermissionResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsSecurityRolesAreaPermissionResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
      if ((jsonObj.get("Area") != null && !jsonObj.get("Area").isJsonNull()) && !jsonObj.get("Area").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Area` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Area").toString()));
      }
      if ((jsonObj.get("Permission") != null && !jsonObj.get("Permission").isJsonNull()) && !jsonObj.get("Permission").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Permission` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Permission").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsSecurityRolesAreaPermissionResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsSecurityRolesAreaPermissionResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsSecurityRolesAreaPermissionResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsSecurityRolesAreaPermissionResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsSecurityRolesAreaPermissionResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsSecurityRolesAreaPermissionResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsSecurityRolesAreaPermissionResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsSecurityRolesAreaPermissionResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsSecurityRolesAreaPermissionResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsSecurityRolesAreaPermissionResponse
  */
  public static KeyfactorApiModelsSecurityRolesAreaPermissionResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsSecurityRolesAreaPermissionResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsSecurityRolesAreaPermissionResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

