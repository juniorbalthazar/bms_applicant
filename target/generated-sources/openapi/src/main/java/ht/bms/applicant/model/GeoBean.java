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
 * GeoBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class GeoBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("departementId")
  private BigDecimal departementId;

  @JsonProperty("nameDepartement")
  private String nameDepartement;

  @JsonProperty("communesId")
  private BigDecimal communesId;

  @JsonProperty("nameCommunes")
  private String nameCommunes;

  public GeoBean departementId(BigDecimal departementId) {
    this.departementId = departementId;
    return this;
  }

  /**
   * applicant id
   * @return departementId
  */
  @Valid 
  @Schema(name = "departementId", example = "100", description = "applicant id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getDepartementId() {
    return departementId;
  }

  public void setDepartementId(BigDecimal departementId) {
    this.departementId = departementId;
  }

  public GeoBean nameDepartement(String nameDepartement) {
    this.nameDepartement = nameDepartement;
    return this;
  }

  /**
   * name of departement
   * @return nameDepartement
  */
  
  @Schema(name = "nameDepartement", example = "Ouest", description = "name of departement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNameDepartement() {
    return nameDepartement;
  }

  public void setNameDepartement(String nameDepartement) {
    this.nameDepartement = nameDepartement;
  }

  public GeoBean communesId(BigDecimal communesId) {
    this.communesId = communesId;
    return this;
  }

  /**
   * communes id
   * @return communesId
  */
  @Valid 
  @Schema(name = "communesId", example = "100", description = "communes id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getCommunesId() {
    return communesId;
  }

  public void setCommunesId(BigDecimal communesId) {
    this.communesId = communesId;
  }

  public GeoBean nameCommunes(String nameCommunes) {
    this.nameCommunes = nameCommunes;
    return this;
  }

  /**
   * name of communes
   * @return nameCommunes
  */
  
  @Schema(name = "nameCommunes", example = "Port-au-Prince", description = "name of communes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getNameCommunes() {
    return nameCommunes;
  }

  public void setNameCommunes(String nameCommunes) {
    this.nameCommunes = nameCommunes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoBean geoBean = (GeoBean) o;
    return Objects.equals(this.departementId, geoBean.departementId) &&
        Objects.equals(this.nameDepartement, geoBean.nameDepartement) &&
        Objects.equals(this.communesId, geoBean.communesId) &&
        Objects.equals(this.nameCommunes, geoBean.nameCommunes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departementId, nameDepartement, communesId, nameCommunes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoBean {\n");
    sb.append("    departementId: ").append(toIndentedString(departementId)).append("\n");
    sb.append("    nameDepartement: ").append(toIndentedString(nameDepartement)).append("\n");
    sb.append("    communesId: ").append(toIndentedString(communesId)).append("\n");
    sb.append("    nameCommunes: ").append(toIndentedString(nameCommunes)).append("\n");
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

