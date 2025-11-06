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
@Table(name="bms_accounts")
@NamedQuery(name="BmsAccount.findAll", query="SELECT b FROM BmsAccount b")
public class BmsAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq_generator")
	//@SequenceGenerator(name="account_seq_generator", sequenceName = "ACCOUNT_SEQ",initialValue = 2, allocationSize=1)
	@Column(name="account_id")
	private BigDecimal accountId;


	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	private String email;

	private String tel;

	private BigDecimal enabled;

	private String password;
	
	private String raison;
	
	@Column(name="username")
	private String userName;

	@Temporal(TemporalType.DATE)
	@Column(name="updated_date")
	private Date updatedDate;

	//bi-directional many-to-one association to BmsRole
	@ManyToOne
	@JoinColumn(name="roles_id")
	private BmsRole bmsRole;


	//bi-directional many-to-one association to BmsUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private BmsUser bmsUser;
	
	@Column(name="assign_id")
	private BigDecimal assignId;



}