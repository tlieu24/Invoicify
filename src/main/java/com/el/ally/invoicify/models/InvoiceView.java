package com.el.ally.invoicify.models;

public class InvoiceView {
	private String invoiceDescription;
	int recordIds[];
	
	public String getInvoiceDescription() {
		return invoiceDescription;
	}
	public void setInvoiceDescription(String invoiceDescription) {
		this.invoiceDescription = invoiceDescription;
	}
	public int[] getRecordIds() {
		return recordIds;
	}
	public void setRecordIds(int[] recordIds) {
		this.recordIds = recordIds;
	}

}
