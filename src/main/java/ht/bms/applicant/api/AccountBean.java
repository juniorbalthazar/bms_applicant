package ht.bms.applicant.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountBean implements Serializable {

    private String username;
    private BigDecimal userId;
    private BigDecimal institutionId;
    private BigDecimal officeId;

}
