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
 * BasicRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class BasicRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("txId")
  private BigDecimal txId;

  @JsonProperty("userId")
  private BigDecimal userId;

  @JsonProperty("dataSize")
  private BigDecimal dataSize;

  @JsonProperty("status")
  private BigDecimal status;

  @JsonProperty("type")
  private BigDecimal type;

  @JsonProperty("date")
  private String date;

  @JsonProperty("officeId")
  private BigDecimal officeId;

  @JsonProperty("serviceId")
  private BigDecimal serviceId;

  public BasicRequest txId(BigDecimal txId) {
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

  public BasicRequest userId(BigDecimal userId) {
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

  public BasicRequest dataSize(BigDecimal dataSize) {
    this.dataSize = dataSize;
    return this;
  }

  /**
   * size of data
   * @return dataSize
  */
  @Valid 
  @Schema(name = "dataSize", example = "100", description = "size of data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getDataSize() {
    return dataSize;
  }

  public void setDataSize(BigDecimal dataSize) {
    this.dataSize = dataSize;
  }

  public BasicRequest status(BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * status of demand
   * @return status
  */
  @Valid 
  @Schema(name = "status", example = "100", description = "status of demand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public BasicRequest type(BigDecimal type) {
    this.type = type;
    return this;
  }

  /**
   * type of demand
   * @return type
  */
  @Valid 
  @Schema(name = "type", example = "100", description = "type of demand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public BasicRequest date(String date) {
    this.date = date;
    return this;
  }

  /**
   * date of demand
   * @return date
  */
  
  @Schema(name = "date", example = "20-09-2025", description = "date of demand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public BasicRequest officeId(BigDecimal officeId) {
    this.officeId = officeId;
    return this;
  }

  /**
   * office id
   * @return officeId
  */
  @Valid 
  @Schema(name = "officeId", example = "100", description = "office id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getOfficeId() {
    return officeId;
  }

  public void setOfficeId(BigDecimal officeId) {
    this.officeId = officeId;
  }

  public BasicRequest serviceId(BigDecimal serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * service id
   * @return serviceId
  */
  @Valid 
  @Schema(name = "serviceId", example = "100", description = "service id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getServiceId() {
    return serviceId;
  }

  public void setServiceId(BigDecimal serviceId) {
    this.serviceId = serviceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicRequest basicRequest = (BasicRequest) o;
    return Objects.equals(this.txId, basicRequest.txId) &&
        Objects.equals(this.userId, basicRequest.userId) &&
        Objects.equals(this.dataSize, basicRequest.dataSize) &&
        Objects.equals(this.status, basicRequest.status) &&
        Objects.equals(this.type, basicRequest.type) &&
        Objects.equals(this.date, basicRequest.date) &&
        Objects.equals(this.officeId, basicRequest.officeId) &&
        Objects.equals(this.serviceId, basicRequest.serviceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txId, userId, dataSize, status, type, date, officeId, serviceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicRequest {\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
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

