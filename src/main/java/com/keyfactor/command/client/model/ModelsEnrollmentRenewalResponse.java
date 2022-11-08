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
 * ModelsEnrollmentRenewalResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsEnrollmentRenewalResponse {
  public static final String SERIALIZED_NAME_KEYFACTOR_ID = "KeyfactorId";
  @SerializedName(SERIALIZED_NAME_KEYFACTOR_ID)
  private Integer keyfactorId;

  public static final String SERIALIZED_NAME_KEYFACTOR_REQUEST_ID = "KeyfactorRequestId";
  @SerializedName(SERIALIZED_NAME_KEYFACTOR_REQUEST_ID)
  private Integer keyfactorRequestId;

  public static final String SERIALIZED_NAME_THUMBPRINT = "Thumbprint";
  @SerializedName(SERIALIZED_NAME_THUMBPRINT)
  private String thumbprint;

  public static final String SERIALIZED_NAME_SERIAL_NUMBER = "SerialNumber";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUMBER)
  private String serialNumber;

  public static final String SERIALIZED_NAME_ISSUER_D_N = "IssuerDN";
  @SerializedName(SERIALIZED_NAME_ISSUER_D_N)
  private String issuerDN;

  public static final String SERIALIZED_NAME_REQUEST_DISPOSITION = "RequestDisposition";
  @SerializedName(SERIALIZED_NAME_REQUEST_DISPOSITION)
  private String requestDisposition;

  public static final String SERIALIZED_NAME_DISPOSITION_MESSAGE = "DispositionMessage";
  @SerializedName(SERIALIZED_NAME_DISPOSITION_MESSAGE)
  private String dispositionMessage;

  public static final String SERIALIZED_NAME_PASSWORD = "Password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public ModelsEnrollmentRenewalResponse() {
  }

  public ModelsEnrollmentRenewalResponse keyfactorId(Integer keyfactorId) {
    
    this.keyfactorId = keyfactorId;
    return this;
  }

   /**
   * Get keyfactorId
   * @return keyfactorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getKeyfactorId() {
    return keyfactorId;
  }


  public void setKeyfactorId(Integer keyfactorId) {
    this.keyfactorId = keyfactorId;
  }


  public ModelsEnrollmentRenewalResponse keyfactorRequestId(Integer keyfactorRequestId) {
    
    this.keyfactorRequestId = keyfactorRequestId;
    return this;
  }

   /**
   * Get keyfactorRequestId
   * @return keyfactorRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getKeyfactorRequestId() {
    return keyfactorRequestId;
  }


  public void setKeyfactorRequestId(Integer keyfactorRequestId) {
    this.keyfactorRequestId = keyfactorRequestId;
  }


  public ModelsEnrollmentRenewalResponse thumbprint(String thumbprint) {
    
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


  public ModelsEnrollmentRenewalResponse serialNumber(String serialNumber) {
    
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


  public ModelsEnrollmentRenewalResponse issuerDN(String issuerDN) {
    
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


  public ModelsEnrollmentRenewalResponse requestDisposition(String requestDisposition) {
    
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


  public ModelsEnrollmentRenewalResponse dispositionMessage(String dispositionMessage) {
    
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


  public ModelsEnrollmentRenewalResponse password(String password) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsEnrollmentRenewalResponse modelsEnrollmentRenewalResponse = (ModelsEnrollmentRenewalResponse) o;
    return Objects.equals(this.keyfactorId, modelsEnrollmentRenewalResponse.keyfactorId) &&
        Objects.equals(this.keyfactorRequestId, modelsEnrollmentRenewalResponse.keyfactorRequestId) &&
        Objects.equals(this.thumbprint, modelsEnrollmentRenewalResponse.thumbprint) &&
        Objects.equals(this.serialNumber, modelsEnrollmentRenewalResponse.serialNumber) &&
        Objects.equals(this.issuerDN, modelsEnrollmentRenewalResponse.issuerDN) &&
        Objects.equals(this.requestDisposition, modelsEnrollmentRenewalResponse.requestDisposition) &&
        Objects.equals(this.dispositionMessage, modelsEnrollmentRenewalResponse.dispositionMessage) &&
        Objects.equals(this.password, modelsEnrollmentRenewalResponse.password);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyfactorId, keyfactorRequestId, thumbprint, serialNumber, issuerDN, requestDisposition, dispositionMessage, password);
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
    sb.append("class ModelsEnrollmentRenewalResponse {\n");
    sb.append("    keyfactorId: ").append(toIndentedString(keyfactorId)).append("\n");
    sb.append("    keyfactorRequestId: ").append(toIndentedString(keyfactorRequestId)).append("\n");
    sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    issuerDN: ").append(toIndentedString(issuerDN)).append("\n");
    sb.append("    requestDisposition: ").append(toIndentedString(requestDisposition)).append("\n");
    sb.append("    dispositionMessage: ").append(toIndentedString(dispositionMessage)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
    openapiFields.add("KeyfactorId");
    openapiFields.add("KeyfactorRequestId");
    openapiFields.add("Thumbprint");
    openapiFields.add("SerialNumber");
    openapiFields.add("IssuerDN");
    openapiFields.add("RequestDisposition");
    openapiFields.add("DispositionMessage");
    openapiFields.add("Password");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsEnrollmentRenewalResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsEnrollmentRenewalResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsEnrollmentRenewalResponse is not found in the empty JSON string", ModelsEnrollmentRenewalResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsEnrollmentRenewalResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsEnrollmentRenewalResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Thumbprint") != null && !jsonObj.get("Thumbprint").isJsonNull()) && !jsonObj.get("Thumbprint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Thumbprint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Thumbprint").toString()));
      }
      if ((jsonObj.get("SerialNumber") != null && !jsonObj.get("SerialNumber").isJsonNull()) && !jsonObj.get("SerialNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SerialNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SerialNumber").toString()));
      }
      if ((jsonObj.get("IssuerDN") != null && !jsonObj.get("IssuerDN").isJsonNull()) && !jsonObj.get("IssuerDN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IssuerDN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IssuerDN").toString()));
      }
      if ((jsonObj.get("RequestDisposition") != null && !jsonObj.get("RequestDisposition").isJsonNull()) && !jsonObj.get("RequestDisposition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RequestDisposition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RequestDisposition").toString()));
      }
      if ((jsonObj.get("DispositionMessage") != null && !jsonObj.get("DispositionMessage").isJsonNull()) && !jsonObj.get("DispositionMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DispositionMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DispositionMessage").toString()));
      }
      if ((jsonObj.get("Password") != null && !jsonObj.get("Password").isJsonNull()) && !jsonObj.get("Password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Password").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsEnrollmentRenewalResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsEnrollmentRenewalResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsEnrollmentRenewalResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsEnrollmentRenewalResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsEnrollmentRenewalResponse>() {
           @Override
           public void write(JsonWriter out, ModelsEnrollmentRenewalResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsEnrollmentRenewalResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsEnrollmentRenewalResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsEnrollmentRenewalResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsEnrollmentRenewalResponse
  */
  public static ModelsEnrollmentRenewalResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsEnrollmentRenewalResponse.class);
  }

 /**
  * Convert an instance of ModelsEnrollmentRenewalResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
