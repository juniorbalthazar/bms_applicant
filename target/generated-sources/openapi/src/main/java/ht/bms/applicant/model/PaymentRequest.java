package ht.bms.applicant.model;

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
 * PaymentRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class PaymentRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("applicantId")
  private BigDecimal applicantId;

  @JsonProperty("paymentNumber")
  private String paymentNumber;

  @JsonProperty("bookingDate")
  private String bookingDate;

  public PaymentRequest applicantId(BigDecimal applicantId) {
    this.applicantId = applicantId;
    return this;
  }

  /**
   * applicant id
   * @return applicantId
  */
  @Valid 
  @Schema(name = "applicantId", example = "100", description = "applicant id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(BigDecimal applicantId) {
    this.applicantId = applicantId;
  }

  public PaymentRequest paymentNumber(String paymentNumber) {
    this.paymentNumber = paymentNumber;
    return this;
  }

  /**
   * payment number
   * @return paymentNumber
  */
  
  @Schema(name = "paymentNumber", example = "100", description = "payment number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPaymentNumber() {
    return paymentNumber;
  }

  public void setPaymentNumber(String paymentNumber) {
    this.paymentNumber = paymentNumber;
  }

  public PaymentRequest bookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
    return this;
  }

  /**
   * booking date
   * @return bookingDate
  */
  
  @Schema(name = "bookingDate", example = "20-09-2025", description = "booking date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBookingDate() {
    return bookingDate;
  }

  public void setBookingDate(String bookingDate) {
    this.bookingDate = bookingDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentRequest paymentRequest = (PaymentRequest) o;
    return Objects.equals(this.applicantId, paymentRequest.applicantId) &&
        Objects.equals(this.paymentNumber, paymentRequest.paymentNumber) &&
        Objects.equals(this.bookingDate, paymentRequest.bookingDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, paymentNumber, bookingDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentRequest {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    paymentNumber: ").append(toIndentedString(paymentNumber)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
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

