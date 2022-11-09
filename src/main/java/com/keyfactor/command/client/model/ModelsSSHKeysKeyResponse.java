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
import java.time.OffsetDateTime;
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
 * ModelsSSHKeysKeyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsSSHKeysKeyResponse {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_FINGERPRINT = "Fingerprint";
  @SerializedName(SERIALIZED_NAME_FINGERPRINT)
  private byte[] fingerprint;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "PublicKey";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private String publicKey;

  public static final String SERIALIZED_NAME_PRIVATE_KEY = "PrivateKey";
  @SerializedName(SERIALIZED_NAME_PRIVATE_KEY)
  private String privateKey;

  public static final String SERIALIZED_NAME_KEY_TYPE = "KeyType";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private String keyType;

  public static final String SERIALIZED_NAME_KEY_LENGTH = "KeyLength";
  @SerializedName(SERIALIZED_NAME_KEY_LENGTH)
  private Integer keyLength;

  public static final String SERIALIZED_NAME_CREATION_DATE = "CreationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_STALE_DATE = "StaleDate";
  @SerializedName(SERIALIZED_NAME_STALE_DATE)
  private OffsetDateTime staleDate;

  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_COMMENTS = "Comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private List<String> comments = null;

  public static final String SERIALIZED_NAME_LOGON_COUNT = "LogonCount";
  @SerializedName(SERIALIZED_NAME_LOGON_COUNT)
  private Integer logonCount;

  public ModelsSSHKeysKeyResponse() {
  }

  public ModelsSSHKeysKeyResponse id(Integer id) {
    
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


  public ModelsSSHKeysKeyResponse fingerprint(byte[] fingerprint) {
    
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Get fingerprint
   * @return fingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getFingerprint() {
    return fingerprint;
  }


  public void setFingerprint(byte[] fingerprint) {
    this.fingerprint = fingerprint;
  }


  public ModelsSSHKeysKeyResponse publicKey(String publicKey) {
    
    this.publicKey = publicKey;
    return this;
  }

   /**
   * Get publicKey
   * @return publicKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPublicKey() {
    return publicKey;
  }


  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public ModelsSSHKeysKeyResponse privateKey(String privateKey) {
    
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Get privateKey
   * @return privateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrivateKey() {
    return privateKey;
  }


  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }


  public ModelsSSHKeysKeyResponse keyType(String keyType) {
    
    this.keyType = keyType;
    return this;
  }

   /**
   * Get keyType
   * @return keyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyType() {
    return keyType;
  }


  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }


  public ModelsSSHKeysKeyResponse keyLength(Integer keyLength) {
    
    this.keyLength = keyLength;
    return this;
  }

   /**
   * Get keyLength
   * @return keyLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getKeyLength() {
    return keyLength;
  }


  public void setKeyLength(Integer keyLength) {
    this.keyLength = keyLength;
  }


  public ModelsSSHKeysKeyResponse creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public ModelsSSHKeysKeyResponse staleDate(OffsetDateTime staleDate) {
    
    this.staleDate = staleDate;
    return this;
  }

   /**
   * Get staleDate
   * @return staleDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStaleDate() {
    return staleDate;
  }


  public void setStaleDate(OffsetDateTime staleDate) {
    this.staleDate = staleDate;
  }


  public ModelsSSHKeysKeyResponse email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ModelsSSHKeysKeyResponse comments(List<String> comments) {
    
    this.comments = comments;
    return this;
  }

  public ModelsSSHKeysKeyResponse addCommentsItem(String commentsItem) {
    if (this.comments == null) {
      this.comments = new ArrayList<>();
    }
    this.comments.add(commentsItem);
    return this;
  }

   /**
   * Get comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getComments() {
    return comments;
  }


  public void setComments(List<String> comments) {
    this.comments = comments;
  }


  public ModelsSSHKeysKeyResponse logonCount(Integer logonCount) {
    
    this.logonCount = logonCount;
    return this;
  }

   /**
   * Get logonCount
   * @return logonCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLogonCount() {
    return logonCount;
  }


  public void setLogonCount(Integer logonCount) {
    this.logonCount = logonCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSHKeysKeyResponse modelsSSHKeysKeyResponse = (ModelsSSHKeysKeyResponse) o;
    return Objects.equals(this.id, modelsSSHKeysKeyResponse.id) &&
        Arrays.equals(this.fingerprint, modelsSSHKeysKeyResponse.fingerprint) &&
        Objects.equals(this.publicKey, modelsSSHKeysKeyResponse.publicKey) &&
        Objects.equals(this.privateKey, modelsSSHKeysKeyResponse.privateKey) &&
        Objects.equals(this.keyType, modelsSSHKeysKeyResponse.keyType) &&
        Objects.equals(this.keyLength, modelsSSHKeysKeyResponse.keyLength) &&
        Objects.equals(this.creationDate, modelsSSHKeysKeyResponse.creationDate) &&
        Objects.equals(this.staleDate, modelsSSHKeysKeyResponse.staleDate) &&
        Objects.equals(this.email, modelsSSHKeysKeyResponse.email) &&
        Objects.equals(this.comments, modelsSSHKeysKeyResponse.comments) &&
        Objects.equals(this.logonCount, modelsSSHKeysKeyResponse.logonCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, Arrays.hashCode(fingerprint), publicKey, privateKey, keyType, keyLength, creationDate, staleDate, email, comments, logonCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSHKeysKeyResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    keyLength: ").append(toIndentedString(keyLength)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    staleDate: ").append(toIndentedString(staleDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
    sb.append("    logonCount: ").append(toIndentedString(logonCount)).append("\n");
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
    openapiFields.add("Fingerprint");
    openapiFields.add("PublicKey");
    openapiFields.add("PrivateKey");
    openapiFields.add("KeyType");
    openapiFields.add("KeyLength");
    openapiFields.add("CreationDate");
    openapiFields.add("StaleDate");
    openapiFields.add("Email");
    openapiFields.add("Comments");
    openapiFields.add("LogonCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSHKeysKeyResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSHKeysKeyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSHKeysKeyResponse is not found in the empty JSON string", ModelsSSHKeysKeyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSHKeysKeyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSHKeysKeyResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("PublicKey") != null && !jsonObj.get("PublicKey").isJsonNull()) && !jsonObj.get("PublicKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PublicKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PublicKey").toString()));
      }
      if ((jsonObj.get("PrivateKey") != null && !jsonObj.get("PrivateKey").isJsonNull()) && !jsonObj.get("PrivateKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PrivateKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PrivateKey").toString()));
      }
      if ((jsonObj.get("KeyType") != null && !jsonObj.get("KeyType").isJsonNull()) && !jsonObj.get("KeyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeyType").toString()));
      }
      if ((jsonObj.get("Email") != null && !jsonObj.get("Email").isJsonNull()) && !jsonObj.get("Email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Email").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Comments") != null && !jsonObj.get("Comments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Comments` to be an array in the JSON string but got `%s`", jsonObj.get("Comments").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSHKeysKeyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSHKeysKeyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSHKeysKeyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSHKeysKeyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSHKeysKeyResponse>() {
           @Override
           public void write(JsonWriter out, ModelsSSHKeysKeyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSHKeysKeyResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSHKeysKeyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSHKeysKeyResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsSSHKeysKeyResponse
  */
  public static ModelsSSHKeysKeyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSHKeysKeyResponse.class);
  }

 /**
  * Convert an instance of ModelsSSHKeysKeyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

