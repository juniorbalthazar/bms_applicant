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
 * Validation of payload, url parameters  and request parameter to the specification of the OpenAPI contract
 */

@Schema(name = "ValidationError", description = "Validation of payload, url parameters  and request parameter to the specification of the OpenAPI contract")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class ValidationError implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("AttributeName")
  private String attributeName;

  @JsonProperty("Reason")
  private String reason;

  @JsonProperty("Message")
  private String message;

  public ValidationError attributeName(String attributeName) {
    this.attributeName = attributeName;
    return this;
  }

  /**
   * Name of the element in the payload, request parameter, URI parameter or header parameter
   * @return attributeName
  */
  @NotNull 
  @Schema(name = "AttributeName", description = "Name of the element in the payload, request parameter, URI parameter or header parameter", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getAttributeName() {
    return attributeName;
  }

  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName;
  }

  public ValidationError reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * A short human-readable summary of the reason.
   * @return reason
  */
  @NotNull 
  @Schema(name = "Reason", description = "A short human-readable summary of the reason.", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public ValidationError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A short human-readable summary of the message
   * @return message
  */
  
  @Schema(name = "Message", description = "A short human-readable summary of the message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationError validationError = (ValidationError) o;
    return Objects.equals(this.attributeName, validationError.attributeName) &&
        Objects.equals(this.reason, validationError.reason) &&
        Objects.equals(this.message, validationError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeName, reason, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationError {\n");
    sb.append("    attributeName: ").append(toIndentedString(attributeName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

