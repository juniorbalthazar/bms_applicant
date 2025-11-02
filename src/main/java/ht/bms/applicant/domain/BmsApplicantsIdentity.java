package ht.bms.applicant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the "BMS_APPLICANTS_IDENTITY" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_applicants_identity")
@NamedQuery(name="BmsApplicantsIdentity.findAll", query="SELECT b FROM BmsApplicantsIdentity b")
public class BmsApplicantsIdentity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "identities_seq_generator")
	@SequenceGenerator(name="identities_seq_generator", sequenceName = "IDENTITIES_SEQ",initialValue = 2, allocationSize=1)
	@Column(name="identity_id")
	private BigDecimal identityId;

	@Column(name="applicant_id")
	private BigDecimal applicantId;

	@Column(name="doc_content")
	private byte[] docCentent;

	@Column(name="doc_content_type")
	private String docCententType;

	@Column(name="doc_type")
	private String docType;

}