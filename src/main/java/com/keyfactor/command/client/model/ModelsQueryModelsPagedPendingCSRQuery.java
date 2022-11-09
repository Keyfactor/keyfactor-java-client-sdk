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
 * ModelsQueryModelsPagedPendingCSRQuery
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsQueryModelsPagedPendingCSRQuery {
  public static final String SERIALIZED_NAME_QUERY_STRING = "QueryString";
  @SerializedName(SERIALIZED_NAME_QUERY_STRING)
  private String queryString;

  public static final String SERIALIZED_NAME_PAGE_RETURNED = "PageReturned";
  @SerializedName(SERIALIZED_NAME_PAGE_RETURNED)
  private Integer pageReturned;

  public static final String SERIALIZED_NAME_RETURN_LIMIT = "ReturnLimit";
  @SerializedName(SERIALIZED_NAME_RETURN_LIMIT)
  private Integer returnLimit;

  public static final String SERIALIZED_NAME_SORT_FIELD = "SortField";
  @SerializedName(SERIALIZED_NAME_SORT_FIELD)
  private String sortField;

  /**
   * Field sort direction [0&#x3D;ascending, 1&#x3D;descending]
   */
  @JsonAdapter(SortAscendingEnum.Adapter.class)
  public enum SortAscendingEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    SortAscendingEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortAscendingEnum fromValue(Integer value) {
      for (SortAscendingEnum b : SortAscendingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SortAscendingEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortAscendingEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortAscendingEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return SortAscendingEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SORT_ASCENDING = "SortAscending";
  @SerializedName(SERIALIZED_NAME_SORT_ASCENDING)
  private SortAscendingEnum sortAscending;

  public ModelsQueryModelsPagedPendingCSRQuery() {
  }

  public ModelsQueryModelsPagedPendingCSRQuery queryString(String queryString) {
    
    this.queryString = queryString;
    return this;
  }

   /**
   * Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)
   * @return queryString
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contents of the query (ex: field1 -eq value1 AND field2 -gt value2)")

  public String getQueryString() {
    return queryString;
  }


  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }


  public ModelsQueryModelsPagedPendingCSRQuery pageReturned(Integer pageReturned) {
    
    this.pageReturned = pageReturned;
    return this;
  }

   /**
   * The current page within the result set to be returned
   * @return pageReturned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current page within the result set to be returned")

  public Integer getPageReturned() {
    return pageReturned;
  }


  public void setPageReturned(Integer pageReturned) {
    this.pageReturned = pageReturned;
  }


  public ModelsQueryModelsPagedPendingCSRQuery returnLimit(Integer returnLimit) {
    
    this.returnLimit = returnLimit;
    return this;
  }

   /**
   * Maximum number of records to be returned in a single call
   * @return returnLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of records to be returned in a single call")

  public Integer getReturnLimit() {
    return returnLimit;
  }


  public void setReturnLimit(Integer returnLimit) {
    this.returnLimit = returnLimit;
  }


  public ModelsQueryModelsPagedPendingCSRQuery sortField(String sortField) {
    
    this.sortField = sortField;
    return this;
  }

   /**
   * Field by which the results should be sorted (view results via Management Portal for sortable columns)
   * @return sortField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field by which the results should be sorted (view results via Management Portal for sortable columns)")

  public String getSortField() {
    return sortField;
  }


  public void setSortField(String sortField) {
    this.sortField = sortField;
  }


  public ModelsQueryModelsPagedPendingCSRQuery sortAscending(SortAscendingEnum sortAscending) {
    
    this.sortAscending = sortAscending;
    return this;
  }

   /**
   * Field sort direction [0&#x3D;ascending, 1&#x3D;descending]
   * @return sortAscending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field sort direction [0=ascending, 1=descending]")

  public SortAscendingEnum getSortAscending() {
    return sortAscending;
  }


  public void setSortAscending(SortAscendingEnum sortAscending) {
    this.sortAscending = sortAscending;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsQueryModelsPagedPendingCSRQuery modelsQueryModelsPagedPendingCSRQuery = (ModelsQueryModelsPagedPendingCSRQuery) o;
    return Objects.equals(this.queryString, modelsQueryModelsPagedPendingCSRQuery.queryString) &&
        Objects.equals(this.pageReturned, modelsQueryModelsPagedPendingCSRQuery.pageReturned) &&
        Objects.equals(this.returnLimit, modelsQueryModelsPagedPendingCSRQuery.returnLimit) &&
        Objects.equals(this.sortField, modelsQueryModelsPagedPendingCSRQuery.sortField) &&
        Objects.equals(this.sortAscending, modelsQueryModelsPagedPendingCSRQuery.sortAscending);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryString, pageReturned, returnLimit, sortField, sortAscending);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsQueryModelsPagedPendingCSRQuery {\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    pageReturned: ").append(toIndentedString(pageReturned)).append("\n");
    sb.append("    returnLimit: ").append(toIndentedString(returnLimit)).append("\n");
    sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
    sb.append("    sortAscending: ").append(toIndentedString(sortAscending)).append("\n");
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
    openapiFields.add("QueryString");
    openapiFields.add("PageReturned");
    openapiFields.add("ReturnLimit");
    openapiFields.add("SortField");
    openapiFields.add("SortAscending");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsQueryModelsPagedPendingCSRQuery
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsQueryModelsPagedPendingCSRQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsQueryModelsPagedPendingCSRQuery is not found in the empty JSON string", ModelsQueryModelsPagedPendingCSRQuery.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsQueryModelsPagedPendingCSRQuery.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsQueryModelsPagedPendingCSRQuery` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("QueryString") != null && !jsonObj.get("QueryString").isJsonNull()) && !jsonObj.get("QueryString").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `QueryString` to be a primitive type in the JSON string but got `%s`", jsonObj.get("QueryString").toString()));
      }
      if ((jsonObj.get("SortField") != null && !jsonObj.get("SortField").isJsonNull()) && !jsonObj.get("SortField").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SortField` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SortField").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsQueryModelsPagedPendingCSRQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsQueryModelsPagedPendingCSRQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsQueryModelsPagedPendingCSRQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsQueryModelsPagedPendingCSRQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsQueryModelsPagedPendingCSRQuery>() {
           @Override
           public void write(JsonWriter out, ModelsQueryModelsPagedPendingCSRQuery value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsQueryModelsPagedPendingCSRQuery read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsQueryModelsPagedPendingCSRQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsQueryModelsPagedPendingCSRQuery
  * @throws IOException if the JSON string is invalid with respect to ModelsQueryModelsPagedPendingCSRQuery
  */
  public static ModelsQueryModelsPagedPendingCSRQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsQueryModelsPagedPendingCSRQuery.class);
  }

 /**
  * Convert an instance of ModelsQueryModelsPagedPendingCSRQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

