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
 * ModelsCertificateDownloadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class ModelsCertificateDownloadRequest {
  public static final String SERIALIZED_NAME_CERT_I_D = "CertID";
  @SerializedName(SERIALIZED_NAME_CERT_I_D)
  private Integer certID;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private byte[] serialNumber;

  public static final String SERIALIZED_NAME_ISSUER_D_N = "IssuerDN";
  @SerializedName(SERIALIZED_NAME_ISSUER_D_N)
  private String issuerDN;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT)
  private byte[] thumbprint;

  public static final String SERIALIZED_NAME_INCLUDE_CHAIN = "IncludeChain";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CHAIN)
  private Boolean includeChain;

  public ModelsCertificateDownloadRequest() {
  }

  public ModelsCertificateDownloadRequest certID(Integer certID) {
    
    this.certID = certID;
    return this;
  }

   /**
   * Get certID
   * @return certID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCertID() {
    return certID;
  }


  public void setCertID(Integer certID) {
    this.certID = certID;
  }


  public ModelsCertificateDownloadRequest serialNumber(byte[] serialNumber) {
    
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getSerialNumber() {
    return serialNumber;
  }


  public void setSerialNumber(byte[] serialNumber) {
    this.serialNumber = serialNumber;
  }


  public ModelsCertificateDownloadRequest issuerDN(String issuerDN) {
    
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


  public ModelsCertificateDownloadRequest thumbprint(byte[] thumbprint) {
    
    this.thumbprint = thumbprint;
    return this;
  }

   /**
   * Get thumbprint
   * @return thumbprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getThumbprint() {
    return thumbprint;
  }


  public void setThumbprint(byte[] thumbprint) {
    this.thumbprint = thumbprint;
  }


  public ModelsCertificateDownloadRequest includeChain(Boolean includeChain) {
    
    this.includeChain = includeChain;
    return this;
  }

   /**
   * Get includeChain
   * @return includeChain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludeChain() {
    return includeChain;
  }


  public void setIncludeChain(Boolean includeChain) {
    this.includeChain = includeChain;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertificateDownloadRequest modelsCertificateDownloadRequest = (ModelsCertificateDownloadRequest) o;
    return Objects.equals(this.certID, modelsCertificateDownloadRequest.certID) &&
        Arrays.equals(this.serialNumber, modelsCertificateDownloadRequest.serialNumber) &&
        Objects.equals(this.issuerDN, modelsCertificateDownloadRequest.issuerDN) &&
        Arrays.equals(this.thumbprint, modelsCertificateDownloadRequest.thumbprint) &&
        Objects.equals(this.includeChain, modelsCertificateDownloadRequest.includeChain);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(certID, Arrays.hashCode(serialNumber), issuerDN, Arrays.hashCode(thumbprint), includeChain);
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
    sb.append("class ModelsCertificateDownloadRequest {\n");
    sb.append("    certID: ").append(toIndentedString(certID)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    issuerDN: ").append(toIndentedString(issuerDN)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
    sb.append("    includeChain: ").append(toIndentedString(includeChain)).append("\n");
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
    openapiFields.add("CertID");
    openapiFields.add("SerialNumber");
    openapiFields.add("IssuerDN");
    openapiFields.add("Thumbprint");
    openapiFields.add("IncludeChain");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertificateDownloadRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertificateDownloadRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertificateDownloadRequest is not found in the empty JSON string", ModelsCertificateDownloadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertificateDownloadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertificateDownloadRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("IssuerDN") != null && !jsonObj.get("IssuerDN").isJsonNull()) && !jsonObj.get("IssuerDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IssuerDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IssuerDN").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertificateDownloadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertificateDownloadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertificateDownloadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertificateDownloadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertificateDownloadRequest>() {
           @Override
           public void write(JsonWriter out, ModelsCertificateDownloadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertificateDownloadRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertificateDownloadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertificateDownloadRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsCertificateDownloadRequest
  */
  public static ModelsCertificateDownloadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertificateDownloadRequest.class);
  }

 /**
  * Convert an instance of ModelsCertificateDownloadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

