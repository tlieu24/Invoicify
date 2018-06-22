package com.el.ally.invoicify.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="flat_fee_billing_record")
public class FlatFeeBillingRecord extends BillingRecord {

	private int amount;
	
	public FlatFeeBillingRecord() {}

	public FlatFeeBillingRecord(Date createdOn, String description, InvoiceLineItem lineItem, Company company, int amount) {
		super(createdOn, description, lineItem, company);
		this.amount = amount;
	}
	@Override
	public int getTotal(int amount) {
		return super.getTotal(amount);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	

}
