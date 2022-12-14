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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ModelsPkcs10CertificateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsPkcs10CertificateResponse {
  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_ISSUER_D_N = "IssuerDN";
  @SerializedName(SERIALIZED_NAME_ISSUER_D_N)
  private String issuerDN;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT)
  private String thumbprint;

  public static final String SERIALIZED_NAME_KEYFACTOR_I_D = "KeyfactorID";
  @SerializedName(SERIALIZED_NAME_KEYFACTOR_I_D)
  private Integer keyfactorID;

  public static final String SERIALIZED_NAME_CERTIFICATES = "Certificates";
  @SerializedName(SERIALIZED_NAME_CERTIFICATES)
  private List<String> certificates = null;

  public static final String SERIALIZED_NAME_KEYFACTOR_REQUEST_ID = "KeyfactorRequestId";
  @SerializedName(SERIALIZED_NAME_KEYFACTOR_REQUEST_ID)
  private Integer keyfactorRequestId;

  public static final String SERIALIZED_NAME_REQUEST_DISPOSITION = "RequestDisposition";
  @SerializedName(SERIALIZED_NAME_REQUEST_DISPOSITION)
  private String requestDisposition;

  public static final String SERIALIZED_NAME_DISPOSITION_MESSAGE = "DispositionMessage";
  @SerializedName(SERIALIZED_NAME_DISPOSITION_MESSAGE)
  private String dispositionMessage;

  public static final String SERIALIZED_NAME_ENROLLMENT_CONTEXT = "EnrollmentContext";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_CONTEXT)
  private Map<String, String> enrollmentContext = null;

  public ModelsPkcs10CertificateResponse() {
  }

  public ModelsPkcs10CertificateResponse serialNumber(String serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  public ModelsPkcs10CertificateResponse issuerDN(String issuerDN) {
    
    this.issuerDN = issuerDN;
    return this;
  }

   /**
   * Get issuerDN
   * @return issuerDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuerDN() {
    return issuerDN;
  }


  public void setIssuerDN(String issuerDN) {
    this.issuerDN = issuerDN;
  }


  public ModelsPkcs10CertificateResponse thumbprint(String thumbprint) {
    
    this.thumbprint = thumbprint;
    return this;
  }

   /**
   * Get thumbprint
   * @return thumbprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThumbprint() {
    return thumbprint;
  }


  public void setThumbprint(String thumbprint) {
    this.thumbprint = thumbprint;
  }


  public ModelsPkcs10CertificateResponse keyfactorID(Integer keyfactorID) {
    
    this.keyfactorID = keyfactorID;
    return this;
  }

   /**
   * The integer ID of the certificate in the keyfactor database, if Issued
   * @return keyfactorID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The integer ID of the certificate in the keyfactor database, if Issued")

  public Integer getKeyfactorID() {
    return keyfactorID;
  }


  public void setKeyfactorID(Integer keyfactorID) {
    this.keyfactorID = keyfactorID;
  }


  public ModelsPkcs10CertificateResponse certificates(List<String> certificates) {
    
    this.certificates = certificates;
    return this;
  }

  public ModelsPkcs10CertificateResponse addCertificatesItem(String certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCertificates() {
    return certificates;
  }


  public void setCertificates(List<String> certificates) {
    this.certificates = certificates;
  }


  public ModelsPkcs10CertificateResponse keyfactorRequestId(Integer keyfactorRequestId) {
    
    this.keyfactorRequestId = keyfactorRequestId;
    return this;
  }

   /**
   * The integer id of the certificate request in the Keyfactor database, if one exists.
   * @return keyfactorRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The integer id of the certificate request in the Keyfactor database, if one exists.")

  public Integer getKeyfactorRequestId() {
    return keyfactorRequestId;
  }


  public void setKeyfactorRequestId(Integer keyfactorRequestId) {
    this.keyfactorRequestId = keyfactorRequestId;
  }


  public ModelsPkcs10CertificateResponse requestDisposition(String requestDisposition) {
    
    this.requestDisposition = requestDisposition;
    return this;
  }

   /**
   * Get requestDisposition
   * @return requestDisposition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequestDisposition() {
    return requestDisposition;
  }


  public void setRequestDisposition(String requestDisposition) {
    this.requestDisposition = requestDisposition;
  }


  public ModelsPkcs10CertificateResponse dispositionMessage(String dispositionMessage) {
    
    this.dispositionMessage = dispositionMessage;
    return this;
  }

   /**
   * Get dispositionMessage
   * @return dispositionMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDispositionMessage() {
    return dispositionMessage;
  }


  public void setDispositionMessage(String dispositionMessage) {
    this.dispositionMessage = dispositionMessage;
  }


  public ModelsPkcs10CertificateResponse enrollmentContext(Map<String, String> enrollmentContext) {
    
    this.enrollmentContext = enrollmentContext;
    return this;
  }

  public ModelsPkcs10CertificateResponse putEnrollmentContextItem(String key, String enrollmentContextItem) {
    if (this.enrollmentContext == null) {
      this.enrollmentContext = new HashMap<>();
    }
    this.enrollmentContext.put(key, enrollmentContextItem);
    return this;
  }

   /**
   * Get enrollmentContext
   * @return enrollmentContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getEnrollmentContext() {
    return enrollmentContext;
  }


  public void setEnrollmentContext(Map<String, String> enrollmentContext) {
    this.enrollmentContext = enrollmentContext;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsPkcs10CertificateResponse modelsPkcs10CertificateResponse = (ModelsPkcs10CertificateResponse) o;
    return Objects.equals(this.serialNumber, modelsPkcs10CertificateResponse.serialNumber) &&
        Objects.equals(this.issuerDN, modelsPkcs10CertificateResponse.issuerDN) &&
        Objects.equals(this.thumbprint, modelsPkcs10CertificateResponse.thumbprint) &&
        Objects.equals(this.keyfactorID, modelsPkcs10CertificateResponse.keyfactorID) &&
        Objects.equals(this.certificates, modelsPkcs10CertificateResponse.certificates) &&
        Objects.equals(this.keyfactorRequestId, modelsPkcs10CertificateResponse.keyfactorRequestId) &&
        Objects.equals(this.requestDisposition, modelsPkcs10CertificateResponse.requestDisposition) &&
        Objects.equals(this.dispositionMessage, modelsPkcs10CertificateResponse.dispositionMessage) &&
        Objects.equals(this.enrollmentContext, modelsPkcs10CertificateResponse.enrollmentContext);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, issuerDN, thumbprint, keyfactorID, certificates, keyfactorRequestId, requestDisposition, dispositionMessage, enrollmentContext);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsPkcs10CertificateResponse {\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    issuerDN: ").append(toIndentedString(issuerDN)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
    sb.append("    keyfactorID: ").append(toIndentedString(keyfactorID)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    keyfactorRequestId: ").append(toIndentedString(keyfactorRequestId)).append("\n");
    sb.append("    requestDisposition: ").append(toIndentedString(requestDisposition)).append("\n");
    sb.append("    dispositionMessage: ").append(toIndentedString(dispositionMessage)).append("\n");
    sb.append("    enrollmentContext: ").append(toIndentedString(enrollmentContext)).append("\n");
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
    openapiFields.add("SerialNumber");
    openapiFields.add("IssuerDN");
    openapiFields.add("Thumbprint");
    openapiFields.add("KeyfactorID");
    openapiFields.add("Certificates");
    openapiFields.add("KeyfactorRequestId");
    openapiFields.add("RequestDisposition");
    openapiFields.add("DispositionMessage");
    openapiFields.add("EnrollmentContext");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsPkcs10CertificateResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsPkcs10CertificateResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsPkcs10CertificateResponse is not found in the empty JSON string", ModelsPkcs10CertificateResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsPkcs10CertificateResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsPkcs10CertificateResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("SerialNumber") != null && !jsonObj.get("SerialNumber").isJsonNull()) && !jsonObj.get("SerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SerialNumber").toString()));
      }
      if ((jsonObj.get("IssuerDN") != null && !jsonObj.get("IssuerDN").isJsonNull()) && !jsonObj.get("IssuerDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IssuerDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IssuerDN").toString()));
      }
      if ((jsonObj.get("Thumbprint") != null && !jsonObj.get("Thumbprint").isJsonNull()) && !jsonObj.get("Thumbprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Thumbprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Thumbprint").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Certificates") != null && !jsonObj.get("Certificates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Certificates` to be an array in the JSON string but got `%s`", jsonObj.get("Certificates").toString()));
      }
      if ((jsonObj.get("RequestDisposition") != null && !jsonObj.get("RequestDisposition").isJsonNull()) && !jsonObj.get("RequestDisposition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RequestDisposition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RequestDisposition").toString()));
      }
      if ((jsonObj.get("DispositionMessage") != null && !jsonObj.get("DispositionMessage").isJsonNull()) && !jsonObj.get("DispositionMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DispositionMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DispositionMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsPkcs10CertificateResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsPkcs10CertificateResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsPkcs10CertificateResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsPkcs10CertificateResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsPkcs10CertificateResponse>() {
           @Override
           public void write(JsonWriter out, ModelsPkcs10CertificateResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsPkcs10CertificateResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsPkcs10CertificateResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsPkcs10CertificateResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsPkcs10CertificateResponse
  */
  public static ModelsPkcs10CertificateResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsPkcs10CertificateResponse.class);
  }

 /**
  * Convert an instance of ModelsPkcs10CertificateResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

