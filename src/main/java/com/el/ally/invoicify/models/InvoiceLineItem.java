package com.el.ally.invoicify.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="invoiceLineItem")
public class InvoiceLineItem {
	
	@Id
	@GeneratedValue
	private int id;
	
	@JsonBackReference
	@OneToOne
	private BillingRecord billingRecord;
	
	private Date createdOn;
	
	@JsonBackReference(value ="secondParent")
	@ManyToOne
	private Invoice invoice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public InvoiceLineItem() {
		
	}

	public InvoiceLineItem(BillingRecord billingRecord, Date date, Invoice invoice) {
		this.billingRecord = billingRecord;
		this.createdOn = date;
		this.invoice = invoice;
	}
	
	public BillingRecord getBillingRecord() {
		return billingRecord;
	}

	public void setBillingRecord(BillingRecord billingRecord) {
		this.billingRecord = billingRecord;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
}
