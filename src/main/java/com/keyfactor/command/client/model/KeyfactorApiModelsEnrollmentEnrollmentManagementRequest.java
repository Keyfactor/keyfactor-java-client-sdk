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
import com.keyfactor.command.client.model.KeyfactorApiModelsEnrollmentManagementStoreRequest;
import com.keyfactor.command.client.model.KeyfactorApiModelsEnrollmentManagementStoreTypeRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * KeyfactorApiModelsEnrollmentEnrollmentManagementRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsEnrollmentEnrollmentManagementRequest {
  public static final String SERIALIZED_NAME_STORES = "Stores";
  @SerializedName(SERIALIZED_NAME_STORES)
  private List<KeyfactorApiModelsEnrollmentManagementStoreRequest> stores = null;

  public static final String SERIALIZED_NAME_STORE_IDS = "StoreIds";
  @SerializedName(SERIALIZED_NAME_STORE_IDS)
  private List<UUID> storeIds = null;

  public static final String SERIALIZED_NAME_STORE_TYPES = "StoreTypes";
  @SerializedName(SERIALIZED_NAME_STORE_TYPES)
  private List<KeyfactorApiModelsEnrollmentManagementStoreTypeRequest> storeTypes = null;

  public static final String SERIALIZED_NAME_CERTIFICATE_ID = "CertificateId";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ID)
  private Integer certificateId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "RequestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private Integer requestId;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_JOB_TIME = "JobTime";
  @SerializedName(SERIALIZED_NAME_JOB_TIME)
  private OffsetDateTime jobTime;

  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest() {
  }

  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest stores(List<KeyfactorApiModelsEnrollmentManagementStoreRequest> stores) {
    
    this.stores = stores;
    return this;
  }

  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest addStoresItem(KeyfactorApiModelsEnrollmentManagementStoreRequest storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * The stores to add the certificate to. Values in this collection will take precedence over values in {Models.Enrollment.SpecificEnrollmentManagementRequest.StoreTypes}.
   * @return stores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The stores to add the certificate to. Values in this collection will take precedence over values in {Models.Enrollment.SpecificEnrollmentManagementRequest.StoreTypes}.")

  public List<KeyfactorApiModelsEnrollmentManagementStoreRequest> getStores() {
    return stores;
  }


  public void setStores(List<KeyfactorApiModelsEnrollmentManagementStoreRequest> stores) {
    this.stores = stores;
  }


  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest storeIds(List<UUID> storeIds) {
    
    this.storeIds = storeIds;
    return this;
  }

  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest addStoreIdsItem(UUID storeIdsItem) {
    if (this.storeIds == null) {
      this.storeIds = new ArrayList<>();
    }
    this.storeIds.add(storeIdsItem);
    return this;
  }

   /**
   * Get storeIds
   * @return storeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UUID> getStoreIds() {
    return storeIds;
  }


  public void setStoreIds(List<UUID> storeIds) {
    this.storeIds = storeIds;
  }


  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest storeTypes(List<KeyfactorApiModelsEnrollmentManagementStoreTypeRequest> storeTypes) {
    
    this.storeTypes = storeTypes;
    return this;
  }

  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest addStoreTypesItem(KeyfactorApiModelsEnrollmentManagementStoreTypeRequest storeTypesItem) {
    if (this.storeTypes == null) {
      this.storeTypes = new ArrayList<>();
    }
    this.storeTypes.add(storeTypesItem);
    return this;
  }

   /**
   * Get storeTypes
   * @return storeTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeyfactorApiModelsEnrollmentManagementStoreTypeRequest> getStoreTypes() {
    return storeTypes;
  }


  public void setStoreTypes(List<KeyfactorApiModelsEnrollmentManagementStoreTypeRequest> storeTypes) {
    this.storeTypes = storeTypes;
  }


  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest certificateId(Integer certificateId) {
    
    this.certificateId = certificateId;
    return this;
  }

   /**
   * Get certificateId
   * @return certificateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCertificateId() {
    return certificateId;
  }


  public void setCertificateId(Integer certificateId) {
    this.certificateId = certificateId;
  }


  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest requestId(Integer requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Get requestId
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRequestId() {
    return requestId;
  }


  public void setRequestId(Integer requestId) {
    this.requestId = requestId;
  }


  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest password(String password) {
    
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


  public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest jobTime(OffsetDateTime jobTime) {
    
    this.jobTime = jobTime;
    return this;
  }

   /**
   * Get jobTime
   * @return jobTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getJobTime() {
    return jobTime;
  }


  public void setJobTime(OffsetDateTime jobTime) {
    this.jobTime = jobTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsEnrollmentEnrollmentManagementRequest keyfactorApiModelsEnrollmentEnrollmentManagementRequest = (KeyfactorApiModelsEnrollmentEnrollmentManagementRequest) o;
    return Objects.equals(this.stores, keyfactorApiModelsEnrollmentEnrollmentManagementRequest.stores) &&
        Objects.equals(this.storeIds, keyfactorApiModelsEnrollmentEnrollmentManagementRequest.storeIds) &&
        Objects.equals(this.storeTypes, keyfactorApiModelsEnrollmentEnrollmentManagementRequest.storeTypes) &&
        Objects.equals(this.certificateId, keyfactorApiModelsEnrollmentEnrollmentManagementRequest.certificateId) &&
        Objects.equals(this.requestId, keyfactorApiModelsEnrollmentEnrollmentManagementRequest.requestId) &&
        Objects.equals(this.password, keyfactorApiModelsEnrollmentEnrollmentManagementRequest.password) &&
        Objects.equals(this.jobTime, keyfactorApiModelsEnrollmentEnrollmentManagementRequest.jobTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stores, storeIds, storeTypes, certificateId, requestId, password, jobTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsEnrollmentEnrollmentManagementRequest {\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
    sb.append("    storeIds: ").append(toIndentedString(storeIds)).append("\n");
    sb.append("    storeTypes: ").append(toIndentedString(storeTypes)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    jobTime: ").append(toIndentedString(jobTime)).append("\n");
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
    openapiFields.add("Stores");
    openapiFields.add("StoreIds");
    openapiFields.add("StoreTypes");
    openapiFields.add("CertificateId");
    openapiFields.add("RequestId");
    openapiFields.add("Password");
    openapiFields.add("JobTime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Password");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsEnrollmentEnrollmentManagementRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsEnrollmentEnrollmentManagementRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsEnrollmentEnrollmentManagementRequest is not found in the empty JSON string", KeyfactorApiModelsEnrollmentEnrollmentManagementRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsEnrollmentEnrollmentManagementRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsEnrollmentEnrollmentManagementRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeyfactorApiModelsEnrollmentEnrollmentManagementRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("Stores") != null && !jsonObj.get("Stores").isJsonNull()) {
        JsonArray jsonArraystores = jsonObj.getAsJsonArray("Stores");
        if (jsonArraystores != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Stores").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Stores` to be an array in the JSON string but got `%s`", jsonObj.get("Stores").toString()));
          }

          // validate the optional field `Stores` (array)
          for (int i = 0; i < jsonArraystores.size(); i++) {
            KeyfactorApiModelsEnrollmentManagementStoreRequest.validateJsonObject(jsonArraystores.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("StoreIds") != null && !jsonObj.get("StoreIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `StoreIds` to be an array in the JSON string but got `%s`", jsonObj.get("StoreIds").toString()));
      }
      if (jsonObj.get("StoreTypes") != null && !jsonObj.get("StoreTypes").isJsonNull()) {
        JsonArray jsonArraystoreTypes = jsonObj.getAsJsonArray("StoreTypes");
        if (jsonArraystoreTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("StoreTypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `StoreTypes` to be an array in the JSON string but got `%s`", jsonObj.get("StoreTypes").toString()));
          }

          // validate the optional field `StoreTypes` (array)
          for (int i = 0; i < jsonArraystoreTypes.size(); i++) {
            KeyfactorApiModelsEnrollmentManagementStoreTypeRequest.validateJsonObject(jsonArraystoreTypes.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("Password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsEnrollmentEnrollmentManagementRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsEnrollmentEnrollmentManagementRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsEnrollmentEnrollmentManagementRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsEnrollmentEnrollmentManagementRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsEnrollmentEnrollmentManagementRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsEnrollmentEnrollmentManagementRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsEnrollmentEnrollmentManagementRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsEnrollmentEnrollmentManagementRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsEnrollmentEnrollmentManagementRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsEnrollmentEnrollmentManagementRequest
  */
  public static KeyfactorApiModelsEnrollmentEnrollmentManagementRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsEnrollmentEnrollmentManagementRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsEnrollmentEnrollmentManagementRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
