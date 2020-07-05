package com.piggymetrics.account.domain.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
@Table(name = "account")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

	@Id
	private String name;

	@Column(name = "last_seen")
	private Date lastSeen;

	@Valid
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Item> incomes;

	@Valid
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Item> expenses;

	@Valid
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	private Saving saving;

	@Length(max = 20_000)
	private String note;
}
