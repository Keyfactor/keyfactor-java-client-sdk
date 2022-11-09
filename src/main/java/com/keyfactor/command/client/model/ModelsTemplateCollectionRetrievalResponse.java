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
import com.keyfactor.command.client.model.ModelsTemplateCollectionRetrievalResponseExtendedKeyUsageModel;
import com.keyfactor.command.client.model.ModelsTemplateCollectionRetrievalResponseTemplateEnrollmentFieldModel;
import com.keyfactor.command.client.model.ModelsTemplateCollectionRetrievalResponseTemplateRegexModel;
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
 * ModelsTemplateCollectionRetrievalResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ModelsTemplateCollectionRetrievalResponse {
  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_COMMON_NAME = "CommonName";
  @SerializedName(SERIALIZED_NAME_COMMON_NAME)
  private String commonName;

  public static final String SERIALIZED_NAME_TEMPLATE_NAME = "TemplateName";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_NAME)
  private String templateName;

  public static final String SERIALIZED_NAME_OID = "Oid";
  @SerializedName(SERIALIZED_NAME_OID)
  private String oid;

  public static final String SERIALIZED_NAME_KEY_SIZE = "KeySize";
  @SerializedName(SERIALIZED_NAME_KEY_SIZE)
  private String keySize;

  public static final String SERIALIZED_NAME_KEY_TYPE = "KeyType";
  @SerializedName(SERIALIZED_NAME_KEY_TYPE)
  private String keyType;

  public static final String SERIALIZED_NAME_FOREST_ROOT = "ForestRoot";
  @SerializedName(SERIALIZED_NAME_FOREST_ROOT)
  private String forestRoot;

  public static final String SERIALIZED_NAME_CONFIGURATION_TENANT = "ConfigurationTenant";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION_TENANT)
  private String configurationTenant;

  public static final String SERIALIZED_NAME_FRIENDLY_NAME = "FriendlyName";
  @SerializedName(SERIALIZED_NAME_FRIENDLY_NAME)
  private String friendlyName;

  /**
   * Gets or Sets keyRetention
   */
  @JsonAdapter(KeyRetentionEnum.Adapter.class)
  public enum KeyRetentionEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3);

    private Integer value;

    KeyRetentionEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyRetentionEnum fromValue(Integer value) {
      for (KeyRetentionEnum b : KeyRetentionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyRetentionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyRetentionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyRetentionEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return KeyRetentionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KEY_RETENTION = "KeyRetention";
  @SerializedName(SERIALIZED_NAME_KEY_RETENTION)
  private KeyRetentionEnum keyRetention;

  public static final String SERIALIZED_NAME_KEY_RETENTION_DAYS = "KeyRetentionDays";
  @SerializedName(SERIALIZED_NAME_KEY_RETENTION_DAYS)
  private Integer keyRetentionDays;

  public static final String SERIALIZED_NAME_KEY_ARCHIVAL = "KeyArchival";
  @SerializedName(SERIALIZED_NAME_KEY_ARCHIVAL)
  private Boolean keyArchival;

  public static final String SERIALIZED_NAME_ENROLLMENT_FIELDS = "EnrollmentFields";
  @SerializedName(SERIALIZED_NAME_ENROLLMENT_FIELDS)
  private List<ModelsTemplateCollectionRetrievalResponseTemplateEnrollmentFieldModel> enrollmentFields = null;

  /**
   * Gets or Sets allowedEnrollmentTypes
   */
  @JsonAdapter(AllowedEnrollmentTypesEnum.Adapter.class)
  public enum AllowedEnrollmentTypesEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_4(4);

    private Integer value;

    AllowedEnrollmentTypesEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AllowedEnrollmentTypesEnum fromValue(Integer value) {
      for (AllowedEnrollmentTypesEnum b : AllowedEnrollmentTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AllowedEnrollmentTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AllowedEnrollmentTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AllowedEnrollmentTypesEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return AllowedEnrollmentTypesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ALLOWED_ENROLLMENT_TYPES = "AllowedEnrollmentTypes";
  @SerializedName(SERIALIZED_NAME_ALLOWED_ENROLLMENT_TYPES)
  private AllowedEnrollmentTypesEnum allowedEnrollmentTypes;

  public static final String SERIALIZED_NAME_TEMPLATE_REGEXES = "TemplateRegexes";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_REGEXES)
  private List<ModelsTemplateCollectionRetrievalResponseTemplateRegexModel> templateRegexes = null;

  public static final String SERIALIZED_NAME_USE_ALLOWED_REQUESTERS = "UseAllowedRequesters";
  @SerializedName(SERIALIZED_NAME_USE_ALLOWED_REQUESTERS)
  private Boolean useAllowedRequesters;

  public static final String SERIALIZED_NAME_ALLOWED_REQUESTERS = "AllowedRequesters";
  @SerializedName(SERIALIZED_NAME_ALLOWED_REQUESTERS)
  private List<String> allowedRequesters = null;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "DisplayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_REQUIRES_APPROVAL = "RequiresApproval";
  @SerializedName(SERIALIZED_NAME_REQUIRES_APPROVAL)
  private Boolean requiresApproval;

  public static final String SERIALIZED_NAME_KEY_USAGE = "KeyUsage";
  @SerializedName(SERIALIZED_NAME_KEY_USAGE)
  private Integer keyUsage;

  public static final String SERIALIZED_NAME_EXTENDED_KEY_USAGES = "ExtendedKeyUsages";
  @SerializedName(SERIALIZED_NAME_EXTENDED_KEY_USAGES)
  private List<ModelsTemplateCollectionRetrievalResponseExtendedKeyUsageModel> extendedKeyUsages = null;

  public ModelsTemplateCollectionRetrievalResponse() {
  }

  
  public ModelsTemplateCollectionRetrievalResponse(
     String forestRoot
  ) {
    this();
    this.forestRoot = forestRoot;
  }

  public ModelsTemplateCollectionRetrievalResponse id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
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


  public ModelsTemplateCollectionRetrievalResponse commonName(String commonName) {
    
    this.commonName = commonName;
    return this;
  }

   /**
   * Get commonName
   * @return commonName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCommonName() {
    return commonName;
  }


  public void setCommonName(String commonName) {
    this.commonName = commonName;
  }


  public ModelsTemplateCollectionRetrievalResponse templateName(String templateName) {
    
    this.templateName = templateName;
    return this;
  }

   /**
   * Get templateName
   * @return templateName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplateName() {
    return templateName;
  }


  public void setTemplateName(String templateName) {
    this.templateName = templateName;
  }


  public ModelsTemplateCollectionRetrievalResponse oid(String oid) {
    
    this.oid = oid;
    return this;
  }

   /**
   * Get oid
   * @return oid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOid() {
    return oid;
  }


  public void setOid(String oid) {
    this.oid = oid;
  }


  public ModelsTemplateCollectionRetrievalResponse keySize(String keySize) {
    
    this.keySize = keySize;
    return this;
  }

   /**
   * Get keySize
   * @return keySize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKeySize() {
    return keySize;
  }


  public void setKeySize(String keySize) {
    this.keySize = keySize;
  }


  public ModelsTemplateCollectionRetrievalResponse keyType(String keyType) {
    
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


   /**
   * Get forestRoot
   * @return forestRoot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getForestRoot() {
    return forestRoot;
  }




  public ModelsTemplateCollectionRetrievalResponse configurationTenant(String configurationTenant) {
    
    this.configurationTenant = configurationTenant;
    return this;
  }

   /**
   * Get configurationTenant
   * @return configurationTenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConfigurationTenant() {
    return configurationTenant;
  }


  public void setConfigurationTenant(String configurationTenant) {
    this.configurationTenant = configurationTenant;
  }


  public ModelsTemplateCollectionRetrievalResponse friendlyName(String friendlyName) {
    
    this.friendlyName = friendlyName;
    return this;
  }

   /**
   * Get friendlyName
   * @return friendlyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFriendlyName() {
    return friendlyName;
  }


  public void setFriendlyName(String friendlyName) {
    this.friendlyName = friendlyName;
  }


  public ModelsTemplateCollectionRetrievalResponse keyRetention(KeyRetentionEnum keyRetention) {
    
    this.keyRetention = keyRetention;
    return this;
  }

   /**
   * Get keyRetention
   * @return keyRetention
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public KeyRetentionEnum getKeyRetention() {
    return keyRetention;
  }


  public void setKeyRetention(KeyRetentionEnum keyRetention) {
    this.keyRetention = keyRetention;
  }


  public ModelsTemplateCollectionRetrievalResponse keyRetentionDays(Integer keyRetentionDays) {
    
    this.keyRetentionDays = keyRetentionDays;
    return this;
  }

   /**
   * Get keyRetentionDays
   * @return keyRetentionDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getKeyRetentionDays() {
    return keyRetentionDays;
  }


  public void setKeyRetentionDays(Integer keyRetentionDays) {
    this.keyRetentionDays = keyRetentionDays;
  }


  public ModelsTemplateCollectionRetrievalResponse keyArchival(Boolean keyArchival) {
    
    this.keyArchival = keyArchival;
    return this;
  }

   /**
   * Get keyArchival
   * @return keyArchival
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getKeyArchival() {
    return keyArchival;
  }


  public void setKeyArchival(Boolean keyArchival) {
    this.keyArchival = keyArchival;
  }


  public ModelsTemplateCollectionRetrievalResponse enrollmentFields(List<ModelsTemplateCollectionRetrievalResponseTemplateEnrollmentFieldModel> enrollmentFields) {
    
    this.enrollmentFields = enrollmentFields;
    return this;
  }

  public ModelsTemplateCollectionRetrievalResponse addEnrollmentFieldsItem(ModelsTemplateCollectionRetrievalResponseTemplateEnrollmentFieldModel enrollmentFieldsItem) {
    if (this.enrollmentFields == null) {
      this.enrollmentFields = new ArrayList<>();
    }
    this.enrollmentFields.add(enrollmentFieldsItem);
    return this;
  }

   /**
   * Get enrollmentFields
   * @return enrollmentFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelsTemplateCollectionRetrievalResponseTemplateEnrollmentFieldModel> getEnrollmentFields() {
    return enrollmentFields;
  }


  public void setEnrollmentFields(List<ModelsTemplateCollectionRetrievalResponseTemplateEnrollmentFieldModel> enrollmentFields) {
    this.enrollmentFields = enrollmentFields;
  }


  public ModelsTemplateCollectionRetrievalResponse allowedEnrollmentTypes(AllowedEnrollmentTypesEnum allowedEnrollmentTypes) {
    
    this.allowedEnrollmentTypes = allowedEnrollmentTypes;
    return this;
  }

   /**
   * Get allowedEnrollmentTypes
   * @return allowedEnrollmentTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AllowedEnrollmentTypesEnum getAllowedEnrollmentTypes() {
    return allowedEnrollmentTypes;
  }


  public void setAllowedEnrollmentTypes(AllowedEnrollmentTypesEnum allowedEnrollmentTypes) {
    this.allowedEnrollmentTypes = allowedEnrollmentTypes;
  }


  public ModelsTemplateCollectionRetrievalResponse templateRegexes(List<ModelsTemplateCollectionRetrievalResponseTemplateRegexModel> templateRegexes) {
    
    this.templateRegexes = templateRegexes;
    return this;
  }

  public ModelsTemplateCollectionRetrievalResponse addTemplateRegexesItem(ModelsTemplateCollectionRetrievalResponseTemplateRegexModel templateRegexesItem) {
    if (this.templateRegexes == null) {
      this.templateRegexes = new ArrayList<>();
    }
    this.templateRegexes.add(templateRegexesItem);
    return this;
  }

   /**
   * Get templateRegexes
   * @return templateRegexes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelsTemplateCollectionRetrievalResponseTemplateRegexModel> getTemplateRegexes() {
    return templateRegexes;
  }


  public void setTemplateRegexes(List<ModelsTemplateCollectionRetrievalResponseTemplateRegexModel> templateRegexes) {
    this.templateRegexes = templateRegexes;
  }


  public ModelsTemplateCollectionRetrievalResponse useAllowedRequesters(Boolean useAllowedRequesters) {
    
    this.useAllowedRequesters = useAllowedRequesters;
    return this;
  }

   /**
   * Get useAllowedRequesters
   * @return useAllowedRequesters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUseAllowedRequesters() {
    return useAllowedRequesters;
  }


  public void setUseAllowedRequesters(Boolean useAllowedRequesters) {
    this.useAllowedRequesters = useAllowedRequesters;
  }


  public ModelsTemplateCollectionRetrievalResponse allowedRequesters(List<String> allowedRequesters) {
    
    this.allowedRequesters = allowedRequesters;
    return this;
  }

  public ModelsTemplateCollectionRetrievalResponse addAllowedRequestersItem(String allowedRequestersItem) {
    if (this.allowedRequesters == null) {
      this.allowedRequesters = new ArrayList<>();
    }
    this.allowedRequesters.add(allowedRequestersItem);
    return this;
  }

   /**
   * Get allowedRequesters
   * @return allowedRequesters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getAllowedRequesters() {
    return allowedRequesters;
  }


  public void setAllowedRequesters(List<String> allowedRequesters) {
    this.allowedRequesters = allowedRequesters;
  }


  public ModelsTemplateCollectionRetrievalResponse displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ModelsTemplateCollectionRetrievalResponse requiresApproval(Boolean requiresApproval) {
    
    this.requiresApproval = requiresApproval;
    return this;
  }

   /**
   * Get requiresApproval
   * @return requiresApproval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRequiresApproval() {
    return requiresApproval;
  }


  public void setRequiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
  }


  public ModelsTemplateCollectionRetrievalResponse keyUsage(Integer keyUsage) {
    
    this.keyUsage = keyUsage;
    return this;
  }

   /**
   * Get keyUsage
   * @return keyUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getKeyUsage() {
    return keyUsage;
  }


  public void setKeyUsage(Integer keyUsage) {
    this.keyUsage = keyUsage;
  }


  public ModelsTemplateCollectionRetrievalResponse extendedKeyUsages(List<ModelsTemplateCollectionRetrievalResponseExtendedKeyUsageModel> extendedKeyUsages) {
    
    this.extendedKeyUsages = extendedKeyUsages;
    return this;
  }

  public ModelsTemplateCollectionRetrievalResponse addExtendedKeyUsagesItem(ModelsTemplateCollectionRetrievalResponseExtendedKeyUsageModel extendedKeyUsagesItem) {
    if (this.extendedKeyUsages == null) {
      this.extendedKeyUsages = new ArrayList<>();
    }
    this.extendedKeyUsages.add(extendedKeyUsagesItem);
    return this;
  }

   /**
   * Get extendedKeyUsages
   * @return extendedKeyUsages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelsTemplateCollectionRetrievalResponseExtendedKeyUsageModel> getExtendedKeyUsages() {
    return extendedKeyUsages;
  }


  public void setExtendedKeyUsages(List<ModelsTemplateCollectionRetrievalResponseExtendedKeyUsageModel> extendedKeyUsages) {
    this.extendedKeyUsages = extendedKeyUsages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsTemplateCollectionRetrievalResponse modelsTemplateCollectionRetrievalResponse = (ModelsTemplateCollectionRetrievalResponse) o;
    return Objects.equals(this.id, modelsTemplateCollectionRetrievalResponse.id) &&
        Objects.equals(this.commonName, modelsTemplateCollectionRetrievalResponse.commonName) &&
        Objects.equals(this.templateName, modelsTemplateCollectionRetrievalResponse.templateName) &&
        Objects.equals(this.oid, modelsTemplateCollectionRetrievalResponse.oid) &&
        Objects.equals(this.keySize, modelsTemplateCollectionRetrievalResponse.keySize) &&
        Objects.equals(this.keyType, modelsTemplateCollectionRetrievalResponse.keyType) &&
        Objects.equals(this.forestRoot, modelsTemplateCollectionRetrievalResponse.forestRoot) &&
        Objects.equals(this.configurationTenant, modelsTemplateCollectionRetrievalResponse.configurationTenant) &&
        Objects.equals(this.friendlyName, modelsTemplateCollectionRetrievalResponse.friendlyName) &&
        Objects.equals(this.keyRetention, modelsTemplateCollectionRetrievalResponse.keyRetention) &&
        Objects.equals(this.keyRetentionDays, modelsTemplateCollectionRetrievalResponse.keyRetentionDays) &&
        Objects.equals(this.keyArchival, modelsTemplateCollectionRetrievalResponse.keyArchival) &&
        Objects.equals(this.enrollmentFields, modelsTemplateCollectionRetrievalResponse.enrollmentFields) &&
        Objects.equals(this.allowedEnrollmentTypes, modelsTemplateCollectionRetrievalResponse.allowedEnrollmentTypes) &&
        Objects.equals(this.templateRegexes, modelsTemplateCollectionRetrievalResponse.templateRegexes) &&
        Objects.equals(this.useAllowedRequesters, modelsTemplateCollectionRetrievalResponse.useAllowedRequesters) &&
        Objects.equals(this.allowedRequesters, modelsTemplateCollectionRetrievalResponse.allowedRequesters) &&
        Objects.equals(this.displayName, modelsTemplateCollectionRetrievalResponse.displayName) &&
        Objects.equals(this.requiresApproval, modelsTemplateCollectionRetrievalResponse.requiresApproval) &&
        Objects.equals(this.keyUsage, modelsTemplateCollectionRetrievalResponse.keyUsage) &&
        Objects.equals(this.extendedKeyUsages, modelsTemplateCollectionRetrievalResponse.extendedKeyUsages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, commonName, templateName, oid, keySize, keyType, forestRoot, configurationTenant, friendlyName, keyRetention, keyRetentionDays, keyArchival, enrollmentFields, allowedEnrollmentTypes, templateRegexes, useAllowedRequesters, allowedRequesters, displayName, requiresApproval, keyUsage, extendedKeyUsages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsTemplateCollectionRetrievalResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    commonName: ").append(toIndentedString(commonName)).append("\n");
    sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
    sb.append("    oid: ").append(toIndentedString(oid)).append("\n");
    sb.append("    keySize: ").append(toIndentedString(keySize)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    forestRoot: ").append(toIndentedString(forestRoot)).append("\n");
    sb.append("    configurationTenant: ").append(toIndentedString(configurationTenant)).append("\n");
    sb.append("    friendlyName: ").append(toIndentedString(friendlyName)).append("\n");
    sb.append("    keyRetention: ").append(toIndentedString(keyRetention)).append("\n");
    sb.append("    keyRetentionDays: ").append(toIndentedString(keyRetentionDays)).append("\n");
    sb.append("    keyArchival: ").append(toIndentedString(keyArchival)).append("\n");
    sb.append("    enrollmentFields: ").append(toIndentedString(enrollmentFields)).append("\n");
    sb.append("    allowedEnrollmentTypes: ").append(toIndentedString(allowedEnrollmentTypes)).append("\n");
    sb.append("    templateRegexes: ").append(toIndentedString(templateRegexes)).append("\n");
    sb.append("    useAllowedRequesters: ").append(toIndentedString(useAllowedRequesters)).append("\n");
    sb.append("    allowedRequesters: ").append(toIndentedString(allowedRequesters)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    requiresApproval: ").append(toIndentedString(requiresApproval)).append("\n");
    sb.append("    keyUsage: ").append(toIndentedString(keyUsage)).append("\n");
    sb.append("    extendedKeyUsages: ").append(toIndentedString(extendedKeyUsages)).append("\n");
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
    openapiFields.add("CommonName");
    openapiFields.add("TemplateName");
    openapiFields.add("Oid");
    openapiFields.add("KeySize");
    openapiFields.add("KeyType");
    openapiFields.add("ForestRoot");
    openapiFields.add("ConfigurationTenant");
    openapiFields.add("FriendlyName");
    openapiFields.add("KeyRetention");
    openapiFields.add("KeyRetentionDays");
    openapiFields.add("KeyArchival");
    openapiFields.add("EnrollmentFields");
    openapiFields.add("AllowedEnrollmentTypes");
    openapiFields.add("TemplateRegexes");
    openapiFields.add("UseAllowedRequesters");
    openapiFields.add("AllowedRequesters");
    openapiFields.add("DisplayName");
    openapiFields.add("RequiresApproval");
    openapiFields.add("KeyUsage");
    openapiFields.add("ExtendedKeyUsages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsTemplateCollectionRetrievalResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ModelsTemplateCollectionRetrievalResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsTemplateCollectionRetrievalResponse is not found in the empty JSON string", ModelsTemplateCollectionRetrievalResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsTemplateCollectionRetrievalResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsTemplateCollectionRetrievalResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("CommonName") != null && !jsonObj.get("CommonName").isJsonNull()) && !jsonObj.get("CommonName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CommonName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CommonName").toString()));
      }
      if ((jsonObj.get("TemplateName") != null && !jsonObj.get("TemplateName").isJsonNull()) && !jsonObj.get("TemplateName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `TemplateName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("TemplateName").toString()));
      }
      if ((jsonObj.get("Oid") != null && !jsonObj.get("Oid").isJsonNull()) && !jsonObj.get("Oid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Oid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Oid").toString()));
      }
      if ((jsonObj.get("KeySize") != null && !jsonObj.get("KeySize").isJsonNull()) && !jsonObj.get("KeySize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeySize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeySize").toString()));
      }
      if ((jsonObj.get("KeyType") != null && !jsonObj.get("KeyType").isJsonNull()) && !jsonObj.get("KeyType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `KeyType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("KeyType").toString()));
      }
      if ((jsonObj.get("ForestRoot") != null && !jsonObj.get("ForestRoot").isJsonNull()) && !jsonObj.get("ForestRoot").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ForestRoot` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ForestRoot").toString()));
      }
      if ((jsonObj.get("ConfigurationTenant") != null && !jsonObj.get("ConfigurationTenant").isJsonNull()) && !jsonObj.get("ConfigurationTenant").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ConfigurationTenant` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ConfigurationTenant").toString()));
      }
      if ((jsonObj.get("FriendlyName") != null && !jsonObj.get("FriendlyName").isJsonNull()) && !jsonObj.get("FriendlyName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FriendlyName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FriendlyName").toString()));
      }
      if (jsonObj.get("EnrollmentFields") != null && !jsonObj.get("EnrollmentFields").isJsonNull()) {
        JsonArray jsonArrayenrollmentFields = jsonObj.getAsJsonArray("EnrollmentFields");
        if (jsonArrayenrollmentFields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("EnrollmentFields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `EnrollmentFields` to be an array in the JSON string but got `%s`", jsonObj.get("EnrollmentFields").toString()));
          }

          // validate the optional field `EnrollmentFields` (array)
          for (int i = 0; i < jsonArrayenrollmentFields.size(); i++) {
            ModelsTemplateCollectionRetrievalResponseTemplateEnrollmentFieldModel.validateJsonObject(jsonArrayenrollmentFields.get(i).getAsJsonObject());
          };
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
            ModelsTemplateCollectionRetrievalResponseTemplateRegexModel.validateJsonObject(jsonArraytemplateRegexes.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("AllowedRequesters") != null && !jsonObj.get("AllowedRequesters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AllowedRequesters` to be an array in the JSON string but got `%s`", jsonObj.get("AllowedRequesters").toString()));
      }
      if ((jsonObj.get("DisplayName") != null && !jsonObj.get("DisplayName").isJsonNull()) && !jsonObj.get("DisplayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `DisplayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("DisplayName").toString()));
      }
      if (jsonObj.get("ExtendedKeyUsages") != null && !jsonObj.get("ExtendedKeyUsages").isJsonNull()) {
        JsonArray jsonArrayextendedKeyUsages = jsonObj.getAsJsonArray("ExtendedKeyUsages");
        if (jsonArrayextendedKeyUsages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ExtendedKeyUsages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ExtendedKeyUsages` to be an array in the JSON string but got `%s`", jsonObj.get("ExtendedKeyUsages").toString()));
          }

          // validate the optional field `ExtendedKeyUsages` (array)
          for (int i = 0; i < jsonArrayextendedKeyUsages.size(); i++) {
            ModelsTemplateCollectionRetrievalResponseExtendedKeyUsageModel.validateJsonObject(jsonArrayextendedKeyUsages.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsTemplateCollectionRetrievalResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsTemplateCollectionRetrievalResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsTemplateCollectionRetrievalResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsTemplateCollectionRetrievalResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsTemplateCollectionRetrievalResponse>() {
           @Override
           public void write(JsonWriter out, ModelsTemplateCollectionRetrievalResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsTemplateCollectionRetrievalResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsTemplateCollectionRetrievalResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsTemplateCollectionRetrievalResponse
  * @throws IOException if the JSON string is invalid with respect to ModelsTemplateCollectionRetrievalResponse
  */
  public static ModelsTemplateCollectionRetrievalResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsTemplateCollectionRetrievalResponse.class);
  }

 /**
  * Convert an instance of ModelsTemplateCollectionRetrievalResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

