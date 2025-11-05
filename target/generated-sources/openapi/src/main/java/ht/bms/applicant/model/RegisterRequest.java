package ht.bms.applicant.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.applicant.model.RoleBean;
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
 * RegisterRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class RegisterRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("userId")
  private BigDecimal userId;

  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("gender")
  private String gender;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("email")
  private String email;

  @JsonProperty("nin")
  private String nin;

  @JsonProperty("nif")
  private String nif;

  @JsonProperty("accountId")
  private BigDecimal accountId;

  @JsonProperty("officeId")
  private BigDecimal officeId;

  @JsonProperty("passport")
  private String passport;

  @JsonProperty("nationalite")
  private String nationalite;

  @JsonProperty("picture")
  private String picture;

  @JsonProperty("pictureType")
  private String pictureType;

  @JsonProperty("role")
  private RoleBean role;

  public RegisterRequest userId(BigDecimal userId) {
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

  public RegisterRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * username
   * @return username
  */
  
  @Schema(name = "username", example = "johndoe", description = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public RegisterRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * password
   * @return password
  */
  
  @Schema(name = "password", example = "password123", description = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RegisterRequest firstName(String firstName) {
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

  public RegisterRequest gender(String gender) {
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

  public RegisterRequest lastName(String lastName) {
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

  public RegisterRequest phone(String phone) {
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

  public RegisterRequest email(String email) {
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

  public RegisterRequest nin(String nin) {
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

  public RegisterRequest nif(String nif) {
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

  public RegisterRequest accountId(BigDecimal accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * account id
   * @return accountId
  */
  @Valid 
  @Schema(name = "accountId", example = "100", description = "account id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getAccountId() {
    return accountId;
  }

  public void setAccountId(BigDecimal accountId) {
    this.accountId = accountId;
  }

  public RegisterRequest officeId(BigDecimal officeId) {
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

  public RegisterRequest passport(String passport) {
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

  public RegisterRequest nationalite(String nationalite) {
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

  public RegisterRequest picture(String picture) {
    this.picture = picture;
    return this;
  }

  /**
   * photo of user in base64
   * @return picture
  */
  
  @Schema(name = "picture", example = "/9j/4AAQSkZJRgABAQEASABIAAD/2wBDAAYEBQYFBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBcUFhYaHSUfGhsjHBYWICwgIyYnKSopGR8tMC0oMCUoKSj/2wBDAQcHBwoIChMKChMoGhYa", description = "photo of user in base64", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public RegisterRequest pictureType(String pictureType) {
    this.pictureType = pictureType;
    return this;
  }

  /**
   * nationality of user
   * @return pictureType
  */
  
  @Schema(name = "pictureType", example = "Haitian", description = "nationality of user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPictureType() {
    return pictureType;
  }

  public void setPictureType(String pictureType) {
    this.pictureType = pictureType;
  }

  public RegisterRequest role(RoleBean role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @Valid 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public RoleBean getRole() {
    return role;
  }

  public void setRole(RoleBean role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterRequest registerRequest = (RegisterRequest) o;
    return Objects.equals(this.userId, registerRequest.userId) &&
        Objects.equals(this.username, registerRequest.username) &&
        Objects.equals(this.password, registerRequest.password) &&
        Objects.equals(this.firstName, registerRequest.firstName) &&
        Objects.equals(this.gender, registerRequest.gender) &&
        Objects.equals(this.lastName, registerRequest.lastName) &&
        Objects.equals(this.phone, registerRequest.phone) &&
        Objects.equals(this.email, registerRequest.email) &&
        Objects.equals(this.nin, registerRequest.nin) &&
        Objects.equals(this.nif, registerRequest.nif) &&
        Objects.equals(this.accountId, registerRequest.accountId) &&
        Objects.equals(this.officeId, registerRequest.officeId) &&
        Objects.equals(this.passport, registerRequest.passport) &&
        Objects.equals(this.nationalite, registerRequest.nationalite) &&
        Objects.equals(this.picture, registerRequest.picture) &&
        Objects.equals(this.pictureType, registerRequest.pictureType) &&
        Objects.equals(this.role, registerRequest.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, username, password, firstName, gender, lastName, phone, email, nin, nif, accountId, officeId, passport, nationalite, picture, pictureType, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterRequest {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    nin: ").append(toIndentedString(nin)).append("\n");
    sb.append("    nif: ").append(toIndentedString(nif)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
    sb.append("    nationalite: ").append(toIndentedString(nationalite)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    pictureType: ").append(toIndentedString(pictureType)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

