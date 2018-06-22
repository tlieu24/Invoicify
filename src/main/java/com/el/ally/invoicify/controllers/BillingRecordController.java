package com.el.ally.invoicify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.invoicify.models.BillingRecord;
import com.el.ally.invoicify.repositories.BillingRecordRepository;

@RestController
@RequestMapping("api/billing-record")
public class BillingRecordController {

	@Autowired
	private BillingRecordRepository billingRecordRepository;
	
	public BillingRecordController(BillingRecordRepository billingrecordRepo) {
		this.billingRecordRepository = billingrecordRepo;
	}

	@GetMapping
	public List<BillingRecord> getAll() {
		List<BillingRecord> billingRecords = billingRecordRepository.findAll();
		return billingRecords;
	}

}
