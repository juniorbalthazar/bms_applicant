package ht.bms.applicant.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import ht.bms.applicant.model.RoleBean;
import ht.bms.applicant.model.UserBean;
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
 * AccountBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class AccountBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("accountId")
  private BigDecimal accountId;

  @JsonProperty("assignId")
  private BigDecimal assignId;

  @JsonProperty("email")
  private String email;

  @JsonProperty("tel")
  private String tel;

  @JsonProperty("enabled")
  private BigDecimal enabled;

  @JsonProperty("role")
  private RoleBean role;

  @JsonProperty("user")
  private UserBean user;

  public AccountBean accountId(BigDecimal accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * role id
   * @return accountId
  */
  @Valid 
  @Schema(name = "accountId", example = "100", description = "role id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getAccountId() {
    return accountId;
  }

  public void setAccountId(BigDecimal accountId) {
    this.accountId = accountId;
  }

  public AccountBean assignId(BigDecimal assignId) {
    this.assignId = assignId;
    return this;
  }

  /**
   * role id
   * @return assignId
  */
  @Valid 
  @Schema(name = "assignId", example = "100", description = "role id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getAssignId() {
    return assignId;
  }

  public void setAssignId(BigDecimal assignId) {
    this.assignId = assignId;
  }

  public AccountBean email(String email) {
    this.email = email;
    return this;
  }

  /**
   * email of user
   * @return email
  */
  
  @Schema(name = "email", example = "admin@#gouv.ht", description = "email of user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AccountBean tel(String tel) {
    this.tel = tel;
    return this;
  }

  /**
   * phone number of user
   * @return tel
  */
  
  @Schema(name = "tel", example = "+509 3701 1234", description = "phone number of user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public AccountBean enabled(BigDecimal enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * is account enabled 0=false 1=true
   * @return enabled
  */
  @Valid 
  @Schema(name = "enabled", example = "1", description = "is account enabled 0=false 1=true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getEnabled() {
    return enabled;
  }

  public void setEnabled(BigDecimal enabled) {
    this.enabled = enabled;
  }

  public AccountBean role(RoleBean role) {
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

  public AccountBean user(UserBean user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public UserBean getUser() {
    return user;
  }

  public void setUser(UserBean user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBean accountBean = (AccountBean) o;
    return Objects.equals(this.accountId, accountBean.accountId) &&
        Objects.equals(this.assignId, accountBean.assignId) &&
        Objects.equals(this.email, accountBean.email) &&
        Objects.equals(this.tel, accountBean.tel) &&
        Objects.equals(this.enabled, accountBean.enabled) &&
        Objects.equals(this.role, accountBean.role) &&
        Objects.equals(this.user, accountBean.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, assignId, email, tel, enabled, role, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBean {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    assignId: ").append(toIndentedString(assignId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

