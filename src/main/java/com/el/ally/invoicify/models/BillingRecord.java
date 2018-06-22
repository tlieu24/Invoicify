package com.el.ally.invoicify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="billingRecord")
public abstract class BillingRecord {

	@Id
	@GeneratedValue
	private int id;
	
	private Date createdOn;
	
	@Size(max=1000)
	private String description;
	
	@Size(max=1000)
	@JsonManagedReference
	@OneToOne(mappedBy="billingRecord")
	private InvoiceLineItem lineItem;
	

	@JsonBackReference(value ="secondParent")
	@ManyToOne
	private Company company;
	
	public BillingRecord() {}
	
	public BillingRecord(Date createdOn, String description, InvoiceLineItem lineItem, Company company) {
		this.createdOn = createdOn;
		this.description = description;
		this.lineItem = lineItem;
		this.company = company;
	}
	
	public int getTotal(int amount) {
		return amount;
	}
	
	public int getTotal(int rate, int quantity) {
		return rate * quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public InvoiceLineItem getLineItem() {
		return lineItem;
	}

	public void setLineItem(InvoiceLineItem lineItem) {
		this.lineItem = lineItem;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
}
