package ht.bms.applicant.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.applicant.model.InstitutionBean;
import ht.bms.applicant.model.OfficeBean;
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
 * UserBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class UserBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("userId")
  private BigDecimal userId;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("middleName")
  private String middleName;

  @JsonProperty("photo")
  private String photo;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("email")
  private String email;

  @JsonProperty("nin")
  private String nin;

  @JsonProperty("nif")
  private String nif;

  @JsonProperty("passport")
  private String passport;

  @JsonProperty("nationalite")
  private String nationalite;

  @JsonProperty("role")
  private String role;

  @JsonProperty("office")
  private OfficeBean office;

  @JsonProperty("institution")
  private InstitutionBean institution;

  public UserBean userId(BigDecimal userId) {
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

  public UserBean firstName(String firstName) {
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

  public UserBean gender(String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * gender of user
   * @return gender
  */
  
  @Schema(name = "gender", example = "Male", description = "gender of user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public UserBean lastName(String lastName) {
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

  public UserBean middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

  /**
   * middle name
   * @return middleName
  */
  
  @Schema(name = "middleName", example = "alan", description = "middle name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public UserBean photo(String photo) {
    this.photo = photo;
    return this;
  }

  /**
   * photo of user in base64
   * @return photo
  */
  
  @Schema(name = "photo", example = "/9j/4AAQSkZJRgABAQEASABIAAD/2wBDAAYEBQYFBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBcUFhYaHSUfGhsjHBYWICwgIyYnKSopGR8tMC0oMCUoKSj/2wBDAQcHBwoIChMKChMoGhYa", description = "photo of user in base64", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public UserBean phone(String phone) {
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

  public UserBean email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email of user
   * @return email
  */
  
  @Schema(name = "email", example = "admin@gouv.ht", description = "email of user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserBean nin(String nin) {
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

  public UserBean nif(String nif) {
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

  public UserBean passport(String passport) {
    this.passport = passport;
    return this;
  }

  /**
   * passport number
   * @return passport
  */
  
  @Schema(name = "passport", example = "A12345678", description = "passport number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassport() {
    return passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
  }

  public UserBean nationalite(String nationalite) {
    this.nationalite = nationalite;
    return this;
  }

  /**
   * nationality of user
   * @return nationalite
  */
  
  @Schema(name = "nationalite", example = "Haitian", description = "nationality of user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNationalite() {
    return nationalite;
  }

  public void setNationalite(String nationalite) {
    this.nationalite = nationalite;
  }

  public UserBean role(String role) {
    this.role = role;
    return this;
  }

  /**
   * role of user
   * @return role
  */
  
  @Schema(name = "role", example = "Admin", description = "role of user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public UserBean office(OfficeBean office) {
    this.office = office;
    return this;
  }

  /**
   * Get office
   * @return office
  */
  @Valid 
  @Schema(name = "office", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public OfficeBean getOffice() {
    return office;
  }

  public void setOffice(OfficeBean office) {
    this.office = office;
  }

  public UserBean institution(InstitutionBean institution) {
    this.institution = institution;
    return this;
  }

  /**
   * Get institution
   * @return institution
  */
  @Valid 
  @Schema(name = "institution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public InstitutionBean getInstitution() {
    return institution;
  }

  public void setInstitution(InstitutionBean institution) {
    this.institution = institution;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBean userBean = (UserBean) o;
    return Objects.equals(this.userId, userBean.userId) &&
        Objects.equals(this.firstName, userBean.firstName) &&
        Objects.equals(this.gender, userBean.gender) &&
        Objects.equals(this.lastName, userBean.lastName) &&
        Objects.equals(this.middleName, userBean.middleName) &&
        Objects.equals(this.photo, userBean.photo) &&
        Objects.equals(this.phone, userBean.phone) &&
        Objects.equals(this.email, userBean.email) &&
        Objects.equals(this.nin, userBean.nin) &&
        Objects.equals(this.nif, userBean.nif) &&
        Objects.equals(this.passport, userBean.passport) &&
        Objects.equals(this.nationalite, userBean.nationalite) &&
        Objects.equals(this.role, userBean.role) &&
        Objects.equals(this.office, userBean.office) &&
        Objects.equals(this.institution, userBean.institution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, firstName, gender, lastName, middleName, photo, phone, email, nin, nif, passport, nationalite, role, office, institution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBean {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
    sb.append("    nif: ").append(toIndentedString(nif)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationalite: ").append(toIndentedString(nationalite)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
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

