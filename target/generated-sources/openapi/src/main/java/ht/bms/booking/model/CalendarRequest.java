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
 * CalendarRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-02T20:31:22.046054300-05:00[America/New_York]")
public class CalendarRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("year")
  private Integer year;

  @JsonProperty("numberOfYear")
  private Integer numberOfYear;

  public CalendarRequest year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * start year
   * @return year
  */
  
  @Schema(name = "year", example = "2025", description = "start year", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public CalendarRequest numberOfYear(Integer numberOfYear) {
    this.numberOfYear = numberOfYear;
    return this;
  }

  /**
   * number of year to generate
   * @return numberOfYear
  */
  
  @Schema(name = "numberOfYear", description = "number of year to generate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Integer getNumberOfYear() {
    return numberOfYear;
  }

  public void setNumberOfYear(Integer numberOfYear) {
    this.numberOfYear = numberOfYear;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarRequest calendarRequest = (CalendarRequest) o;
    return Objects.equals(this.year, calendarRequest.year) &&
        Objects.equals(this.numberOfYear, calendarRequest.numberOfYear);
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, numberOfYear);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarRequest {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    numberOfYear: ").append(toIndentedString(numberOfYear)).append("\n");
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

