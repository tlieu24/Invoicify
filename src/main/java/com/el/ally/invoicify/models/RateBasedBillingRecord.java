package com.el.ally.invoicify.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rate_based_billing_record")
public class RateBasedBillingRecord extends BillingRecord {

	private double rate;
	private int quantity;
	
	public RateBasedBillingRecord() {}

	@Override
	public double getTotal(double rate, double quantity) {
		return super.getTotal(rate, quantity);
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
