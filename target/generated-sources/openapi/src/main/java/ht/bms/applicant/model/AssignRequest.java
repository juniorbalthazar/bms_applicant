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
 * AssignRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class AssignRequest implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("institutionId")
  private BigDecimal institutionId;

  @JsonProperty("userId")
  private BigDecimal userId;

  @JsonProperty("assignId")
  private BigDecimal assignId;

  @JsonProperty("initial")
  private String initial;

  @JsonProperty("document")
  private String document;

  @JsonProperty("documentType")
  private String documentType;

  @JsonProperty("fullName")
  private String fullName;

  @JsonProperty("assignName")
  private String assignName;

  @JsonProperty("pinNumber")
  private String pinNumber;

  @JsonProperty("pinNumberConfirm")
  private String pinNumberConfirm;

  @JsonProperty("poste")
  private String poste;

  @JsonProperty("responsabilite")
  private String responsabilite;

  public AssignRequest institutionId(BigDecimal institutionId) {
    this.institutionId = institutionId;
    return this;
  }

  /**
   * institution id
   * @return institutionId
  */
  @Valid 
  @Schema(name = "institutionId", example = "100", description = "institution id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getInstitutionId() {
    return institutionId;
  }

  public void setInstitutionId(BigDecimal institutionId) {
    this.institutionId = institutionId;
  }

  public AssignRequest userId(BigDecimal userId) {
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

  public AssignRequest assignId(BigDecimal assignId) {
    this.assignId = assignId;
    return this;
  }

  /**
   * assign id
   * @return assignId
  */
  @Valid 
  @Schema(name = "assignId", example = "100", description = "assign id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getAssignId() {
    return assignId;
  }

  public void setAssignId(BigDecimal assignId) {
    this.assignId = assignId;
  }

  public AssignRequest initial(String initial) {
    this.initial = initial;
    return this;
  }

  /**
   * initial
   * @return initial
  */
  
  @Schema(name = "initial", example = "JD", description = "initial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getInitial() {
    return initial;
  }

  public void setInitial(String initial) {
    this.initial = initial;
  }

  public AssignRequest document(String document) {
    this.document = document;
    return this;
  }

  /**
   * document in byte array
   * @return document
  */
  
  @Schema(name = "document", example = "/9j/4AAQSkZJRgABAQEASABIAAD/2wBDAAYEBQYFBAYGBQYHBwYIChAKCgkJChQODwwQFxQYGBcUFhYaHSUfGhsjHBYWICwgIyYnKSopGR8tMC0oMCUoKSj/2wBDAQcHBwoIChMKChMoGhYa", description = "document in byte array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public AssignRequest documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * document type
   * @return documentType
  */
  
  @Schema(name = "documentType", example = "PDF", description = "document type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public AssignRequest fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * full name
   * @return fullName
  */
  
  @Schema(name = "fullName", example = "john doe", description = "full name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public AssignRequest assignName(String assignName) {
    this.assignName = assignName;
    return this;
  }

  /**
   * assign name
   * @return assignName
  */
  
  @Schema(name = "assignName", example = "john doe", description = "assign name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getAssignName() {
    return assignName;
  }

  public void setAssignName(String assignName) {
    this.assignName = assignName;
  }

  public AssignRequest pinNumber(String pinNumber) {
    this.pinNumber = pinNumber;
    return this;
  }

  /**
   * pin number
   * @return pinNumber
  */
  
  @Schema(name = "pinNumber", example = "PIN987654321", description = "pin number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPinNumber() {
    return pinNumber;
  }

  public void setPinNumber(String pinNumber) {
    this.pinNumber = pinNumber;
  }

  public AssignRequest pinNumberConfirm(String pinNumberConfirm) {
    this.pinNumberConfirm = pinNumberConfirm;
    return this;
  }

  /**
   * pin number confirm
   * @return pinNumberConfirm
  */
  
  @Schema(name = "pinNumberConfirm", example = "PIN987654321", description = "pin number confirm", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPinNumberConfirm() {
    return pinNumberConfirm;
  }

  public void setPinNumberConfirm(String pinNumberConfirm) {
    this.pinNumberConfirm = pinNumberConfirm;
  }

  public AssignRequest poste(String poste) {
    this.poste = poste;
    return this;
  }

  /**
   * poste of assign
   * @return poste
  */
  
  @Schema(name = "poste", example = "Manager", description = "poste of assign", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getPoste() {
    return poste;
  }

  public void setPoste(String poste) {
    this.poste = poste;
  }

  public AssignRequest responsabilite(String responsabilite) {
    this.responsabilite = responsabilite;
    return this;
  }

  /**
   * responsabilite of assign
   * @return responsabilite
  */
  
  @Schema(name = "responsabilite", example = "Admin", description = "responsabilite of assign", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getResponsabilite() {
    return responsabilite;
  }

  public void setResponsabilite(String responsabilite) {
    this.responsabilite = responsabilite;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignRequest assignRequest = (AssignRequest) o;
    return Objects.equals(this.institutionId, assignRequest.institutionId) &&
        Objects.equals(this.userId, assignRequest.userId) &&
        Objects.equals(this.assignId, assignRequest.assignId) &&
        Objects.equals(this.initial, assignRequest.initial) &&
        Objects.equals(this.document, assignRequest.document) &&
        Objects.equals(this.documentType, assignRequest.documentType) &&
        Objects.equals(this.fullName, assignRequest.fullName) &&
        Objects.equals(this.assignName, assignRequest.assignName) &&
        Objects.equals(this.pinNumber, assignRequest.pinNumber) &&
        Objects.equals(this.pinNumberConfirm, assignRequest.pinNumberConfirm) &&
        Objects.equals(this.poste, assignRequest.poste) &&
        Objects.equals(this.responsabilite, assignRequest.responsabilite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institutionId, userId, assignId, initial, document, documentType, fullName, assignName, pinNumber, pinNumberConfirm, poste, responsabilite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignRequest {\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    assignId: ").append(toIndentedString(assignId)).append("\n");
    sb.append("    initial: ").append(toIndentedString(initial)).append("\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    assignName: ").append(toIndentedString(assignName)).append("\n");
    sb.append("    pinNumber: ").append(toIndentedString(pinNumber)).append("\n");
    sb.append("    pinNumberConfirm: ").append(toIndentedString(pinNumberConfirm)).append("\n");
    sb.append("    poste: ").append(toIndentedString(poste)).append("\n");
    sb.append("    responsabilite: ").append(toIndentedString(responsabilite)).append("\n");
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

