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
 * SubmitBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class SubmitBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("txId")
  private BigDecimal txId;

  @JsonProperty("userId")
  private BigDecimal userId;

  @JsonProperty("issign")
  private Boolean issign;

  @JsonProperty("photo")
  private String photo;

  @JsonProperty("contentType")
  private BigDecimal contentType;

  public SubmitBean txId(BigDecimal txId) {
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

  public SubmitBean userId(BigDecimal userId) {
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

  public SubmitBean issign(Boolean issign) {
    this.issign = issign;
    return this;
  }

  /**
   * sign id
   * @return issign
  */
  
  @Schema(name = "issign", example = "true", description = "sign id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIssign() {
    return issign;
  }

  public void setIssign(Boolean issign) {
    this.issign = issign;
  }

  public SubmitBean photo(String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * picture of applicant
   * @return photo
  */
  
  @Schema(name = "photo", example = "100", description = "picture of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public SubmitBean contentType(BigDecimal contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * type of picture
   * @return contentType
  */
  @Valid 
  @Schema(name = "contentType", description = "type of picture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getContentType() {
    return contentType;
  }

  public void setContentType(BigDecimal contentType) {
    this.contentType = contentType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitBean submitBean = (SubmitBean) o;
    return Objects.equals(this.txId, submitBean.txId) &&
        Objects.equals(this.userId, submitBean.userId) &&
        Objects.equals(this.issign, submitBean.issign) &&
        Objects.equals(this.photo, submitBean.photo) &&
        Objects.equals(this.contentType, submitBean.contentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txId, userId, issign, photo, contentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitBean {\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    issign: ").append(toIndentedString(issign)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
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

