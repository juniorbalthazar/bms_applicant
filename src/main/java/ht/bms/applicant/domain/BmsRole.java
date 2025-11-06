package ht.bms.applicant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the "BMS_ROLES" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_roles")
@NamedQuery(name="BmsRole.findAll", query="SELECT b FROM BmsRole b")
public class BmsRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_seq_generator")
	@SequenceGenerator(name="account_seq_generator", sequenceName = "ROLE_SEQ",initialValue = 2, allocationSize=1)
	@Column(name="role_id")
	private BigDecimal roleId;

	@Column(name="role_name")
	private String roleName;


}