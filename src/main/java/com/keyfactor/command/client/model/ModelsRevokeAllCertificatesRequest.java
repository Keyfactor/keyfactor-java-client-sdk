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
import java.time.OffsetDateTime;

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
 * Information for revoking all certifictes in a query
 */
@ApiModel(description = "Information for revoking all certifictes in a query")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-27T12:22:19.679-07:00[America/Phoenix]")
public class ModelsRevokeAllCertificatesRequest {
  public static final String SERIALIZED_NAME_QUERY = "Query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  /**
   * The Reason for revocation
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
    
    NUMBER_8(8),
    
    NUMBER_999(999),
    
    NUMBER_MINUS_1(-1);

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

  public static final String SERIALIZED_NAME_COMMENT = "Comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_EFFECTIVE_DATE = "EffectiveDate";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_DATE)
  private OffsetDateTime effectiveDate;

  public static final String SERIALIZED_NAME_INCLUDE_REVOKED = "IncludeRevoked";
  @SerializedName(SERIALIZED_NAME_INCLUDE_REVOKED)
  private Boolean includeRevoked;

  public static final String SERIALIZED_NAME_INCLUDE_EXPIRED = "IncludeExpired";
  @SerializedName(SERIALIZED_NAME_INCLUDE_EXPIRED)
  private Boolean includeExpired;

  public ModelsRevokeAllCertificatesRequest() {
  }

  public ModelsRevokeAllCertificatesRequest query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * The query string of the certificates to revoke
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The query string of the certificates to revoke")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public ModelsRevokeAllCertificatesRequest reason(ReasonEnum reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * The Reason for revocation
   * @return reason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The Reason for revocation")

  public ReasonEnum getReason() {
    return reason;
  }


  public void setReason(ReasonEnum reason) {
    this.reason = reason;
  }


  public ModelsRevokeAllCertificatesRequest comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * A comment for auditing purposes
   * @return comment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A comment for auditing purposes")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    this.comment = comment;
  }


  public ModelsRevokeAllCertificatesRequest effectiveDate(OffsetDateTime effectiveDate) {
    
    this.effectiveDate = effectiveDate;
    return this;
  }

   /**
   * The date when the certificates are to appear on the revocation list
   * @return effectiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the certificates are to appear on the revocation list")

  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }


  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }


  public ModelsRevokeAllCertificatesRequest includeRevoked(Boolean includeRevoked) {
    
    this.includeRevoked = includeRevoked;
    return this;
  }

   /**
   * A flag telling the query to include revoked certificates
   * @return includeRevoked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag telling the query to include revoked certificates")

  public Boolean getIncludeRevoked() {
    return includeRevoked;
  }


  public void setIncludeRevoked(Boolean includeRevoked) {
    this.includeRevoked = includeRevoked;
  }


  public ModelsRevokeAllCertificatesRequest includeExpired(Boolean includeExpired) {
    
    this.includeExpired = includeExpired;
    return this;
  }

   /**
   * A flag telling the query to include expired certificates
   * @return includeExpired
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag telling the query to include expired certificates")

  public Boolean getIncludeExpired() {
    return includeExpired;
  }


  public void setIncludeExpired(Boolean includeExpired) {
    this.includeExpired = includeExpired;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsRevokeAllCertificatesRequest modelsRevokeAllCertificatesRequest = (ModelsRevokeAllCertificatesRequest) o;
    return Objects.equals(this.query, modelsRevokeAllCertificatesRequest.query) &&
        Objects.equals(this.reason, modelsRevokeAllCertificatesRequest.reason) &&
        Objects.equals(this.comment, modelsRevokeAllCertificatesRequest.comment) &&
        Objects.equals(this.effectiveDate, modelsRevokeAllCertificatesRequest.effectiveDate) &&
        Objects.equals(this.includeRevoked, modelsRevokeAllCertificatesRequest.includeRevoked) &&
        Objects.equals(this.includeExpired, modelsRevokeAllCertificatesRequest.includeExpired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, reason, comment, effectiveDate, includeRevoked, includeExpired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsRevokeAllCertificatesRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    includeRevoked: ").append(toIndentedString(includeRevoked)).append("\n");
    sb.append("    includeExpired: ").append(toIndentedString(includeExpired)).append("\n");
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
    openapiFields.add("Query");
    openapiFields.add("Reason");
    openapiFields.add("Comment");
    openapiFields.add("EffectiveDate");
    openapiFields.add("IncludeRevoked");
    openapiFields.add("IncludeExpired");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Reason");
    openapiRequiredFields.add("Comment");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsRevokeAllCertificatesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsRevokeAllCertificatesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsRevokeAllCertificatesRequest is not found in the empty JSON string", ModelsRevokeAllCertificatesRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsRevokeAllCertificatesRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsRevokeAllCertificatesRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ModelsRevokeAllCertificatesRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Query") != null && !jsonObj.get("Query").isJsonNull()) && !jsonObj.get("Query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Query").toString()));
      }
      if (!jsonObj.get("Comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Comment").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsRevokeAllCertificatesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsRevokeAllCertificatesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsRevokeAllCertificatesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsRevokeAllCertificatesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsRevokeAllCertificatesRequest>() {
           @Override
           public void write(JsonWriter out, ModelsRevokeAllCertificatesRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsRevokeAllCertificatesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsRevokeAllCertificatesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsRevokeAllCertificatesRequest
  * @throws IOException if the JSON string is invalid with respect to ModelsRevokeAllCertificatesRequest
  */
  public static ModelsRevokeAllCertificatesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsRevokeAllCertificatesRequest.class);
  }

 /**
  * Convert an instance of ModelsRevokeAllCertificatesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

