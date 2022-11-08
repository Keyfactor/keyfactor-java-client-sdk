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
 * ModelsCertificateRetrievalResponseCRLDistributionPointModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsCertificateRetrievalResponseCRLDistributionPointModel {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_URL = "Url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_URL_HASH = "UrlHash";
  @SerializedName(SERIALIZED_NAME_URL_HASH)
  private byte[] urlHash;

  public ModelsCertificateRetrievalResponseCRLDistributionPointModel() {
  }

  public ModelsCertificateRetrievalResponseCRLDistributionPointModel id(Integer id) {
    
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


  public ModelsCertificateRetrievalResponseCRLDistributionPointModel url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ModelsCertificateRetrievalResponseCRLDistributionPointModel urlHash(byte[] urlHash) {
    
    this.urlHash = urlHash;
    return this;
  }

   /**
   * Get urlHash
   * @return urlHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public byte[] getUrlHash() {
    return urlHash;
  }


  public void setUrlHash(byte[] urlHash) {
    this.urlHash = urlHash;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertificateRetrievalResponseCRLDistributionPointModel modelsCertificateRetrievalResponseCRLDistributionPointModel = (ModelsCertificateRetrievalResponseCRLDistributionPointModel) o;
    return Objects.equals(this.id, modelsCertificateRetrievalResponseCRLDistributionPointModel.id) &&
        Objects.equals(this.url, modelsCertificateRetrievalResponseCRLDistributionPointModel.url) &&
        Arrays.equals(this.urlHash, modelsCertificateRetrievalResponseCRLDistributionPointModel.urlHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, Arrays.hashCode(urlHash));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCertificateRetrievalResponseCRLDistributionPointModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlHash: ").append(toIndentedString(urlHash)).append("\n");
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
    openapiFields.add("Url");
    openapiFields.add("UrlHash");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertificateRetrievalResponseCRLDistributionPointModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertificateRetrievalResponseCRLDistributionPointModel.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertificateRetrievalResponseCRLDistributionPointModel is not found in the empty JSON string", ModelsCertificateRetrievalResponseCRLDistributionPointModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertificateRetrievalResponseCRLDistributionPointModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertificateRetrievalResponseCRLDistributionPointModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Url") != null && !jsonObj.get("Url").isJsonNull()) && !jsonObj.get("Url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertificateRetrievalResponseCRLDistributionPointModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertificateRetrievalResponseCRLDistributionPointModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertificateRetrievalResponseCRLDistributionPointModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertificateRetrievalResponseCRLDistributionPointModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertificateRetrievalResponseCRLDistributionPointModel>() {
           @Override
           public void write(JsonWriter out, ModelsCertificateRetrievalResponseCRLDistributionPointModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertificateRetrievalResponseCRLDistributionPointModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertificateRetrievalResponseCRLDistributionPointModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertificateRetrievalResponseCRLDistributionPointModel
  * @throws IOException if the JSON string is invalid with respect to ModelsCertificateRetrievalResponseCRLDistributionPointModel
  */
  public static ModelsCertificateRetrievalResponseCRLDistributionPointModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertificateRetrievalResponseCRLDistributionPointModel.class);
  }

 /**
  * Convert an instance of ModelsCertificateRetrievalResponseCRLDistributionPointModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
