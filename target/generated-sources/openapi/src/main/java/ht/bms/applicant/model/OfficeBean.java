package ht.bms.applicant.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.applicant.model.InstitutionBean;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class OfficeBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("officeId")
  private BigDecimal officeId;

  @JsonProperty("active")
  private Boolean active;

  @JsonProperty("isCentral")
  private Boolean isCentral;

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

  public OfficeBean active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * is office active
   * @return active
  */
  
  @Schema(name = "active", example = "true", description = "is office active", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public OfficeBean isCentral(Boolean isCentral) {
    this.isCentral = isCentral;
    return this;
  }

  /**
   * is office central
   * @return isCentral
  */
  
  @Schema(name = "isCentral", example = "false", description = "is office central", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsCentral() {
    return isCentral;
  }

  public void setIsCentral(Boolean isCentral) {
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

