package com.el.ally.invoicify.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.el.ally.invoicify.models.RateBasedBillingRecord;
import com.el.ally.invoicify.repositories.BillingRecordRepository;

@RequestMapping("/api/billing-record")
public class RateBasedBillingRecordController {

	@Autowired
	private BillingRecordRepository billingRecordRepository;

	public RateBasedBillingRecordController(BillingRecordRepository billingRecordRepository) {
		this.billingRecordRepository = billingRecordRepository;
	}

	@PostMapping("rate-based/{clientId}")
	public RateBasedBillingRecord create(RateBasedBillingRecord rbRecord) {
        //save billingRecord to database
		RateBasedBillingRecord newBillingRecord = billingRecordRepository.save(rbRecord);

        //take me back to the add page
		return newBillingRecord;
	}

}