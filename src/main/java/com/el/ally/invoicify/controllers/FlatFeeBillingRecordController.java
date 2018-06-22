package com.el.ally.invoicify.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.invoicify.models.FlatFeeBillingRecord;

import com.el.ally.invoicify.repositories.BillingRecordRepository;


@RestController
@RequestMapping("/api/billing-record")
public class FlatFeeBillingRecordController {

    @Autowired
    private BillingRecordRepository billingRecordRepository;    
    
    public FlatFeeBillingRecordController(BillingRecordRepository billingRecordRepository) {

        this.billingRecordRepository = billingRecordRepository;

    }    
    
    @PostMapping("flat-fee/{clientId}")
    public FlatFeeBillingRecord create(FlatFeeBillingRecord ffbRecord) {

       //save billingRecord to database

        FlatFeeBillingRecord newBillingRecord = billingRecordRepository.save(ffbRecord);        //take me back to the add page

        return newBillingRecord;

    }}