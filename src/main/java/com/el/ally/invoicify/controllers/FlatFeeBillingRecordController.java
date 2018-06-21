package com.el.ally.invoicify.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.el.ally.invoicify.models.BillingRecord;
import com.el.ally.invoicify.models.FlatFeeBillingRecord;
import com.el.ally.invoicify.repositories.BillingRecordRepository;

public class FlatFeeBillingRecordController {
	
	@Autowired
	private BillingRecordRepository billingRecordRepository;

	public FlatFeeBillingRecordController(BillingRecordRepository billingRecordRepository) {
		this.billingRecordRepository = billingRecordRepository;
	}

	public FlatFeeBillingRecord create(FlatFeeBillingRecord ffbRecord) {
        //save billingRecord to database
		FlatFeeBillingRecord newBillingRecord = billingRecordRepository.save(ffbRecord);

        //take me back to the add page
		return newBillingRecord;
	}

}
