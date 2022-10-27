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
import java.util.UUID;

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
 * ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel {
  public static final String SERIALIZED_NAME_STORE_MACHINE = "StoreMachine";
  @SerializedName(SERIALIZED_NAME_STORE_MACHINE)
  private String storeMachine;

  public static final String SERIALIZED_NAME_STORE_PATH = "StorePath";
  @SerializedName(SERIALIZED_NAME_STORE_PATH)
  private String storePath;

  public static final String SERIALIZED_NAME_STORE_TYPE = "StoreType";
  @SerializedName(SERIALIZED_NAME_STORE_TYPE)
  private Integer storeType;

  public static final String SERIALIZED_NAME_ALIAS = "Alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_CHAIN_LEVEL = "ChainLevel";
  @SerializedName(SERIALIZED_NAME_CHAIN_LEVEL)
  private Integer chainLevel;

  public static final String SERIALIZED_NAME_CERT_STORE_ID = "CertStoreId";
  @SerializedName(SERIALIZED_NAME_CERT_STORE_ID)
  private UUID certStoreId;

  public ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel() {
  }

  public ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel storeMachine(String storeMachine) {
    
    this.storeMachine = storeMachine;
    return this;
  }

   /**
   * Get storeMachine
   * @return storeMachine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStoreMachine() {
    return storeMachine;
  }


  public void setStoreMachine(String storeMachine) {
    this.storeMachine = storeMachine;
  }


  public ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel storePath(String storePath) {
    
    this.storePath = storePath;
    return this;
  }

   /**
   * Get storePath
   * @return storePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorePath() {
    return storePath;
  }


  public void setStorePath(String storePath) {
    this.storePath = storePath;
  }


  public ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel storeType(Integer storeType) {
    
    this.storeType = storeType;
    return this;
  }

   /**
   * Get storeType
   * @return storeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStoreType() {
    return storeType;
  }


  public void setStoreType(Integer storeType) {
    this.storeType = storeType;
  }


  public ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel chainLevel(Integer chainLevel) {
    
    this.chainLevel = chainLevel;
    return this;
  }

   /**
   * Get chainLevel
   * @return chainLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getChainLevel() {
    return chainLevel;
  }


  public void setChainLevel(Integer chainLevel) {
    this.chainLevel = chainLevel;
  }


  public ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel certStoreId(UUID certStoreId) {
    
    this.certStoreId = certStoreId;
    return this;
  }

   /**
   * Get certStoreId
   * @return certStoreId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getCertStoreId() {
    return certStoreId;
  }


  public void setCertStoreId(UUID certStoreId) {
    this.certStoreId = certStoreId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel modelsCertificateRetrievalResponseCertificateStoreInventoryItemModel = (ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel) o;
    return Objects.equals(this.storeMachine, modelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.storeMachine) &&
        Objects.equals(this.storePath, modelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.storePath) &&
        Objects.equals(this.storeType, modelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.storeType) &&
        Objects.equals(this.alias, modelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.alias) &&
        Objects.equals(this.chainLevel, modelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.chainLevel) &&
        Objects.equals(this.certStoreId, modelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.certStoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeMachine, storePath, storeType, alias, chainLevel, certStoreId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel {\n");
    sb.append("    storeMachine: ").append(toIndentedString(storeMachine)).append("\n");
    sb.append("    storePath: ").append(toIndentedString(storePath)).append("\n");
    sb.append("    storeType: ").append(toIndentedString(storeType)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    chainLevel: ").append(toIndentedString(chainLevel)).append("\n");
    sb.append("    certStoreId: ").append(toIndentedString(certStoreId)).append("\n");
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
    openapiFields.add("StoreMachine");
    openapiFields.add("StorePath");
    openapiFields.add("StoreType");
    openapiFields.add("Alias");
    openapiFields.add("ChainLevel");
    openapiFields.add("CertStoreId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel is not found in the empty JSON string", ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("StoreMachine") != null && !jsonObj.get("StoreMachine").isJsonNull()) && !jsonObj.get("StoreMachine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StoreMachine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StoreMachine").toString()));
      }
      if ((jsonObj.get("StorePath") != null && !jsonObj.get("StorePath").isJsonNull()) && !jsonObj.get("StorePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StorePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StorePath").toString()));
      }
      if ((jsonObj.get("Alias") != null && !jsonObj.get("Alias").isJsonNull()) && !jsonObj.get("Alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Alias").toString()));
      }
      if ((jsonObj.get("CertStoreId") != null && !jsonObj.get("CertStoreId").isJsonNull()) && !jsonObj.get("CertStoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CertStoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CertStoreId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel>() {
           @Override
           public void write(JsonWriter out, ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel
  * @throws IOException if the JSON string is invalid with respect to ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel
  */
  public static ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel.class);
  }

 /**
  * Convert an instance of ModelsCertificateRetrievalResponseCertificateStoreInventoryItemModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

