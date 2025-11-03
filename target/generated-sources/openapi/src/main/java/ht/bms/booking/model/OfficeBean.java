package ht.bms.booking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.booking.model.InstitutionBean;
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
 * OfficeBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-02T20:31:22.046054300-05:00[America/New_York]")
public class OfficeBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("officeId")
  private BigDecimal officeId;

  @JsonProperty("active")
  private BigDecimal active;

  @JsonProperty("isCentral")
  private BigDecimal isCentral;

  @JsonProperty("officeName")
  private String officeName;

  @JsonProperty("BmsInstitutionBean")
  private InstitutionBean bmsInstitutionBean;

  public OfficeBean officeId(BigDecimal officeId) {
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

  public OfficeBean active(BigDecimal active) {
    this.active = active;
    return this;
  }

  /**
   * 0 is equal to false and 1 is equal to true
   * @return active
  */
  @Valid 
  @Schema(name = "active", example = "0", description = "0 is equal to false and 1 is equal to true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getActive() {
    return active;
  }

  public void setActive(BigDecimal active) {
    this.active = active;
  }

  public OfficeBean isCentral(BigDecimal isCentral) {
    this.isCentral = isCentral;
    return this;
  }

  /**
   * 0 is equal to false and 1 is equal to true
   * @return isCentral
  */
  @Valid 
  @Schema(name = "isCentral", example = "1", description = "0 is equal to false and 1 is equal to true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getIsCentral() {
    return isCentral;
  }

  public void setIsCentral(BigDecimal isCentral) {
    this.isCentral = isCentral;
  }

  public OfficeBean officeName(String officeName) {
    this.officeName = officeName;
    return this;
  }

  /**
   * name of office
   * @return officeName
  */
  
  @Schema(name = "officeName", example = "head office", description = "name of office", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getOfficeName() {
    return officeName;
  }

  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }

  public OfficeBean bmsInstitutionBean(InstitutionBean bmsInstitutionBean) {
    this.bmsInstitutionBean = bmsInstitutionBean;
    return this;
  }

  /**
   * Get bmsInstitutionBean
   * @return bmsInstitutionBean
  */
  @Valid 
  @Schema(name = "BmsInstitutionBean", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InstitutionBean getBmsInstitutionBean() {
    return bmsInstitutionBean;
  }

  public void setBmsInstitutionBean(InstitutionBean bmsInstitutionBean) {
    this.bmsInstitutionBean = bmsInstitutionBean;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfficeBean officeBean = (OfficeBean) o;
    return Objects.equals(this.officeId, officeBean.officeId) &&
        Objects.equals(this.active, officeBean.active) &&
        Objects.equals(this.isCentral, officeBean.isCentral) &&
        Objects.equals(this.officeName, officeBean.officeName) &&
        Objects.equals(this.bmsInstitutionBean, officeBean.bmsInstitutionBean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeId, active, isCentral, officeName, bmsInstitutionBean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfficeBean {\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    isCentral: ").append(toIndentedString(isCentral)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    bmsInstitutionBean: ").append(toIndentedString(bmsInstitutionBean)).append("\n");
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

