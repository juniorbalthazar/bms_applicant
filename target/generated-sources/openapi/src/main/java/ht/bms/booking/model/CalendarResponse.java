package ht.bms.booking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.booking.model.CalendarBean;
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
 * CalendarResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-02T20:31:22.046054300-05:00[America/New_York]")
public class CalendarResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("isSuccessfully")
  private Boolean isSuccessfully;

  @JsonProperty("calendar")
  @Valid
  private List<CalendarBean> calendar = null;

  public CalendarResponse isSuccessfully(Boolean isSuccessfully) {
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

  public CalendarResponse calendar(List<CalendarBean> calendar) {
    this.calendar = calendar;
    return this;
  }

  public CalendarResponse addCalendarItem(CalendarBean calendarItem) {
    if (this.calendar == null) {
      this.calendar = new ArrayList<>();
    }
    this.calendar.add(calendarItem);
    return this;
  }

  /**
   * Get calendar
   * @return calendar
  */
  @Valid 
  @Schema(name = "calendar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CalendarBean> getCalendar() {
    return calendar;
  }

  public void setCalendar(List<CalendarBean> calendar) {
    this.calendar = calendar;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarResponse calendarResponse = (CalendarResponse) o;
    return Objects.equals(this.isSuccessfully, calendarResponse.isSuccessfully) &&
        Objects.equals(this.calendar, calendarResponse.calendar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isSuccessfully, calendar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarResponse {\n");
    sb.append("    isSuccessfully: ").append(toIndentedString(isSuccessfully)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
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

