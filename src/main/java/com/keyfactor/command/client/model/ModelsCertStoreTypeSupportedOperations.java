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
 * ModelsCertStoreTypeSupportedOperations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsCertStoreTypeSupportedOperations {
  public static final String SERIALIZED_NAME_ADD = "Add";
  @SerializedName(SERIALIZED_NAME_ADD)
  private Boolean add;

  public static final String SERIALIZED_NAME_CREATE = "Create";
  @SerializedName(SERIALIZED_NAME_CREATE)
  private Boolean create;

  public static final String SERIALIZED_NAME_DISCOVERY = "Discovery";
  @SerializedName(SERIALIZED_NAME_DISCOVERY)
  private Boolean discovery;

  public static final String SERIALIZED_NAME_ENROLLMENT = "Enrollment";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT)
  private Boolean enrollment;

  public static final String SERIALIZED_NAME_REMOVE = "Remove";
  @SerializedName(SERIALIZED_NAME_REMOVE)
  private Boolean remove;

  public ModelsCertStoreTypeSupportedOperations() {
  }

  public ModelsCertStoreTypeSupportedOperations add(Boolean add) {
    
    this.add = add;
    return this;
  }

   /**
   * Get add
   * @return add
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAdd() {
    return add;
  }


  public void setAdd(Boolean add) {
    this.add = add;
  }


  public ModelsCertStoreTypeSupportedOperations create(Boolean create) {
    
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCreate() {
    return create;
  }


  public void setCreate(Boolean create) {
    this.create = create;
  }


  public ModelsCertStoreTypeSupportedOperations discovery(Boolean discovery) {
    
    this.discovery = discovery;
    return this;
  }

   /**
   * Get discovery
   * @return discovery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDiscovery() {
    return discovery;
  }


  public void setDiscovery(Boolean discovery) {
    this.discovery = discovery;
  }


  public ModelsCertStoreTypeSupportedOperations enrollment(Boolean enrollment) {
    
    this.enrollment = enrollment;
    return this;
  }

   /**
   * Get enrollment
   * @return enrollment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getEnrollment() {
    return enrollment;
  }


  public void setEnrollment(Boolean enrollment) {
    this.enrollment = enrollment;
  }


  public ModelsCertStoreTypeSupportedOperations remove(Boolean remove) {
    
    this.remove = remove;
    return this;
  }

   /**
   * Get remove
   * @return remove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRemove() {
    return remove;
  }


  public void setRemove(Boolean remove) {
    this.remove = remove;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsCertStoreTypeSupportedOperations modelsCertStoreTypeSupportedOperations = (ModelsCertStoreTypeSupportedOperations) o;
    return Objects.equals(this.add, modelsCertStoreTypeSupportedOperations.add) &&
        Objects.equals(this.create, modelsCertStoreTypeSupportedOperations.create) &&
        Objects.equals(this.discovery, modelsCertStoreTypeSupportedOperations.discovery) &&
        Objects.equals(this.enrollment, modelsCertStoreTypeSupportedOperations.enrollment) &&
        Objects.equals(this.remove, modelsCertStoreTypeSupportedOperations.remove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, create, discovery, enrollment, remove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCertStoreTypeSupportedOperations {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    discovery: ").append(toIndentedString(discovery)).append("\n");
    sb.append("    enrollment: ").append(toIndentedString(enrollment)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
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
    openapiFields.add("Add");
    openapiFields.add("Create");
    openapiFields.add("Discovery");
    openapiFields.add("Enrollment");
    openapiFields.add("Remove");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCertStoreTypeSupportedOperations
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCertStoreTypeSupportedOperations.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCertStoreTypeSupportedOperations is not found in the empty JSON string", ModelsCertStoreTypeSupportedOperations.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCertStoreTypeSupportedOperations.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCertStoreTypeSupportedOperations` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCertStoreTypeSupportedOperations.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCertStoreTypeSupportedOperations' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCertStoreTypeSupportedOperations> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCertStoreTypeSupportedOperations.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCertStoreTypeSupportedOperations>() {
           @Override
           public void write(JsonWriter out, ModelsCertStoreTypeSupportedOperations value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCertStoreTypeSupportedOperations read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCertStoreTypeSupportedOperations given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCertStoreTypeSupportedOperations
  * @throws IOException if the JSON string is invalid with respect to ModelsCertStoreTypeSupportedOperations
  */
  public static ModelsCertStoreTypeSupportedOperations fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCertStoreTypeSupportedOperations.class);
  }

 /**
  * Convert an instance of ModelsCertStoreTypeSupportedOperations to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
