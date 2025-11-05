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
 * PersonalBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class PersonalBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("applicantId")
  private BigDecimal applicantId;

  @JsonProperty("alreadyArrestDeport")
  private String alreadyArrestDeport;

  @JsonProperty("birthOfPlace")
  private String birthOfPlace;

  @JsonProperty("dateOfBirth")
  private String dateOfBirth;

  @JsonProperty("fatherFullName")
  private String fatherFullName;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("isAlreadyArrestDeport")
  private Boolean isAlreadyArrestDeport;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("motherFulName")
  private String motherFulName;

  @JsonProperty("motifDemande")
  private String motifDemande;

  @JsonProperty("nif")
  private String nif;

  @JsonProperty("nin")
  private String nin;

  @JsonProperty("email")
  private String email;

  @JsonProperty("isCitizen")
  private Boolean isCitizen;

  @JsonProperty("msPoids")
  private String msPoids;

  @JsonProperty("msTaille")
  private String msTaille;

  @JsonProperty("conjointFullName")
  private String conjointFullName;

  @JsonProperty("maritialStatus")
  private String maritialStatus;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("idDeptAdress")
  private BigDecimal idDeptAdress;

  @JsonProperty("idCommuneAdress")
  private BigDecimal idCommuneAdress;

  @JsonProperty("detailsAdress")
  private String detailsAdress;

  @JsonProperty("youngGirlname")
  private String youngGirlname;

  @JsonProperty("nationalite")
  private BigDecimal nationalite;

  @JsonProperty("passport")
  private String passport;

  @JsonProperty("bodyColor")
  private String bodyColor;

  @JsonProperty("eyes")
  private String eyes;

  @JsonProperty("hairs")
  private String hairs;

  public PersonalBean applicantId(BigDecimal applicantId) {
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

  public PersonalBean alreadyArrestDeport(String alreadyArrestDeport) {
    this.alreadyArrestDeport = alreadyArrestDeport;
    return this;
  }

  /**
   * already arrest deport
   * @return alreadyArrestDeport
  */
  
  @Schema(name = "alreadyArrestDeport", example = "oui", description = "already arrest deport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAlreadyArrestDeport() {
    return alreadyArrestDeport;
  }

  public void setAlreadyArrestDeport(String alreadyArrestDeport) {
    this.alreadyArrestDeport = alreadyArrestDeport;
  }

  public PersonalBean birthOfPlace(String birthOfPlace) {
    this.birthOfPlace = birthOfPlace;
    return this;
  }

  /**
   * place of birth
   * @return birthOfPlace
  */
  
  @Schema(name = "birthOfPlace", example = "Montana", description = "place of birth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBirthOfPlace() {
    return birthOfPlace;
  }

  public void setBirthOfPlace(String birthOfPlace) {
    this.birthOfPlace = birthOfPlace;
  }

  public PersonalBean dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * date of birth
   * @return dateOfBirth
  */
  
  @Schema(name = "dateOfBirth", example = "20-09-1990", description = "date of birth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PersonalBean fatherFullName(String fatherFullName) {
    this.fatherFullName = fatherFullName;
    return this;
  }

  /**
   * father full name
   * @return fatherFullName
  */
  
  @Schema(name = "fatherFullName", example = "john doe", description = "father full name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFatherFullName() {
    return fatherFullName;
  }

  public void setFatherFullName(String fatherFullName) {
    this.fatherFullName = fatherFullName;
  }

  public PersonalBean firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * first name
   * @return firstName
  */
  
  @Schema(name = "firstName", example = "john", description = "first name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonalBean isAlreadyArrestDeport(Boolean isAlreadyArrestDeport) {
    this.isAlreadyArrestDeport = isAlreadyArrestDeport;
    return this;
  }

  /**
   * is already arrest deport
   * @return isAlreadyArrestDeport
  */
  
  @Schema(name = "isAlreadyArrestDeport", example = "true", description = "is already arrest deport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsAlreadyArrestDeport() {
    return isAlreadyArrestDeport;
  }

  public void setIsAlreadyArrestDeport(Boolean isAlreadyArrestDeport) {
    this.isAlreadyArrestDeport = isAlreadyArrestDeport;
  }

  public PersonalBean lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * last name
   * @return lastName
  */
  
  @Schema(name = "lastName", example = "doe", description = "last name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PersonalBean motherFulName(String motherFulName) {
    this.motherFulName = motherFulName;
    return this;
  }

  /**
   * mother full name
   * @return motherFulName
  */
  
  @Schema(name = "motherFulName", example = "jane doe", description = "mother full name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMotherFulName() {
    return motherFulName;
  }

  public void setMotherFulName(String motherFulName) {
    this.motherFulName = motherFulName;
  }

  public PersonalBean motifDemande(String motifDemande) {
    this.motifDemande = motifDemande;
    return this;
  }

  /**
   * Certificate request reason
   * @return motifDemande
  */
  
  @Schema(name = "motifDemande", example = "BRJ", description = "Certificate request reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMotifDemande() {
    return motifDemande;
  }

  public void setMotifDemande(String motifDemande) {
    this.motifDemande = motifDemande;
  }

  public PersonalBean nif(String nif) {
    this.nif = nif;
    return this;
  }

  /**
   * numero identification fiscale
   * @return nif
  */
  
  @Schema(name = "nif", example = "009-098-098-8", description = "numero identification fiscale", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNif() {
    return nif;
  }

  public void setNif(String nif) {
    this.nif = nif;
  }

  public PersonalBean nin(String nin) {
    this.nin = nin;
    return this;
  }

  /**
   * numero identification national
   * @return nin
  */
  
  @Schema(name = "nin", example = "001-2345-6789", description = "numero identification national", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNin() {
    return nin;
  }

  public void setNin(String nin) {
    this.nin = nin;
  }

  public PersonalBean email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email of applicant
   * @return email
  */
  
  @Schema(name = "email", example = "janedoe@gmail.com", description = "email of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PersonalBean isCitizen(Boolean isCitizen) {
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

  public PersonalBean msPoids(String msPoids) {
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

  public PersonalBean msTaille(String msTaille) {
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

  public PersonalBean conjointFullName(String conjointFullName) {
    this.conjointFullName = conjointFullName;
    return this;
  }

  /**
   * Month of year name
   * @return conjointFullName
  */
  
  @Schema(name = "conjointFullName", example = "January", description = "Month of year name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getConjointFullName() {
    return conjointFullName;
  }

  public void setConjointFullName(String conjointFullName) {
    this.conjointFullName = conjointFullName;
  }

  public PersonalBean maritialStatus(String maritialStatus) {
    this.maritialStatus = maritialStatus;
    return this;
  }

  /**
   * Month of year name
   * @return maritialStatus
  */
  
  @Schema(name = "maritialStatus", example = "January", description = "Month of year name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMaritialStatus() {
    return maritialStatus;
  }

  public void setMaritialStatus(String maritialStatus) {
    this.maritialStatus = maritialStatus;
  }

  public PersonalBean gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * gender of applicant
   * @return gender
  */
  
  @Schema(name = "gender", example = "Male", description = "gender of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public PersonalBean idDeptAdress(BigDecimal idDeptAdress) {
    this.idDeptAdress = idDeptAdress;
    return this;
  }

  /**
   * department adress of applicant
   * @return idDeptAdress
  */
  @Valid 
  @Schema(name = "idDeptAdress", example = "12", description = "department adress of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getIdDeptAdress() {
    return idDeptAdress;
  }

  public void setIdDeptAdress(BigDecimal idDeptAdress) {
    this.idDeptAdress = idDeptAdress;
  }

  public PersonalBean idCommuneAdress(BigDecimal idCommuneAdress) {
    this.idCommuneAdress = idCommuneAdress;
    return this;
  }

  /**
   * commune adress of applicant
   * @return idCommuneAdress
  */
  @Valid 
  @Schema(name = "idCommuneAdress", example = "12345", description = "commune adress of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getIdCommuneAdress() {
    return idCommuneAdress;
  }

  public void setIdCommuneAdress(BigDecimal idCommuneAdress) {
    this.idCommuneAdress = idCommuneAdress;
  }

  public PersonalBean detailsAdress(String detailsAdress) {
    this.detailsAdress = detailsAdress;
    return this;
  }

  /**
   * detailed adress of applicant
   * @return detailsAdress
  */
  
  @Schema(name = "detailsAdress", description = "detailed adress of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDetailsAdress() {
    return detailsAdress;
  }

  public void setDetailsAdress(String detailsAdress) {
    this.detailsAdress = detailsAdress;
  }

  public PersonalBean youngGirlname(String youngGirlname) {
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

  public PersonalBean nationalite(BigDecimal nationalite) {
    this.nationalite = nationalite;
    return this;
  }

  /**
   * nationality of applicant
   * @return nationalite
  */
  @Valid 
  @Schema(name = "nationalite", example = "1", description = "nationality of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getNationalite() {
    return nationalite;
  }

  public void setNationalite(BigDecimal nationalite) {
    this.nationalite = nationalite;
  }

  public PersonalBean passport(String passport) {
    this.passport = passport;
    return this;
  }

  /**
   * passport of applicant
   * @return passport
  */
  
  @Schema(name = "passport", example = "A12345678", description = "passport of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassport() {
    return passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
  }

  public PersonalBean bodyColor(String bodyColor) {
    this.bodyColor = bodyColor;
    return this;
  }

  /**
   * body color of applicant
   * @return bodyColor
  */
  
  @Schema(name = "bodyColor", example = "black", description = "body color of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getBodyColor() {
    return bodyColor;
  }

  public void setBodyColor(String bodyColor) {
    this.bodyColor = bodyColor;
  }

  public PersonalBean eyes(String eyes) {
    this.eyes = eyes;
    return this;
  }

  /**
   * eyes of applicant
   * @return eyes
  */
  
  @Schema(name = "eyes", example = "blue", description = "eyes of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEyes() {
    return eyes;
  }

  public void setEyes(String eyes) {
    this.eyes = eyes;
  }

  public PersonalBean hairs(String hairs) {
    this.hairs = hairs;
    return this;
  }

  /**
   * hairs of applicant
   * @return hairs
  */
  
  @Schema(name = "hairs", example = "black", description = "hairs of applicant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getHairs() {
    return hairs;
  }

  public void setHairs(String hairs) {
    this.hairs = hairs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalBean personalBean = (PersonalBean) o;
    return Objects.equals(this.applicantId, personalBean.applicantId) &&
        Objects.equals(this.alreadyArrestDeport, personalBean.alreadyArrestDeport) &&
        Objects.equals(this.birthOfPlace, personalBean.birthOfPlace) &&
        Objects.equals(this.dateOfBirth, personalBean.dateOfBirth) &&
        Objects.equals(this.fatherFullName, personalBean.fatherFullName) &&
        Objects.equals(this.firstName, personalBean.firstName) &&
        Objects.equals(this.isAlreadyArrestDeport, personalBean.isAlreadyArrestDeport) &&
        Objects.equals(this.lastName, personalBean.lastName) &&
        Objects.equals(this.motherFulName, personalBean.motherFulName) &&
        Objects.equals(this.motifDemande, personalBean.motifDemande) &&
        Objects.equals(this.nif, personalBean.nif) &&
        Objects.equals(this.nin, personalBean.nin) &&
        Objects.equals(this.email, personalBean.email) &&
        Objects.equals(this.isCitizen, personalBean.isCitizen) &&
        Objects.equals(this.msPoids, personalBean.msPoids) &&
        Objects.equals(this.msTaille, personalBean.msTaille) &&
        Objects.equals(this.conjointFullName, personalBean.conjointFullName) &&
        Objects.equals(this.maritialStatus, personalBean.maritialStatus) &&
        Objects.equals(this.gender, personalBean.gender) &&
        Objects.equals(this.idDeptAdress, personalBean.idDeptAdress) &&
        Objects.equals(this.idCommuneAdress, personalBean.idCommuneAdress) &&
        Objects.equals(this.detailsAdress, personalBean.detailsAdress) &&
        Objects.equals(this.youngGirlname, personalBean.youngGirlname) &&
        Objects.equals(this.nationalite, personalBean.nationalite) &&
        Objects.equals(this.passport, personalBean.passport) &&
        Objects.equals(this.bodyColor, personalBean.bodyColor) &&
        Objects.equals(this.eyes, personalBean.eyes) &&
        Objects.equals(this.hairs, personalBean.hairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicantId, alreadyArrestDeport, birthOfPlace, dateOfBirth, fatherFullName, firstName, isAlreadyArrestDeport, lastName, motherFulName, motifDemande, nif, nin, email, isCitizen, msPoids, msTaille, conjointFullName, maritialStatus, gender, idDeptAdress, idCommuneAdress, detailsAdress, youngGirlname, nationalite, passport, bodyColor, eyes, hairs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalBean {\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    alreadyArrestDeport: ").append(toIndentedString(alreadyArrestDeport)).append("\n");
    sb.append("    birthOfPlace: ").append(toIndentedString(birthOfPlace)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    fatherFullName: ").append(toIndentedString(fatherFullName)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    isAlreadyArrestDeport: ").append(toIndentedString(isAlreadyArrestDeport)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    motherFulName: ").append(toIndentedString(motherFulName)).append("\n");
    sb.append("    motifDemande: ").append(toIndentedString(motifDemande)).append("\n");
    sb.append("    nif: ").append(toIndentedString(nif)).append("\n");
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isCitizen: ").append(toIndentedString(isCitizen)).append("\n");
    sb.append("    msPoids: ").append(toIndentedString(msPoids)).append("\n");
    sb.append("    msTaille: ").append(toIndentedString(msTaille)).append("\n");
    sb.append("    conjointFullName: ").append(toIndentedString(conjointFullName)).append("\n");
    sb.append("    maritialStatus: ").append(toIndentedString(maritialStatus)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    idDeptAdress: ").append(toIndentedString(idDeptAdress)).append("\n");
    sb.append("    idCommuneAdress: ").append(toIndentedString(idCommuneAdress)).append("\n");
    sb.append("    detailsAdress: ").append(toIndentedString(detailsAdress)).append("\n");
    sb.append("    youngGirlname: ").append(toIndentedString(youngGirlname)).append("\n");
    sb.append("    nationalite: ").append(toIndentedString(nationalite)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    bodyColor: ").append(toIndentedString(bodyColor)).append("\n");
    sb.append("    eyes: ").append(toIndentedString(eyes)).append("\n");
    sb.append("    hairs: ").append(toIndentedString(hairs)).append("\n");
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

