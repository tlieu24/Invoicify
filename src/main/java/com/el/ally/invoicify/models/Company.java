package com.el.ally.invoicify.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Company {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(length = 75, nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "company")
	private List<Invoice> invoices

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}
	
	
}
