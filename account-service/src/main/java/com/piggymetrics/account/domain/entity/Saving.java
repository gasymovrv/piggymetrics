package com.piggymetrics.account.domain.entity;

import com.piggymetrics.account.domain.enums.Currency;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "saving")
public class Saving {
	@Id
	@SequenceGenerator(name = "saving_seq", sequenceName = "saving_seq", initialValue = 1000)
	@GeneratedValue(generator = "saving_seq", strategy = GenerationType.SEQUENCE)
	private long id;

	@NotNull
	private BigDecimal amount;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Currency currency;

	@NotNull
	private BigDecimal interest;

	@NotNull
	private Boolean deposit;

	@NotNull
	private Boolean capitalization;
}
