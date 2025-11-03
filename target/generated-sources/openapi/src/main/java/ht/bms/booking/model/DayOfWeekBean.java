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
 * DayOfWeekBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-02T20:31:22.046054300-05:00[America/New_York]")
public class DayOfWeekBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("dayOfWeekId")
  private BigDecimal dayOfWeekId;

  @JsonProperty("dayOfWeekName")
  private String dayOfWeekName;

  public DayOfWeekBean dayOfWeekId(BigDecimal dayOfWeekId) {
    this.dayOfWeekId = dayOfWeekId;
    return this;
  }

  /**
   * day of week id
   * @return dayOfWeekId
  */
  @Valid 
  @Schema(name = "dayOfWeekId", example = "2025", description = "day of week id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getDayOfWeekId() {
    return dayOfWeekId;
  }

  public void setDayOfWeekId(BigDecimal dayOfWeekId) {
    this.dayOfWeekId = dayOfWeekId;
  }

  public DayOfWeekBean dayOfWeekName(String dayOfWeekName) {
    this.dayOfWeekName = dayOfWeekName;
    return this;
  }

  /**
   * day of week name
   * @return dayOfWeekName
  */
  
  @Schema(name = "dayOfWeekName", example = "Monday", description = "day of week name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDayOfWeekName() {
    return dayOfWeekName;
  }

  public void setDayOfWeekName(String dayOfWeekName) {
    this.dayOfWeekName = dayOfWeekName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayOfWeekBean dayOfWeekBean = (DayOfWeekBean) o;
    return Objects.equals(this.dayOfWeekId, dayOfWeekBean.dayOfWeekId) &&
        Objects.equals(this.dayOfWeekName, dayOfWeekBean.dayOfWeekName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeekId, dayOfWeekName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayOfWeekBean {\n");
    sb.append("    dayOfWeekId: ").append(toIndentedString(dayOfWeekId)).append("\n");
    sb.append("    dayOfWeekName: ").append(toIndentedString(dayOfWeekName)).append("\n");
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

