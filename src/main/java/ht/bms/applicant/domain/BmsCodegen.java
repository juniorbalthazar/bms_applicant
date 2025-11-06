package ht.bms.applicant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


/**
 * The persistent class for the "BMS_CODEGEN" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_codegen")
@NamedQuery(name="BmsCodegen.findAll", query="SELECT b FROM BmsCodegen b")
public class BmsCodegen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	@Temporal(TemporalType.DATE)
	private Date createddate;

}