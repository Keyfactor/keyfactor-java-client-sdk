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
 * The CustomReport can be used to create and update a custom report.
 */
@ApiModel(description = "The CustomReport can be used to create and update a custom report.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsCustomReport {
  public static final String SERIALIZED_NAME_CUSTOM_U_R_L = "CustomURL";
  @SerializedName(SERIALIZED_NAME_CUSTOM_U_R_L)
  private String customURL;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IN_NAVIGATOR = "InNavigator";
  @SerializedName(SERIALIZED_NAME_IN_NAVIGATOR)
  private Boolean inNavigator;

  public static final String SERIALIZED_NAME_FAVORITE = "Favorite";
  @SerializedName(SERIALIZED_NAME_FAVORITE)
  private Boolean favorite;

  public ModelsCustomReport() {
  }

  public ModelsCustomReport customURL(String customURL) {
    
    this.customURL = customURL;
    return this;
  }

   /**
   * Get customURL
   * @return customURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomURL() {
    return customURL;
  }


  public void setCustomURL(String customURL) {
    this.customURL = customURL;
  }


  public ModelsCustomReport id(Integer id) {
    
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


  public ModelsCustomReport displayName(String displayName) {
    
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


  public ModelsCustomReport description(String description) {
    
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


  public ModelsCustomReport inNavigator(Boolean inNavigator) {
    
    this.inNavigator = inNavigator;
    return this;
  }

   /**
   * Get inNavigator
   * @return inNavigator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInNavigator() {
    return inNavigator;
  }


  public void setInNavigator(Boolean inNavigator) {
    this.inNavigator = inNavigator;
  }


  public ModelsCustomReport favorite(Boolean favorite) {
    
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
    ModelsCustomReport modelsCustomReport = (ModelsCustomReport) o;
    return Objects.equals(this.customURL, modelsCustomReport.customURL) &&
        Objects.equals(this.id, modelsCustomReport.id) &&
        Objects.equals(this.displayName, modelsCustomReport.displayName) &&
        Objects.equals(this.description, modelsCustomReport.description) &&
        Objects.equals(this.inNavigator, modelsCustomReport.inNavigator) &&
        Objects.equals(this.favorite, modelsCustomReport.favorite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customURL, id, displayName, description, inNavigator, favorite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsCustomReport {\n");
    sb.append("    customURL: ").append(toIndentedString(customURL)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inNavigator: ").append(toIndentedString(inNavigator)).append("\n");
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
    openapiFields.add("CustomURL");
    openapiFields.add("Id");
    openapiFields.add("DisplayName");
    openapiFields.add("Description");
    openapiFields.add("InNavigator");
    openapiFields.add("Favorite");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsCustomReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsCustomReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsCustomReport is not found in the empty JSON string", ModelsCustomReport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsCustomReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsCustomReport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("CustomURL") != null && !jsonObj.get("CustomURL").isJsonNull()) && !jsonObj.get("CustomURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CustomURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CustomURL").toString()));
      }
      if ((jsonObj.get("DisplayName") != null && !jsonObj.get("DisplayName").isJsonNull()) && !jsonObj.get("DisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DisplayName").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsCustomReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsCustomReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsCustomReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsCustomReport.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsCustomReport>() {
           @Override
           public void write(JsonWriter out, ModelsCustomReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsCustomReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsCustomReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsCustomReport
  * @throws IOException if the JSON string is invalid with respect to ModelsCustomReport
  */
  public static ModelsCustomReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsCustomReport.class);
  }

 /**
  * Convert an instance of ModelsCustomReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

