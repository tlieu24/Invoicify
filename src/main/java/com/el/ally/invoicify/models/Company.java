package com.el.ally.invoicify.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="company")
public class Company {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(length = 75, nullable = false)
	private String name;
	
	@JsonManagedReference(value ="secondParent")
	@OneToMany(mappedBy = "company")
	private List<Invoice> invoices;

	//constructors
	public Company() {	
	}
	public Company(String name) {
		this.name = name;
	}
	
	//getters and setters
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
