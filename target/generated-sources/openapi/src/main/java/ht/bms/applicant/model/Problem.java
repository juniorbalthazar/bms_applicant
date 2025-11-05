package ht.bms.applicant.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.applicant.model.BusinessError;
import ht.bms.applicant.model.TechnicalError;
import ht.bms.applicant.model.ValidationError;
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
 * Describes the probblem in case of error.
 */

@Schema(name = "Problem", description = "Describes the probblem in case of error.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class Problem implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("Title")
  private String title;

  @JsonProperty("Detail")
  private String detail;

  @JsonProperty("ValidationErrors")
  @Valid
  private List<ValidationError> validationErrors = null;

  @JsonProperty("BusinessErrors")
  @Valid
  private List<BusinessError> businessErrors = null;

  @JsonProperty("TechnicalErrors")
  @Valid
  private List<TechnicalError> technicalErrors = null;

  public Problem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * A short, human-readable summary of the problem type. it SHOULD not change from occurence to occurence of the problem. See [RFC7231], Section 3.4
   * @return title
  */
  @NotNull 
  @Schema(name = "Title", description = "A short, human-readable summary of the problem type. it SHOULD not change from occurence to occurence of the problem. See [RFC7231], Section 3.4", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Problem detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * A human-readable explanation specific to this occurence of the problem
   * @return detail
  */
  
  @Schema(name = "Detail", description = "A human-readable explanation specific to this occurence of the problem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public Problem validationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

  public Problem addValidationErrorsItem(ValidationError validationErrorsItem) {
    if (this.validationErrors == null) {
      this.validationErrors = new ArrayList<>();
    }
    this.validationErrors.add(validationErrorsItem);
    return this;
  }

  /**
   * Get validationErrors
   * @return validationErrors
  */
  @Valid 
  @Schema(name = "ValidationErrors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<ValidationError> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(List<ValidationError> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public Problem businessErrors(List<BusinessError> businessErrors) {
    this.businessErrors = businessErrors;
    return this;
  }

  public Problem addBusinessErrorsItem(BusinessError businessErrorsItem) {
    if (this.businessErrors == null) {
      this.businessErrors = new ArrayList<>();
    }
    this.businessErrors.add(businessErrorsItem);
    return this;
  }

  /**
   * Get businessErrors
   * @return businessErrors
  */
  @Valid 
  @Schema(name = "BusinessErrors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<BusinessError> getBusinessErrors() {
    return businessErrors;
  }

  public void setBusinessErrors(List<BusinessError> businessErrors) {
    this.businessErrors = businessErrors;
  }

  public Problem technicalErrors(List<TechnicalError> technicalErrors) {
    this.technicalErrors = technicalErrors;
    return this;
  }

  public Problem addTechnicalErrorsItem(TechnicalError technicalErrorsItem) {
    if (this.technicalErrors == null) {
      this.technicalErrors = new ArrayList<>();
    }
    this.technicalErrors.add(technicalErrorsItem);
    return this;
  }

  /**
   * Get technicalErrors
   * @return technicalErrors
  */
  @Valid 
  @Schema(name = "TechnicalErrors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<TechnicalError> getTechnicalErrors() {
    return technicalErrors;
  }

  public void setTechnicalErrors(List<TechnicalError> technicalErrors) {
    this.technicalErrors = technicalErrors;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Problem problem = (Problem) o;
    return Objects.equals(this.title, problem.title) &&
        Objects.equals(this.detail, problem.detail) &&
        Objects.equals(this.validationErrors, problem.validationErrors) &&
        Objects.equals(this.businessErrors, problem.businessErrors) &&
        Objects.equals(this.technicalErrors, problem.technicalErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, detail, validationErrors, businessErrors, technicalErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Problem {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    businessErrors: ").append(toIndentedString(businessErrors)).append("\n");
    sb.append("    technicalErrors: ").append(toIndentedString(technicalErrors)).append("\n");
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

