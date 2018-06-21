package com.el.ally.invoicify.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.el.ally.invoicify.models.FlatFeeBillingRecord;
import com.el.ally.invoicify.models.RateBasedBillingRecord;
import com.el.ally.invoicify.repositories.BillingRecordRepository;

public class RateBasedBillingRecordController {

	@Autowired
	private BillingRecordRepository billingRecordRepository;

	public RateBasedBillingRecordController(BillingRecordRepository billingRecordRepository) {
		this.billingRecordRepository = billingRecordRepository;
	}

	public RateBasedBillingRecord create(RateBasedBillingRecord rbRecord) {
        //save billingRecord to database
		RateBasedBillingRecord newBillingRecord = billingRecordRepository.save(rbRecord);

        //take me back to the add page
		return newBillingRecord;
	}

}