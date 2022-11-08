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
import com.keyfactor.command.client.model.KeyfactorApiModelsWorkflowsParameterDefinitionResponse;
import com.keyfactor.command.client.model.KeyfactorApiModelsWorkflowsSignalDefinitionResponse;
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
 * KeyfactorApiModelsWorkflowsAvailableStepResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class KeyfactorApiModelsWorkflowsAvailableStepResponse {
  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EXTENSION_NAME = "ExtensionName";
  @SerializedName(SERIALIZED_NAME_EXTENSION_NAME)
  private String extensionName;

  public static final String SERIALIZED_NAME_OUTPUTS = "Outputs";
  @SerializedName(SERIALIZED_NAME_OUTPUTS)
  private List<String> outputs = null;

  public static final String SERIALIZED_NAME_CONFIGURATION_PARAMETERS_DEFINITION = "ConfigurationParametersDefinition";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_PARAMETERS_DEFINITION)
  private Map<String, KeyfactorApiModelsWorkflowsParameterDefinitionResponse> configurationParametersDefinition = null;

  public static final String SERIALIZED_NAME_SIGNALS_DEFINITION = "SignalsDefinition";
  @SerializedName(SERIALIZED_NAME_SIGNALS_DEFINITION)
  private Map<String, KeyfactorApiModelsWorkflowsSignalDefinitionResponse> signalsDefinition = null;

  public KeyfactorApiModelsWorkflowsAvailableStepResponse() {
  }

  public KeyfactorApiModelsWorkflowsAvailableStepResponse displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the step.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the step.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public KeyfactorApiModelsWorkflowsAvailableStepResponse extensionName(String extensionName) {
    
    this.extensionName = extensionName;
    return this;
  }

   /**
   * The name of the extension.
   * @return extensionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the extension.")

  public String getExtensionName() {
    return extensionName;
  }


  public void setExtensionName(String extensionName) {
    this.extensionName = extensionName;
  }


  public KeyfactorApiModelsWorkflowsAvailableStepResponse outputs(List<String> outputs) {
    
    this.outputs = outputs;
    return this;
  }

  public KeyfactorApiModelsWorkflowsAvailableStepResponse addOutputsItem(String outputsItem) {
    if (this.outputs == null) {
      this.outputs = new ArrayList<>();
    }
    this.outputs.add(outputsItem);
    return this;
  }

   /**
   * The possible outputs of the step.
   * @return outputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The possible outputs of the step.")

  public List<String> getOutputs() {
    return outputs;
  }


  public void setOutputs(List<String> outputs) {
    this.outputs = outputs;
  }


  public KeyfactorApiModelsWorkflowsAvailableStepResponse configurationParametersDefinition(Map<String, KeyfactorApiModelsWorkflowsParameterDefinitionResponse> configurationParametersDefinition) {
    
    this.configurationParametersDefinition = configurationParametersDefinition;
    return this;
  }

  public KeyfactorApiModelsWorkflowsAvailableStepResponse putConfigurationParametersDefinitionItem(String key, KeyfactorApiModelsWorkflowsParameterDefinitionResponse configurationParametersDefinitionItem) {
    if (this.configurationParametersDefinition == null) {
      this.configurationParametersDefinition = new HashMap<>();
    }
    this.configurationParametersDefinition.put(key, configurationParametersDefinitionItem);
    return this;
  }

   /**
   * Get configurationParametersDefinition
   * @return configurationParametersDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, KeyfactorApiModelsWorkflowsParameterDefinitionResponse> getConfigurationParametersDefinition() {
    return configurationParametersDefinition;
  }


  public void setConfigurationParametersDefinition(Map<String, KeyfactorApiModelsWorkflowsParameterDefinitionResponse> configurationParametersDefinition) {
    this.configurationParametersDefinition = configurationParametersDefinition;
  }


  public KeyfactorApiModelsWorkflowsAvailableStepResponse signalsDefinition(Map<String, KeyfactorApiModelsWorkflowsSignalDefinitionResponse> signalsDefinition) {
    
    this.signalsDefinition = signalsDefinition;
    return this;
  }

  public KeyfactorApiModelsWorkflowsAvailableStepResponse putSignalsDefinitionItem(String key, KeyfactorApiModelsWorkflowsSignalDefinitionResponse signalsDefinitionItem) {
    if (this.signalsDefinition == null) {
      this.signalsDefinition = new HashMap<>();
    }
    this.signalsDefinition.put(key, signalsDefinitionItem);
    return this;
  }

   /**
   * Get signalsDefinition
   * @return signalsDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, KeyfactorApiModelsWorkflowsSignalDefinitionResponse> getSignalsDefinition() {
    return signalsDefinition;
  }


  public void setSignalsDefinition(Map<String, KeyfactorApiModelsWorkflowsSignalDefinitionResponse> signalsDefinition) {
    this.signalsDefinition = signalsDefinition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsWorkflowsAvailableStepResponse keyfactorApiModelsWorkflowsAvailableStepResponse = (KeyfactorApiModelsWorkflowsAvailableStepResponse) o;
    return Objects.equals(this.displayName, keyfactorApiModelsWorkflowsAvailableStepResponse.displayName) &&
        Objects.equals(this.extensionName, keyfactorApiModelsWorkflowsAvailableStepResponse.extensionName) &&
        Objects.equals(this.outputs, keyfactorApiModelsWorkflowsAvailableStepResponse.outputs) &&
        Objects.equals(this.configurationParametersDefinition, keyfactorApiModelsWorkflowsAvailableStepResponse.configurationParametersDefinition) &&
        Objects.equals(this.signalsDefinition, keyfactorApiModelsWorkflowsAvailableStepResponse.signalsDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, extensionName, outputs, configurationParametersDefinition, signalsDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsWorkflowsAvailableStepResponse {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    extensionName: ").append(toIndentedString(extensionName)).append("\n");
    sb.append("    outputs: ").append(toIndentedString(outputs)).append("\n");
    sb.append("    configurationParametersDefinition: ").append(toIndentedString(configurationParametersDefinition)).append("\n");
    sb.append("    signalsDefinition: ").append(toIndentedString(signalsDefinition)).append("\n");
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
    openapiFields.add("DisplayName");
    openapiFields.add("ExtensionName");
    openapiFields.add("Outputs");
    openapiFields.add("ConfigurationParametersDefinition");
    openapiFields.add("SignalsDefinition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsWorkflowsAvailableStepResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsWorkflowsAvailableStepResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsWorkflowsAvailableStepResponse is not found in the empty JSON string", KeyfactorApiModelsWorkflowsAvailableStepResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsWorkflowsAvailableStepResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsWorkflowsAvailableStepResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("DisplayName") != null && !jsonObj.get("DisplayName").isJsonNull()) && !jsonObj.get("DisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DisplayName").toString()));
      }
      if ((jsonObj.get("ExtensionName") != null && !jsonObj.get("ExtensionName").isJsonNull()) && !jsonObj.get("ExtensionName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ExtensionName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ExtensionName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Outputs") != null && !jsonObj.get("Outputs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Outputs` to be an array in the JSON string but got `%s`", jsonObj.get("Outputs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsWorkflowsAvailableStepResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsWorkflowsAvailableStepResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsWorkflowsAvailableStepResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsWorkflowsAvailableStepResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsWorkflowsAvailableStepResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsWorkflowsAvailableStepResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsWorkflowsAvailableStepResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsWorkflowsAvailableStepResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsWorkflowsAvailableStepResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsWorkflowsAvailableStepResponse
  */
  public static KeyfactorApiModelsWorkflowsAvailableStepResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsWorkflowsAvailableStepResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsWorkflowsAvailableStepResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

