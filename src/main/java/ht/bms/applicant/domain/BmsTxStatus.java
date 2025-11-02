package ht.bms.applicant.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * The persistent class for the "BMS_TX_STATUS" database table.
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_tx_status")
@NamedQuery(name="BmsTxStatus.findAll", query="SELECT b FROM BmsTxStatus b")
public class BmsTxStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="status_id")
	private BigDecimal statusId;

	private String description;

	@Column(name="status_name")
	private String statusName;


}