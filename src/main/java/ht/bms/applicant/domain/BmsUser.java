package ht.bms.applicant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the "BMS_USERS" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_users")
@NamedQuery(name="BmsUser.findAll", query="SELECT b FROM BmsUser b")
public class BmsUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq_generator")
	@SequenceGenerator(name="users_seq_generator", sequenceName = "USERS_SEQ",initialValue = 2, allocationSize=1)	
	@Column(name="user_id")
	private BigDecimal userId;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createddate;

	@Column(name="first_name")
	private String firstName;

	private String gender;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	private String nin;
	
	private String nif;
	
	@Column(name="institution_id")
	private BigDecimal institutionId;
	

	@Column(name="nationalite")
	private BigDecimal nationalite;
	
	@Column(name="passport_number")
	private String passport;
	

	@Temporal(TemporalType.DATE)
	private Date upddated;

	@Column(name="office_id")
	private BigDecimal officeId;
	
	//bi-directional many-to-one association to BmsAccount
	@OneToMany(mappedBy="bmsUser")
	private List<BmsAccount> bmsAccounts;

}