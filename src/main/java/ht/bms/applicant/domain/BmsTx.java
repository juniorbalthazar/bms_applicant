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
 * The persistent class for the "BMS_TX" database table.
 * isCurrent 0=true   1=false  as true false
 * 
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bms_tx")
@NamedQuery(name="BmsTx.findAll", query="SELECT b FROM BmsTx b")
public class BmsTx implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tx_id")
	private BigDecimal txId;


	@Temporal(TemporalType.DATE)
	@Column(name="check_in")
	private Date checkIn;

	@Temporal(TemporalType.DATE)
	@Column(name="check_out")
	private Date checkOut;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;
	
	@Temporal(TemporalType.DATE)
	@Column(name="certificat_expired_date")
	private Date certificatExpiredDate;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name="certificat_date")
	private Date certificatDate;

	private String note;

	@Column(name="tx_code")
	private String txCode;
	
	
	@Column(name="is_current")
	private BigDecimal isCurrent;


	@Temporal(TemporalType.DATE)
	@Column(name="updated_date")
	private Date updatedDate;

	private BigDecimal cretedBy;
	
	private BigDecimal updatedBy;

	private BigDecimal applicant_id;

	private BigDecimal tx_date;

    @Column(name="user_tranction")
    private BigDecimal user_transaction;

    @Column(name="office_id")
	private BigDecimal officeId;

    @Column(name="office_id")
	private BigDecimal serviceId;

    @Column(name="institution_id")
    private BigDecimal institutionId;

	//bi-directional many-to-one association to BmsTxStatus
	@ManyToOne
	@JoinColumn(name="tx_status")
	private BmsTxStatus bmsTxStatus;

	//bi-directional many-to-one association to BmsTxType
	@ManyToOne
	@JoinColumn(name="tx_type")
	private BmsTxType bmsTxType;

	//bi-directional many-to-one association to BmsTxType
	@ManyToOne
	@JoinColumn(name="TX_PROCESS_ID")
	private BmsTxProcess bmsTxProcess;
	

}