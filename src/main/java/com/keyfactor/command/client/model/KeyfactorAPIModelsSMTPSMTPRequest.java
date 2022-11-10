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
 * KeyfactorAPIModelsSMTPSMTPRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorAPIModelsSMTPSMTPRequest {
  public static final String SERIALIZED_NAME_HOST = "Host";
  @SerializedName(SERIALIZED_NAME_HOST)
  private String host;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PORT = "Port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private Integer port;

  public static final String SERIALIZED_NAME_RELAY_AUTHENTICATION_TYPE = "RelayAuthenticationType";
  @SerializedName(SERIALIZED_NAME_RELAY_AUTHENTICATION_TYPE)
  private Integer relayAuthenticationType;

  public static final String SERIALIZED_NAME_RELAY_PASSWORD = "RelayPassword";
  @SerializedName(SERIALIZED_NAME_RELAY_PASSWORD)
  private String relayPassword;

  public static final String SERIALIZED_NAME_RELAY_USERNAME = "RelayUsername";
  @SerializedName(SERIALIZED_NAME_RELAY_USERNAME)
  private String relayUsername;

  public static final String SERIALIZED_NAME_SENDER_ACCOUNT = "SenderAccount";
  @SerializedName(SERIALIZED_NAME_SENDER_ACCOUNT)
  private String senderAccount;

  public static final String SERIALIZED_NAME_SENDER_NAME = "SenderName";
  @SerializedName(SERIALIZED_NAME_SENDER_NAME)
  private String senderName;

  public static final String SERIALIZED_NAME_USE_S_S_L = "UseSSL";
  @SerializedName(SERIALIZED_NAME_USE_S_S_L)
  private Boolean useSSL;

  public KeyfactorAPIModelsSMTPSMTPRequest() {
  }

  public KeyfactorAPIModelsSMTPSMTPRequest host(String host) {
    
    this.host = host;
    return this;
  }

   /**
   * Get host
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHost() {
    return host;
  }


  public void setHost(String host) {
    this.host = host;
  }


  public KeyfactorAPIModelsSMTPSMTPRequest id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public KeyfactorAPIModelsSMTPSMTPRequest port(Integer port) {
    
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


  public KeyfactorAPIModelsSMTPSMTPRequest relayAuthenticationType(Integer relayAuthenticationType) {
    
    this.relayAuthenticationType = relayAuthenticationType;
    return this;
  }

   /**
   * Get relayAuthenticationType
   * @return relayAuthenticationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRelayAuthenticationType() {
    return relayAuthenticationType;
  }


  public void setRelayAuthenticationType(Integer relayAuthenticationType) {
    this.relayAuthenticationType = relayAuthenticationType;
  }


  public KeyfactorAPIModelsSMTPSMTPRequest relayPassword(String relayPassword) {
    
    this.relayPassword = relayPassword;
    return this;
  }

   /**
   * Get relayPassword
   * @return relayPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRelayPassword() {
    return relayPassword;
  }


  public void setRelayPassword(String relayPassword) {
    this.relayPassword = relayPassword;
  }


  public KeyfactorAPIModelsSMTPSMTPRequest relayUsername(String relayUsername) {
    
    this.relayUsername = relayUsername;
    return this;
  }

   /**
   * Get relayUsername
   * @return relayUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRelayUsername() {
    return relayUsername;
  }


  public void setRelayUsername(String relayUsername) {
    this.relayUsername = relayUsername;
  }


  public KeyfactorAPIModelsSMTPSMTPRequest senderAccount(String senderAccount) {
    
    this.senderAccount = senderAccount;
    return this;
  }

   /**
   * Get senderAccount
   * @return senderAccount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSenderAccount() {
    return senderAccount;
  }


  public void setSenderAccount(String senderAccount) {
    this.senderAccount = senderAccount;
  }


  public KeyfactorAPIModelsSMTPSMTPRequest senderName(String senderName) {
    
    this.senderName = senderName;
    return this;
  }

   /**
   * Get senderName
   * @return senderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSenderName() {
    return senderName;
  }


  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }


  public KeyfactorAPIModelsSMTPSMTPRequest useSSL(Boolean useSSL) {
    
    this.useSSL = useSSL;
    return this;
  }

   /**
   * Get useSSL
   * @return useSSL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseSSL() {
    return useSSL;
  }


  public void setUseSSL(Boolean useSSL) {
    this.useSSL = useSSL;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorAPIModelsSMTPSMTPRequest keyfactorAPIModelsSMTPSMTPRequest = (KeyfactorAPIModelsSMTPSMTPRequest) o;
    return Objects.equals(this.host, keyfactorAPIModelsSMTPSMTPRequest.host) &&
        Objects.equals(this.id, keyfactorAPIModelsSMTPSMTPRequest.id) &&
        Objects.equals(this.port, keyfactorAPIModelsSMTPSMTPRequest.port) &&
        Objects.equals(this.relayAuthenticationType, keyfactorAPIModelsSMTPSMTPRequest.relayAuthenticationType) &&
        Objects.equals(this.relayPassword, keyfactorAPIModelsSMTPSMTPRequest.relayPassword) &&
        Objects.equals(this.relayUsername, keyfactorAPIModelsSMTPSMTPRequest.relayUsername) &&
        Objects.equals(this.senderAccount, keyfactorAPIModelsSMTPSMTPRequest.senderAccount) &&
        Objects.equals(this.senderName, keyfactorAPIModelsSMTPSMTPRequest.senderName) &&
        Objects.equals(this.useSSL, keyfactorAPIModelsSMTPSMTPRequest.useSSL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, id, port, relayAuthenticationType, relayPassword, relayUsername, senderAccount, senderName, useSSL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorAPIModelsSMTPSMTPRequest {\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    relayAuthenticationType: ").append(toIndentedString(relayAuthenticationType)).append("\n");
    sb.append("    relayPassword: ").append(toIndentedString(relayPassword)).append("\n");
    sb.append("    relayUsername: ").append(toIndentedString(relayUsername)).append("\n");
    sb.append("    senderAccount: ").append(toIndentedString(senderAccount)).append("\n");
    sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
    sb.append("    useSSL: ").append(toIndentedString(useSSL)).append("\n");
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
    openapiFields.add("Host");
    openapiFields.add("Id");
    openapiFields.add("Port");
    openapiFields.add("RelayAuthenticationType");
    openapiFields.add("RelayPassword");
    openapiFields.add("RelayUsername");
    openapiFields.add("SenderAccount");
    openapiFields.add("SenderName");
    openapiFields.add("UseSSL");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorAPIModelsSMTPSMTPRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorAPIModelsSMTPSMTPRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorAPIModelsSMTPSMTPRequest is not found in the empty JSON string", KeyfactorAPIModelsSMTPSMTPRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorAPIModelsSMTPSMTPRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorAPIModelsSMTPSMTPRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Host") != null && !jsonObj.get("Host").isJsonNull()) && !jsonObj.get("Host").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Host` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Host").toString()));
      }
      if ((jsonObj.get("RelayPassword") != null && !jsonObj.get("RelayPassword").isJsonNull()) && !jsonObj.get("RelayPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RelayPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RelayPassword").toString()));
      }
      if ((jsonObj.get("RelayUsername") != null && !jsonObj.get("RelayUsername").isJsonNull()) && !jsonObj.get("RelayUsername").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RelayUsername` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RelayUsername").toString()));
      }
      if ((jsonObj.get("SenderAccount") != null && !jsonObj.get("SenderAccount").isJsonNull()) && !jsonObj.get("SenderAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SenderAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SenderAccount").toString()));
      }
      if ((jsonObj.get("SenderName") != null && !jsonObj.get("SenderName").isJsonNull()) && !jsonObj.get("SenderName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SenderName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SenderName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorAPIModelsSMTPSMTPRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorAPIModelsSMTPSMTPRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorAPIModelsSMTPSMTPRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorAPIModelsSMTPSMTPRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorAPIModelsSMTPSMTPRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorAPIModelsSMTPSMTPRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorAPIModelsSMTPSMTPRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorAPIModelsSMTPSMTPRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorAPIModelsSMTPSMTPRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorAPIModelsSMTPSMTPRequest
  */
  public static KeyfactorAPIModelsSMTPSMTPRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorAPIModelsSMTPSMTPRequest.class);
  }

 /**
  * Convert an instance of KeyfactorAPIModelsSMTPSMTPRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

