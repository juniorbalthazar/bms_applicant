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
 * MonthOfYearBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-02T20:31:22.046054300-05:00[America/New_York]")
public class MonthOfYearBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("monthOfYearId")
  private BigDecimal monthOfYearId;

  @JsonProperty("monthOfYearName")
  private String monthOfYearName;

  public MonthOfYearBean monthOfYearId(BigDecimal monthOfYearId) {
    this.monthOfYearId = monthOfYearId;
    return this;
  }

  /**
   * month of year id
   * @return monthOfYearId
  */
  @Valid 
  @Schema(name = "monthOfYearId", example = "100", description = "month of year id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getMonthOfYearId() {
    return monthOfYearId;
  }

  public void setMonthOfYearId(BigDecimal monthOfYearId) {
    this.monthOfYearId = monthOfYearId;
  }

  public MonthOfYearBean monthOfYearName(String monthOfYearName) {
    this.monthOfYearName = monthOfYearName;
    return this;
  }

  /**
   * Month of year name
   * @return monthOfYearName
  */
  
  @Schema(name = "monthOfYearName", example = "January", description = "Month of year name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMonthOfYearName() {
    return monthOfYearName;
  }

  public void setMonthOfYearName(String monthOfYearName) {
    this.monthOfYearName = monthOfYearName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonthOfYearBean monthOfYearBean = (MonthOfYearBean) o;
    return Objects.equals(this.monthOfYearId, monthOfYearBean.monthOfYearId) &&
        Objects.equals(this.monthOfYearName, monthOfYearBean.monthOfYearName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monthOfYearId, monthOfYearName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonthOfYearBean {\n");
    sb.append("    monthOfYearId: ").append(toIndentedString(monthOfYearId)).append("\n");
    sb.append("    monthOfYearName: ").append(toIndentedString(monthOfYearName)).append("\n");
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

