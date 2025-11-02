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
 * The persistent class for the "BMS_APPLICANTS_FINGERPRINT" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_applicants_fingerprint")
@NamedQuery(name="BmsApplicantsFingerprint.findAll", query="SELECT b FROM BmsApplicantsFingerprint b")
public class BmsApplicantsFingerprint implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "finger_print_seq_generator")
	@SequenceGenerator(name="finger_print_seq_generator", sequenceName = "FINGER_PRINT_SEQ",initialValue = 2, allocationSize=1)
	@Column(name="finger_print_id")
	private BigDecimal fingerPrintId;
	
	
	@Column(name="applicant_id")
	private BigDecimal applicantId;

	@Column(name="created_by")
	private BigDecimal createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="doc_content")
	private byte[] docContent;

	@Column(name="doc_content_type")
	private String docContentType;


}