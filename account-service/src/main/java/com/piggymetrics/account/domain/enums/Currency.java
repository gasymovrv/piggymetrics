package com.piggymetrics.account.domain.enums;

public enum Currency {

	USD, EUR, RUB;

	public static Currency getDefault() {
		return USD;
	}
}
