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
import com.keyfactor.command.client.model.KeyfactorApiModelsMonitoringDashboardRequest;
import com.keyfactor.command.client.model.KeyfactorApiModelsMonitoringEmailRequest;
import com.keyfactor.command.client.model.KeyfactorApiModelsMonitoringOCSPParametersRequest;
import com.keyfactor.command.client.model.KeyfactorCommonSchedulingKeyfactorSchedule;
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
 * KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ENDPOINT_TYPE = "EndpointType";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_TYPE)
  private String endpointType;

  public static final String SERIALIZED_NAME_LOCATION = "Location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_EMAIL = "Email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private KeyfactorApiModelsMonitoringEmailRequest email;

  public static final String SERIALIZED_NAME_DASHBOARD = "Dashboard";
  @SerializedName(SERIALIZED_NAME_DASHBOARD)
  private KeyfactorApiModelsMonitoringDashboardRequest dashboard;

  public static final String SERIALIZED_NAME_SCHEDULE = "Schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private KeyfactorCommonSchedulingKeyfactorSchedule schedule;

  public static final String SERIALIZED_NAME_OC_S_P_PARAMETERS = "OCSPParameters";
  @SerializedName(SERIALIZED_NAME_OC_S_P_PARAMETERS)
  private KeyfactorApiModelsMonitoringOCSPParametersRequest ocSPParameters;

  public KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest() {
  }

  public KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * minimum: 1
   * maximum: 2147483647
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


  public KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest name(String name) {
    
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


  public KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest endpointType(String endpointType) {
    
    this.endpointType = endpointType;
    return this;
  }

   /**
   * Get endpointType
   * @return endpointType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getEndpointType() {
    return endpointType;
  }


  public void setEndpointType(String endpointType) {
    this.endpointType = endpointType;
  }


  public KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest email(KeyfactorApiModelsMonitoringEmailRequest email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorApiModelsMonitoringEmailRequest getEmail() {
    return email;
  }


  public void setEmail(KeyfactorApiModelsMonitoringEmailRequest email) {
    this.email = email;
  }


  public KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest dashboard(KeyfactorApiModelsMonitoringDashboardRequest dashboard) {
    
    this.dashboard = dashboard;
    return this;
  }

   /**
   * Get dashboard
   * @return dashboard
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public KeyfactorApiModelsMonitoringDashboardRequest getDashboard() {
    return dashboard;
  }


  public void setDashboard(KeyfactorApiModelsMonitoringDashboardRequest dashboard) {
    this.dashboard = dashboard;
  }


  public KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest schedule(KeyfactorCommonSchedulingKeyfactorSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorCommonSchedulingKeyfactorSchedule getSchedule() {
    return schedule;
  }


  public void setSchedule(KeyfactorCommonSchedulingKeyfactorSchedule schedule) {
    this.schedule = schedule;
  }


  public KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest ocSPParameters(KeyfactorApiModelsMonitoringOCSPParametersRequest ocSPParameters) {
    
    this.ocSPParameters = ocSPParameters;
    return this;
  }

   /**
   * Get ocSPParameters
   * @return ocSPParameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyfactorApiModelsMonitoringOCSPParametersRequest getOcSPParameters() {
    return ocSPParameters;
  }


  public void setOcSPParameters(KeyfactorApiModelsMonitoringOCSPParametersRequest ocSPParameters) {
    this.ocSPParameters = ocSPParameters;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest keyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest = (KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest) o;
    return Objects.equals(this.id, keyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.id) &&
        Objects.equals(this.name, keyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.name) &&
        Objects.equals(this.endpointType, keyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.endpointType) &&
        Objects.equals(this.location, keyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.location) &&
        Objects.equals(this.email, keyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.email) &&
        Objects.equals(this.dashboard, keyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.dashboard) &&
        Objects.equals(this.schedule, keyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.schedule) &&
        Objects.equals(this.ocSPParameters, keyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.ocSPParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, endpointType, location, email, dashboard, schedule, ocSPParameters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    endpointType: ").append(toIndentedString(endpointType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    dashboard: ").append(toIndentedString(dashboard)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    ocSPParameters: ").append(toIndentedString(ocSPParameters)).append("\n");
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
    openapiFields.add("EndpointType");
    openapiFields.add("Location");
    openapiFields.add("Email");
    openapiFields.add("Dashboard");
    openapiFields.add("Schedule");
    openapiFields.add("OCSPParameters");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("EndpointType");
    openapiRequiredFields.add("Location");
    openapiRequiredFields.add("Dashboard");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest is not found in the empty JSON string", KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (!jsonObj.get("EndpointType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EndpointType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EndpointType").toString()));
      }
      if (!jsonObj.get("Location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Location").toString()));
      }
      // validate the optional field `Email`
      if (jsonObj.get("Email") != null && !jsonObj.get("Email").isJsonNull()) {
        KeyfactorApiModelsMonitoringEmailRequest.validateJsonObject(jsonObj.getAsJsonObject("Email"));
      }
      // validate the required field `Dashboard`
      KeyfactorApiModelsMonitoringDashboardRequest.validateJsonObject(jsonObj.getAsJsonObject("Dashboard"));
      // validate the optional field `Schedule`
      if (jsonObj.get("Schedule") != null && !jsonObj.get("Schedule").isJsonNull()) {
        KeyfactorCommonSchedulingKeyfactorSchedule.validateJsonObject(jsonObj.getAsJsonObject("Schedule"));
      }
      // validate the optional field `OCSPParameters`
      if (jsonObj.get("OCSPParameters") != null && !jsonObj.get("OCSPParameters").isJsonNull()) {
        KeyfactorApiModelsMonitoringOCSPParametersRequest.validateJsonObject(jsonObj.getAsJsonObject("OCSPParameters"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest>() {
           @Override
           public void write(JsonWriter out, KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest
  */
  public static KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest.class);
  }

 /**
  * Convert an instance of KeyfactorApiModelsMonitoringRevocationMonitoringUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

