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
import com.keyfactor.command.client.model.KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest;
import com.keyfactor.command.client.model.KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest;
import com.keyfactor.command.client.model.KeyfactorApiModelsTemplatesGlobalTemplateRegexRequest;
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
 * KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest {
  public static final String SERIALIZED_NAME_TEMPLATE_REGEXES = "TemplateRegexes";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REGEXES)
  private List<KeyfactorApiModelsTemplatesGlobalTemplateRegexRequest> templateRegexes = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE_DEFAULTS = "TemplateDefaults";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_DEFAULTS)
  private List<KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest> templateDefaults = new ArrayList<>();

  public static final String SERIALIZED_NAME_TEMPLATE_POLICY = "TemplatePolicy";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_POLICY)
  private KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest templatePolicy;

  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest() {
  }

  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest templateRegexes(List<KeyfactorApiModelsTemplatesGlobalTemplateRegexRequest> templateRegexes) {
    
    this.templateRegexes = templateRegexes;
    return this;
  }

  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest addTemplateRegexesItem(KeyfactorApiModelsTemplatesGlobalTemplateRegexRequest templateRegexesItem) {
    this.templateRegexes.add(templateRegexesItem);
    return this;
  }

   /**
   * The regular expressions to use for validation during enrollment.
   * @return templateRegexes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The regular expressions to use for validation during enrollment.")

  public List<KeyfactorApiModelsTemplatesGlobalTemplateRegexRequest> getTemplateRegexes() {
    return templateRegexes;
  }


  public void setTemplateRegexes(List<KeyfactorApiModelsTemplatesGlobalTemplateRegexRequest> templateRegexes) {
    this.templateRegexes = templateRegexes;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest templateDefaults(List<KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest> templateDefaults) {
    
    this.templateDefaults = templateDefaults;
    return this;
  }

  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest addTemplateDefaultsItem(KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest templateDefaultsItem) {
    this.templateDefaults.add(templateDefaultsItem);
    return this;
  }

   /**
   * The default values to use during enrollment.
   * @return templateDefaults
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The default values to use during enrollment.")

  public List<KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest> getTemplateDefaults() {
    return templateDefaults;
  }


  public void setTemplateDefaults(List<KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest> templateDefaults) {
    this.templateDefaults = templateDefaults;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest templatePolicy(KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest templatePolicy) {
    
    this.templatePolicy = templatePolicy;
    return this;
  }

   /**
   * Get templatePolicy
   * @return templatePolicy
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest getTemplatePolicy() {
    return templatePolicy;
  }


  public void setTemplatePolicy(KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest templatePolicy) {
    this.templatePolicy = templatePolicy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest keyfactorApiModelsTemplatesGlobalTemplateSettingsRequest = (KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest) o;
    return Objects.equals(this.templateRegexes, keyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.templateRegexes) &&
        Objects.equals(this.templateDefaults, keyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.templateDefaults) &&
        Objects.equals(this.templatePolicy, keyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.templatePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateRegexes, templateDefaults, templatePolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest {\n");
    sb.append("    templateRegexes: ").append(toIndentedString(templateRegexes)).append("\n");
    sb.append("    templateDefaults: ").append(toIndentedString(templateDefaults)).append("\n");
    sb.append("    templatePolicy: ").append(toIndentedString(templatePolicy)).append("\n");
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
    openapiFields.add("TemplateRegexes");
    openapiFields.add("TemplateDefaults");
    openapiFields.add("TemplatePolicy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("TemplateRegexes");
    openapiRequiredFields.add("TemplateDefaults");
    openapiRequiredFields.add("TemplatePolicy");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest is not found in the empty JSON string", KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("TemplateRegexes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TemplateRegexes` to be an array in the JSON string but got `%s`", jsonObj.get("TemplateRegexes").toString()));
      }

      JsonArray jsonArraytemplateRegexes = jsonObj.getAsJsonArray("TemplateRegexes");
      // validate the required field `TemplateRegexes` (array)
      for (int i = 0; i < jsonArraytemplateRegexes.size(); i++) {
        KeyfactorApiModelsTemplatesGlobalTemplateRegexRequest.validateJsonObject(jsonArraytemplateRegexes.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("TemplateDefaults").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `TemplateDefaults` to be an array in the JSON string but got `%s`", jsonObj.get("TemplateDefaults").toString()));
      }

      JsonArray jsonArraytemplateDefaults = jsonObj.getAsJsonArray("TemplateDefaults");
      // validate the required field `TemplateDefaults` (array)
      for (int i = 0; i < jsonArraytemplateDefaults.size(); i++) {
        KeyfactorApiModelsTemplatesGlobalTemplateDefaultRequest.validateJsonObject(jsonArraytemplateDefaults.get(i).getAsJsonObject());
      };
      // validate the required field `TemplatePolicy`
      KeyfactorApiModelsTemplatesGlobalTemplatePolicyRequest.validateJsonObject(jsonObj.getAsJsonObject("TemplatePolicy"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest
  */
  public static KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsTemplatesGlobalTemplateSettingsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

