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
 * TxSearCriteria
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class TxSearCriteria implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("txId")
  private BigDecimal txId;

  @JsonProperty("txDate")
  private String txDate;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("nin")
  private String nin;

  @JsonProperty("nif")
  private String nif;

  @JsonProperty("status")
  private BigDecimal status;

  @JsonProperty("type")
  private BigDecimal type;

  @JsonProperty("office_id")
  private BigDecimal officeId;

  @JsonProperty("user_id")
  private BigDecimal userId;

  @JsonProperty("userAssignId")
  private BigDecimal userAssignId;

  @JsonProperty("paymentNumber")
  private BigDecimal paymentNumber;

  @JsonProperty("startDate")
  private String startDate;

  @JsonProperty("endDate")
  private String endDate;

  @JsonProperty("iscertificat")
  private Boolean iscertificat;

  @JsonProperty("isdemande")
  private Boolean isdemande;

  @JsonProperty("isdemandeSubmitted")
  private Boolean isdemandeSubmitted;

  @JsonProperty("isdemandeNotComplete")
  private Boolean isdemandeNotComplete;

  @JsonProperty("attribution")
  private BigDecimal attribution;

  public TxSearCriteria txId(BigDecimal txId) {
    this.txId = txId;
    return this;
  }

  /**
   * transaction id
   * @return txId
  */
  @Valid 
  @Schema(name = "txId", example = "100", description = "transaction id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getTxId() {
    return txId;
  }

  public void setTxId(BigDecimal txId) {
    this.txId = txId;
  }

  public TxSearCriteria txDate(String txDate) {
    this.txDate = txDate;
    return this;
  }

  /**
   * transaction date
   * @return txDate
  */
  
  @Schema(name = "txDate", example = "20-09-2025", description = "transaction date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTxDate() {
    return txDate;
  }

  public void setTxDate(String txDate) {
    this.txDate = txDate;
  }

  public TxSearCriteria phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * phone number
   * @return phone
  */
  
  @Schema(name = "phone", example = "+509 3701 1234", description = "phone number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public TxSearCriteria nin(String nin) {
    this.nin = nin;
    return this;
  }

  /**
   * national identification number
   * @return nin
  */
  
  @Schema(name = "nin", example = "001-2345-6789", description = "national identification number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNin() {
    return nin;
  }

  public void setNin(String nin) {
    this.nin = nin;
  }

  public TxSearCriteria nif(String nif) {
    this.nif = nif;
    return this;
  }

  /**
   * fiscal identification number
   * @return nif
  */
  
  @Schema(name = "nif", example = "009-098-098-8", description = "fiscal identification number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNif() {
    return nif;
  }

  public void setNif(String nif) {
    this.nif = nif;
  }

  public TxSearCriteria status(BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * status of transaction
   * @return status
  */
  @Valid 
  @Schema(name = "status", example = "100", description = "status of transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public TxSearCriteria type(BigDecimal type) {
    this.type = type;
    return this;
  }

  /**
   * type of transaction
   * @return type
  */
  @Valid 
  @Schema(name = "type", example = "100", description = "type of transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public TxSearCriteria officeId(BigDecimal officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * office id
   * @return officeId
  */
  @Valid 
  @Schema(name = "office_id", example = "100", description = "office id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getOfficeId() {
    return officeId;
  }

  public void setOfficeId(BigDecimal officeId) {
    this.officeId = officeId;
  }

  public TxSearCriteria userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

  /**
   * user id
   * @return userId
  */
  @Valid 
  @Schema(name = "user_id", example = "100", description = "user id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public TxSearCriteria userAssignId(BigDecimal userAssignId) {
    this.userAssignId = userAssignId;
    return this;
  }

  /**
   * user assign id
   * @return userAssignId
  */
  @Valid 
  @Schema(name = "userAssignId", example = "100", description = "user assign id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getUserAssignId() {
    return userAssignId;
  }

  public void setUserAssignId(BigDecimal userAssignId) {
    this.userAssignId = userAssignId;
  }

  public TxSearCriteria paymentNumber(BigDecimal paymentNumber) {
    this.paymentNumber = paymentNumber;
    return this;
  }

  /**
   * payment number
   * @return paymentNumber
  */
  @Valid 
  @Schema(name = "paymentNumber", example = "100", description = "payment number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getPaymentNumber() {
    return paymentNumber;
  }

  public void setPaymentNumber(BigDecimal paymentNumber) {
    this.paymentNumber = paymentNumber;
  }

  public TxSearCriteria startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * start date of transaction
   * @return startDate
  */
  
  @Schema(name = "startDate", example = "20-09-2025", description = "start date of transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public TxSearCriteria endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * end date of transaction
   * @return endDate
  */
  
  @Schema(name = "endDate", example = "20-09-2025", description = "end date of transaction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public TxSearCriteria iscertificat(Boolean iscertificat) {
    this.iscertificat = iscertificat;
    return this;
  }

  /**
   * is certificat is ready
   * @return iscertificat
  */
  
  @Schema(name = "iscertificat", example = "false", description = "is certificat is ready", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIscertificat() {
    return iscertificat;
  }

  public void setIscertificat(Boolean iscertificat) {
    this.iscertificat = iscertificat;
  }

  public TxSearCriteria isdemande(Boolean isdemande) {
    this.isdemande = isdemande;
    return this;
  }

  /**
   * is demande is ready
   * @return isdemande
  */
  
  @Schema(name = "isdemande", example = "true", description = "is demande is ready", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsdemande() {
    return isdemande;
  }

  public void setIsdemande(Boolean isdemande) {
    this.isdemande = isdemande;
  }

  public TxSearCriteria isdemandeSubmitted(Boolean isdemandeSubmitted) {
    this.isdemandeSubmitted = isdemandeSubmitted;
    return this;
  }

  /**
   * is demande submitted
   * @return isdemandeSubmitted
  */
  
  @Schema(name = "isdemandeSubmitted", example = "false", description = "is demande submitted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsdemandeSubmitted() {
    return isdemandeSubmitted;
  }

  public void setIsdemandeSubmitted(Boolean isdemandeSubmitted) {
    this.isdemandeSubmitted = isdemandeSubmitted;
  }

  public TxSearCriteria isdemandeNotComplete(Boolean isdemandeNotComplete) {
    this.isdemandeNotComplete = isdemandeNotComplete;
    return this;
  }

  /**
   * is demande not complete
   * @return isdemandeNotComplete
  */
  
  @Schema(name = "isdemandeNotComplete", example = "true", description = "is demande not complete", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsdemandeNotComplete() {
    return isdemandeNotComplete;
  }

  public void setIsdemandeNotComplete(Boolean isdemandeNotComplete) {
    this.isdemandeNotComplete = isdemandeNotComplete;
  }

  public TxSearCriteria attribution(BigDecimal attribution) {
    this.attribution = attribution;
    return this;
  }

  /**
   * transaction id
   * @return attribution
  */
  @Valid 
  @Schema(name = "attribution", example = "100", description = "transaction id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getAttribution() {
    return attribution;
  }

  public void setAttribution(BigDecimal attribution) {
    this.attribution = attribution;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TxSearCriteria txSearCriteria = (TxSearCriteria) o;
    return Objects.equals(this.txId, txSearCriteria.txId) &&
        Objects.equals(this.txDate, txSearCriteria.txDate) &&
        Objects.equals(this.phone, txSearCriteria.phone) &&
        Objects.equals(this.nin, txSearCriteria.nin) &&
        Objects.equals(this.nif, txSearCriteria.nif) &&
        Objects.equals(this.status, txSearCriteria.status) &&
        Objects.equals(this.type, txSearCriteria.type) &&
        Objects.equals(this.officeId, txSearCriteria.officeId) &&
        Objects.equals(this.userId, txSearCriteria.userId) &&
        Objects.equals(this.userAssignId, txSearCriteria.userAssignId) &&
        Objects.equals(this.paymentNumber, txSearCriteria.paymentNumber) &&
        Objects.equals(this.startDate, txSearCriteria.startDate) &&
        Objects.equals(this.endDate, txSearCriteria.endDate) &&
        Objects.equals(this.iscertificat, txSearCriteria.iscertificat) &&
        Objects.equals(this.isdemande, txSearCriteria.isdemande) &&
        Objects.equals(this.isdemandeSubmitted, txSearCriteria.isdemandeSubmitted) &&
        Objects.equals(this.isdemandeNotComplete, txSearCriteria.isdemandeNotComplete) &&
        Objects.equals(this.attribution, txSearCriteria.attribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txId, txDate, phone, nin, nif, status, type, officeId, userId, userAssignId, paymentNumber, startDate, endDate, iscertificat, isdemande, isdemandeSubmitted, isdemandeNotComplete, attribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TxSearCriteria {\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    txDate: ").append(toIndentedString(txDate)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
    sb.append("    nif: ").append(toIndentedString(nif)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userAssignId: ").append(toIndentedString(userAssignId)).append("\n");
    sb.append("    paymentNumber: ").append(toIndentedString(paymentNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    iscertificat: ").append(toIndentedString(iscertificat)).append("\n");
    sb.append("    isdemande: ").append(toIndentedString(isdemande)).append("\n");
    sb.append("    isdemandeSubmitted: ").append(toIndentedString(isdemandeSubmitted)).append("\n");
    sb.append("    isdemandeNotComplete: ").append(toIndentedString(isdemandeNotComplete)).append("\n");
    sb.append("    attribution: ").append(toIndentedString(attribution)).append("\n");
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

