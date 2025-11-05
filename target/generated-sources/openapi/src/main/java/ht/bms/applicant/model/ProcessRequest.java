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
 * ProcessRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class ProcessRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("txId")
  private BigDecimal txId;

  @JsonProperty("userId")
  private BigDecimal userId;

  @JsonProperty("assignId")
  private BigDecimal assignId;

  @JsonProperty("digitalNumber")
  private String digitalNumber;

  @JsonProperty("pinNumber")
  private String pinNumber;

  @JsonProperty("initial")
  private String initial;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("raison")
  private String raison;

  public ProcessRequest txId(BigDecimal txId) {
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

  public ProcessRequest userId(BigDecimal userId) {
    this.userId = userId;
    return this;
  }

  /**
   * user id
   * @return userId
  */
  @Valid 
  @Schema(name = "userId", example = "100", description = "user id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getUserId() {
    return userId;
  }

  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  public ProcessRequest assignId(BigDecimal assignId) {
    this.assignId = assignId;
    return this;
  }

  /**
   * assign id
   * @return assignId
  */
  @Valid 
  @Schema(name = "assignId", example = "100", description = "assign id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getAssignId() {
    return assignId;
  }

  public void setAssignId(BigDecimal assignId) {
    this.assignId = assignId;
  }

  public ProcessRequest digitalNumber(String digitalNumber) {
    this.digitalNumber = digitalNumber;
    return this;
  }

  /**
   * digital number
   * @return digitalNumber
  */
  
  @Schema(name = "digitalNumber", example = "DN123456789", description = "digital number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDigitalNumber() {
    return digitalNumber;
  }

  public void setDigitalNumber(String digitalNumber) {
    this.digitalNumber = digitalNumber;
  }

  public ProcessRequest pinNumber(String pinNumber) {
    this.pinNumber = pinNumber;
    return this;
  }

  /**
   * pin number
   * @return pinNumber
  */
  
  @Schema(name = "pinNumber", example = "PIN987654321", description = "pin number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPinNumber() {
    return pinNumber;
  }

  public void setPinNumber(String pinNumber) {
    this.pinNumber = pinNumber;
  }

  public ProcessRequest initial(String initial) {
    this.initial = initial;
    return this;
  }

  /**
   * initial
   * @return initial
  */
  
  @Schema(name = "initial", example = "JD", description = "initial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getInitial() {
    return initial;
  }

  public void setInitial(String initial) {
    this.initial = initial;
  }

  public ProcessRequest comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * comment
   * @return comment
  */
  
  @Schema(name = "comment", example = "This is a sample comment.", description = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ProcessRequest raison(String raison) {
    this.raison = raison;
    return this;
  }

  /**
   * raison
   * @return raison
  */
  
  @Schema(name = "raison", example = "Sample raison.", description = "raison", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getRaison() {
    return raison;
  }

  public void setRaison(String raison) {
    this.raison = raison;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessRequest processRequest = (ProcessRequest) o;
    return Objects.equals(this.txId, processRequest.txId) &&
        Objects.equals(this.userId, processRequest.userId) &&
        Objects.equals(this.assignId, processRequest.assignId) &&
        Objects.equals(this.digitalNumber, processRequest.digitalNumber) &&
        Objects.equals(this.pinNumber, processRequest.pinNumber) &&
        Objects.equals(this.initial, processRequest.initial) &&
        Objects.equals(this.comment, processRequest.comment) &&
        Objects.equals(this.raison, processRequest.raison);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txId, userId, assignId, digitalNumber, pinNumber, initial, comment, raison);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessRequest {\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    assignId: ").append(toIndentedString(assignId)).append("\n");
    sb.append("    digitalNumber: ").append(toIndentedString(digitalNumber)).append("\n");
    sb.append("    pinNumber: ").append(toIndentedString(pinNumber)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    raison: ").append(toIndentedString(raison)).append("\n");
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

