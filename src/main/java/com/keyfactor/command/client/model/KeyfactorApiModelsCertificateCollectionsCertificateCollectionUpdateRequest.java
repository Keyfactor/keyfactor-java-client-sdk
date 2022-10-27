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
 * KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_QUERY = "Query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  /**
   * Gets or Sets duplicationField
   */
  @JsonAdapter(DuplicationFieldEnum.Adapter.class)
  public enum DuplicationFieldEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4);

    private Integer value;

    DuplicationFieldEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DuplicationFieldEnum fromValue(Integer value) {
      for (DuplicationFieldEnum b : DuplicationFieldEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DuplicationFieldEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DuplicationFieldEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DuplicationFieldEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DuplicationFieldEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DUPLICATION_FIELD = "DuplicationField";
  @SerializedName(SERIALIZED_NAME_DUPLICATION_FIELD)
  private DuplicationFieldEnum duplicationField;

  public static final String SERIALIZED_NAME_SHOW_ON_DASHBOARD = "ShowOnDashboard";
  @SerializedName(SERIALIZED_NAME_SHOW_ON_DASHBOARD)
  private Boolean showOnDashboard;

  public static final String SERIALIZED_NAME_FAVORITE = "Favorite";
  @SerializedName(SERIALIZED_NAME_FAVORITE)
  private Boolean favorite;

  public KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest() {
  }

  public KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest duplicationField(DuplicationFieldEnum duplicationField) {
    
    this.duplicationField = duplicationField;
    return this;
  }

   /**
   * Get duplicationField
   * @return duplicationField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DuplicationFieldEnum getDuplicationField() {
    return duplicationField;
  }


  public void setDuplicationField(DuplicationFieldEnum duplicationField) {
    this.duplicationField = duplicationField;
  }


  public KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest showOnDashboard(Boolean showOnDashboard) {
    
    this.showOnDashboard = showOnDashboard;
    return this;
  }

   /**
   * Get showOnDashboard
   * @return showOnDashboard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getShowOnDashboard() {
    return showOnDashboard;
  }


  public void setShowOnDashboard(Boolean showOnDashboard) {
    this.showOnDashboard = showOnDashboard;
  }


  public KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest favorite(Boolean favorite) {
    
    this.favorite = favorite;
    return this;
  }

   /**
   * Get favorite
   * @return favorite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFavorite() {
    return favorite;
  }


  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest keyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest = (KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest) o;
    return Objects.equals(this.id, keyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.id) &&
        Objects.equals(this.name, keyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.name) &&
        Objects.equals(this.description, keyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.description) &&
        Objects.equals(this.query, keyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.query) &&
        Objects.equals(this.duplicationField, keyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.duplicationField) &&
        Objects.equals(this.showOnDashboard, keyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.showOnDashboard) &&
        Objects.equals(this.favorite, keyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.favorite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, query, duplicationField, showOnDashboard, favorite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    duplicationField: ").append(toIndentedString(duplicationField)).append("\n");
    sb.append("    showOnDashboard: ").append(toIndentedString(showOnDashboard)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
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
    openapiFields.add("Name");
    openapiFields.add("Description");
    openapiFields.add("Query");
    openapiFields.add("DuplicationField");
    openapiFields.add("ShowOnDashboard");
    openapiFields.add("Favorite");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest is not found in the empty JSON string", KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("Query") != null && !jsonObj.get("Query").isJsonNull()) && !jsonObj.get("Query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Query").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest
  */
  public static KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsCertificateCollectionsCertificateCollectionUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

