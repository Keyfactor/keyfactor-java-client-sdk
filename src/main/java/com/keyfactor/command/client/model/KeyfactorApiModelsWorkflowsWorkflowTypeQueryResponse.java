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
import com.keyfactor.command.client.model.KeyfactorApiModelsWorkflowsAvailableStepResponse;
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
 * KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse {
  public static final String SERIALIZED_NAME_WORKFLOW_TYPE = "WorkflowType";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE)
  private String workflowType;

  public static final String SERIALIZED_NAME_KEY_TYPE = "KeyType";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private String keyType;

  public static final String SERIALIZED_NAME_CONTEXT_PARAMETERS = "ContextParameters";
  @SerializedName(SERIALIZED_NAME_CONTEXT_PARAMETERS)
  private List<String> contextParameters = null;

  public static final String SERIALIZED_NAME_BUILT_IN_STEPS = "BuiltInSteps";
  @SerializedName(SERIALIZED_NAME_BUILT_IN_STEPS)
  private List<KeyfactorApiModelsWorkflowsAvailableStepResponse> builtInSteps = null;

  public KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse() {
  }

  public KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse workflowType(String workflowType) {
    
    this.workflowType = workflowType;
    return this;
  }

   /**
   * Get workflowType
   * @return workflowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWorkflowType() {
    return workflowType;
  }


  public void setWorkflowType(String workflowType) {
    this.workflowType = workflowType;
  }


  public KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse keyType(String keyType) {
    
    this.keyType = keyType;
    return this;
  }

   /**
   * Get keyType
   * @return keyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeyType() {
    return keyType;
  }


  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }


  public KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse contextParameters(List<String> contextParameters) {
    
    this.contextParameters = contextParameters;
    return this;
  }

  public KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse addContextParametersItem(String contextParametersItem) {
    if (this.contextParameters == null) {
      this.contextParameters = new ArrayList<>();
    }
    this.contextParameters.add(contextParametersItem);
    return this;
  }

   /**
   * Get contextParameters
   * @return contextParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getContextParameters() {
    return contextParameters;
  }


  public void setContextParameters(List<String> contextParameters) {
    this.contextParameters = contextParameters;
  }


  public KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse builtInSteps(List<KeyfactorApiModelsWorkflowsAvailableStepResponse> builtInSteps) {
    
    this.builtInSteps = builtInSteps;
    return this;
  }

  public KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse addBuiltInStepsItem(KeyfactorApiModelsWorkflowsAvailableStepResponse builtInStepsItem) {
    if (this.builtInSteps == null) {
      this.builtInSteps = new ArrayList<>();
    }
    this.builtInSteps.add(builtInStepsItem);
    return this;
  }

   /**
   * Get builtInSteps
   * @return builtInSteps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeyfactorApiModelsWorkflowsAvailableStepResponse> getBuiltInSteps() {
    return builtInSteps;
  }


  public void setBuiltInSteps(List<KeyfactorApiModelsWorkflowsAvailableStepResponse> builtInSteps) {
    this.builtInSteps = builtInSteps;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse keyfactorApiModelsWorkflowsWorkflowTypeQueryResponse = (KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse) o;
    return Objects.equals(this.workflowType, keyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.workflowType) &&
        Objects.equals(this.keyType, keyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.keyType) &&
        Objects.equals(this.contextParameters, keyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.contextParameters) &&
        Objects.equals(this.builtInSteps, keyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.builtInSteps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowType, keyType, contextParameters, builtInSteps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse {\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    contextParameters: ").append(toIndentedString(contextParameters)).append("\n");
    sb.append("    builtInSteps: ").append(toIndentedString(builtInSteps)).append("\n");
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
    openapiFields.add("WorkflowType");
    openapiFields.add("KeyType");
    openapiFields.add("ContextParameters");
    openapiFields.add("BuiltInSteps");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse is not found in the empty JSON string", KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("WorkflowType") != null && !jsonObj.get("WorkflowType").isJsonNull()) && !jsonObj.get("WorkflowType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `WorkflowType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("WorkflowType").toString()));
      }
      if ((jsonObj.get("KeyType") != null && !jsonObj.get("KeyType").isJsonNull()) && !jsonObj.get("KeyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeyType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("ContextParameters") != null && !jsonObj.get("ContextParameters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ContextParameters` to be an array in the JSON string but got `%s`", jsonObj.get("ContextParameters").toString()));
      }
      if (jsonObj.get("BuiltInSteps") != null && !jsonObj.get("BuiltInSteps").isJsonNull()) {
        JsonArray jsonArraybuiltInSteps = jsonObj.getAsJsonArray("BuiltInSteps");
        if (jsonArraybuiltInSteps != null) {
          // ensure the json data is an array
          if (!jsonObj.get("BuiltInSteps").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `BuiltInSteps` to be an array in the JSON string but got `%s`", jsonObj.get("BuiltInSteps").toString()));
          }

          // validate the optional field `BuiltInSteps` (array)
          for (int i = 0; i < jsonArraybuiltInSteps.size(); i++) {
            KeyfactorApiModelsWorkflowsAvailableStepResponse.validateJsonObject(jsonArraybuiltInSteps.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse
  */
  public static KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsWorkflowsWorkflowTypeQueryResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

