package ht.bms.applicant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the "BMS_APPLICANTS" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_applicant")
@NamedQuery(name="BmsApplicant.findAll", query="SELECT b FROM BmsApplicant b")
public class BmsApplicant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "applicant_seq_generator")
//	@SequenceGenerator(name="applicant_seq_generator", sequenceName = "APPLICANT_SEQ",initialValue = 2, allocationSize=1)
	@Column(name="applicant_id")
	private BigDecimal applicantId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;


	@Column(name="is_citizen")
	private boolean isCitizen;

	@Column(name="nationalite")
	private BigDecimal nationalite;

	@ManyToOne
	@JoinColumn(name="payment_id")
	private BmsApplicantsPayment payment;

	@ManyToOne
	@JoinColumn(name="personnal_id")
	private BmsApplicantsPersonal personal;

	@ManyToOne
	@JoinColumn(name="professionnal_id")
	private BmsApplicantsProfessional professionnal;

	@Column(name="user_id")
	private BigDecimal userId;

}