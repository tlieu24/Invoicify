package com.el.ally.invoicify.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="invoice")
public class Invoice {

	 	@Id
	    @GeneratedValue
	    private int id;
	 	
	 	@JsonBackReference(value ="secondParent")
	 	@ManyToOne
	    private Company company;
	 	
	 	private Date createdOn;
	 	private String invoiceDescription;
	 	
	 	@JsonManagedReference(value="secondParent")
	 	@OneToMany(mappedBy="invoice")
	 	private List<InvoiceLineItem> lineItems;
	 	
	 	public Invoice(Date createdOn, String invoiceDescription, List<InvoiceLineItem> lineItems) {
	        this.createdOn = createdOn;
	        this.invoiceDescription = invoiceDescription;
	        this.lineItems = lineItems; 
	    }
	 	
	 	public Invoice() {
	       
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

		public String getInvoiceDescription() {
			return invoiceDescription;
		}

		public void setInvoiceDescription(String invoiceDescription) {
			this.invoiceDescription = invoiceDescription;
		}

		public List<InvoiceLineItem> getLineItems() {
			return lineItems;
		}

		public void setLineItems(List<InvoiceLineItem> lineItems) {
			this.lineItems = lineItems;
		}

		public Company getCompany() {
			return company;
		}

		public void setCompany(Company company) {
			this.company = company;
		}
		
		
	    
	
}
