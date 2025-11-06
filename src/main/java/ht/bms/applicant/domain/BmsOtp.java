package ht.bms.applicant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_otp")
public class BmsOtp {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bms_gen_otp_seq_generator")
    @SequenceGenerator(name="bms_gen_otp_seq_generator", sequenceName = "BMS_GEN_OTP_SEQ",initialValue = 2, allocationSize=1)
    @Column(name="OTP_ID")
    private BigDecimal otpID ;


    @Column(name="CREATED_DATE")
    private LocalDateTime createdDate ;

    private String activated ;

    private  String tel ;

    private Integer otp ;

}
