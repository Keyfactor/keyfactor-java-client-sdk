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
 * ModelsSSHKeysKeyGenerationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsSSHKeysKeyGenerationRequest {
  public static final String SERIALIZED_NAME_KEY_TYPE = "KeyType";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private String keyType;

  public static final String SERIALIZED_NAME_PRIVATE_KEY_FORMAT = "PrivateKeyFormat";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY_FORMAT)
  private String privateKeyFormat;

  public static final String SERIALIZED_NAME_KEY_LENGTH = "KeyLength";
  @SerializedName(SERIALIZED_NAME_KEY_LENGTH)
  private Integer keyLength;

  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public ModelsSSHKeysKeyGenerationRequest() {
  }

  public ModelsSSHKeysKeyGenerationRequest keyType(String keyType) {
    
    this.keyType = keyType;
    return this;
  }

   /**
   * Get keyType
   * @return keyType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getKeyType() {
    return keyType;
  }


  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }


  public ModelsSSHKeysKeyGenerationRequest privateKeyFormat(String privateKeyFormat) {
    
    this.privateKeyFormat = privateKeyFormat;
    return this;
  }

   /**
   * Get privateKeyFormat
   * @return privateKeyFormat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPrivateKeyFormat() {
    return privateKeyFormat;
  }


  public void setPrivateKeyFormat(String privateKeyFormat) {
    this.privateKeyFormat = privateKeyFormat;
  }


  public ModelsSSHKeysKeyGenerationRequest keyLength(Integer keyLength) {
    
    this.keyLength = keyLength;
    return this;
  }

   /**
   * Get keyLength
   * @return keyLength
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getKeyLength() {
    return keyLength;
  }


  public void setKeyLength(Integer keyLength) {
    this.keyLength = keyLength;
  }


  public ModelsSSHKeysKeyGenerationRequest email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ModelsSSHKeysKeyGenerationRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public ModelsSSHKeysKeyGenerationRequest comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSHKeysKeyGenerationRequest modelsSSHKeysKeyGenerationRequest = (ModelsSSHKeysKeyGenerationRequest) o;
    return Objects.equals(this.keyType, modelsSSHKeysKeyGenerationRequest.keyType) &&
        Objects.equals(this.privateKeyFormat, modelsSSHKeysKeyGenerationRequest.privateKeyFormat) &&
        Objects.equals(this.keyLength, modelsSSHKeysKeyGenerationRequest.keyLength) &&
        Objects.equals(this.email, modelsSSHKeysKeyGenerationRequest.email) &&
        Objects.equals(this.password, modelsSSHKeysKeyGenerationRequest.password) &&
        Objects.equals(this.comment, modelsSSHKeysKeyGenerationRequest.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyType, privateKeyFormat, keyLength, email, password, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSHKeysKeyGenerationRequest {\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    privateKeyFormat: ").append(toIndentedString(privateKeyFormat)).append("\n");
    sb.append("    keyLength: ").append(toIndentedString(keyLength)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
    openapiFields.add("KeyType");
    openapiFields.add("PrivateKeyFormat");
    openapiFields.add("KeyLength");
    openapiFields.add("Email");
    openapiFields.add("Password");
    openapiFields.add("Comment");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("KeyType");
    openapiRequiredFields.add("PrivateKeyFormat");
    openapiRequiredFields.add("KeyLength");
    openapiRequiredFields.add("Email");
    openapiRequiredFields.add("Password");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSHKeysKeyGenerationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSHKeysKeyGenerationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSHKeysKeyGenerationRequest is not found in the empty JSON string", ModelsSSHKeysKeyGenerationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSHKeysKeyGenerationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSHKeysKeyGenerationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsSSHKeysKeyGenerationRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("KeyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeyType").toString()));
      }
      if (!jsonObj.get("PrivateKeyFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrivateKeyFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrivateKeyFormat").toString()));
      }
      if (!jsonObj.get("Email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Email").toString()));
      }
      if (!jsonObj.get("Password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Password").toString()));
      }
      if ((jsonObj.get("Comment") != null && !jsonObj.get("Comment").isJsonNull()) && !jsonObj.get("Comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSHKeysKeyGenerationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSHKeysKeyGenerationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSHKeysKeyGenerationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSHKeysKeyGenerationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSHKeysKeyGenerationRequest>() {
           @Override
           public void write(JsonWriter out, ModelsSSHKeysKeyGenerationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSHKeysKeyGenerationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSHKeysKeyGenerationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSHKeysKeyGenerationRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsSSHKeysKeyGenerationRequest
  */
  public static ModelsSSHKeysKeyGenerationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSHKeysKeyGenerationRequest.class);
  }

 /**
  * Convert an instance of ModelsSSHKeysKeyGenerationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

