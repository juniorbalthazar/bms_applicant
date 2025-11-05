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
 * IdentityBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class IdentityBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("identityId")
  private BigDecimal identityId;

  @JsonProperty("docCentent")
  private String docCentent;

  @JsonProperty("contentType")
  private String contentType;

  @JsonProperty("name")
  private String name;

  public IdentityBean identityId(BigDecimal identityId) {
    this.identityId = identityId;
    return this;
  }

  /**
   * identity id
   * @return identityId
  */
  @Valid 
  @Schema(name = "identityId", example = "100", description = "identity id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getIdentityId() {
    return identityId;
  }

  public void setIdentityId(BigDecimal identityId) {
    this.identityId = identityId;
  }

  public IdentityBean docCentent(String docCentent) {
    this.docCentent = docCentent;
    return this;
  }

  /**
   * document in byte array
   * @return docCentent
  */
  
  @Schema(name = "docCentent", example = "/9j/4AAQSkZJRgABAQEASABIAAD/2wBDAAYEBQYFBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBcUFhYaHSUfGhsjHBYWICwgIyYnKSopGR8tMC0oMCUoKSj/2wBDAQcHBwoIChMKChMoGhYa", description = "document in byte array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDocCentent() {
    return docCentent;
  }

  public void setDocCentent(String docCentent) {
    this.docCentent = docCentent;
  }

  public IdentityBean contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * type of document
   * @return contentType
  */
  
  @Schema(name = "contentType", example = "PDF", description = "type of document", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public IdentityBean name(String name) {
    this.name = name;
    return this;
  }

  /**
   * name of document
   * @return name
  */
  
  @Schema(name = "name", example = "Birth Certificate", description = "name of document", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityBean identityBean = (IdentityBean) o;
    return Objects.equals(this.identityId, identityBean.identityId) &&
        Objects.equals(this.docCentent, identityBean.docCentent) &&
        Objects.equals(this.contentType, identityBean.contentType) &&
        Objects.equals(this.name, identityBean.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityId, docCentent, contentType, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityBean {\n");
    sb.append("    identityId: ").append(toIndentedString(identityId)).append("\n");
    sb.append("    docCentent: ").append(toIndentedString(docCentent)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

