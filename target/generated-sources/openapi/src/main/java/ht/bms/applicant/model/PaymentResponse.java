package ht.bms.applicant.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.applicant.model.CalendarBean;
import ht.bms.applicant.model.OfficeBean;
import ht.bms.applicant.model.ServiceBean;
import java.math.BigDecimal;
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
 * PaymentResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class PaymentResponse implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("references")
  @Valid
  private List<CalendarBean> references = null;

  @JsonProperty("currentTxId")
  private BigDecimal currentTxId;

  @JsonProperty("bookingDate")
  private CalendarBean bookingDate;

  @JsonProperty("office")
  private OfficeBean office;

  @JsonProperty("service")
  private ServiceBean service;

  public PaymentResponse references(List<CalendarBean> references) {
    this.references = references;
    return this;
  }

  public PaymentResponse addReferencesItem(CalendarBean referencesItem) {
    if (this.references == null) {
      this.references = new ArrayList<>();
    }
    this.references.add(referencesItem);
    return this;
  }

  /**
   * Get references
   * @return references
  */
  @Valid 
  @Schema(name = "references", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public List<CalendarBean> getReferences() {
    return references;
  }

  public void setReferences(List<CalendarBean> references) {
    this.references = references;
  }

  public PaymentResponse currentTxId(BigDecimal currentTxId) {
    this.currentTxId = currentTxId;
    return this;
  }

  /**
   * transaction id
   * @return currentTxId
  */
  @Valid 
  @Schema(name = "currentTxId", example = "100", description = "transaction id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getCurrentTxId() {
    return currentTxId;
  }

  public void setCurrentTxId(BigDecimal currentTxId) {
    this.currentTxId = currentTxId;
  }

  public PaymentResponse bookingDate(CalendarBean bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * Get bookingDate
   * @return bookingDate
  */
  @Valid 
  @Schema(name = "bookingDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public CalendarBean getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(CalendarBean bookingDate) {
    this.bookingDate = bookingDate;
  }

  public PaymentResponse office(OfficeBean office) {
    this.office = office;
    return this;
  }

  /**
   * Get office
   * @return office
  */
  @Valid 
  @Schema(name = "office", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OfficeBean getOffice() {
    return office;
  }

  public void setOffice(OfficeBean office) {
    this.office = office;
  }

  public PaymentResponse service(ServiceBean service) {
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
  */
  @Valid 
  @Schema(name = "service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public ServiceBean getService() {
    return service;
  }

  public void setService(ServiceBean service) {
    this.service = service;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentResponse paymentResponse = (PaymentResponse) o;
    return Objects.equals(this.references, paymentResponse.references) &&
        Objects.equals(this.currentTxId, paymentResponse.currentTxId) &&
        Objects.equals(this.bookingDate, paymentResponse.bookingDate) &&
        Objects.equals(this.office, paymentResponse.office) &&
        Objects.equals(this.service, paymentResponse.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(references, currentTxId, bookingDate, office, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentResponse {\n");
    sb.append("    references: ").append(toIndentedString(references)).append("\n");
    sb.append("    currentTxId: ").append(toIndentedString(currentTxId)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

