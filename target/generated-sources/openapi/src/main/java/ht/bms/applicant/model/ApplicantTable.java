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
 * ApplicantTable
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class ApplicantTable implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("currentTxId")
  private BigDecimal currentTxId;

  @JsonProperty("stateId")
  private BigDecimal stateId;

  @JsonProperty("office")
  private String office;

  @JsonProperty("service")
  private String service;

  @JsonProperty("bookingDate")
  private String bookingDate;

  @JsonProperty("bookingNumber")
  private String bookingNumber;

  @JsonProperty("paymentNumber")
  private String paymentNumber;

  @JsonProperty("status")
  private String status;

  @JsonProperty("state")
  private String state;

  @JsonProperty("fullName")
  private String fullName;

  @JsonProperty("isCitizen")
  private Boolean isCitizen;

  @JsonProperty("document")
  private String document;

  @JsonProperty("txCodeCrypt")
  private String txCodeCrypt;

  public ApplicantTable currentTxId(BigDecimal currentTxId) {
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

  public ApplicantTable stateId(BigDecimal stateId) {
    this.stateId = stateId;
    return this;
  }

  /**
   * state id
   * @return stateId
  */
  @Valid 
  @Schema(name = "stateId", example = "100", description = "state id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getStateId() {
    return stateId;
  }

  public void setStateId(BigDecimal stateId) {
    this.stateId = stateId;
  }

  public ApplicantTable office(String office) {
    this.office = office;
    return this;
  }

  /**
   * name of office
   * @return office
  */
  
  @Schema(name = "office", example = "head office", description = "name of office", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public ApplicantTable service(String service) {
    this.service = service;
    return this;
  }

  /**
   * name of service
   * @return service
  */
  
  @Schema(name = "service", example = "service de l'etat civil", description = "name of service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public ApplicantTable bookingDate(String bookingDate) {
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

  public ApplicantTable bookingNumber(String bookingNumber) {
    this.bookingNumber = bookingNumber;
    return this;
  }

  /**
   * booking number
   * @return bookingNumber
  */
  
  @Schema(name = "bookingNumber", example = "BN123456", description = "booking number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBookingNumber() {
    return bookingNumber;
  }

  public void setBookingNumber(String bookingNumber) {
    this.bookingNumber = bookingNumber;
  }

  public ApplicantTable paymentNumber(String paymentNumber) {
    this.paymentNumber = paymentNumber;
    return this;
  }

  /**
   * payment number
   * @return paymentNumber
  */
  
  @Schema(name = "paymentNumber", example = "PN654321", description = "payment number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPaymentNumber() {
    return paymentNumber;
  }

  public void setPaymentNumber(String paymentNumber) {
    this.paymentNumber = paymentNumber;
  }

  public ApplicantTable status(String status) {
    this.status = status;
    return this;
  }

  /**
   * status of applicant
   * @return status
  */
  
  @Schema(name = "status", example = "Pending", description = "status of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ApplicantTable state(String state) {
    this.state = state;
    return this;
  }

  /**
   * state of applicant
   * @return state
  */
  
  @Schema(name = "state", example = "New", description = "state of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ApplicantTable fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * full name of applicant
   * @return fullName
  */
  
  @Schema(name = "fullName", example = "john doe", description = "full name of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public ApplicantTable isCitizen(Boolean isCitizen) {
    this.isCitizen = isCitizen;
    return this;
  }

  /**
   * is citizen
   * @return isCitizen
  */
  
  @Schema(name = "isCitizen", example = "true", description = "is citizen", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsCitizen() {
    return isCitizen;
  }

  public void setIsCitizen(Boolean isCitizen) {
    this.isCitizen = isCitizen;
  }

  public ApplicantTable document(String document) {
    this.document = document;
    return this;
  }

  /**
   * document of applicant
   * @return document
  */
  
  @Schema(name = "document", example = "/9j/4AAQSkZJRgABAQEASABIAAD/2wBDAAYEBQYFBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBcUFhYaHSUfGhsjHBYWICwgIyYnKSopGR8tMC0oMCUoKSj/2wBDAQcHBwoIChMKChMoGhYa", description = "document of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public ApplicantTable txCodeCrypt(String txCodeCrypt) {
    this.txCodeCrypt = txCodeCrypt;
    return this;
  }

  /**
   * transaction code crypted
   * @return txCodeCrypt
  */
  
  @Schema(name = "txCodeCrypt", example = "abcd1234efgh5678", description = "transaction code crypted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTxCodeCrypt() {
    return txCodeCrypt;
  }

  public void setTxCodeCrypt(String txCodeCrypt) {
    this.txCodeCrypt = txCodeCrypt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicantTable applicantTable = (ApplicantTable) o;
    return Objects.equals(this.currentTxId, applicantTable.currentTxId) &&
        Objects.equals(this.stateId, applicantTable.stateId) &&
        Objects.equals(this.office, applicantTable.office) &&
        Objects.equals(this.service, applicantTable.service) &&
        Objects.equals(this.bookingDate, applicantTable.bookingDate) &&
        Objects.equals(this.bookingNumber, applicantTable.bookingNumber) &&
        Objects.equals(this.paymentNumber, applicantTable.paymentNumber) &&
        Objects.equals(this.status, applicantTable.status) &&
        Objects.equals(this.state, applicantTable.state) &&
        Objects.equals(this.fullName, applicantTable.fullName) &&
        Objects.equals(this.isCitizen, applicantTable.isCitizen) &&
        Objects.equals(this.document, applicantTable.document) &&
        Objects.equals(this.txCodeCrypt, applicantTable.txCodeCrypt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentTxId, stateId, office, service, bookingDate, bookingNumber, paymentNumber, status, state, fullName, isCitizen, document, txCodeCrypt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicantTable {\n");
    sb.append("    currentTxId: ").append(toIndentedString(currentTxId)).append("\n");
    sb.append("    stateId: ").append(toIndentedString(stateId)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    bookingDate: ").append(toIndentedString(bookingDate)).append("\n");
    sb.append("    bookingNumber: ").append(toIndentedString(bookingNumber)).append("\n");
    sb.append("    paymentNumber: ").append(toIndentedString(paymentNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    isCitizen: ").append(toIndentedString(isCitizen)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    txCodeCrypt: ").append(toIndentedString(txCodeCrypt)).append("\n");
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

