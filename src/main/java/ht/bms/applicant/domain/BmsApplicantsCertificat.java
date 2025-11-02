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
 * The persistent class for the "BMS_APPLICANTS_CERTIFICAT" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_applicants_certificat")
@NamedQuery(name="BmsApplicantsCertificat.findAll", query="SELECT b FROM BmsApplicantsCertificat b")
public class BmsApplicantsCertificat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
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