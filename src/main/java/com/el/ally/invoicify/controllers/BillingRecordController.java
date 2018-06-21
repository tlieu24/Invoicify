package com.el.ally.invoicify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.invoicify.models.BillingRecord;
import com.el.ally.invoicify.repositories.BillingRecordRepository;

@RestController
@RequestMapping("invoicify/billing-records")
public class BillingRecordController {

	@Autowired
	private BillingRecordRepository billingRecordRepository;
	
//	@GetMapping
//	public List<BillingRecord> getBillingRecords() {
//		List<BillingRecord> billingRecords = billingRecordRepository.findAll();
//		return billingRecords;
//	}
//
//    @PostMapping
//	public BillingRecord createBillingRecord(@RequestBody BillingRecord billingRecord) {
//
//        //save billingRecord to database
//		BillingRecord newBillingRecord = billingRecordRepository.save(billingRecord);
//
//        //take me back to the add page
//		return newBillingRecord;
//	}
//
//	@DeleteMapping("{id}")
//	public BillingRecord deleteJoke(@PathVariable int id) {
//
//		//get the original billingRecord from db
//		BillingRecord originalBillingRecord = billingRecordRepository.findOne(id);
//
//        //delete billingRecord from database
//		billingRecordRepository.delete(originalBillingRecord);
//
//        //take me back to the add page
//		return originalBillingRecord;
//	}
//
//	@GetMapping("{id}")
//	public BillingRecord getSpecificBillingRecord(@PathVariable int id) {
//
//		//get the original billingRecord from db
//		BillingRecord billingRecord = billingRecordRepository.findOne(id);
//
//        //take me back to the add page
//		return billingRecord;
//		
//	}
//
//	@PutMapping("{id}")
//	public BillingRecord getSpecificBillingRecord(@PathVariable int id, @RequestBody BillingRecord billingRecord) {
//
//        //set the id on the billingRecord just sent in
//		billingRecord.setId(id);
//         
//		//get the original billingRecord from db
//		BillingRecord updatedBillingRecord = billingRecordRepository.save(billingRecord);
//
//        //take me back to the add page
//		return updatedBillingRecord;
//	}
	
//	@PostMapping("/{billingRecordId}/movies")
//	public BillingRecord create(@PathVariable int billingRecordId, @RequestBody int movieId) {
//		BillingRecord billingRecord = billingRecordRepository.findOne(billingRecordId);
//		Movie movie = movieRepository.findOne(movieId);
//		billingRecord.setMovie(movie);
//		billingRecordRepository.save(billingRecord);
//		return billingRecord;
//	}
//	
//	@PostMapping("{billingRecordId}/awards")
//	public BillingRecord createAward(@PathVariable int billingRecordId, @RequestBody int awardId) {
//		BillingRecord billingRecord = billingRecordRepository.findOne(billingRecordId);
//		Award award = awardRepository.findOne(awardId);
//		billingRecord.getAwards().add(award);
//		billingRecordRepository.save(billingRecord);
//		return billingRecord;
//	}
}
