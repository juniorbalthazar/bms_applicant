package ht.bms.booking.model;

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
 * This type of error occurs during an irrecoverable technical problem.
 */

@Schema(name = "TechnicalError", description = "This type of error occurs during an irrecoverable technical problem.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-02T20:31:22.046054300-05:00[America/New_York]")
public class TechnicalError implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("Code")
  private String code;

  @JsonProperty("Reason")
  private String reason;

  @JsonProperty("Message")
  private String message;

  public TechnicalError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * An ISO  standard [https://www.iso20022.org/]
   * @return code
  */
  @NotNull 
  @Schema(name = "Code", description = "An ISO  standard [https://www.iso20022.org/]", requiredMode = Schema.RequiredMode.REQUIRED)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public TechnicalError reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * A short human-readable summary of the reason.
   * @return reason
  */
  
  @Schema(name = "Reason", description = "A short human-readable summary of the reason.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public TechnicalError message(String message) {
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
    TechnicalError technicalError = (TechnicalError) o;
    return Objects.equals(this.code, technicalError.code) &&
        Objects.equals(this.reason, technicalError.reason) &&
        Objects.equals(this.message, technicalError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, reason, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

