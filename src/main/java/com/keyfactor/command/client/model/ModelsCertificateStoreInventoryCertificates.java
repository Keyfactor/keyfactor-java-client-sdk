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
import java.util.HashMap;
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
 * ModelsCertificateStoreInventoryCertificates
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsCertificateStoreInventoryCertificates {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_ISSUED_D_N = "IssuedDN";
  @SerializedName(SERIALIZED_NAME_ISSUED_D_N)
  private String issuedDN;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_NOT_BEFORE = "NotBefore";
  @SerializedName(SERIALIZED_NAME_NOT_BEFORE)
  private OffsetDateTime notBefore;

  public static final String SERIALIZED_NAME_NOT_AFTER = "NotAfter";
  @SerializedName(SERIALIZED_NAME_NOT_AFTER)
  private OffsetDateTime notAfter;

  public static final String SERIALIZED_NAME_SIGNING_ALGORITHM = "SigningAlgorithm";
  @SerializedName(SERIALIZED_NAME_SIGNING_ALGORITHM)
  private String signingAlgorithm;

  public static final String SERIALIZED_NAME_ISSUER_D_N = "IssuerDN";
  @SerializedName(SERIALIZED_NAME_ISSUER_D_N)
  private String issuerDN;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT)
  private String thumbprint;

  public static final String SERIALIZED_NAME_CERT_STORE_INVENTORY_ITEM_ID = "CertStoreInventoryItemId";
  @SerializedName(SERIALIZED_NAME_CERT_STORE_INVENTORY_ITEM_ID)
  private Integer certStoreInventoryItemId;

  public static final String SERIALIZED_NAME_METADATA = "Metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, Object> metadata = null;

  public ModelsCertificateStoreInventoryCertificates() {
  }

  public ModelsCertificateStoreInventoryCertificates id(Integer id) {
    
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


  public ModelsCertificateStoreInventoryCertificates issuedDN(String issuedDN) {
    
    this.issuedDN = issuedDN;
    return this;
  }

   /**
   * Get issuedDN
   * @return issuedDN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIssuedDN() {
    return issuedDN;
  }


  public void setIssuedDN(String issuedDN) {
    this.issuedDN = issuedDN;
  }


  public ModelsCertificateStoreInventoryCertificates serialNumber(String serialNumber) {
    
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


  public ModelsCertificateStoreInventoryCertificates notBefore(OffsetDateTime notBefore) {
    
    this.notBefore = notBefore;
    return this;
  }

   /**
   * Get notBefore
   * @return notBefore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNotBefore() {
    return notBefore;
  }


  public void setNotBefore(OffsetDateTime notBefore) {
    this.notBefore = notBefore;
  }


  public ModelsCertificateStoreInventoryCertificates notAfter(OffsetDateTime notAfter) {
    
    this.notAfter = notAfter;
    return this;
  }

   /**
   * Get notAfter
   * @return notAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getNotAfter() {
    return notAfter;
  }


  public void setNotAfter(OffsetDateTime notAfter) {
    this.notAfter = notAfter;
  }


  public ModelsCertificateStoreInventoryCertificates signingAlgorithm(String signingAlgorithm) {
    
    this.signingAlgorithm = signingAlgorithm;
    return this;
  }

   /**
   * Get signingAlgorithm
   * @return signingAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSigningAlgorithm() {
    return signingAlgorithm;
  }


  public void setSigningAlgorithm(String signingAlgorithm) {
    this.signingAlgorithm = signingAlgorithm;
  }


  public ModelsCertificateStoreInventoryCertificates issuerDN(String issuerDN) {
    
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


  public ModelsCertificateStoreInventoryCertificates thumbprint(String thumbprint) {
    
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


  public ModelsCertificateStoreInventoryCertificates certStoreInventoryItemId(Integer certStoreInventoryItemId) {
    
    this.certStoreInventoryItemId = certStoreInventoryItemId;
    return this;
  }

   /**
   * Get certStoreInventoryItemId
   * @return certStoreInventoryItemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCertStoreInventoryItemId() {
    return certStoreInventoryItemId;
  }


  public void setCertStoreInventoryItemId(Integer certStoreInventoryItemId) {
    this.certStoreInventoryItemId = certStoreInventoryItemId;
  }


  public ModelsCertificateStoreInventoryCertificates metadata(Map<String, Object> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public ModelsCertificateStoreInventoryCertificates putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertificateStoreInventoryCertificates modelsCertificateStoreInventoryCertificates = (ModelsCertificateStoreInventoryCertificates) o;
    return Objects.equals(this.id, modelsCertificateStoreInventoryCertificates.id) &&
        Objects.equals(this.issuedDN, modelsCertificateStoreInventoryCertificates.issuedDN) &&
        Objects.equals(this.serialNumber, modelsCertificateStoreInventoryCertificates.serialNumber) &&
        Objects.equals(this.notBefore, modelsCertificateStoreInventoryCertificates.notBefore) &&
        Objects.equals(this.notAfter, modelsCertificateStoreInventoryCertificates.notAfter) &&
        Objects.equals(this.signingAlgorithm, modelsCertificateStoreInventoryCertificates.signingAlgorithm) &&
        Objects.equals(this.issuerDN, modelsCertificateStoreInventoryCertificates.issuerDN) &&
        Objects.equals(this.thumbprint, modelsCertificateStoreInventoryCertificates.thumbprint) &&
        Objects.equals(this.certStoreInventoryItemId, modelsCertificateStoreInventoryCertificates.certStoreInventoryItemId) &&
        Objects.equals(this.metadata, modelsCertificateStoreInventoryCertificates.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, issuedDN, serialNumber, notBefore, notAfter, signingAlgorithm, issuerDN, thumbprint, certStoreInventoryItemId, metadata);
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
    sb.append("class ModelsCertificateStoreInventoryCertificates {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuedDN: ").append(toIndentedString(issuedDN)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
    sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
    sb.append("    signingAlgorithm: ").append(toIndentedString(signingAlgorithm)).append("\n");
    sb.append("    issuerDN: ").append(toIndentedString(issuerDN)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
    sb.append("    certStoreInventoryItemId: ").append(toIndentedString(certStoreInventoryItemId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("IssuedDN");
    openapiFields.add("SerialNumber");
    openapiFields.add("NotBefore");
    openapiFields.add("NotAfter");
    openapiFields.add("SigningAlgorithm");
    openapiFields.add("IssuerDN");
    openapiFields.add("Thumbprint");
    openapiFields.add("CertStoreInventoryItemId");
    openapiFields.add("Metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertificateStoreInventoryCertificates
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertificateStoreInventoryCertificates.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertificateStoreInventoryCertificates is not found in the empty JSON string", ModelsCertificateStoreInventoryCertificates.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertificateStoreInventoryCertificates.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertificateStoreInventoryCertificates` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("IssuedDN") != null && !jsonObj.get("IssuedDN").isJsonNull()) && !jsonObj.get("IssuedDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IssuedDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IssuedDN").toString()));
      }
      if ((jsonObj.get("SerialNumber") != null && !jsonObj.get("SerialNumber").isJsonNull()) && !jsonObj.get("SerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SerialNumber").toString()));
      }
      if ((jsonObj.get("SigningAlgorithm") != null && !jsonObj.get("SigningAlgorithm").isJsonNull()) && !jsonObj.get("SigningAlgorithm").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SigningAlgorithm` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SigningAlgorithm").toString()));
      }
      if ((jsonObj.get("IssuerDN") != null && !jsonObj.get("IssuerDN").isJsonNull()) && !jsonObj.get("IssuerDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IssuerDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IssuerDN").toString()));
      }
      if ((jsonObj.get("Thumbprint") != null && !jsonObj.get("Thumbprint").isJsonNull()) && !jsonObj.get("Thumbprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Thumbprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Thumbprint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertificateStoreInventoryCertificates.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertificateStoreInventoryCertificates' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertificateStoreInventoryCertificates> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertificateStoreInventoryCertificates.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertificateStoreInventoryCertificates>() {
           @Override
           public void write(JsonWriter out, ModelsCertificateStoreInventoryCertificates value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertificateStoreInventoryCertificates read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertificateStoreInventoryCertificates given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertificateStoreInventoryCertificates
  * @throws IOException if the JSON string is invalid with respect to ModelsCertificateStoreInventoryCertificates
  */
  public static ModelsCertificateStoreInventoryCertificates fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertificateStoreInventoryCertificates.class);
  }

 /**
  * Convert an instance of ModelsCertificateStoreInventoryCertificates to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
