package ht.bms.booking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * InstitutionBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-02T20:31:22.046054300-05:00[America/New_York]")
public class InstitutionBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("institutionId")
  private BigDecimal institutionId;

  @JsonProperty("email")
  private String email;

  @JsonProperty("fullName")
  private String fullName;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("shortName")
  private String shortName;

  @JsonProperty("isDefault")
  private BigDecimal isDefault;

  public InstitutionBean institutionId(BigDecimal institutionId) {
    this.institutionId = institutionId;
    return this;
  }

  /**
   * institution id
   * @return institutionId
  */
  @Valid 
  @Schema(name = "institutionId", example = "100", description = "institution id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getInstitutionId() {
    return institutionId;
  }

  public void setInstitutionId(BigDecimal institutionId) {
    this.institutionId = institutionId;
  }

  public InstitutionBean email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email of institution
   * @return email
  */
  
  @Schema(name = "email", example = "zlab.info@gouv.ht", description = "email of institution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InstitutionBean fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * name of institution
   * @return fullName
  */
  
  @Schema(name = "fullName", example = "zaria laboratory", description = "name of institution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public InstitutionBean phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * phone of institution
   * @return phone
  */
  
  @Schema(name = "phone", example = "+509 3701 1234", description = "phone of institution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public InstitutionBean shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * short name of institution
   * @return shortName
  */
  
  @Schema(name = "shortName", example = "zlab", description = "short name of institution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public InstitutionBean isDefault(BigDecimal isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * 0 is equal to false and 1 is equal to true
   * @return isDefault
  */
  @Valid 
  @Schema(name = "isDefault", example = "0", description = "0 is equal to false and 1 is equal to true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(BigDecimal isDefault) {
    this.isDefault = isDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionBean institutionBean = (InstitutionBean) o;
    return Objects.equals(this.institutionId, institutionBean.institutionId) &&
        Objects.equals(this.email, institutionBean.email) &&
        Objects.equals(this.fullName, institutionBean.fullName) &&
        Objects.equals(this.phone, institutionBean.phone) &&
        Objects.equals(this.shortName, institutionBean.shortName) &&
        Objects.equals(this.isDefault, institutionBean.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionId, email, fullName, phone, shortName, isDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionBean {\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
}

