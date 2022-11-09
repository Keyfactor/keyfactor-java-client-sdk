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
 * A public DTO representing the result of a security identity lookup.
 */
@ApiModel(description = "A public DTO representing the result of a security identity lookup.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsSecurityIdentitiesSecurityIdentityLookupResponse {
  public static final String SERIALIZED_NAME_VALID = "Valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public ModelsSecurityIdentitiesSecurityIdentityLookupResponse() {
  }

  public ModelsSecurityIdentitiesSecurityIdentityLookupResponse valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Whether or not the identity is valid.
   * @return valid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the identity is valid.")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSecurityIdentitiesSecurityIdentityLookupResponse modelsSecurityIdentitiesSecurityIdentityLookupResponse = (ModelsSecurityIdentitiesSecurityIdentityLookupResponse) o;
    return Objects.equals(this.valid, modelsSecurityIdentitiesSecurityIdentityLookupResponse.valid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSecurityIdentitiesSecurityIdentityLookupResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
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
    openapiFields.add("Valid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSecurityIdentitiesSecurityIdentityLookupResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSecurityIdentitiesSecurityIdentityLookupResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSecurityIdentitiesSecurityIdentityLookupResponse is not found in the empty JSON string", ModelsSecurityIdentitiesSecurityIdentityLookupResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSecurityIdentitiesSecurityIdentityLookupResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSecurityIdentitiesSecurityIdentityLookupResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSecurityIdentitiesSecurityIdentityLookupResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSecurityIdentitiesSecurityIdentityLookupResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSecurityIdentitiesSecurityIdentityLookupResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSecurityIdentitiesSecurityIdentityLookupResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSecurityIdentitiesSecurityIdentityLookupResponse>() {
           @Override
           public void write(JsonWriter out, ModelsSecurityIdentitiesSecurityIdentityLookupResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSecurityIdentitiesSecurityIdentityLookupResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSecurityIdentitiesSecurityIdentityLookupResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSecurityIdentitiesSecurityIdentityLookupResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsSecurityIdentitiesSecurityIdentityLookupResponse
  */
  public static ModelsSecurityIdentitiesSecurityIdentityLookupResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSecurityIdentitiesSecurityIdentityLookupResponse.class);
  }

 /**
  * Convert an instance of ModelsSecurityIdentitiesSecurityIdentityLookupResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

