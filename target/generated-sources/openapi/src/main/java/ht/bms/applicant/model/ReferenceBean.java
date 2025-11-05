package ht.bms.applicant.model;

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
 * ReferenceBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class ReferenceBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("applicantId")
  private BigDecimal applicantId;

  @JsonProperty("referencesId")
  private BigDecimal referencesId;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("nin")
  private String nin;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("email")
  private String email;

  @JsonProperty("streetAddres")
  private String streetAddres;

  public ReferenceBean applicantId(BigDecimal applicantId) {
    this.applicantId = applicantId;
    return this;
  }

  /**
   * applicant id
   * @return applicantId
  */
  @Valid 
  @Schema(name = "applicantId", example = "100", description = "applicant id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(BigDecimal applicantId) {
    this.applicantId = applicantId;
  }

  public ReferenceBean referencesId(BigDecimal referencesId) {
    this.referencesId = referencesId;
    return this;
  }

  /**
   * references id
   * @return referencesId
  */
  @Valid 
  @Schema(name = "referencesId", example = "100", description = "references id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getReferencesId() {
    return referencesId;
  }

  public void setReferencesId(BigDecimal referencesId) {
    this.referencesId = referencesId;
  }

  public ReferenceBean firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * first name of reference
   * @return firstName
  */
  
  @Schema(name = "firstName", example = "jane", description = "first name of reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ReferenceBean lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * last name of reference
   * @return lastName
  */
  
  @Schema(name = "lastName", example = "peter", description = "last name of reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ReferenceBean nin(String nin) {
    this.nin = nin;
    return this;
  }

  /**
   * nin
   * @return nin
  */
  
  @Schema(name = "nin", example = "001-2345-6789", description = "nin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNin() {
    return nin;
  }

  public void setNin(String nin) {
    this.nin = nin;
  }

  public ReferenceBean phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * phone of reference
   * @return phone
  */
  
  @Schema(name = "phone", example = "+509 3701 1234", description = "phone of reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public ReferenceBean email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email of reference
   * @return email
  */
  
  @Schema(name = "email", example = "peterjane@gmail.com", description = "email of reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ReferenceBean streetAddres(String streetAddres) {
    this.streetAddres = streetAddres;
    return this;
  }

  /**
   * street address of reference
   * @return streetAddres
  */
  
  @Schema(name = "streetAddres", example = "123 Main St", description = "street address of reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStreetAddres() {
    return streetAddres;
  }

  public void setStreetAddres(String streetAddres) {
    this.streetAddres = streetAddres;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReferenceBean referenceBean = (ReferenceBean) o;
    return Objects.equals(this.applicantId, referenceBean.applicantId) &&
        Objects.equals(this.referencesId, referenceBean.referencesId) &&
        Objects.equals(this.firstName, referenceBean.firstName) &&
        Objects.equals(this.lastName, referenceBean.lastName) &&
        Objects.equals(this.nin, referenceBean.nin) &&
        Objects.equals(this.phone, referenceBean.phone) &&
        Objects.equals(this.email, referenceBean.email) &&
        Objects.equals(this.streetAddres, referenceBean.streetAddres);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, referencesId, firstName, lastName, nin, phone, email, streetAddres);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReferenceBean {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    referencesId: ").append(toIndentedString(referencesId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    streetAddres: ").append(toIndentedString(streetAddres)).append("\n");
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

