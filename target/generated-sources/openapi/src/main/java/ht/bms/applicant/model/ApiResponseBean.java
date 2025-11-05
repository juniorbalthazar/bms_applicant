package ht.bms.applicant.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ApiResponseBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class ApiResponseBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("isSuccessfully")
  private Boolean isSuccessfully;

  @JsonProperty("errorMessage")
  private String errorMessage;

  @JsonProperty("errorCode")
  private Integer errorCode;

  public ApiResponseBean isSuccessfully(Boolean isSuccessfully) {
    this.isSuccessfully = isSuccessfully;
    return this;
  }

  /**
   * true if operation is successfully otherwise false
   * @return isSuccessfully
  */
  
  @Schema(name = "isSuccessfully", example = "true", description = "true if operation is successfully otherwise false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsSuccessfully() {
    return isSuccessfully;
  }

  public void setIsSuccessfully(Boolean isSuccessfully) {
    this.isSuccessfully = isSuccessfully;
  }

  public ApiResponseBean errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * message of operation
   * @return errorMessage
  */
  
  @Schema(name = "errorMessage", example = "Operation completed successfully", description = "message of operation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public ApiResponseBean errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * error code of operation
   * @return errorCode
  */
  
  @Schema(name = "errorCode", example = "0", description = "error code of operation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseBean apiResponseBean = (ApiResponseBean) o;
    return Objects.equals(this.isSuccessfully, apiResponseBean.isSuccessfully) &&
        Objects.equals(this.errorMessage, apiResponseBean.errorMessage) &&
        Objects.equals(this.errorCode, apiResponseBean.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSuccessfully, errorMessage, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseBean {\n");
    sb.append("    isSuccessfully: ").append(toIndentedString(isSuccessfully)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

