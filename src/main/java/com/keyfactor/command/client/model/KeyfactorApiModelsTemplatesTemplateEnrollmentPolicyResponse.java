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
 * KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse {
  public static final String SERIALIZED_NAME_RS_A_VALID_KEY_SIZES = "RSAValidKeySizes";
  @SerializedName(SERIALIZED_NAME_RS_A_VALID_KEY_SIZES)
  private List<Integer> rsAValidKeySizes = null;

  public static final String SERIALIZED_NAME_EC_C_VALID_CURVES = "ECCValidCurves";
  @SerializedName(SERIALIZED_NAME_EC_C_VALID_CURVES)
  private List<String> ecCValidCurves = null;

  public static final String SERIALIZED_NAME_ALLOW_KEY_REUSE = "AllowKeyReuse";
  @SerializedName(SERIALIZED_NAME_ALLOW_KEY_REUSE)
  private Boolean allowKeyReuse;

  public static final String SERIALIZED_NAME_ALLOW_WILDCARDS = "AllowWildcards";
  @SerializedName(SERIALIZED_NAME_ALLOW_WILDCARDS)
  private Boolean allowWildcards;

  public static final String SERIALIZED_NAME_RF_C_ENFORCEMENT = "RFCEnforcement";
  @SerializedName(SERIALIZED_NAME_RF_C_ENFORCEMENT)
  private Boolean rfCEnforcement;

  public KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse() {
  }

  public KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse rsAValidKeySizes(List<Integer> rsAValidKeySizes) {
    
    this.rsAValidKeySizes = rsAValidKeySizes;
    return this;
  }

  public KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse addRsAValidKeySizesItem(Integer rsAValidKeySizesItem) {
    if (this.rsAValidKeySizes == null) {
      this.rsAValidKeySizes = new ArrayList<>();
    }
    this.rsAValidKeySizes.add(rsAValidKeySizesItem);
    return this;
  }

   /**
   * The allowed RSA key sizes.
   * @return rsAValidKeySizes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The allowed RSA key sizes.")

  public List<Integer> getRsAValidKeySizes() {
    return rsAValidKeySizes;
  }


  public void setRsAValidKeySizes(List<Integer> rsAValidKeySizes) {
    this.rsAValidKeySizes = rsAValidKeySizes;
  }


  public KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse ecCValidCurves(List<String> ecCValidCurves) {
    
    this.ecCValidCurves = ecCValidCurves;
    return this;
  }

  public KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse addEcCValidCurvesItem(String ecCValidCurvesItem) {
    if (this.ecCValidCurves == null) {
      this.ecCValidCurves = new ArrayList<>();
    }
    this.ecCValidCurves.add(ecCValidCurvesItem);
    return this;
  }

   /**
   * The allowed ECC curves.
   * @return ecCValidCurves
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The allowed ECC curves.")

  public List<String> getEcCValidCurves() {
    return ecCValidCurves;
  }


  public void setEcCValidCurves(List<String> ecCValidCurves) {
    this.ecCValidCurves = ecCValidCurves;
  }


  public KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse allowKeyReuse(Boolean allowKeyReuse) {
    
    this.allowKeyReuse = allowKeyReuse;
    return this;
  }

   /**
   * Whether or not keys can be reused.
   * @return allowKeyReuse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not keys can be reused.")

  public Boolean getAllowKeyReuse() {
    return allowKeyReuse;
  }


  public void setAllowKeyReuse(Boolean allowKeyReuse) {
    this.allowKeyReuse = allowKeyReuse;
  }


  public KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse allowWildcards(Boolean allowWildcards) {
    
    this.allowWildcards = allowWildcards;
    return this;
  }

   /**
   * Whether or not wildcards can be used.
   * @return allowWildcards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not wildcards can be used.")

  public Boolean getAllowWildcards() {
    return allowWildcards;
  }


  public void setAllowWildcards(Boolean allowWildcards) {
    this.allowWildcards = allowWildcards;
  }


  public KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse rfCEnforcement(Boolean rfCEnforcement) {
    
    this.rfCEnforcement = rfCEnforcement;
    return this;
  }

   /**
   * Whether or not RFC 2818 compliance should be enforced.
   * @return rfCEnforcement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not RFC 2818 compliance should be enforced.")

  public Boolean getRfCEnforcement() {
    return rfCEnforcement;
  }


  public void setRfCEnforcement(Boolean rfCEnforcement) {
    this.rfCEnforcement = rfCEnforcement;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse keyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse = (KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse) o;
    return Objects.equals(this.rsAValidKeySizes, keyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.rsAValidKeySizes) &&
        Objects.equals(this.ecCValidCurves, keyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.ecCValidCurves) &&
        Objects.equals(this.allowKeyReuse, keyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.allowKeyReuse) &&
        Objects.equals(this.allowWildcards, keyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.allowWildcards) &&
        Objects.equals(this.rfCEnforcement, keyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.rfCEnforcement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rsAValidKeySizes, ecCValidCurves, allowKeyReuse, allowWildcards, rfCEnforcement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse {\n");
    sb.append("    rsAValidKeySizes: ").append(toIndentedString(rsAValidKeySizes)).append("\n");
    sb.append("    ecCValidCurves: ").append(toIndentedString(ecCValidCurves)).append("\n");
    sb.append("    allowKeyReuse: ").append(toIndentedString(allowKeyReuse)).append("\n");
    sb.append("    allowWildcards: ").append(toIndentedString(allowWildcards)).append("\n");
    sb.append("    rfCEnforcement: ").append(toIndentedString(rfCEnforcement)).append("\n");
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
    openapiFields.add("RSAValidKeySizes");
    openapiFields.add("ECCValidCurves");
    openapiFields.add("AllowKeyReuse");
    openapiFields.add("AllowWildcards");
    openapiFields.add("RFCEnforcement");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse is not found in the empty JSON string", KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("RSAValidKeySizes") != null && !jsonObj.get("RSAValidKeySizes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RSAValidKeySizes` to be an array in the JSON string but got `%s`", jsonObj.get("RSAValidKeySizes").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ECCValidCurves") != null && !jsonObj.get("ECCValidCurves").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ECCValidCurves` to be an array in the JSON string but got `%s`", jsonObj.get("ECCValidCurves").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse
  */
  public static KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsTemplatesTemplateEnrollmentPolicyResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
