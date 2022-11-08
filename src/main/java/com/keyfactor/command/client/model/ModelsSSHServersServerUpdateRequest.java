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
 * ModelsSSHServersServerUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsSSHServersServerUpdateRequest {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_UNDER_MANAGEMENT = "UnderManagement";
  @SerializedName(SERIALIZED_NAME_UNDER_MANAGEMENT)
  private Boolean underManagement;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public ModelsSSHServersServerUpdateRequest() {
  }

  public ModelsSSHServersServerUpdateRequest id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public ModelsSSHServersServerUpdateRequest underManagement(Boolean underManagement) {
    
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


  public ModelsSSHServersServerUpdateRequest port(Integer port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPort() {
    return port;
  }


  public void setPort(Integer port) {
    this.port = port;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSHServersServerUpdateRequest modelsSSHServersServerUpdateRequest = (ModelsSSHServersServerUpdateRequest) o;
    return Objects.equals(this.id, modelsSSHServersServerUpdateRequest.id) &&
        Objects.equals(this.underManagement, modelsSSHServersServerUpdateRequest.underManagement) &&
        Objects.equals(this.port, modelsSSHServersServerUpdateRequest.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, underManagement, port);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSHServersServerUpdateRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    underManagement: ").append(toIndentedString(underManagement)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
    openapiFields.add("UnderManagement");
    openapiFields.add("Port");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSHServersServerUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSHServersServerUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSHServersServerUpdateRequest is not found in the empty JSON string", ModelsSSHServersServerUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSHServersServerUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSHServersServerUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsSSHServersServerUpdateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSHServersServerUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSHServersServerUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSHServersServerUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSHServersServerUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSHServersServerUpdateRequest>() {
           @Override
           public void write(JsonWriter out, ModelsSSHServersServerUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSHServersServerUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSHServersServerUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSHServersServerUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsSSHServersServerUpdateRequest
  */
  public static ModelsSSHServersServerUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSHServersServerUpdateRequest.class);
  }

 /**
  * Convert an instance of ModelsSSHServersServerUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

