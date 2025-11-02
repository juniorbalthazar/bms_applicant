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
 * The persistent class for the "BMS_APPLICANTS_PROFESSIONAL" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_applicants_professional")
@NamedQuery(name="BmsApplicantsProfessional.findAll", query="SELECT b FROM BmsApplicantsProfessional b")
public class BmsApplicantsProfessional implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="applicant_id")
	private BigDecimal applicantId;

	@Column(name="conjoint_full_name")
	private String conjointFullName;

	@Column(name="created_by")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="maritial_status")
	private String maritialStatus;
	
	@Column(name="young_girl_name")
	private String youngGirlname;
	

	@Column(name="mobile_phone")
	private String mobilePhone;

	@Column(name="ms_poids")
	private String msPoids;

	@Column(name="ms_taille")
	private String msTaille;

	private String occupation;

	private String profession;

	@Column(name="street_address")
	private String streetAddress;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;

}