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
import java.util.List;
import java.util.Map;

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
 * ModelsEnrollmentPFXEnrollmentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsEnrollmentPFXEnrollmentRequest {
  public static final String SERIALIZED_NAME_CUSTOM_FRIENDLY_NAME = "CustomFriendlyName";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FRIENDLY_NAME)
  private String customFriendlyName;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_POPULATE_MISSING_VALUES_FROM_A_D = "PopulateMissingValuesFromAD";
  @SerializedName(SERIALIZED_NAME_POPULATE_MISSING_VALUES_FROM_A_D)
  private Boolean populateMissingValuesFromAD;

  public static final String SERIALIZED_NAME_SUBJECT = "Subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_INCLUDE_CHAIN = "IncludeChain";
  @SerializedName(SERIALIZED_NAME_INCLUDE_CHAIN)
  private Boolean includeChain;

  public static final String SERIALIZED_NAME_RENEWAL_CERTIFICATE_ID = "RenewalCertificateId";
  @SerializedName(SERIALIZED_NAME_RENEWAL_CERTIFICATE_ID)
  private Integer renewalCertificateId;

  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY = "CertificateAuthority";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY)
  private String certificateAuthority;

  public static final String SERIALIZED_NAME_METADATA = "Metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_ADDITIONAL_ENROLLMENT_FIELDS = "AdditionalEnrollmentFields";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_ENROLLMENT_FIELDS)
  private Map<String, Object> additionalEnrollmentFields = null;

  public static final String SERIALIZED_NAME_TIMESTAMP = "Timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public static final String SERIALIZED_NAME_TEMPLATE = "Template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_SA_NS = "SANs";
  @SerializedName(SERIALIZED_NAME_SA_NS)
  private Map<String, List<String>> saNs = null;

  public ModelsEnrollmentPFXEnrollmentRequest() {
  }

  public ModelsEnrollmentPFXEnrollmentRequest customFriendlyName(String customFriendlyName) {
    
    this.customFriendlyName = customFriendlyName;
    return this;
  }

   /**
   * Get customFriendlyName
   * @return customFriendlyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomFriendlyName() {
    return customFriendlyName;
  }


  public void setCustomFriendlyName(String customFriendlyName) {
    this.customFriendlyName = customFriendlyName;
  }


  public ModelsEnrollmentPFXEnrollmentRequest password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public ModelsEnrollmentPFXEnrollmentRequest populateMissingValuesFromAD(Boolean populateMissingValuesFromAD) {
    
    this.populateMissingValuesFromAD = populateMissingValuesFromAD;
    return this;
  }

   /**
   * Get populateMissingValuesFromAD
   * @return populateMissingValuesFromAD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPopulateMissingValuesFromAD() {
    return populateMissingValuesFromAD;
  }


  public void setPopulateMissingValuesFromAD(Boolean populateMissingValuesFromAD) {
    this.populateMissingValuesFromAD = populateMissingValuesFromAD;
  }


  public ModelsEnrollmentPFXEnrollmentRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public ModelsEnrollmentPFXEnrollmentRequest includeChain(Boolean includeChain) {
    
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


  public ModelsEnrollmentPFXEnrollmentRequest renewalCertificateId(Integer renewalCertificateId) {
    
    this.renewalCertificateId = renewalCertificateId;
    return this;
  }

   /**
   * Get renewalCertificateId
   * @return renewalCertificateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRenewalCertificateId() {
    return renewalCertificateId;
  }


  public void setRenewalCertificateId(Integer renewalCertificateId) {
    this.renewalCertificateId = renewalCertificateId;
  }


  public ModelsEnrollmentPFXEnrollmentRequest certificateAuthority(String certificateAuthority) {
    
    this.certificateAuthority = certificateAuthority;
    return this;
  }

   /**
   * Get certificateAuthority
   * @return certificateAuthority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCertificateAuthority() {
    return certificateAuthority;
  }


  public void setCertificateAuthority(String certificateAuthority) {
    this.certificateAuthority = certificateAuthority;
  }


  public ModelsEnrollmentPFXEnrollmentRequest metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public ModelsEnrollmentPFXEnrollmentRequest additionalEnrollmentFields(Map<String, Object> additionalEnrollmentFields) {
    
    this.additionalEnrollmentFields = additionalEnrollmentFields;
    return this;
  }

  public ModelsEnrollmentPFXEnrollmentRequest putAdditionalEnrollmentFieldsItem(String key, Object additionalEnrollmentFieldsItem) {
    if (this.additionalEnrollmentFields == null) {
      this.additionalEnrollmentFields = new HashMap<>();
    }
    this.additionalEnrollmentFields.put(key, additionalEnrollmentFieldsItem);
    return this;
  }

   /**
   * Get additionalEnrollmentFields
   * @return additionalEnrollmentFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getAdditionalEnrollmentFields() {
    return additionalEnrollmentFields;
  }


  public void setAdditionalEnrollmentFields(Map<String, Object> additionalEnrollmentFields) {
    this.additionalEnrollmentFields = additionalEnrollmentFields;
  }


  public ModelsEnrollmentPFXEnrollmentRequest timestamp(OffsetDateTime timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public ModelsEnrollmentPFXEnrollmentRequest template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public ModelsEnrollmentPFXEnrollmentRequest saNs(Map<String, List<String>> saNs) {
    
    this.saNs = saNs;
    return this;
  }

  public ModelsEnrollmentPFXEnrollmentRequest putSaNsItem(String key, List<String> saNsItem) {
    if (this.saNs == null) {
      this.saNs = new HashMap<>();
    }
    this.saNs.put(key, saNsItem);
    return this;
  }

   /**
   * Get saNs
   * @return saNs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, List<String>> getSaNs() {
    return saNs;
  }


  public void setSaNs(Map<String, List<String>> saNs) {
    this.saNs = saNs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsEnrollmentPFXEnrollmentRequest modelsEnrollmentPFXEnrollmentRequest = (ModelsEnrollmentPFXEnrollmentRequest) o;
    return Objects.equals(this.customFriendlyName, modelsEnrollmentPFXEnrollmentRequest.customFriendlyName) &&
        Objects.equals(this.password, modelsEnrollmentPFXEnrollmentRequest.password) &&
        Objects.equals(this.populateMissingValuesFromAD, modelsEnrollmentPFXEnrollmentRequest.populateMissingValuesFromAD) &&
        Objects.equals(this.subject, modelsEnrollmentPFXEnrollmentRequest.subject) &&
        Objects.equals(this.includeChain, modelsEnrollmentPFXEnrollmentRequest.includeChain) &&
        Objects.equals(this.renewalCertificateId, modelsEnrollmentPFXEnrollmentRequest.renewalCertificateId) &&
        Objects.equals(this.certificateAuthority, modelsEnrollmentPFXEnrollmentRequest.certificateAuthority) &&
        Objects.equals(this.metadata, modelsEnrollmentPFXEnrollmentRequest.metadata) &&
        Objects.equals(this.additionalEnrollmentFields, modelsEnrollmentPFXEnrollmentRequest.additionalEnrollmentFields) &&
        Objects.equals(this.timestamp, modelsEnrollmentPFXEnrollmentRequest.timestamp) &&
        Objects.equals(this.template, modelsEnrollmentPFXEnrollmentRequest.template) &&
        Objects.equals(this.saNs, modelsEnrollmentPFXEnrollmentRequest.saNs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFriendlyName, password, populateMissingValuesFromAD, subject, includeChain, renewalCertificateId, certificateAuthority, metadata, additionalEnrollmentFields, timestamp, template, saNs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsEnrollmentPFXEnrollmentRequest {\n");
    sb.append("    customFriendlyName: ").append(toIndentedString(customFriendlyName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    populateMissingValuesFromAD: ").append(toIndentedString(populateMissingValuesFromAD)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    includeChain: ").append(toIndentedString(includeChain)).append("\n");
    sb.append("    renewalCertificateId: ").append(toIndentedString(renewalCertificateId)).append("\n");
    sb.append("    certificateAuthority: ").append(toIndentedString(certificateAuthority)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    additionalEnrollmentFields: ").append(toIndentedString(additionalEnrollmentFields)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    saNs: ").append(toIndentedString(saNs)).append("\n");
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
    openapiFields.add("CustomFriendlyName");
    openapiFields.add("Password");
    openapiFields.add("PopulateMissingValuesFromAD");
    openapiFields.add("Subject");
    openapiFields.add("IncludeChain");
    openapiFields.add("RenewalCertificateId");
    openapiFields.add("CertificateAuthority");
    openapiFields.add("Metadata");
    openapiFields.add("AdditionalEnrollmentFields");
    openapiFields.add("Timestamp");
    openapiFields.add("Template");
    openapiFields.add("SANs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsEnrollmentPFXEnrollmentRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsEnrollmentPFXEnrollmentRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsEnrollmentPFXEnrollmentRequest is not found in the empty JSON string", ModelsEnrollmentPFXEnrollmentRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsEnrollmentPFXEnrollmentRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsEnrollmentPFXEnrollmentRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("CustomFriendlyName") != null && !jsonObj.get("CustomFriendlyName").isJsonNull()) && !jsonObj.get("CustomFriendlyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomFriendlyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomFriendlyName").toString()));
      }
      if ((jsonObj.get("Password") != null && !jsonObj.get("Password").isJsonNull()) && !jsonObj.get("Password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Password").toString()));
      }
      if ((jsonObj.get("Subject") != null && !jsonObj.get("Subject").isJsonNull()) && !jsonObj.get("Subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subject").toString()));
      }
      if ((jsonObj.get("CertificateAuthority") != null && !jsonObj.get("CertificateAuthority").isJsonNull()) && !jsonObj.get("CertificateAuthority").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CertificateAuthority` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CertificateAuthority").toString()));
      }
      if ((jsonObj.get("Template") != null && !jsonObj.get("Template").isJsonNull()) && !jsonObj.get("Template").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Template` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Template").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsEnrollmentPFXEnrollmentRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsEnrollmentPFXEnrollmentRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsEnrollmentPFXEnrollmentRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsEnrollmentPFXEnrollmentRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsEnrollmentPFXEnrollmentRequest>() {
           @Override
           public void write(JsonWriter out, ModelsEnrollmentPFXEnrollmentRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsEnrollmentPFXEnrollmentRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsEnrollmentPFXEnrollmentRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsEnrollmentPFXEnrollmentRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsEnrollmentPFXEnrollmentRequest
  */
  public static ModelsEnrollmentPFXEnrollmentRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsEnrollmentPFXEnrollmentRequest.class);
  }

 /**
  * Convert an instance of ModelsEnrollmentPFXEnrollmentRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

