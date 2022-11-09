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
import com.keyfactor.command.client.model.KeyfactorApiModelsTemplatesGlobalTemplateDefaultResponse;
import com.keyfactor.command.client.model.KeyfactorApiModelsTemplatesGlobalTemplatePolicyResponse;
import com.keyfactor.command.client.model.KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse;
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
 * KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse {
  public static final String SERIALIZED_NAME_TEMPLATE_REGEXES = "TemplateRegexes";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REGEXES)
  private List<KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse> templateRegexes = null;

  public static final String SERIALIZED_NAME_TEMPLATE_DEFAULTS = "TemplateDefaults";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_DEFAULTS)
  private List<KeyfactorApiModelsTemplatesGlobalTemplateDefaultResponse> templateDefaults = null;

  public static final String SERIALIZED_NAME_TEMPLATE_POLICY = "TemplatePolicy";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_POLICY)
  private KeyfactorApiModelsTemplatesGlobalTemplatePolicyResponse templatePolicy;

  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse() {
  }

  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse templateRegexes(List<KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse> templateRegexes) {
    
    this.templateRegexes = templateRegexes;
    return this;
  }

  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse addTemplateRegexesItem(KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse templateRegexesItem) {
    if (this.templateRegexes == null) {
      this.templateRegexes = new ArrayList<>();
    }
    this.templateRegexes.add(templateRegexesItem);
    return this;
  }

   /**
   * The regular expressions to use for validation during enrollment.
   * @return templateRegexes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The regular expressions to use for validation during enrollment.")

  public List<KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse> getTemplateRegexes() {
    return templateRegexes;
  }


  public void setTemplateRegexes(List<KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse> templateRegexes) {
    this.templateRegexes = templateRegexes;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse templateDefaults(List<KeyfactorApiModelsTemplatesGlobalTemplateDefaultResponse> templateDefaults) {
    
    this.templateDefaults = templateDefaults;
    return this;
  }

  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse addTemplateDefaultsItem(KeyfactorApiModelsTemplatesGlobalTemplateDefaultResponse templateDefaultsItem) {
    if (this.templateDefaults == null) {
      this.templateDefaults = new ArrayList<>();
    }
    this.templateDefaults.add(templateDefaultsItem);
    return this;
  }

   /**
   * The default values to use during enrollment.
   * @return templateDefaults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default values to use during enrollment.")

  public List<KeyfactorApiModelsTemplatesGlobalTemplateDefaultResponse> getTemplateDefaults() {
    return templateDefaults;
  }


  public void setTemplateDefaults(List<KeyfactorApiModelsTemplatesGlobalTemplateDefaultResponse> templateDefaults) {
    this.templateDefaults = templateDefaults;
  }


  public KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse templatePolicy(KeyfactorApiModelsTemplatesGlobalTemplatePolicyResponse templatePolicy) {
    
    this.templatePolicy = templatePolicy;
    return this;
  }

   /**
   * Get templatePolicy
   * @return templatePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorApiModelsTemplatesGlobalTemplatePolicyResponse getTemplatePolicy() {
    return templatePolicy;
  }


  public void setTemplatePolicy(KeyfactorApiModelsTemplatesGlobalTemplatePolicyResponse templatePolicy) {
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
    KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse keyfactorApiModelsTemplatesGlobalTemplateSettingsResponse = (KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse) o;
    return Objects.equals(this.templateRegexes, keyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.templateRegexes) &&
        Objects.equals(this.templateDefaults, keyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.templateDefaults) &&
        Objects.equals(this.templatePolicy, keyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.templatePolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateRegexes, templateDefaults, templatePolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse {\n");
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
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse is not found in the empty JSON string", KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("TemplateRegexes") != null && !jsonObj.get("TemplateRegexes").isJsonNull()) {
        JsonArray jsonArraytemplateRegexes = jsonObj.getAsJsonArray("TemplateRegexes");
        if (jsonArraytemplateRegexes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("TemplateRegexes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `TemplateRegexes` to be an array in the JSON string but got `%s`", jsonObj.get("TemplateRegexes").toString()));
          }

          // validate the optional field `TemplateRegexes` (array)
          for (int i = 0; i < jsonArraytemplateRegexes.size(); i++) {
            KeyfactorApiModelsTemplatesGlobalTemplateRegexResponse.validateJsonObject(jsonArraytemplateRegexes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("TemplateDefaults") != null && !jsonObj.get("TemplateDefaults").isJsonNull()) {
        JsonArray jsonArraytemplateDefaults = jsonObj.getAsJsonArray("TemplateDefaults");
        if (jsonArraytemplateDefaults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("TemplateDefaults").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `TemplateDefaults` to be an array in the JSON string but got `%s`", jsonObj.get("TemplateDefaults").toString()));
          }

          // validate the optional field `TemplateDefaults` (array)
          for (int i = 0; i < jsonArraytemplateDefaults.size(); i++) {
            KeyfactorApiModelsTemplatesGlobalTemplateDefaultResponse.validateJsonObject(jsonArraytemplateDefaults.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `TemplatePolicy`
      if (jsonObj.get("TemplatePolicy") != null && !jsonObj.get("TemplatePolicy").isJsonNull()) {
        KeyfactorApiModelsTemplatesGlobalTemplatePolicyResponse.validateJsonObject(jsonObj.getAsJsonObject("TemplatePolicy"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse
  */
  public static KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsTemplatesGlobalTemplateSettingsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

