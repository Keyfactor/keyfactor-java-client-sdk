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
import com.keyfactor.command.client.model.CoreModelsEnrollmentEnrollmentCA;
import com.keyfactor.command.client.model.CoreModelsEnrollmentEnrollmentTemplate;
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
 * CoreModelsEnrollmentEnrollmentTemplateCAResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CoreModelsEnrollmentEnrollmentTemplateCAResponse {
  public static final String SERIALIZED_NAME_TEMPLATES = "Templates";
  @SerializedName(SERIALIZED_NAME_TEMPLATES)
  private List<CoreModelsEnrollmentEnrollmentTemplate> templates = null;

  public static final String SERIALIZED_NAME_STANDALONE_C_AS = "StandaloneCAs";
  @SerializedName(SERIALIZED_NAME_STANDALONE_C_AS)
  private List<CoreModelsEnrollmentEnrollmentCA> standaloneCAs = null;

  public CoreModelsEnrollmentEnrollmentTemplateCAResponse() {
  }

  public CoreModelsEnrollmentEnrollmentTemplateCAResponse templates(List<CoreModelsEnrollmentEnrollmentTemplate> templates) {
    
    this.templates = templates;
    return this;
  }

  public CoreModelsEnrollmentEnrollmentTemplateCAResponse addTemplatesItem(CoreModelsEnrollmentEnrollmentTemplate templatesItem) {
    if (this.templates == null) {
      this.templates = new ArrayList<>();
    }
    this.templates.add(templatesItem);
    return this;
  }

   /**
   * Get templates
   * @return templates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CoreModelsEnrollmentEnrollmentTemplate> getTemplates() {
    return templates;
  }


  public void setTemplates(List<CoreModelsEnrollmentEnrollmentTemplate> templates) {
    this.templates = templates;
  }


  public CoreModelsEnrollmentEnrollmentTemplateCAResponse standaloneCAs(List<CoreModelsEnrollmentEnrollmentCA> standaloneCAs) {
    
    this.standaloneCAs = standaloneCAs;
    return this;
  }

  public CoreModelsEnrollmentEnrollmentTemplateCAResponse addStandaloneCAsItem(CoreModelsEnrollmentEnrollmentCA standaloneCAsItem) {
    if (this.standaloneCAs == null) {
      this.standaloneCAs = new ArrayList<>();
    }
    this.standaloneCAs.add(standaloneCAsItem);
    return this;
  }

   /**
   * Get standaloneCAs
   * @return standaloneCAs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CoreModelsEnrollmentEnrollmentCA> getStandaloneCAs() {
    return standaloneCAs;
  }


  public void setStandaloneCAs(List<CoreModelsEnrollmentEnrollmentCA> standaloneCAs) {
    this.standaloneCAs = standaloneCAs;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreModelsEnrollmentEnrollmentTemplateCAResponse coreModelsEnrollmentEnrollmentTemplateCAResponse = (CoreModelsEnrollmentEnrollmentTemplateCAResponse) o;
    return Objects.equals(this.templates, coreModelsEnrollmentEnrollmentTemplateCAResponse.templates) &&
        Objects.equals(this.standaloneCAs, coreModelsEnrollmentEnrollmentTemplateCAResponse.standaloneCAs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templates, standaloneCAs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreModelsEnrollmentEnrollmentTemplateCAResponse {\n");
    sb.append("    templates: ").append(toIndentedString(templates)).append("\n");
    sb.append("    standaloneCAs: ").append(toIndentedString(standaloneCAs)).append("\n");
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
    openapiFields.add("Templates");
    openapiFields.add("StandaloneCAs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CoreModelsEnrollmentEnrollmentTemplateCAResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CoreModelsEnrollmentEnrollmentTemplateCAResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CoreModelsEnrollmentEnrollmentTemplateCAResponse is not found in the empty JSON string", CoreModelsEnrollmentEnrollmentTemplateCAResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CoreModelsEnrollmentEnrollmentTemplateCAResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CoreModelsEnrollmentEnrollmentTemplateCAResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("Templates") != null && !jsonObj.get("Templates").isJsonNull()) {
        JsonArray jsonArraytemplates = jsonObj.getAsJsonArray("Templates");
        if (jsonArraytemplates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Templates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Templates` to be an array in the JSON string but got `%s`", jsonObj.get("Templates").toString()));
          }

          // validate the optional field `Templates` (array)
          for (int i = 0; i < jsonArraytemplates.size(); i++) {
            CoreModelsEnrollmentEnrollmentTemplate.validateJsonObject(jsonArraytemplates.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("StandaloneCAs") != null && !jsonObj.get("StandaloneCAs").isJsonNull()) {
        JsonArray jsonArraystandaloneCAs = jsonObj.getAsJsonArray("StandaloneCAs");
        if (jsonArraystandaloneCAs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("StandaloneCAs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `StandaloneCAs` to be an array in the JSON string but got `%s`", jsonObj.get("StandaloneCAs").toString()));
          }

          // validate the optional field `StandaloneCAs` (array)
          for (int i = 0; i < jsonArraystandaloneCAs.size(); i++) {
            CoreModelsEnrollmentEnrollmentCA.validateJsonObject(jsonArraystandaloneCAs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CoreModelsEnrollmentEnrollmentTemplateCAResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CoreModelsEnrollmentEnrollmentTemplateCAResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CoreModelsEnrollmentEnrollmentTemplateCAResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CoreModelsEnrollmentEnrollmentTemplateCAResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<CoreModelsEnrollmentEnrollmentTemplateCAResponse>() {
           @Override
           public void write(JsonWriter out, CoreModelsEnrollmentEnrollmentTemplateCAResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CoreModelsEnrollmentEnrollmentTemplateCAResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CoreModelsEnrollmentEnrollmentTemplateCAResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CoreModelsEnrollmentEnrollmentTemplateCAResponse
  * @throws IOException if the JSON string is invalid with respect to CoreModelsEnrollmentEnrollmentTemplateCAResponse
  */
  public static CoreModelsEnrollmentEnrollmentTemplateCAResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CoreModelsEnrollmentEnrollmentTemplateCAResponse.class);
  }

 /**
  * Convert an instance of CoreModelsEnrollmentEnrollmentTemplateCAResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

