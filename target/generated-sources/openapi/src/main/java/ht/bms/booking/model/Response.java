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
 * Response
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-02T20:31:22.046054300-05:00[America/New_York]")
public class Response implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("isSuccessfully")
  private Boolean isSuccessfully;

  public Response isSuccessfully(Boolean isSuccessfully) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.isSuccessfully, response.isSuccessfully);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSuccessfully);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    sb.append("    isSuccessfully: ").append(toIndentedString(isSuccessfully)).append("\n");
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

