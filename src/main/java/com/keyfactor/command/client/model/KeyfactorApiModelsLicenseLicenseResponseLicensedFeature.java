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
 * KeyfactorApiModelsLicenseLicenseResponseLicensedFeature
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsLicenseLicenseResponseLicensedFeature {
  public static final String SERIALIZED_NAME_FEATURE_I_D = "FeatureID";
  @SerializedName(SERIALIZED_NAME_FEATURE_I_D)
  private String featureID;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_QUANTITY = "Quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "ExpirationDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private OffsetDateTime expirationDate;

  public KeyfactorApiModelsLicenseLicenseResponseLicensedFeature() {
  }

  public KeyfactorApiModelsLicenseLicenseResponseLicensedFeature featureID(String featureID) {
    
    this.featureID = featureID;
    return this;
  }

   /**
   * Get featureID
   * @return featureID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFeatureID() {
    return featureID;
  }


  public void setFeatureID(String featureID) {
    this.featureID = featureID;
  }


  public KeyfactorApiModelsLicenseLicenseResponseLicensedFeature displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public KeyfactorApiModelsLicenseLicenseResponseLicensedFeature enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public KeyfactorApiModelsLicenseLicenseResponseLicensedFeature quantity(Integer quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getQuantity() {
    return quantity;
  }


  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public KeyfactorApiModelsLicenseLicenseResponseLicensedFeature expirationDate(OffsetDateTime expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsLicenseLicenseResponseLicensedFeature keyfactorApiModelsLicenseLicenseResponseLicensedFeature = (KeyfactorApiModelsLicenseLicenseResponseLicensedFeature) o;
    return Objects.equals(this.featureID, keyfactorApiModelsLicenseLicenseResponseLicensedFeature.featureID) &&
        Objects.equals(this.displayName, keyfactorApiModelsLicenseLicenseResponseLicensedFeature.displayName) &&
        Objects.equals(this.enabled, keyfactorApiModelsLicenseLicenseResponseLicensedFeature.enabled) &&
        Objects.equals(this.quantity, keyfactorApiModelsLicenseLicenseResponseLicensedFeature.quantity) &&
        Objects.equals(this.expirationDate, keyfactorApiModelsLicenseLicenseResponseLicensedFeature.expirationDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureID, displayName, enabled, quantity, expirationDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsLicenseLicenseResponseLicensedFeature {\n");
    sb.append("    featureID: ").append(toIndentedString(featureID)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
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
    openapiFields.add("FeatureID");
    openapiFields.add("DisplayName");
    openapiFields.add("Enabled");
    openapiFields.add("Quantity");
    openapiFields.add("ExpirationDate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsLicenseLicenseResponseLicensedFeature
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsLicenseLicenseResponseLicensedFeature.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsLicenseLicenseResponseLicensedFeature is not found in the empty JSON string", KeyfactorApiModelsLicenseLicenseResponseLicensedFeature.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsLicenseLicenseResponseLicensedFeature.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsLicenseLicenseResponseLicensedFeature` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("FeatureID") != null && !jsonObj.get("FeatureID").isJsonNull()) && !jsonObj.get("FeatureID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FeatureID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FeatureID").toString()));
      }
      if ((jsonObj.get("DisplayName") != null && !jsonObj.get("DisplayName").isJsonNull()) && !jsonObj.get("DisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DisplayName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsLicenseLicenseResponseLicensedFeature.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsLicenseLicenseResponseLicensedFeature' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsLicenseLicenseResponseLicensedFeature> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsLicenseLicenseResponseLicensedFeature.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsLicenseLicenseResponseLicensedFeature>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsLicenseLicenseResponseLicensedFeature value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsLicenseLicenseResponseLicensedFeature read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsLicenseLicenseResponseLicensedFeature given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsLicenseLicenseResponseLicensedFeature
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsLicenseLicenseResponseLicensedFeature
  */
  public static KeyfactorApiModelsLicenseLicenseResponseLicensedFeature fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsLicenseLicenseResponseLicensedFeature.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsLicenseLicenseResponseLicensedFeature to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
