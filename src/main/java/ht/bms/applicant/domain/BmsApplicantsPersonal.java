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
 * The persistent class for the "BMS_APPLICANTS_PESONNAL" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_applicants_personnal")
@NamedQuery(name="BmsApplicantsPesonnal.findAll", query="SELECT b FROM BmsApplicantsPersonal b")
public class BmsApplicantsPersonal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="applicant_id")
	private BigDecimal applicantId;

	@Column(name="already_arrest_deport")
	private String alreadyArrestDeport;

	@Column(name="birth_of_place")
	private String birthOfPlace;

	@Column(name="create_by")
	private BigDecimal createBy;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="date_of_birth")
	private String dateOfBirth;

	@Column(name="father_full_name")
	private String fatherFullName;

	@Column(name="first_name")
	private String firstName;
	
	@Column(name="is_already_arrest_dport")
	private String isAlreadyArrestDeport;

	@Column(name="last_name")
	private String lastName;

	@Column(name="mother_full_name")
	private String motherFulName;

	@Column(name="motif_demande")
	private String motifDemande;
	
	@Column(name="motif_demande_id")
	private BigDecimal motifDemandeId;

	@Column(name="nif")
	private String nif;

	@Column(name="nin")
	private String nin;
	
	@Column(name="email")
	private String email;

	@Column(name="mobile_phone")
	private String mobilePhone;

	@Temporal(TemporalType.DATE)
	@Column(name="update_date")
	private Date updateDate;
	
	@Column(name="ms_poids")
	private String msPoids;

	@Column(name="ms_taille")
	private String msTaille;
	
	@Column(name="conjoint_full_name")
	private String conjointFullName;

	@Column(name="maritial_status")
	private String maritialStatus;
	
	@Column(name="young_girl_name")
	private String youngGirlname;
	
	@Column(name="gender")
	private String gender;

	@Column(name="id_dept_address")
	private BigDecimal idDeptAdress;

	@Column(name="id_commune_address")
	private BigDecimal idCommuneAdress;

	@Column(name="detail_address")
	private String detailsAdress;
	
	@Column(name="nationalite")
	private BigDecimal nationalite;

	@Column(name="passport")
	private String passport;
	
	@Column(name="BODY_COLOR")
	private String bodyColor;
	
	@Column(name="EYES")
	private String eyes;
	
	@Column(name="HAIRS")
	private String hairs;

    @Column(name="isCitizen")
    private boolean isCitizen;
}