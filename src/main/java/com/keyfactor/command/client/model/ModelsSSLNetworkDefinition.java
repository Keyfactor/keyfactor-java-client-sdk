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
 * ModelsSSLNetworkDefinition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsSSLNetworkDefinition {
  /**
   * Gets or Sets itemType
   */
  @JsonAdapter(ItemTypeEnum.Adapter.class)
  public enum ItemTypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    ItemTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ItemTypeEnum fromValue(Integer value) {
      for (ItemTypeEnum b : ItemTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ItemTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ItemTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ItemTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ItemTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ITEM_TYPE = "ItemType";
  @SerializedName(SERIALIZED_NAME_ITEM_TYPE)
  private ItemTypeEnum itemType;

  public static final String SERIALIZED_NAME_VALUE = "Value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public ModelsSSLNetworkDefinition() {
  }

  public ModelsSSLNetworkDefinition itemType(ItemTypeEnum itemType) {
    
    this.itemType = itemType;
    return this;
  }

   /**
   * Get itemType
   * @return itemType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemTypeEnum getItemType() {
    return itemType;
  }


  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }


  public ModelsSSLNetworkDefinition value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsSSLNetworkDefinition modelsSSLNetworkDefinition = (ModelsSSLNetworkDefinition) o;
    return Objects.equals(this.itemType, modelsSSLNetworkDefinition.itemType) &&
        Objects.equals(this.value, modelsSSLNetworkDefinition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsSSLNetworkDefinition {\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("ItemType");
    openapiFields.add("Value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsSSLNetworkDefinition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsSSLNetworkDefinition.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsSSLNetworkDefinition is not found in the empty JSON string", ModelsSSLNetworkDefinition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsSSLNetworkDefinition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsSSLNetworkDefinition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Value") != null && !jsonObj.get("Value").isJsonNull()) && !jsonObj.get("Value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsSSLNetworkDefinition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsSSLNetworkDefinition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsSSLNetworkDefinition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsSSLNetworkDefinition.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsSSLNetworkDefinition>() {
           @Override
           public void write(JsonWriter out, ModelsSSLNetworkDefinition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsSSLNetworkDefinition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsSSLNetworkDefinition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsSSLNetworkDefinition
  * @throws IOException if the JSON string is invalid with respect to ModelsSSLNetworkDefinition
  */
  public static ModelsSSLNetworkDefinition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsSSLNetworkDefinition.class);
  }

 /**
  * Convert an instance of ModelsSSLNetworkDefinition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

