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
import java.util.HashMap;
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
 * ModelsCertificateValidationResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class ModelsCertificateValidationResponse {
  public static final String SERIALIZED_NAME_VALID = "Valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_RESULTS = "Results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private Map<String, String> results = null;

  public ModelsCertificateValidationResponse() {
  }

  public ModelsCertificateValidationResponse valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * States whether the certificate is valid or not
   * @return valid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "States whether the certificate is valid or not")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public ModelsCertificateValidationResponse results(Map<String, String> results) {
    
    this.results = results;
    return this;
  }

  public ModelsCertificateValidationResponse putResultsItem(String key, String resultsItem) {
    if (this.results == null) {
      this.results = new HashMap<>();
    }
    this.results.put(key, resultsItem);
    return this;
  }

   /**
   * Lists any reasons why the certificate is not valid
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lists any reasons why the certificate is not valid")

  public Map<String, String> getResults() {
    return results;
  }


  public void setResults(Map<String, String> results) {
    this.results = results;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertificateValidationResponse modelsCertificateValidationResponse = (ModelsCertificateValidationResponse) o;
    return Objects.equals(this.valid, modelsCertificateValidationResponse.valid) &&
        Objects.equals(this.results, modelsCertificateValidationResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCertificateValidationResponse {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
    openapiFields.add("Valid");
    openapiFields.add("Results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertificateValidationResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertificateValidationResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertificateValidationResponse is not found in the empty JSON string", ModelsCertificateValidationResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertificateValidationResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertificateValidationResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertificateValidationResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertificateValidationResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertificateValidationResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertificateValidationResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertificateValidationResponse>() {
           @Override
           public void write(JsonWriter out, ModelsCertificateValidationResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertificateValidationResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertificateValidationResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertificateValidationResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsCertificateValidationResponse
  */
  public static ModelsCertificateValidationResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertificateValidationResponse.class);
  }

 /**
  * Convert an instance of ModelsCertificateValidationResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

