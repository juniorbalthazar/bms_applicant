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
 * RoleBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class RoleBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("roleId")
  private BigDecimal roleId;

  @JsonProperty("roleName")
  private String roleName;

  public RoleBean roleId(BigDecimal roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * role id
   * @return roleId
  */
  @Valid 
  @Schema(name = "roleId", example = "100", description = "role id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getRoleId() {
    return roleId;
  }

  public void setRoleId(BigDecimal roleId) {
    this.roleId = roleId;
  }

  public RoleBean roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * role name
   * @return roleName
  */
  
  @Schema(name = "roleName", example = "Admin", description = "role name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoleBean roleBean = (RoleBean) o;
    return Objects.equals(this.roleId, roleBean.roleId) &&
        Objects.equals(this.roleName, roleBean.roleName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, roleName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleBean {\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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

