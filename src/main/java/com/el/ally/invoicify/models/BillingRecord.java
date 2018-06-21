package com.el.ally.invoicify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="billing_record")
public abstract class BillingRecord {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false)
	private Date createdOn;
	
	@Size(max=1000)
	@Column(nullable = false)
	private String description;
	
	@Size(max=1000)
	@Column(nullable = false)
	@OneToMany(mappedBy="billing_record")
	private String lineItem;
	
	@Size(max=75)
	@Column(nullable = false)
	@ManyToOne
	private String company;
	
	public BillingRecord() {}
	
	public double getTotal(double amount) {
		return amount;
	}
	
	public double getTotal(double rate, double quantity) {
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

	public String getLineItem() {
		return lineItem;
	}

	public void setLineItem(String lineItem) {
		this.lineItem = lineItem;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
