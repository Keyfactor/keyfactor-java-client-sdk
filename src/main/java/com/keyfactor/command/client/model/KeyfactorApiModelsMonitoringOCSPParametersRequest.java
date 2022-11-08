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
 * KeyfactorApiModelsMonitoringOCSPParametersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsMonitoringOCSPParametersRequest {
  public static final String SERIALIZED_NAME_CERTIFICATE_CONTENTS = "CertificateContents";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_CONTENTS)
  private String certificateContents;

  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY_ID = "CertificateAuthorityId";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY_ID)
  private Integer certificateAuthorityId;

  public static final String SERIALIZED_NAME_AUTHORITY_NAME = "AuthorityName";
  @SerializedName(SERIALIZED_NAME_AUTHORITY_NAME)
  private String authorityName;

  public static final String SERIALIZED_NAME_AUTHORITY_NAME_ID = "AuthorityNameId";
  @SerializedName(SERIALIZED_NAME_AUTHORITY_NAME_ID)
  private String authorityNameId;

  public static final String SERIALIZED_NAME_AUTHORITY_KEY_ID = "AuthorityKeyId";
  @SerializedName(SERIALIZED_NAME_AUTHORITY_KEY_ID)
  private String authorityKeyId;

  public static final String SERIALIZED_NAME_SAMPLE_SERIAL_NUMBER = "SampleSerialNumber";
  @SerializedName(SERIALIZED_NAME_SAMPLE_SERIAL_NUMBER)
  private String sampleSerialNumber;

  public KeyfactorApiModelsMonitoringOCSPParametersRequest() {
  }

  public KeyfactorApiModelsMonitoringOCSPParametersRequest certificateContents(String certificateContents) {
    
    this.certificateContents = certificateContents;
    return this;
  }

   /**
   * Get certificateContents
   * @return certificateContents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateContents() {
    return certificateContents;
  }


  public void setCertificateContents(String certificateContents) {
    this.certificateContents = certificateContents;
  }


  public KeyfactorApiModelsMonitoringOCSPParametersRequest certificateAuthorityId(Integer certificateAuthorityId) {
    
    this.certificateAuthorityId = certificateAuthorityId;
    return this;
  }

   /**
   * Get certificateAuthorityId
   * @return certificateAuthorityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCertificateAuthorityId() {
    return certificateAuthorityId;
  }


  public void setCertificateAuthorityId(Integer certificateAuthorityId) {
    this.certificateAuthorityId = certificateAuthorityId;
  }


  public KeyfactorApiModelsMonitoringOCSPParametersRequest authorityName(String authorityName) {
    
    this.authorityName = authorityName;
    return this;
  }

   /**
   * Get authorityName
   * @return authorityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthorityName() {
    return authorityName;
  }


  public void setAuthorityName(String authorityName) {
    this.authorityName = authorityName;
  }


  public KeyfactorApiModelsMonitoringOCSPParametersRequest authorityNameId(String authorityNameId) {
    
    this.authorityNameId = authorityNameId;
    return this;
  }

   /**
   * Get authorityNameId
   * @return authorityNameId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthorityNameId() {
    return authorityNameId;
  }


  public void setAuthorityNameId(String authorityNameId) {
    this.authorityNameId = authorityNameId;
  }


  public KeyfactorApiModelsMonitoringOCSPParametersRequest authorityKeyId(String authorityKeyId) {
    
    this.authorityKeyId = authorityKeyId;
    return this;
  }

   /**
   * Get authorityKeyId
   * @return authorityKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuthorityKeyId() {
    return authorityKeyId;
  }


  public void setAuthorityKeyId(String authorityKeyId) {
    this.authorityKeyId = authorityKeyId;
  }


  public KeyfactorApiModelsMonitoringOCSPParametersRequest sampleSerialNumber(String sampleSerialNumber) {
    
    this.sampleSerialNumber = sampleSerialNumber;
    return this;
  }

   /**
   * Get sampleSerialNumber
   * @return sampleSerialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSampleSerialNumber() {
    return sampleSerialNumber;
  }


  public void setSampleSerialNumber(String sampleSerialNumber) {
    this.sampleSerialNumber = sampleSerialNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsMonitoringOCSPParametersRequest keyfactorApiModelsMonitoringOCSPParametersRequest = (KeyfactorApiModelsMonitoringOCSPParametersRequest) o;
    return Objects.equals(this.certificateContents, keyfactorApiModelsMonitoringOCSPParametersRequest.certificateContents) &&
        Objects.equals(this.certificateAuthorityId, keyfactorApiModelsMonitoringOCSPParametersRequest.certificateAuthorityId) &&
        Objects.equals(this.authorityName, keyfactorApiModelsMonitoringOCSPParametersRequest.authorityName) &&
        Objects.equals(this.authorityNameId, keyfactorApiModelsMonitoringOCSPParametersRequest.authorityNameId) &&
        Objects.equals(this.authorityKeyId, keyfactorApiModelsMonitoringOCSPParametersRequest.authorityKeyId) &&
        Objects.equals(this.sampleSerialNumber, keyfactorApiModelsMonitoringOCSPParametersRequest.sampleSerialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateContents, certificateAuthorityId, authorityName, authorityNameId, authorityKeyId, sampleSerialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsMonitoringOCSPParametersRequest {\n");
    sb.append("    certificateContents: ").append(toIndentedString(certificateContents)).append("\n");
    sb.append("    certificateAuthorityId: ").append(toIndentedString(certificateAuthorityId)).append("\n");
    sb.append("    authorityName: ").append(toIndentedString(authorityName)).append("\n");
    sb.append("    authorityNameId: ").append(toIndentedString(authorityNameId)).append("\n");
    sb.append("    authorityKeyId: ").append(toIndentedString(authorityKeyId)).append("\n");
    sb.append("    sampleSerialNumber: ").append(toIndentedString(sampleSerialNumber)).append("\n");
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
    openapiFields.add("CertificateContents");
    openapiFields.add("CertificateAuthorityId");
    openapiFields.add("AuthorityName");
    openapiFields.add("AuthorityNameId");
    openapiFields.add("AuthorityKeyId");
    openapiFields.add("SampleSerialNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsMonitoringOCSPParametersRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsMonitoringOCSPParametersRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsMonitoringOCSPParametersRequest is not found in the empty JSON string", KeyfactorApiModelsMonitoringOCSPParametersRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsMonitoringOCSPParametersRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsMonitoringOCSPParametersRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("CertificateContents") != null && !jsonObj.get("CertificateContents").isJsonNull()) && !jsonObj.get("CertificateContents").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CertificateContents` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CertificateContents").toString()));
      }
      if ((jsonObj.get("AuthorityName") != null && !jsonObj.get("AuthorityName").isJsonNull()) && !jsonObj.get("AuthorityName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AuthorityName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AuthorityName").toString()));
      }
      if ((jsonObj.get("AuthorityNameId") != null && !jsonObj.get("AuthorityNameId").isJsonNull()) && !jsonObj.get("AuthorityNameId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AuthorityNameId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AuthorityNameId").toString()));
      }
      if ((jsonObj.get("AuthorityKeyId") != null && !jsonObj.get("AuthorityKeyId").isJsonNull()) && !jsonObj.get("AuthorityKeyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `AuthorityKeyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("AuthorityKeyId").toString()));
      }
      if ((jsonObj.get("SampleSerialNumber") != null && !jsonObj.get("SampleSerialNumber").isJsonNull()) && !jsonObj.get("SampleSerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SampleSerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SampleSerialNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsMonitoringOCSPParametersRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsMonitoringOCSPParametersRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsMonitoringOCSPParametersRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsMonitoringOCSPParametersRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsMonitoringOCSPParametersRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsMonitoringOCSPParametersRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsMonitoringOCSPParametersRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsMonitoringOCSPParametersRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsMonitoringOCSPParametersRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsMonitoringOCSPParametersRequest
  */
  public static KeyfactorApiModelsMonitoringOCSPParametersRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsMonitoringOCSPParametersRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsMonitoringOCSPParametersRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

