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
 * SettingBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-02T20:31:22.046054300-05:00[America/New_York]")
public class SettingBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("settingId")
  private BigDecimal settingId;

  @JsonProperty("institutionId")
  private BigDecimal institutionId;

  @JsonProperty("nbreTransPerApplicant")
  private BigDecimal nbreTransPerApplicant;

  @JsonProperty("officeCapacity")
  private BigDecimal officeCapacity;

  @JsonProperty("startHours")
  private String startHours;

  @JsonProperty("endHours")
  private String endHours;

  @JsonProperty("expirationCertificat")
  private BigDecimal expirationCertificat;

  @JsonProperty("sendEmailTransaction")
  private BigDecimal sendEmailTransaction;

  @JsonProperty("maxTimeTxBeforePay")
  private BigDecimal maxTimeTxBeforePay;

  @JsonProperty("smsMesageBody")
  private String smsMesageBody;

  public SettingBean settingId(BigDecimal settingId) {
    this.settingId = settingId;
    return this;
  }

  /**
   * Setting id
   * @return settingId
  */
  @Valid 
  @Schema(name = "settingId", example = "100", description = "Setting id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getSettingId() {
    return settingId;
  }

  public void setSettingId(BigDecimal settingId) {
    this.settingId = settingId;
  }

  public SettingBean institutionId(BigDecimal institutionId) {
    this.institutionId = institutionId;
    return this;
  }

  /**
   * office id
   * @return institutionId
  */
  @Valid 
  @Schema(name = "institutionId", example = "100", description = "office id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getInstitutionId() {
    return institutionId;
  }

  public void setInstitutionId(BigDecimal institutionId) {
    this.institutionId = institutionId;
  }

  public SettingBean nbreTransPerApplicant(BigDecimal nbreTransPerApplicant) {
    this.nbreTransPerApplicant = nbreTransPerApplicant;
    return this;
  }

  /**
   * 0 is equal to false and 1 is equal to true
   * @return nbreTransPerApplicant
  */
  @Valid 
  @Schema(name = "nbreTransPerApplicant", example = "0", description = "0 is equal to false and 1 is equal to true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getNbreTransPerApplicant() {
    return nbreTransPerApplicant;
  }

  public void setNbreTransPerApplicant(BigDecimal nbreTransPerApplicant) {
    this.nbreTransPerApplicant = nbreTransPerApplicant;
  }

  public SettingBean officeCapacity(BigDecimal officeCapacity) {
    this.officeCapacity = officeCapacity;
    return this;
  }

  /**
   * nomber of office capacity
   * @return officeCapacity
  */
  @Valid 
  @Schema(name = "officeCapacity", example = "100", description = "nomber of office capacity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getOfficeCapacity() {
    return officeCapacity;
  }

  public void setOfficeCapacity(BigDecimal officeCapacity) {
    this.officeCapacity = officeCapacity;
  }

  public SettingBean startHours(String startHours) {
    this.startHours = startHours;
    return this;
  }

  /**
   * start hour of office
   * @return startHours
  */
  
  @Schema(name = "startHours", example = "8:00 AM", description = "start hour of office", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStartHours() {
    return startHours;
  }

  public void setStartHours(String startHours) {
    this.startHours = startHours;
  }

  public SettingBean endHours(String endHours) {
    this.endHours = endHours;
    return this;
  }

  /**
   * end hour of office
   * @return endHours
  */
  
  @Schema(name = "endHours", example = "4:00 PM", description = "end hour of office", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEndHours() {
    return endHours;
  }

  public void setEndHours(String endHours) {
    this.endHours = endHours;
  }

  public SettingBean expirationCertificat(BigDecimal expirationCertificat) {
    this.expirationCertificat = expirationCertificat;
    return this;
  }

  /**
   * nomber of days before certificat expiration
   * @return expirationCertificat
  */
  @Valid 
  @Schema(name = "expirationCertificat", example = "365", description = "nomber of days before certificat expiration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getExpirationCertificat() {
    return expirationCertificat;
  }

  public void setExpirationCertificat(BigDecimal expirationCertificat) {
    this.expirationCertificat = expirationCertificat;
  }

  public SettingBean sendEmailTransaction(BigDecimal sendEmailTransaction) {
    this.sendEmailTransaction = sendEmailTransaction;
    return this;
  }

  /**
   * 0 is equal to false and 1 is equal to true
   * @return sendEmailTransaction
  */
  @Valid 
  @Schema(name = "sendEmailTransaction", description = "0 is equal to false and 1 is equal to true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getSendEmailTransaction() {
    return sendEmailTransaction;
  }

  public void setSendEmailTransaction(BigDecimal sendEmailTransaction) {
    this.sendEmailTransaction = sendEmailTransaction;
  }

  public SettingBean maxTimeTxBeforePay(BigDecimal maxTimeTxBeforePay) {
    this.maxTimeTxBeforePay = maxTimeTxBeforePay;
    return this;
  }

  /**
   * max time transaction before pay
   * @return maxTimeTxBeforePay
  */
  @Valid 
  @Schema(name = "maxTimeTxBeforePay", example = "5", description = "max time transaction before pay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getMaxTimeTxBeforePay() {
    return maxTimeTxBeforePay;
  }

  public void setMaxTimeTxBeforePay(BigDecimal maxTimeTxBeforePay) {
    this.maxTimeTxBeforePay = maxTimeTxBeforePay;
  }

  public SettingBean smsMesageBody(String smsMesageBody) {
    this.smsMesageBody = smsMesageBody;
    return this;
  }

  /**
   * format of sms message
   * @return smsMesageBody
  */
  
  @Schema(name = "smsMesageBody", example = "html", description = "format of sms message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getSmsMesageBody() {
    return smsMesageBody;
  }

  public void setSmsMesageBody(String smsMesageBody) {
    this.smsMesageBody = smsMesageBody;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingBean settingBean = (SettingBean) o;
    return Objects.equals(this.settingId, settingBean.settingId) &&
        Objects.equals(this.institutionId, settingBean.institutionId) &&
        Objects.equals(this.nbreTransPerApplicant, settingBean.nbreTransPerApplicant) &&
        Objects.equals(this.officeCapacity, settingBean.officeCapacity) &&
        Objects.equals(this.startHours, settingBean.startHours) &&
        Objects.equals(this.endHours, settingBean.endHours) &&
        Objects.equals(this.expirationCertificat, settingBean.expirationCertificat) &&
        Objects.equals(this.sendEmailTransaction, settingBean.sendEmailTransaction) &&
        Objects.equals(this.maxTimeTxBeforePay, settingBean.maxTimeTxBeforePay) &&
        Objects.equals(this.smsMesageBody, settingBean.smsMesageBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingId, institutionId, nbreTransPerApplicant, officeCapacity, startHours, endHours, expirationCertificat, sendEmailTransaction, maxTimeTxBeforePay, smsMesageBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingBean {\n");
    sb.append("    settingId: ").append(toIndentedString(settingId)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    nbreTransPerApplicant: ").append(toIndentedString(nbreTransPerApplicant)).append("\n");
    sb.append("    officeCapacity: ").append(toIndentedString(officeCapacity)).append("\n");
    sb.append("    startHours: ").append(toIndentedString(startHours)).append("\n");
    sb.append("    endHours: ").append(toIndentedString(endHours)).append("\n");
    sb.append("    expirationCertificat: ").append(toIndentedString(expirationCertificat)).append("\n");
    sb.append("    sendEmailTransaction: ").append(toIndentedString(sendEmailTransaction)).append("\n");
    sb.append("    maxTimeTxBeforePay: ").append(toIndentedString(maxTimeTxBeforePay)).append("\n");
    sb.append("    smsMesageBody: ").append(toIndentedString(smsMesageBody)).append("\n");
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

