/*
 * Copyright 2022 Keyfactor
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.  You may obtain a
 * copy of the License at http://www.apache.org/licenses/LICENSE-2.0.  Unless
 * required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for
 * thespecific language governing permissions and limitations under the
 * License.
 *
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
import com.keyfactor.command.client.model.ModelsCertificateStoreInventoryCertificates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
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
 * ModelsCertificateStoreInventory
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsCertificateStoreInventory {
  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CERTIFICATES = "Certificates";
  @SerializedName(SERIALIZED_NAME_CERTIFICATES)
  private List<ModelsCertificateStoreInventoryCertificates> certificates = null;

  public static final String SERIALIZED_NAME_PARAMETERS = "Parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private Map<String, Object> parameters = null;

  public ModelsCertificateStoreInventory() {
  }

  public ModelsCertificateStoreInventory name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ModelsCertificateStoreInventory certificates(List<ModelsCertificateStoreInventoryCertificates> certificates) {
    
    this.certificates = certificates;
    return this;
  }

  public ModelsCertificateStoreInventory addCertificatesItem(ModelsCertificateStoreInventoryCertificates certificatesItem) {
    if (this.certificates == null) {
      this.certificates = new ArrayList<>();
    }
    this.certificates.add(certificatesItem);
    return this;
  }

   /**
   * Get certificates
   * @return certificates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelsCertificateStoreInventoryCertificates> getCertificates() {
    return certificates;
  }


  public void setCertificates(List<ModelsCertificateStoreInventoryCertificates> certificates) {
    this.certificates = certificates;
  }


  public ModelsCertificateStoreInventory parameters(Map<String, Object> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public ModelsCertificateStoreInventory putParametersItem(String key, Object parametersItem) {
    if (this.parameters == null) {
      this.parameters = new HashMap<>();
    }
    this.parameters.put(key, parametersItem);
    return this;
  }

   /**
   * Get parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getParameters() {
    return parameters;
  }


  public void setParameters(Map<String, Object> parameters) {
    this.parameters = parameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertificateStoreInventory modelsCertificateStoreInventory = (ModelsCertificateStoreInventory) o;
    return Objects.equals(this.name, modelsCertificateStoreInventory.name) &&
        Objects.equals(this.certificates, modelsCertificateStoreInventory.certificates) &&
        Objects.equals(this.parameters, modelsCertificateStoreInventory.parameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, certificates, parameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCertificateStoreInventory {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Certificates");
    openapiFields.add("Parameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertificateStoreInventory
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertificateStoreInventory.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertificateStoreInventory is not found in the empty JSON string", ModelsCertificateStoreInventory.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertificateStoreInventory.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertificateStoreInventory` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (jsonObj.get("Certificates") != null && !jsonObj.get("Certificates").isJsonNull()) {
        JsonArray jsonArraycertificates = jsonObj.getAsJsonArray("Certificates");
        if (jsonArraycertificates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Certificates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Certificates` to be an array in the JSON string but got `%s`", jsonObj.get("Certificates").toString()));
          }

          // validate the optional field `Certificates` (array)
          for (int i = 0; i < jsonArraycertificates.size(); i++) {
            ModelsCertificateStoreInventoryCertificates.validateJsonObject(jsonArraycertificates.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertificateStoreInventory.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertificateStoreInventory' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertificateStoreInventory> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertificateStoreInventory.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertificateStoreInventory>() {
           @Override
           public void write(JsonWriter out, ModelsCertificateStoreInventory value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertificateStoreInventory read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertificateStoreInventory given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertificateStoreInventory
  * @throws IOException if the JSON string is invalid with respect to ModelsCertificateStoreInventory
  */
  public static ModelsCertificateStoreInventory fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertificateStoreInventory.class);
  }

 /**
  * Convert an instance of ModelsCertificateStoreInventory to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

