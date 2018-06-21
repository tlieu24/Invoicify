package com.el.ally.invoicify.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.invoicify.models.InvoiceLineItem;
import com.el.ally.invoicify.repositories.InvoiceLineItemRepository;

@RestController
@RequestMapping("/InvoiceLineItem")
public class InvoiceLineItemController {
	
	@Autowired
	private InvoiceLineItemRepository invoiceLineItemRepository;
	
	@GetMapping("")
	public List<InvoiceLineItem> getAll() {
		return invoiceLineItemRepository.findAll();
	}
}
