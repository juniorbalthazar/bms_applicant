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
 * The persistent class for the "BMS_ACCOUNTS" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_tx_process")
public class BmsTxProcess  implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bms_tx_process_seq_generator")
	//@SequenceGenerator(name="bms_tx_process_seq_generator", sequenceName = "BMS_TX_PROCESS_SEQ",initialValue = 2, allocationSize=1)
	@Column(name="id")
	private BigDecimal Id;

//	@ManyToOne
//	@JoinColumn(name="txid")
//	private BmsTx bmsTx;
		
	@Column(name="txid")
	private BigDecimal txid;

	@Column(name="start_date")
	private Date startDate;
	

	@Column(name="end_date")
	private Date endDate;

	@ManyToOne
	@JoinColumn(name="user_id")
	private BmsUser bmsUser;
	
	@Column(name="status")
	private BigDecimal status;
	
	@Column(name="is_emprunt")
	private BigDecimal isEmprunt;
	
	@Column(name="user_emprunt")
	private BigDecimal userEmprunt;
	
	@Column(name="emprunt_number")
	private String empruntNumber;
	
	@Column(name="is_verify_identity")
	private BigDecimal isVerifyIdentity;
	
	@Column(name="user_verify_identity")
	private BigDecimal userVerifyIdentity;
	
	@Column(name="is_analyst")
	private BigDecimal isAnalyst;
	
	@Column(name="user_analyst")
	private BigDecimal userAnalyst;
	
	@Temporal(TemporalType.DATE)
	@Column(name="analyst_date")
	private Date analystDate;
	
	@Column(name="is_approuved")
	private BigDecimal isApprouved;
	
	@Column(name="user_approuved")
	private BigDecimal userApprouved;
	
	@Temporal(TemporalType.DATE)
	@Column(name="emprunt_date")
	private Date empruntDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="emprunt_update_date")
	private Date empruntUpdateDate;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="verify_identity_date")
	private Date verifyIdentityDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="approuved_date")
	private Date approuvedDate;
	
	@Column(name="is_reject")
	private BigDecimal isReject;
	
	@Column(name="user_reject")
	private BigDecimal userReject;
	
	@Temporal(TemporalType.DATE)
	@Column(name="reject_date")
	private Date rejectDate;
	
	@Column(name="raison_reject")
	private String raisonReject;
	
	@Column(name="is_fichier_central")
	private BigDecimal isFichierCentral;
	
	@Column(name="user_fichier_central")
	private BigDecimal userFichierCentral;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fichier_central_date")
	private Date fichierCentralDate;
	
	@Column(name="is_interpol")
	private BigDecimal isInterpol;
	
	@Column(name="user_interpol")
	private BigDecimal userInterpol;
	
	@Temporal(TemporalType.DATE)
	@Column(name="interpol_date")
	private Date interpolDate;
	
	@Column(name="is_verification_brj")
	private BigDecimal isVerificationBrj;
	
	@Column(name="user_verification_brj")
	private BigDecimal userVerificationBrj;
	
	@Temporal(TemporalType.DATE)
	@Column(name="verification_brj_date")
	private Date verificationBrjDate;

	@Column(name="approuved_by_assign_id")
	private BigDecimal approuvedByAssignId;
	
	@Column(name="reject_by_assign_id")
	private BigDecimal rejectByAssignId;
	
	@Column(name="FINGER_1")
	private String finger1;
	
	@Column(name="FINGER_2")
	private String finger2;
	
	@Column(name="FINGER_3")
	private String finger3;
	
	@Column(name="FINGER_4")
	private String finger4;
	
	@Column(name="FINGER_5")
	private String finger5;
	
	@Column(name="FINGER_6")
	private String finger6;
	
	@Column(name="FINGER_7")
	private String finger7;
	
	@Column(name="FINGER_8")
	private String finger8;
	
	@Column(name="FINGER_9")
	private String finger9;
	
	@Column(name="FINGER_10")
	private String finger10;
	
	@Column(name="emprunt_comment")
	private String comment_emprunt;
	
	@Column(name="identity_comment")
	private String comment_identity;
	
	@Column(name="fichier_central_comment")
	private String comment_fichier_central;
	
	@Column(name="analyst_comment")
	private String comment_analyst;
	
	@Column(name="interpol_comment")
	private String comment_interpol;
	
	@Column(name="brj_comment")
	private String comment_brj;
	
	@Column(name="approuved_comment")
	private String comment_approuved;
	
	//
	
	@Column(name="START_DATE_STR")
	private String startDateStr;
	
	@Column(name="END_DATE_STR")
	private String endDateStr;
	

	@Column(name="EMPRUNT_DATE_STR")
	private String empruntDateStr;
	
	@Column(name="VERIFY_IDENTITY_DATE_STR")
	private String verifyIdentityDateStr;
	
	@Column(name="ANALYST_DATE_STR")
	private String analystDateStr;
	
	@Column(name="APPROUVED_DATE_STR")	
	private String approuvedDateStr;
	
	@Column(name="REJECT_DATE_STR")	
	private String rejectDateStr;
	
	@Column(name="FICHIER_CENTRAL_DATE_STR")	
	private String fichierCentralDateStr;
	
	@Column(name="INTERPOL_DATE_STR")
	private String interpolDateStr;
	
	@Column(name="VERIFICATION_BRJ_DATE_STR")
	private String verificationBrjDateStr;
	
	@Column(name="EMPRUNT_UPDATE_DATE_STR")
	private String empruntUpdateDateStr;
	

}
