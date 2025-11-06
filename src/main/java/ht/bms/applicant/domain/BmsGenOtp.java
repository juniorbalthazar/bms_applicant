package ht.bms.applicant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the "BMS_USERS" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_gen_otp")
@NamedQuery(name="BmsGenOtp.findAll", query="SELECT b FROM BmsGenOtp b")
public class BmsGenOtp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
/*	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bms_gen_otp_seq_generator")
	@SequenceGenerator(name="bms_gen_otp_seq_generator", sequenceName = "BMS_GEN_OTP_SEQ",initialValue = 2, allocationSize=1)*/
	@Column(name="otp_code")
	private String optCode;
	
	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createddate;

	@Column(name="activeted_date")
	@Temporal(TemporalType.DATE)
	private Date activetedDate;

	//bi-directional many-to-one association to BmsOffice
	@ManyToOne
	@JoinColumn(name="user_id")
	private BmsUser bmsUser;


	
}