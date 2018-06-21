package com.el.ally.invoicify.controllers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.el.ally.invoicify.models.BillingRecord;
import com.el.ally.invoicify.models.Invoice;
import com.el.ally.invoicify.models.InvoiceLineItem;
import com.el.ally.invoicify.models.InvoiceView;

public class InvoiceController {
	
	@AutoWired
	
	@PostMapping("{clientId}")
	public Invoice createInvoice(@RequestBody InvoiceView invoiceView, @PathVariable long clientId) {

		List<BillingRecord> records = recordRepository.findByIdIn(invoiceView.getRecordIds());
		long nowish = Calendar.getInstance().getTimeInMillis();
		Date now = new Date(nowish);
		Invoice invoice = new Invoice();

		invoice.setInvoiceDescription(invoiceView.getInvoiceDescription());

		List<InvoiceLineItem> items = new ArrayList<InvoiceLineItem>();

		for (BillingRecord record : records) {
			InvoiceLineItem lineItem = new InvoiceLineItem();
			lineItem.setBillingRecord(record);
			lineItem.setCreatedOn(now);
			lineItem.setInvoice(invoice);
			items.add(lineItem);
		}

		invoice.setLineItems(items);
		invoice.setCreatedOn(now);
		invoice.setCompany(companyRepository.findOne(clientId));

		return invoiceRepository.save(invoice);

	}

}
