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
 * KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest {
  public static final String SERIALIZED_NAME_RS_A_VALID_KEY_SIZES = "RSAValidKeySizes";
  @SerializedName(SERIALIZED_NAME_RS_A_VALID_KEY_SIZES)
  private List<Integer> rsAValidKeySizes = new ArrayList<>();

  public static final String SERIALIZED_NAME_EC_C_VALID_CURVES = "ECCValidCurves";
  @SerializedName(SERIALIZED_NAME_EC_C_VALID_CURVES)
  private List<String> ecCValidCurves = new ArrayList<>();

  public static final String SERIALIZED_NAME_ALLOW_KEY_REUSE = "AllowKeyReuse";
  @SerializedName(SERIALIZED_NAME_ALLOW_KEY_REUSE)
  private Boolean allowKeyReuse;

  public static final String SERIALIZED_NAME_ALLOW_WILDCARDS = "AllowWildcards";
  @SerializedName(SERIALIZED_NAME_ALLOW_WILDCARDS)
  private Boolean allowWildcards;

  public static final String SERIALIZED_NAME_RF_C_ENFORCEMENT = "RFCEnforcement";
  @SerializedName(SERIALIZED_NAME_RF_C_ENFORCEMENT)
  private Boolean rfCEnforcement;

  public KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest() {
  }

  public KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest rsAValidKeySizes(List<Integer> rsAValidKeySizes) {
    
    this.rsAValidKeySizes = rsAValidKeySizes;
    return this;
  }

  public KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest addRsAValidKeySizesItem(Integer rsAValidKeySizesItem) {
    this.rsAValidKeySizes.add(rsAValidKeySizesItem);
    return this;
  }

   /**
   * The allowed RSA key sizes.
   * @return rsAValidKeySizes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The allowed RSA key sizes.")

  public List<Integer> getRsAValidKeySizes() {
    return rsAValidKeySizes;
  }


  public void setRsAValidKeySizes(List<Integer> rsAValidKeySizes) {
    this.rsAValidKeySizes = rsAValidKeySizes;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest ecCValidCurves(List<String> ecCValidCurves) {
    
    this.ecCValidCurves = ecCValidCurves;
    return this;
  }

  public KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest addEcCValidCurvesItem(String ecCValidCurvesItem) {
    this.ecCValidCurves.add(ecCValidCurvesItem);
    return this;
  }

   /**
   * The allowed ECC curves.
   * @return ecCValidCurves
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The allowed ECC curves.")

  public List<String> getEcCValidCurves() {
    return ecCValidCurves;
  }


  public void setEcCValidCurves(List<String> ecCValidCurves) {
    this.ecCValidCurves = ecCValidCurves;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest allowKeyReuse(Boolean allowKeyReuse) {
    
    this.allowKeyReuse = allowKeyReuse;
    return this;
  }

   /**
   * Whether or not keys can be reused.
   * @return allowKeyReuse
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether or not keys can be reused.")

  public Boolean getAllowKeyReuse() {
    return allowKeyReuse;
  }


  public void setAllowKeyReuse(Boolean allowKeyReuse) {
    this.allowKeyReuse = allowKeyReuse;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest allowWildcards(Boolean allowWildcards) {
    
    this.allowWildcards = allowWildcards;
    return this;
  }

   /**
   * Whether or not wildcards can be used.
   * @return allowWildcards
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether or not wildcards can be used.")

  public Boolean getAllowWildcards() {
    return allowWildcards;
  }


  public void setAllowWildcards(Boolean allowWildcards) {
    this.allowWildcards = allowWildcards;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest rfCEnforcement(Boolean rfCEnforcement) {
    
    this.rfCEnforcement = rfCEnforcement;
    return this;
  }

   /**
   * Whether or not RFC 2818 compliance should be enforced.
   * @return rfCEnforcement
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether or not RFC 2818 compliance should be enforced.")

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
    KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest keyfactorApiModelsTemplatesGlobalTemplatePolicyRequest = (KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest) o;
    return Objects.equals(this.rsAValidKeySizes, keyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.rsAValidKeySizes) &&
        Objects.equals(this.ecCValidCurves, keyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.ecCValidCurves) &&
        Objects.equals(this.allowKeyReuse, keyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.allowKeyReuse) &&
        Objects.equals(this.allowWildcards, keyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.allowWildcards) &&
        Objects.equals(this.rfCEnforcement, keyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.rfCEnforcement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rsAValidKeySizes, ecCValidCurves, allowKeyReuse, allowWildcards, rfCEnforcement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest {\n");
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
    openapiRequiredFields.add("RSAValidKeySizes");
    openapiRequiredFields.add("ECCValidCurves");
    openapiRequiredFields.add("AllowKeyReuse");
    openapiRequiredFields.add("AllowWildcards");
    openapiRequiredFields.add("RFCEnforcement");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest is not found in the empty JSON string", KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("RSAValidKeySizes") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("RSAValidKeySizes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `RSAValidKeySizes` to be an array in the JSON string but got `%s`", jsonObj.get("RSAValidKeySizes").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("ECCValidCurves") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("ECCValidCurves").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ECCValidCurves` to be an array in the JSON string but got `%s`", jsonObj.get("ECCValidCurves").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest
  */
  public static KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

