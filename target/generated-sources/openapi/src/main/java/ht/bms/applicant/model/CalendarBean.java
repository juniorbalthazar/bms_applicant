package ht.bms.applicant.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.applicant.model.DayOfWeekBean;
import ht.bms.applicant.model.MonthOfYearBean;
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
 * CalendarBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class CalendarBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("calendarDate")
  private String calendarDate;

  @JsonProperty("calendarDateExpired")
  private Boolean calendarDateExpired;

  @JsonProperty("day_of_month")
  private BigDecimal dayOfMonth;

  @JsonProperty("holidayName")
  private String holidayName;

  @JsonProperty("holidayNote")
  private String holidayNote;

  @JsonProperty("isBusinessDay")
  private Boolean isBusinessDay;

  @JsonProperty("isDateAvailable")
  private Boolean isDateAvailable;

  @JsonProperty("isHalfDay")
  private Boolean isHalfDay;

  @JsonProperty("isHolyDay")
  private Boolean isHolyDay;

  @JsonProperty("year")
  private BigDecimal year;

  @JsonProperty("dayOfWeek")
  private BigDecimal dayOfWeek;

  @JsonProperty("monthOfYear")
  private BigDecimal monthOfYear;

  @JsonProperty("dateStr")
  private String dateStr;

  @JsonProperty("dateLong")
  private BigDecimal dateLong;

  @JsonProperty("dayOfWeekBean")
  private DayOfWeekBean dayOfWeekBean;

  @JsonProperty("monthOfYearBean")
  private MonthOfYearBean monthOfYearBean;

  public CalendarBean calendarDate(String calendarDate) {
    this.calendarDate = calendarDate;
    return this;
  }

  /**
   * Date for calendar
   * @return calendarDate
  */
  
  @Schema(name = "calendarDate", example = "20-09-2025", description = "Date for calendar", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getCalendarDate() {
    return calendarDate;
  }

  public void setCalendarDate(String calendarDate) {
    this.calendarDate = calendarDate;
  }

  public CalendarBean calendarDateExpired(Boolean calendarDateExpired) {
    this.calendarDateExpired = calendarDateExpired;
    return this;
  }

  /**
   * true if date is expired otherwise false
   * @return calendarDateExpired
  */
  
  @Schema(name = "calendarDateExpired", example = "false", description = "true if date is expired otherwise false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getCalendarDateExpired() {
    return calendarDateExpired;
  }

  public void setCalendarDateExpired(Boolean calendarDateExpired) {
    this.calendarDateExpired = calendarDateExpired;
  }

  public CalendarBean dayOfMonth(BigDecimal dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
    return this;
  }

  /**
   * date in long format
   * @return dayOfMonth
  */
  @Valid 
  @Schema(name = "day_of_month", example = "1734768000000", description = "date in long format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getDayOfMonth() {
    return dayOfMonth;
  }

  public void setDayOfMonth(BigDecimal dayOfMonth) {
    this.dayOfMonth = dayOfMonth;
  }

  public CalendarBean holidayName(String holidayName) {
    this.holidayName = holidayName;
    return this;
  }

  /**
   * name of holiday if exist otherwise null
   * @return holidayName
  */
  
  @Schema(name = "holidayName", description = "name of holiday if exist otherwise null", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getHolidayName() {
    return holidayName;
  }

  public void setHolidayName(String holidayName) {
    this.holidayName = holidayName;
  }

  public CalendarBean holidayNote(String holidayNote) {
    this.holidayNote = holidayNote;
    return this;
  }

  /**
   * note of holiday if exist otherwise null
   * @return holidayNote
  */
  
  @Schema(name = "holidayNote", description = "note of holiday if exist otherwise null", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getHolidayNote() {
    return holidayNote;
  }

  public void setHolidayNote(String holidayNote) {
    this.holidayNote = holidayNote;
  }

  public CalendarBean isBusinessDay(Boolean isBusinessDay) {
    this.isBusinessDay = isBusinessDay;
    return this;
  }

  /**
   * is business day
   * @return isBusinessDay
  */
  
  @Schema(name = "isBusinessDay", example = "true", description = "is business day", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsBusinessDay() {
    return isBusinessDay;
  }

  public void setIsBusinessDay(Boolean isBusinessDay) {
    this.isBusinessDay = isBusinessDay;
  }

  public CalendarBean isDateAvailable(Boolean isDateAvailable) {
    this.isDateAvailable = isDateAvailable;
    return this;
  }

  /**
   * is date available
   * @return isDateAvailable
  */
  
  @Schema(name = "isDateAvailable", example = "true", description = "is date available", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsDateAvailable() {
    return isDateAvailable;
  }

  public void setIsDateAvailable(Boolean isDateAvailable) {
    this.isDateAvailable = isDateAvailable;
  }

  public CalendarBean isHalfDay(Boolean isHalfDay) {
    this.isHalfDay = isHalfDay;
    return this;
  }

  /**
   * is half day
   * @return isHalfDay
  */
  
  @Schema(name = "isHalfDay", example = "false", description = "is half day", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsHalfDay() {
    return isHalfDay;
  }

  public void setIsHalfDay(Boolean isHalfDay) {
    this.isHalfDay = isHalfDay;
  }

  public CalendarBean isHolyDay(Boolean isHolyDay) {
    this.isHolyDay = isHolyDay;
    return this;
  }

  /**
   * is holy day
   * @return isHolyDay
  */
  
  @Schema(name = "isHolyDay", example = "false", description = "is holy day", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsHolyDay() {
    return isHolyDay;
  }

  public void setIsHolyDay(Boolean isHolyDay) {
    this.isHolyDay = isHolyDay;
  }

  public CalendarBean year(BigDecimal year) {
    this.year = year;
    return this;
  }

  /**
   * year of date
   * @return year
  */
  @Valid 
  @Schema(name = "year", example = "1734768000000", description = "year of date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getYear() {
    return year;
  }

  public void setYear(BigDecimal year) {
    this.year = year;
  }

  public CalendarBean dayOfWeek(BigDecimal dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * day of week
   * @return dayOfWeek
  */
  @Valid 
  @Schema(name = "dayOfWeek", example = "1734768000000", description = "day of week", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(BigDecimal dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public CalendarBean monthOfYear(BigDecimal monthOfYear) {
    this.monthOfYear = monthOfYear;
    return this;
  }

  /**
   * month of year
   * @return monthOfYear
  */
  @Valid 
  @Schema(name = "monthOfYear", example = "1734768000000", description = "month of year", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getMonthOfYear() {
    return monthOfYear;
  }

  public void setMonthOfYear(BigDecimal monthOfYear) {
    this.monthOfYear = monthOfYear;
  }

  public CalendarBean dateStr(String dateStr) {
    this.dateStr = dateStr;
    return this;
  }

  /**
   * date in string format
   * @return dateStr
  */
  
  @Schema(name = "dateStr", description = "date in string format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDateStr() {
    return dateStr;
  }

  public void setDateStr(String dateStr) {
    this.dateStr = dateStr;
  }

  public CalendarBean dateLong(BigDecimal dateLong) {
    this.dateLong = dateLong;
    return this;
  }

  /**
   * date in long format
   * @return dateLong
  */
  @Valid 
  @Schema(name = "dateLong", example = "1734768000000", description = "date in long format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getDateLong() {
    return dateLong;
  }

  public void setDateLong(BigDecimal dateLong) {
    this.dateLong = dateLong;
  }

  public CalendarBean dayOfWeekBean(DayOfWeekBean dayOfWeekBean) {
    this.dayOfWeekBean = dayOfWeekBean;
    return this;
  }

  /**
   * Get dayOfWeekBean
   * @return dayOfWeekBean
  */
  @Valid 
  @Schema(name = "dayOfWeekBean", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public DayOfWeekBean getDayOfWeekBean() {
    return dayOfWeekBean;
  }

  public void setDayOfWeekBean(DayOfWeekBean dayOfWeekBean) {
    this.dayOfWeekBean = dayOfWeekBean;
  }

  public CalendarBean monthOfYearBean(MonthOfYearBean monthOfYearBean) {
    this.monthOfYearBean = monthOfYearBean;
    return this;
  }

  /**
   * Get monthOfYearBean
   * @return monthOfYearBean
  */
  @Valid 
  @Schema(name = "monthOfYearBean", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public MonthOfYearBean getMonthOfYearBean() {
    return monthOfYearBean;
  }

  public void setMonthOfYearBean(MonthOfYearBean monthOfYearBean) {
    this.monthOfYearBean = monthOfYearBean;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CalendarBean calendarBean = (CalendarBean) o;
    return Objects.equals(this.calendarDate, calendarBean.calendarDate) &&
        Objects.equals(this.calendarDateExpired, calendarBean.calendarDateExpired) &&
        Objects.equals(this.dayOfMonth, calendarBean.dayOfMonth) &&
        Objects.equals(this.holidayName, calendarBean.holidayName) &&
        Objects.equals(this.holidayNote, calendarBean.holidayNote) &&
        Objects.equals(this.isBusinessDay, calendarBean.isBusinessDay) &&
        Objects.equals(this.isDateAvailable, calendarBean.isDateAvailable) &&
        Objects.equals(this.isHalfDay, calendarBean.isHalfDay) &&
        Objects.equals(this.isHolyDay, calendarBean.isHolyDay) &&
        Objects.equals(this.year, calendarBean.year) &&
        Objects.equals(this.dayOfWeek, calendarBean.dayOfWeek) &&
        Objects.equals(this.monthOfYear, calendarBean.monthOfYear) &&
        Objects.equals(this.dateStr, calendarBean.dateStr) &&
        Objects.equals(this.dateLong, calendarBean.dateLong) &&
        Objects.equals(this.dayOfWeekBean, calendarBean.dayOfWeekBean) &&
        Objects.equals(this.monthOfYearBean, calendarBean.monthOfYearBean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calendarDate, calendarDateExpired, dayOfMonth, holidayName, holidayNote, isBusinessDay, isDateAvailable, isHalfDay, isHolyDay, year, dayOfWeek, monthOfYear, dateStr, dateLong, dayOfWeekBean, monthOfYearBean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CalendarBean {\n");
    sb.append("    calendarDate: ").append(toIndentedString(calendarDate)).append("\n");
    sb.append("    calendarDateExpired: ").append(toIndentedString(calendarDateExpired)).append("\n");
    sb.append("    dayOfMonth: ").append(toIndentedString(dayOfMonth)).append("\n");
    sb.append("    holidayName: ").append(toIndentedString(holidayName)).append("\n");
    sb.append("    holidayNote: ").append(toIndentedString(holidayNote)).append("\n");
    sb.append("    isBusinessDay: ").append(toIndentedString(isBusinessDay)).append("\n");
    sb.append("    isDateAvailable: ").append(toIndentedString(isDateAvailable)).append("\n");
    sb.append("    isHalfDay: ").append(toIndentedString(isHalfDay)).append("\n");
    sb.append("    isHolyDay: ").append(toIndentedString(isHolyDay)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    monthOfYear: ").append(toIndentedString(monthOfYear)).append("\n");
    sb.append("    dateStr: ").append(toIndentedString(dateStr)).append("\n");
    sb.append("    dateLong: ").append(toIndentedString(dateLong)).append("\n");
    sb.append("    dayOfWeekBean: ").append(toIndentedString(dayOfWeekBean)).append("\n");
    sb.append("    monthOfYearBean: ").append(toIndentedString(monthOfYearBean)).append("\n");
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

