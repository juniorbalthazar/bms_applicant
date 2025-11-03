package ht.bms.booking.model;

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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-11-02T20:31:22.046054300-05:00[America/New_York]")
public class ServiceBean implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("serviceId")
  private BigDecimal serviceId;

  @JsonProperty("fullName")
  private String fullName;

  @JsonProperty("isAvailable")
  private BigDecimal isAvailable;

  @JsonProperty("shortName")
  private String shortName;

  public ServiceBean serviceId(BigDecimal serviceId) {
    this.serviceId = serviceId;
    return this;
  }

  /**
   * service id
   * @return serviceId
  */
  @Valid 
  @Schema(name = "serviceId", example = "100", description = "service id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getServiceId() {
    return serviceId;
  }

  public void setServiceId(BigDecimal serviceId) {
    this.serviceId = serviceId;
  }

  public ServiceBean fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * full name of service
   * @return fullName
  */
  
  @Schema(name = "fullName", example = "BRJ / Identity", description = "full name of service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public ServiceBean isAvailable(BigDecimal isAvailable) {
    this.isAvailable = isAvailable;
    return this;
  }

  /**
   * 0 is equal to false and 1 is equal to true
   * @return isAvailable
  */
  @Valid 
  @Schema(name = "isAvailable", example = "0", description = "0 is equal to false and 1 is equal to true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public BigDecimal getIsAvailable() {
    return isAvailable;
  }

  public void setIsAvailable(BigDecimal isAvailable) {
    this.isAvailable = isAvailable;
  }

  public ServiceBean shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  /**
   * short name of service
   * @return shortName
  */
  
  @Schema(name = "shortName", example = "BRJ", description = "short name of service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
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
    return Objects.equals(this.serviceId, serviceBean.serviceId) &&
        Objects.equals(this.fullName, serviceBean.fullName) &&
        Objects.equals(this.isAvailable, serviceBean.isAvailable) &&
        Objects.equals(this.shortName, serviceBean.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, fullName, isAvailable, shortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceBean {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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

