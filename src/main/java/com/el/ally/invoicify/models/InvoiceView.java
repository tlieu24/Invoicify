package com.el.ally.invoicify.models;

public class InvoiceView {
	private String invoiceDescription;
	Long recordIds[];
	
	public String getInvoiceDescription() {
		return invoiceDescription;
	}
	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
	}
	public Long[] getRecordIds() {
		return recordIds;
	}
	public void setRecordIds(Long[] recordIds) {
		this.recordIds = recordIds;
	}

}
