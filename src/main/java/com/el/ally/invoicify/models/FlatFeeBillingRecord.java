package com.el.ally.invoicify.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="flat_fee_billing_record")
public class FlatFeeBillingRecord extends BillingRecord {

	private int amount;
	
	public FlatFeeBillingRecord() {}

	@Override
	public double getTotal(double amount) {
		return super.getTotal(amount);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
