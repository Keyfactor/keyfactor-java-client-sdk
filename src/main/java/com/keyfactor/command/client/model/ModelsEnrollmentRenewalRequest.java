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
 * ModelsEnrollmentRenewalRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class ModelsEnrollmentRenewalRequest {
  public static final String SERIALIZED_NAME_CERTIFICATE_ID = "CertificateId";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_ID)
  private Integer certificateId;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT)
  private String thumbprint;

  public static final String SERIALIZED_NAME_CERTIFICATE_AUTHORITY = "CertificateAuthority";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_AUTHORITY)
  private String certificateAuthority;

  public static final String SERIALIZED_NAME_TEMPLATE = "Template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_TIMESTAMP = "Timestamp";
  @SerializedName(SERIALIZED_NAME_TIMESTAMP)
  private OffsetDateTime timestamp;

  public ModelsEnrollmentRenewalRequest() {
  }

  public ModelsEnrollmentRenewalRequest certificateId(Integer certificateId) {
    
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


  public ModelsEnrollmentRenewalRequest thumbprint(String thumbprint) {
    
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


  public ModelsEnrollmentRenewalRequest certificateAuthority(String certificateAuthority) {
    
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


  public ModelsEnrollmentRenewalRequest template(String template) {
    
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


  public ModelsEnrollmentRenewalRequest timestamp(OffsetDateTime timestamp) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsEnrollmentRenewalRequest modelsEnrollmentRenewalRequest = (ModelsEnrollmentRenewalRequest) o;
    return Objects.equals(this.certificateId, modelsEnrollmentRenewalRequest.certificateId) &&
        Objects.equals(this.thumbprint, modelsEnrollmentRenewalRequest.thumbprint) &&
        Objects.equals(this.certificateAuthority, modelsEnrollmentRenewalRequest.certificateAuthority) &&
        Objects.equals(this.template, modelsEnrollmentRenewalRequest.template) &&
        Objects.equals(this.timestamp, modelsEnrollmentRenewalRequest.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateId, thumbprint, certificateAuthority, template, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsEnrollmentRenewalRequest {\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
    sb.append("    certificateAuthority: ").append(toIndentedString(certificateAuthority)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
    openapiFields.add("CertificateId");
    openapiFields.add("Thumbprint");
    openapiFields.add("CertificateAuthority");
    openapiFields.add("Template");
    openapiFields.add("Timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsEnrollmentRenewalRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsEnrollmentRenewalRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsEnrollmentRenewalRequest is not found in the empty JSON string", ModelsEnrollmentRenewalRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsEnrollmentRenewalRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsEnrollmentRenewalRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Thumbprint") != null && !jsonObj.get("Thumbprint").isJsonNull()) && !jsonObj.get("Thumbprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Thumbprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Thumbprint").toString()));
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
       if (!ModelsEnrollmentRenewalRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsEnrollmentRenewalRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsEnrollmentRenewalRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsEnrollmentRenewalRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsEnrollmentRenewalRequest>() {
           @Override
           public void write(JsonWriter out, ModelsEnrollmentRenewalRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsEnrollmentRenewalRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsEnrollmentRenewalRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsEnrollmentRenewalRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsEnrollmentRenewalRequest
  */
  public static ModelsEnrollmentRenewalRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsEnrollmentRenewalRequest.class);
  }

 /**
  * Convert an instance of ModelsEnrollmentRenewalRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

