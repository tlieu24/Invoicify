package com.el.ally.invoicify.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.el.ally.invoicify.models.FlatFeeBillingRecord;
import com.el.ally.invoicify.repositories.BillingRecordRepository;
import com.el.ally.invoicify.repositories.CompanyRepository;
import com.el.ally.invoicify.repositories.InvoiceLineItemRepository;
import com.el.ally.invoicify.repositories.InvoiceRepository;

@Configuration
@Profile("development")
public class SeedData {

/*	public SeedData(BillingRecordRepository billingRecordRepo, 
					CompanyRepository companyRepo,
					InvoiceLineItemRepository lineRepo,
					InvoiceRepository invoiceRepo) {
		billingRecordRepo.save(new FlatFeeBillingRecord(null, "ffDescription", null, null, 12345));
	}*/
}