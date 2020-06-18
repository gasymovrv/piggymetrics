package com.piggymetrics.account.domain;

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
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.validator.constraints.Length;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(Date lastSeen) {
		this.lastSeen = lastSeen;
	}

	public List<Item> getIncomes() {
		return incomes;
	}

	public void setIncomes(List<Item> incomes) {
		this.incomes = incomes;
	}

	public List<Item> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Item> expenses) {
		this.expenses = expenses;
	}

	public Saving getSaving() {
		return saving;
	}

	public void setSaving(Saving saving) {
		this.saving = saving;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
}
