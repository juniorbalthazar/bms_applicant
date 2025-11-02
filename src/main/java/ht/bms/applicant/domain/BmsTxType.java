package ht.bms.applicant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the "BMS_TX_TYPE" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_tx_type")
@NamedQuery(name="BmsTxType.findAll", query="SELECT b FROM BmsTxType b")
public class BmsTxType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private BigDecimal id;

	private String name;
	
	private String description;
	
	@Column(name="status_id")
	private BigDecimal statusId;


}