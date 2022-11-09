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
 * KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * Gets or Sets dataType
   */
  @JsonAdapter(DataTypeEnum.Adapter.class)
  public enum DataTypeEnum {
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7),
    
    NUMBER_8(8);

    private Integer value;

    DataTypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DataTypeEnum fromValue(Integer value) {
      for (DataTypeEnum b : DataTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DataTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DataTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DataTypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return DataTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DATA_TYPE = "DataType";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private DataTypeEnum dataType;

  public static final String SERIALIZED_NAME_HINT = "Hint";
  @SerializedName(SERIALIZED_NAME_HINT)
  private String hint;

  public static final String SERIALIZED_NAME_VALIDATION = "Validation";
  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private String validation;

  /**
   * Gets or Sets enrollment
   */
  @JsonAdapter(EnrollmentEnum.Adapter.class)
  public enum EnrollmentEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2);

    private Integer value;

    EnrollmentEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnrollmentEnum fromValue(Integer value) {
      for (EnrollmentEnum b : EnrollmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EnrollmentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnrollmentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnrollmentEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return EnrollmentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENROLLMENT = "Enrollment";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT)
  private EnrollmentEnum enrollment;

  public static final String SERIALIZED_NAME_MESSAGE = "Message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private String options;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "DefaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_DISPLAY_ORDER = "DisplayOrder";
  @SerializedName(SERIALIZED_NAME_DISPLAY_ORDER)
  private Integer displayOrder;

  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest() {
  }

  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * minimum: 0
   * maximum: 2147483647
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


  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest name(String name) {
    
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


  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest dataType(DataTypeEnum dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DataTypeEnum getDataType() {
    return dataType;
  }


  public void setDataType(DataTypeEnum dataType) {
    this.dataType = dataType;
  }


  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest hint(String hint) {
    
    this.hint = hint;
    return this;
  }

   /**
   * Get hint
   * @return hint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHint() {
    return hint;
  }


  public void setHint(String hint) {
    this.hint = hint;
  }


  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest validation(String validation) {
    
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValidation() {
    return validation;
  }


  public void setValidation(String validation) {
    this.validation = validation;
  }


  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest enrollment(EnrollmentEnum enrollment) {
    
    this.enrollment = enrollment;
    return this;
  }

   /**
   * Get enrollment
   * @return enrollment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnrollmentEnum getEnrollment() {
    return enrollment;
  }


  public void setEnrollment(EnrollmentEnum enrollment) {
    this.enrollment = enrollment;
  }


  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest options(String options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOptions() {
    return options;
  }


  public void setOptions(String options) {
    this.options = options;
  }


  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * Get defaultValue
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest displayOrder(Integer displayOrder) {
    
    this.displayOrder = displayOrder;
    return this;
  }

   /**
   * Get displayOrder
   * @return displayOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDisplayOrder() {
    return displayOrder;
  }


  public void setDisplayOrder(Integer displayOrder) {
    this.displayOrder = displayOrder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest = (KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest) o;
    return Objects.equals(this.id, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.id) &&
        Objects.equals(this.name, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.name) &&
        Objects.equals(this.description, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.description) &&
        Objects.equals(this.dataType, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.dataType) &&
        Objects.equals(this.hint, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.hint) &&
        Objects.equals(this.validation, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.validation) &&
        Objects.equals(this.enrollment, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.enrollment) &&
        Objects.equals(this.message, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.message) &&
        Objects.equals(this.options, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.options) &&
        Objects.equals(this.defaultValue, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.defaultValue) &&
        Objects.equals(this.displayOrder, keyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.displayOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dataType, hint, validation, enrollment, message, options, defaultValue, displayOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    enrollment: ").append(toIndentedString(enrollment)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    displayOrder: ").append(toIndentedString(displayOrder)).append("\n");
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
    openapiFields.add("DataType");
    openapiFields.add("Hint");
    openapiFields.add("Validation");
    openapiFields.add("Enrollment");
    openapiFields.add("Message");
    openapiFields.add("Options");
    openapiFields.add("DefaultValue");
    openapiFields.add("DisplayOrder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Id");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("Description");
    openapiRequiredFields.add("DataType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest is not found in the empty JSON string", KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (!jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("Hint") != null && !jsonObj.get("Hint").isJsonNull()) && !jsonObj.get("Hint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Hint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Hint").toString()));
      }
      if ((jsonObj.get("Validation") != null && !jsonObj.get("Validation").isJsonNull()) && !jsonObj.get("Validation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Validation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Validation").toString()));
      }
      if ((jsonObj.get("Message") != null && !jsonObj.get("Message").isJsonNull()) && !jsonObj.get("Message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Message").toString()));
      }
      if ((jsonObj.get("Options") != null && !jsonObj.get("Options").isJsonNull()) && !jsonObj.get("Options").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Options` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Options").toString()));
      }
      if ((jsonObj.get("DefaultValue") != null && !jsonObj.get("DefaultValue").isJsonNull()) && !jsonObj.get("DefaultValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DefaultValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DefaultValue").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest
  */
  public static KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsMetadataFieldMetadataFieldUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

