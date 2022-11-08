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
import java.util.UUID;

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
 * ModelsInvalidKeystore
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-08T11:48:36.483-07:00[America/Phoenix]")
public class ModelsInvalidKeystore {
  public static final String SERIALIZED_NAME_KEYSTORE_ID = "KeystoreId";
  @SerializedName(SERIALIZED_NAME_KEYSTORE_ID)
  private UUID keystoreId;

  public static final String SERIALIZED_NAME_CLIENT_MACHINE = "ClientMachine";
  @SerializedName(SERIALIZED_NAME_CLIENT_MACHINE)
  private String clientMachine;

  public static final String SERIALIZED_NAME_STORE_PATH = "StorePath";
  @SerializedName(SERIALIZED_NAME_STORE_PATH)
  private String storePath;

  public static final String SERIALIZED_NAME_ALIAS = "Alias";
  @SerializedName(SERIALIZED_NAME_ALIAS)
  private String alias;

  /**
   * Gets or Sets reason
   */
  @JsonAdapter(ReasonEnum.Adapter.class)
  public enum ReasonEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7);

    private Integer value;

    ReasonEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReasonEnum fromValue(Integer value) {
      for (ReasonEnum b : ReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReasonEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ReasonEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REASON = "Reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private ReasonEnum reason;

  public static final String SERIALIZED_NAME_EXPLANATION = "Explanation";
  @SerializedName(SERIALIZED_NAME_EXPLANATION)
  private String explanation;

  public ModelsInvalidKeystore() {
  }

  public ModelsInvalidKeystore keystoreId(UUID keystoreId) {
    
    this.keystoreId = keystoreId;
    return this;
  }

   /**
   * Get keystoreId
   * @return keystoreId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", value = "")

  public UUID getKeystoreId() {
    return keystoreId;
  }


  public void setKeystoreId(UUID keystoreId) {
    this.keystoreId = keystoreId;
  }


  public ModelsInvalidKeystore clientMachine(String clientMachine) {
    
    this.clientMachine = clientMachine;
    return this;
  }

   /**
   * Get clientMachine
   * @return clientMachine
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getClientMachine() {
    return clientMachine;
  }


  public void setClientMachine(String clientMachine) {
    this.clientMachine = clientMachine;
  }


  public ModelsInvalidKeystore storePath(String storePath) {
    
    this.storePath = storePath;
    return this;
  }

   /**
   * Get storePath
   * @return storePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStorePath() {
    return storePath;
  }


  public void setStorePath(String storePath) {
    this.storePath = storePath;
  }


  public ModelsInvalidKeystore alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * Get alias
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public ModelsInvalidKeystore reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public ModelsInvalidKeystore explanation(String explanation) {
    
    this.explanation = explanation;
    return this;
  }

   /**
   * Get explanation
   * @return explanation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExplanation() {
    return explanation;
  }


  public void setExplanation(String explanation) {
    this.explanation = explanation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsInvalidKeystore modelsInvalidKeystore = (ModelsInvalidKeystore) o;
    return Objects.equals(this.keystoreId, modelsInvalidKeystore.keystoreId) &&
        Objects.equals(this.clientMachine, modelsInvalidKeystore.clientMachine) &&
        Objects.equals(this.storePath, modelsInvalidKeystore.storePath) &&
        Objects.equals(this.alias, modelsInvalidKeystore.alias) &&
        Objects.equals(this.reason, modelsInvalidKeystore.reason) &&
        Objects.equals(this.explanation, modelsInvalidKeystore.explanation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keystoreId, clientMachine, storePath, alias, reason, explanation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsInvalidKeystore {\n");
    sb.append("    keystoreId: ").append(toIndentedString(keystoreId)).append("\n");
    sb.append("    clientMachine: ").append(toIndentedString(clientMachine)).append("\n");
    sb.append("    storePath: ").append(toIndentedString(storePath)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    explanation: ").append(toIndentedString(explanation)).append("\n");
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
    openapiFields.add("KeystoreId");
    openapiFields.add("ClientMachine");
    openapiFields.add("StorePath");
    openapiFields.add("Alias");
    openapiFields.add("Reason");
    openapiFields.add("Explanation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsInvalidKeystore
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsInvalidKeystore.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsInvalidKeystore is not found in the empty JSON string", ModelsInvalidKeystore.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsInvalidKeystore.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsInvalidKeystore` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("KeystoreId") != null && !jsonObj.get("KeystoreId").isJsonNull()) && !jsonObj.get("KeystoreId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeystoreId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeystoreId").toString()));
      }
      if ((jsonObj.get("ClientMachine") != null && !jsonObj.get("ClientMachine").isJsonNull()) && !jsonObj.get("ClientMachine").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ClientMachine` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ClientMachine").toString()));
      }
      if ((jsonObj.get("StorePath") != null && !jsonObj.get("StorePath").isJsonNull()) && !jsonObj.get("StorePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StorePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StorePath").toString()));
      }
      if ((jsonObj.get("Alias") != null && !jsonObj.get("Alias").isJsonNull()) && !jsonObj.get("Alias").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Alias` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Alias").toString()));
      }
      if ((jsonObj.get("Explanation") != null && !jsonObj.get("Explanation").isJsonNull()) && !jsonObj.get("Explanation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Explanation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Explanation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsInvalidKeystore.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsInvalidKeystore' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsInvalidKeystore> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsInvalidKeystore.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsInvalidKeystore>() {
           @Override
           public void write(JsonWriter out, ModelsInvalidKeystore value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsInvalidKeystore read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsInvalidKeystore given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsInvalidKeystore
  * @throws IOException if the JSON string is invalid with respect to ModelsInvalidKeystore
  */
  public static ModelsInvalidKeystore fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsInvalidKeystore.class);
  }

 /**
  * Convert an instance of ModelsInvalidKeystore to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
