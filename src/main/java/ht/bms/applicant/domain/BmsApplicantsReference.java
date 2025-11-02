package ht.bms.applicant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the "BMS_APPLICANTS_REFERENCES" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_applicants_references")
@NamedQuery(name="BmsApplicantsReference.findAll", query="SELECT b FROM BmsApplicantsReference b")
public class BmsApplicantsReference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "references_seq_generator")
	@SequenceGenerator(name="references_seq_generator", sequenceName = "REFERENCES_SEQ",initialValue = 2, allocationSize=1)
	@Column(name="references_id")
	private BigDecimal referencesId;

	@Column(name="applicant_id")
	private BigDecimal applicantId;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	private String nin;

	private String phone;

	@Column(name="street_addres")
	private String streetAddres;
	
	@Column(name="email")
	private String email;

}