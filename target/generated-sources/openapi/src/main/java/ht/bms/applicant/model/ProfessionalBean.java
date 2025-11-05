package ht.bms.applicant.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.applicant.model.GeoBean;
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
 * ProfessionalBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class ProfessionalBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("applicantId")
  private BigDecimal applicantId;

  @JsonProperty("conjointFullName")
  private String conjointFullName;

  @JsonProperty("maritialStatus")
  private String maritialStatus;

  @JsonProperty("youngGirlname")
  private String youngGirlname;

  @JsonProperty("mobilePhone")
  private String mobilePhone;

  @JsonProperty("msPoids")
  private String msPoids;

  @JsonProperty("msTaille")
  private String msTaille;

  @JsonProperty("occupation")
  private String occupation;

  @JsonProperty("profession")
  private String profession;

  @JsonProperty("streetAddress")
  private String streetAddress;

  @JsonProperty("adressGeo")
  private GeoBean adressGeo;

  public ProfessionalBean applicantId(BigDecimal applicantId) {
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

  public ProfessionalBean conjointFullName(String conjointFullName) {
    this.conjointFullName = conjointFullName;
    return this;
  }

  /**
   * conjoint full name
   * @return conjointFullName
  */
  
  @Schema(name = "conjointFullName", example = "jane doe", description = "conjoint full name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getConjointFullName() {
    return conjointFullName;
  }

  public void setConjointFullName(String conjointFullName) {
    this.conjointFullName = conjointFullName;
  }

  public ProfessionalBean maritialStatus(String maritialStatus) {
    this.maritialStatus = maritialStatus;
    return this;
  }

  /**
   * maritial status
   * @return maritialStatus
  */
  
  @Schema(name = "maritialStatus", example = "married", description = "maritial status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMaritialStatus() {
    return maritialStatus;
  }

  public void setMaritialStatus(String maritialStatus) {
    this.maritialStatus = maritialStatus;
  }

  public ProfessionalBean youngGirlname(String youngGirlname) {
    this.youngGirlname = youngGirlname;
    return this;
  }

  /**
   * young girl name
   * @return youngGirlname
  */
  
  @Schema(name = "youngGirlname", example = "jane smith", description = "young girl name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getYoungGirlname() {
    return youngGirlname;
  }

  public void setYoungGirlname(String youngGirlname) {
    this.youngGirlname = youngGirlname;
  }

  public ProfessionalBean mobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
    return this;
  }

  /**
   * mobile phone
   * @return mobilePhone
  */
  
  @Schema(name = "mobilePhone", example = "+509 3701 1234", description = "mobile phone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public ProfessionalBean msPoids(String msPoids) {
    this.msPoids = msPoids;
    return this;
  }

  /**
   * poids of applicant
   * @return msPoids
  */
  
  @Schema(name = "msPoids", example = "75kg", description = "poids of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMsPoids() {
    return msPoids;
  }

  public void setMsPoids(String msPoids) {
    this.msPoids = msPoids;
  }

  public ProfessionalBean msTaille(String msTaille) {
    this.msTaille = msTaille;
    return this;
  }

  /**
   * taille of applicant
   * @return msTaille
  */
  
  @Schema(name = "msTaille", example = "1.75m", description = "taille of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMsTaille() {
    return msTaille;
  }

  public void setMsTaille(String msTaille) {
    this.msTaille = msTaille;
  }

  public ProfessionalBean occupation(String occupation) {
    this.occupation = occupation;
    return this;
  }

  /**
   * occupation of applicant
   * @return occupation
  */
  
  @Schema(name = "occupation", example = "Engineer", description = "occupation of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getOccupation() {
    return occupation;
  }

  public void setOccupation(String occupation) {
    this.occupation = occupation;
  }

  public ProfessionalBean profession(String profession) {
    this.profession = profession;
    return this;
  }

  /**
   * profession of applicant
   * @return profession
  */
  
  @Schema(name = "profession", example = "Software Developer", description = "profession of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getProfession() {
    return profession;
  }

  public void setProfession(String profession) {
    this.profession = profession;
  }

  public ProfessionalBean streetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * street address of applicant
   * @return streetAddress
  */
  
  @Schema(name = "streetAddress", example = "123 Main St", description = "street address of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getStreetAddress() {
    return streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public ProfessionalBean adressGeo(GeoBean adressGeo) {
    this.adressGeo = adressGeo;
    return this;
  }

  /**
   * Get adressGeo
   * @return adressGeo
  */
  @Valid 
  @Schema(name = "adressGeo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public GeoBean getAdressGeo() {
    return adressGeo;
  }

  public void setAdressGeo(GeoBean adressGeo) {
    this.adressGeo = adressGeo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfessionalBean professionalBean = (ProfessionalBean) o;
    return Objects.equals(this.applicantId, professionalBean.applicantId) &&
        Objects.equals(this.conjointFullName, professionalBean.conjointFullName) &&
        Objects.equals(this.maritialStatus, professionalBean.maritialStatus) &&
        Objects.equals(this.youngGirlname, professionalBean.youngGirlname) &&
        Objects.equals(this.mobilePhone, professionalBean.mobilePhone) &&
        Objects.equals(this.msPoids, professionalBean.msPoids) &&
        Objects.equals(this.msTaille, professionalBean.msTaille) &&
        Objects.equals(this.occupation, professionalBean.occupation) &&
        Objects.equals(this.profession, professionalBean.profession) &&
        Objects.equals(this.streetAddress, professionalBean.streetAddress) &&
        Objects.equals(this.adressGeo, professionalBean.adressGeo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, conjointFullName, maritialStatus, youngGirlname, mobilePhone, msPoids, msTaille, occupation, profession, streetAddress, adressGeo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfessionalBean {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    conjointFullName: ").append(toIndentedString(conjointFullName)).append("\n");
    sb.append("    maritialStatus: ").append(toIndentedString(maritialStatus)).append("\n");
    sb.append("    youngGirlname: ").append(toIndentedString(youngGirlname)).append("\n");
    sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
    sb.append("    msPoids: ").append(toIndentedString(msPoids)).append("\n");
    sb.append("    msTaille: ").append(toIndentedString(msTaille)).append("\n");
    sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
    sb.append("    profession: ").append(toIndentedString(profession)).append("\n");
    sb.append("    streetAddress: ").append(toIndentedString(streetAddress)).append("\n");
    sb.append("    adressGeo: ").append(toIndentedString(adressGeo)).append("\n");
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

