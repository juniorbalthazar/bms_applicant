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
 * ServiceBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-05T16:13:48.142050300-05:00[America/New_York]")
public class ServiceBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("osId")
  private BigDecimal osId;

  @JsonProperty("isServiceAvailable")
  private Boolean isServiceAvailable;

  @JsonProperty("serviceFullName")
  private String serviceFullName;

  @JsonProperty("serviceShortName")
  private String serviceShortName;

  public ServiceBean osId(BigDecimal osId) {
    this.osId = osId;
    return this;
  }

  /**
   * service id
   * @return osId
  */
  @Valid 
  @Schema(name = "osId", example = "100", description = "service id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getOsId() {
    return osId;
  }

  public void setOsId(BigDecimal osId) {
    this.osId = osId;
  }

  public ServiceBean isServiceAvailable(Boolean isServiceAvailable) {
    this.isServiceAvailable = isServiceAvailable;
    return this;
  }

  /**
   * is service available
   * @return isServiceAvailable
  */
  
  @Schema(name = "isServiceAvailable", example = "true", description = "is service available", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public Boolean getIsServiceAvailable() {
    return isServiceAvailable;
  }

  public void setIsServiceAvailable(Boolean isServiceAvailable) {
    this.isServiceAvailable = isServiceAvailable;
  }

  public ServiceBean serviceFullName(String serviceFullName) {
    this.serviceFullName = serviceFullName;
    return this;
  }

  /**
   * full name of service
   * @return serviceFullName
  */
  
  @Schema(name = "serviceFullName", example = "Service de l'Etat Civil", description = "full name of service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getServiceFullName() {
    return serviceFullName;
  }

  public void setServiceFullName(String serviceFullName) {
    this.serviceFullName = serviceFullName;
  }

  public ServiceBean serviceShortName(String serviceShortName) {
    this.serviceShortName = serviceShortName;
    return this;
  }

  /**
   * short name of service
   * @return serviceShortName
  */
  
  @Schema(name = "serviceShortName", example = "SEC", description = "short name of service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getServiceShortName() {
    return serviceShortName;
  }

  public void setServiceShortName(String serviceShortName) {
    this.serviceShortName = serviceShortName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceBean serviceBean = (ServiceBean) o;
    return Objects.equals(this.osId, serviceBean.osId) &&
        Objects.equals(this.isServiceAvailable, serviceBean.isServiceAvailable) &&
        Objects.equals(this.serviceFullName, serviceBean.serviceFullName) &&
        Objects.equals(this.serviceShortName, serviceBean.serviceShortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(osId, isServiceAvailable, serviceFullName, serviceShortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBean {\n");
    sb.append("    osId: ").append(toIndentedString(osId)).append("\n");
    sb.append("    isServiceAvailable: ").append(toIndentedString(isServiceAvailable)).append("\n");
    sb.append("    serviceFullName: ").append(toIndentedString(serviceFullName)).append("\n");
    sb.append("    serviceShortName: ").append(toIndentedString(serviceShortName)).append("\n");
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

