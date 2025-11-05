package ht.bms.applicant.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.applicant.model.CalendarBean;
import ht.bms.applicant.model.OfficeBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ApplicantResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class ApplicantResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("personalId")
  private BigDecimal personalId;

  @JsonProperty("professionalId")
  private BigDecimal professionalId;

  @JsonProperty("referencesId")
  @Valid
  private List<BigDecimal> referencesId = null;

  @JsonProperty("identityId")
  @Valid
  private List<BigDecimal> identityId = null;

  @JsonProperty("bookingDate")
  private CalendarBean bookingDate;

  @JsonProperty("office")
  private OfficeBean office;

  @JsonProperty("success")
  private Boolean success;

  @JsonProperty("errorCode")
  private Integer errorCode;

  @JsonProperty("errorMessage")
  private String errorMessage;

  public ApplicantResponse personalId(BigDecimal personalId) {
    this.personalId = personalId;
    return this;
  }

  /**
   * Personal identifier Id of applicant
   * @return personalId
  */
  @Valid 
  @Schema(name = "personalId", example = "123456789", description = "Personal identifier Id of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getPersonalId() {
    return personalId;
  }

  public void setPersonalId(BigDecimal personalId) {
    this.personalId = personalId;
  }

  public ApplicantResponse professionalId(BigDecimal professionalId) {
    this.professionalId = professionalId;
    return this;
  }

  /**
   * Professional identifier Id of applicant
   * @return professionalId
  */
  @Valid 
  @Schema(name = "professionalId", example = "987654321", description = "Professional identifier Id of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getProfessionalId() {
    return professionalId;
  }

  public void setProfessionalId(BigDecimal professionalId) {
    this.professionalId = professionalId;
  }

  public ApplicantResponse referencesId(List<BigDecimal> referencesId) {
    this.referencesId = referencesId;
    return this;
  }

  public ApplicantResponse addReferencesIdItem(BigDecimal referencesIdItem) {
    if (this.referencesId == null) {
      this.referencesId = new ArrayList<>();
    }
    this.referencesId.add(referencesIdItem);
    return this;
  }

  /**
   * Get referencesId
   * @return referencesId
  */
  @Valid 
  @Schema(name = "referencesId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<BigDecimal> getReferencesId() {
    return referencesId;
  }

  public void setReferencesId(List<BigDecimal> referencesId) {
    this.referencesId = referencesId;
  }

  public ApplicantResponse identityId(List<BigDecimal> identityId) {
    this.identityId = identityId;
    return this;
  }

  public ApplicantResponse addIdentityIdItem(BigDecimal identityIdItem) {
    if (this.identityId == null) {
      this.identityId = new ArrayList<>();
    }
    this.identityId.add(identityIdItem);
    return this;
  }

  /**
   * Get identityId
   * @return identityId
  */
  @Valid 
  @Schema(name = "identityId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<BigDecimal> getIdentityId() {
    return identityId;
  }

  public void setIdentityId(List<BigDecimal> identityId) {
    this.identityId = identityId;
  }

  public ApplicantResponse bookingDate(CalendarBean bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * Get bookingDate
   * @return bookingDate
  */
  @Valid 
  @Schema(name = "bookingDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CalendarBean getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(CalendarBean bookingDate) {
    this.bookingDate = bookingDate;
  }

  public ApplicantResponse office(OfficeBean office) {
    this.office = office;
    return this;
  }

  /**
   * Get office
   * @return office
  */
  @Valid 
  @Schema(name = "office", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OfficeBean getOffice() {
    return office;
  }

  public void setOffice(OfficeBean office) {
    this.office = office;
  }

  public ApplicantResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  */
  
  @Schema(name = "success", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ApplicantResponse errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  */
  
  @Schema(name = "errorCode", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public ApplicantResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  */
  
  @Schema(name = "errorMessage", example = "", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantResponse applicantResponse = (ApplicantResponse) o;
    return Objects.equals(this.personalId, applicantResponse.personalId) &&
        Objects.equals(this.professionalId, applicantResponse.professionalId) &&
        Objects.equals(this.referencesId, applicantResponse.referencesId) &&
        Objects.equals(this.identityId, applicantResponse.identityId) &&
        Objects.equals(this.bookingDate, applicantResponse.bookingDate) &&
        Objects.equals(this.office, applicantResponse.office) &&
        Objects.equals(this.success, applicantResponse.success) &&
        Objects.equals(this.errorCode, applicantResponse.errorCode) &&
        Objects.equals(this.errorMessage, applicantResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personalId, professionalId, referencesId, identityId, bookingDate, office, success, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantResponse {\n");
    sb.append("    personalId: ").append(toIndentedString(personalId)).append("\n");
    sb.append("    professionalId: ").append(toIndentedString(professionalId)).append("\n");
    sb.append("    referencesId: ").append(toIndentedString(referencesId)).append("\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

