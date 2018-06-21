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

@Entity
@Table(name="invoice")
public class Invoice {

	 	@Id
	    @GeneratedValue
	    private int id;
	 	@ManyToOne
	    //private List<Company> company;
	 	
	 	private Date createdOn;
	 	private Long invoiceDescription;
	 	
	 	//@OneToMany(mappedBy="invoice", cascade=CascadeType.ALL
	 	private int lineItems;
	 	
	 	public Invoice(Date createdOn, Long invoiceDescription, int lineItems) {
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

		public Long getInvoiceDescription() {
			return invoiceDescription;
		}

		public void setInvoiceDescription(Long invoiceDescription) {
			this.invoiceDescription = invoiceDescription;
		}

		public int getLineItems() {
			return lineItems;
		}

		public void setLineItems(int lineItems) {
			this.lineItems = lineItems;
		}
	    
	
}
