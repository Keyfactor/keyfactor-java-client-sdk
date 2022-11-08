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
import com.keyfactor.command.client.model.ModelsKeyfactorAPISecret;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
 * ModelsCertificateStoreEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsCertificateStoreEntry {
  public static final String SERIALIZED_NAME_CERTIFICATE_STORE_ID = "CertificateStoreId";
  @SerializedName(SERIALIZED_NAME_CERTIFICATE_STORE_ID)
  private UUID certificateStoreId;

  public static final String SERIALIZED_NAME_ALIAS = "Alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  public static final String SERIALIZED_NAME_JOB_FIELDS = "JobFields";
  @SerializedName(SERIALIZED_NAME_JOB_FIELDS)
  private Map<String, Object> jobFields = null;

  public static final String SERIALIZED_NAME_OVERWRITE = "Overwrite";
  @SerializedName(SERIALIZED_NAME_OVERWRITE)
  private Boolean overwrite;

  public static final String SERIALIZED_NAME_ENTRY_PASSWORD = "EntryPassword";
  @SerializedName(SERIALIZED_NAME_ENTRY_PASSWORD)
  private ModelsKeyfactorAPISecret entryPassword;

  public static final String SERIALIZED_NAME_PFX_PASSWORD = "PfxPassword";
  @SerializedName(SERIALIZED_NAME_PFX_PASSWORD)
  private String pfxPassword;

  public static final String SERIALIZED_NAME_INCLUDE_PRIVATE_KEY = "IncludePrivateKey";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PRIVATE_KEY)
  private Boolean includePrivateKey;

  public ModelsCertificateStoreEntry() {
  }

  public ModelsCertificateStoreEntry certificateStoreId(UUID certificateStoreId) {
    
    this.certificateStoreId = certificateStoreId;
    return this;
  }

   /**
   * Get certificateStoreId
   * @return certificateStoreId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "")

  public UUID getCertificateStoreId() {
    return certificateStoreId;
  }


  public void setCertificateStoreId(UUID certificateStoreId) {
    this.certificateStoreId = certificateStoreId;
  }


  public ModelsCertificateStoreEntry alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public ModelsCertificateStoreEntry jobFields(Map<String, Object> jobFields) {
    
    this.jobFields = jobFields;
    return this;
  }

  public ModelsCertificateStoreEntry putJobFieldsItem(String key, Object jobFieldsItem) {
    if (this.jobFields == null) {
      this.jobFields = new HashMap<>();
    }
    this.jobFields.put(key, jobFieldsItem);
    return this;
  }

   /**
   * Get jobFields
   * @return jobFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getJobFields() {
    return jobFields;
  }


  public void setJobFields(Map<String, Object> jobFields) {
    this.jobFields = jobFields;
  }


  public ModelsCertificateStoreEntry overwrite(Boolean overwrite) {
    
    this.overwrite = overwrite;
    return this;
  }

   /**
   * Get overwrite
   * @return overwrite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOverwrite() {
    return overwrite;
  }


  public void setOverwrite(Boolean overwrite) {
    this.overwrite = overwrite;
  }


  public ModelsCertificateStoreEntry entryPassword(ModelsKeyfactorAPISecret entryPassword) {
    
    this.entryPassword = entryPassword;
    return this;
  }

   /**
   * Get entryPassword
   * @return entryPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelsKeyfactorAPISecret getEntryPassword() {
    return entryPassword;
  }


  public void setEntryPassword(ModelsKeyfactorAPISecret entryPassword) {
    this.entryPassword = entryPassword;
  }


  public ModelsCertificateStoreEntry pfxPassword(String pfxPassword) {
    
    this.pfxPassword = pfxPassword;
    return this;
  }

   /**
   * The PFX password.
   * @return pfxPassword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The PFX password.")

  public String getPfxPassword() {
    return pfxPassword;
  }


  public void setPfxPassword(String pfxPassword) {
    this.pfxPassword = pfxPassword;
  }


  public ModelsCertificateStoreEntry includePrivateKey(Boolean includePrivateKey) {
    
    this.includePrivateKey = includePrivateKey;
    return this;
  }

   /**
   * Get includePrivateKey
   * @return includePrivateKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIncludePrivateKey() {
    return includePrivateKey;
  }


  public void setIncludePrivateKey(Boolean includePrivateKey) {
    this.includePrivateKey = includePrivateKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertificateStoreEntry modelsCertificateStoreEntry = (ModelsCertificateStoreEntry) o;
    return Objects.equals(this.certificateStoreId, modelsCertificateStoreEntry.certificateStoreId) &&
        Objects.equals(this.alias, modelsCertificateStoreEntry.alias) &&
        Objects.equals(this.jobFields, modelsCertificateStoreEntry.jobFields) &&
        Objects.equals(this.overwrite, modelsCertificateStoreEntry.overwrite) &&
        Objects.equals(this.entryPassword, modelsCertificateStoreEntry.entryPassword) &&
        Objects.equals(this.pfxPassword, modelsCertificateStoreEntry.pfxPassword) &&
        Objects.equals(this.includePrivateKey, modelsCertificateStoreEntry.includePrivateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateStoreId, alias, jobFields, overwrite, entryPassword, pfxPassword, includePrivateKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCertificateStoreEntry {\n");
    sb.append("    certificateStoreId: ").append(toIndentedString(certificateStoreId)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    jobFields: ").append(toIndentedString(jobFields)).append("\n");
    sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
    sb.append("    entryPassword: ").append(toIndentedString(entryPassword)).append("\n");
    sb.append("    pfxPassword: ").append(toIndentedString(pfxPassword)).append("\n");
    sb.append("    includePrivateKey: ").append(toIndentedString(includePrivateKey)).append("\n");
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
    openapiFields.add("CertificateStoreId");
    openapiFields.add("Alias");
    openapiFields.add("JobFields");
    openapiFields.add("Overwrite");
    openapiFields.add("EntryPassword");
    openapiFields.add("PfxPassword");
    openapiFields.add("IncludePrivateKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("CertificateStoreId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertificateStoreEntry
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertificateStoreEntry.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertificateStoreEntry is not found in the empty JSON string", ModelsCertificateStoreEntry.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertificateStoreEntry.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertificateStoreEntry` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsCertificateStoreEntry.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("CertificateStoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CertificateStoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CertificateStoreId").toString()));
      }
      if ((jsonObj.get("Alias") != null && !jsonObj.get("Alias").isJsonNull()) && !jsonObj.get("Alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Alias").toString()));
      }
      // validate the optional field `EntryPassword`
      if (jsonObj.get("EntryPassword") != null && !jsonObj.get("EntryPassword").isJsonNull()) {
        ModelsKeyfactorAPISecret.validateJsonObject(jsonObj.getAsJsonObject("EntryPassword"));
      }
      if ((jsonObj.get("PfxPassword") != null && !jsonObj.get("PfxPassword").isJsonNull()) && !jsonObj.get("PfxPassword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PfxPassword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PfxPassword").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertificateStoreEntry.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertificateStoreEntry' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertificateStoreEntry> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertificateStoreEntry.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertificateStoreEntry>() {
           @Override
           public void write(JsonWriter out, ModelsCertificateStoreEntry value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertificateStoreEntry read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertificateStoreEntry given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertificateStoreEntry
  * @throws IOException if the JSON string is invalid with respect to ModelsCertificateStoreEntry
  */
  public static ModelsCertificateStoreEntry fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertificateStoreEntry.class);
  }

 /**
  * Convert an instance of ModelsCertificateStoreEntry to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
