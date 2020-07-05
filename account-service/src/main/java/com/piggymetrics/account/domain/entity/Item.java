package com.piggymetrics.account.domain.entity;

import com.piggymetrics.account.domain.enums.Currency;
import com.piggymetrics.account.domain.enums.TimePeriod;
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
import org.hibernate.validator.constraints.Length;

@Data
@Entity
@Table(name = "item")
public class Item {
	@Id
	@SequenceGenerator(name = "item_seq", sequenceName = "item_seq", initialValue = 1000)
	@GeneratedValue(generator = "item_seq", strategy = GenerationType.SEQUENCE)
	private long id;

	@NotNull
	@Length(min = 1, max = 20)
	private String title;

	@NotNull
	private BigDecimal amount;

	@NotNull
	@Enumerated(EnumType.STRING)
	private Currency currency;

	@NotNull
	@Enumerated(EnumType.STRING)
	private TimePeriod period;

	@NotNull
	private String icon;
}
