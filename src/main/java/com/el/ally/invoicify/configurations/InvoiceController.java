package com.el.ally.invoicify.configurations;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.el.ally.invoicify.models.Invoice;
import com.el.ally.invoicify.repositories.InvoiceRepository;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {

	  private InvoiceRepository invoiceRepo;

	  public InvoiceController(InvoiceRepository invoiceRepo) {
	    this.invoiceRepo = invoiceRepo;
	  }

	  @GetMapping("")
	  public List<Invoice> getAll() {
	    return invoiceRepo.findAll();
	  }

	  @GetMapping("{id}")
	  public Invoice getOne(@PathVariable int id) {
	    return invoiceRepo.findOne(id);
	  }

	  @PostMapping("")
	  public Invoice create(@RequestBody Invoice company) {
	    return invoiceRepo.save(company);
	  }

	  @PutMapping("{id}")
	  public Invoice update(@RequestBody Invoice actor, @PathVariable int id) {
	    actor.setId(id);
	    return invoiceRepo.save(actor);
	  }

	  @DeleteMapping("{id}")
	  public Invoice delete(@PathVariable int id) {
	    Invoice company = invoiceRepo.findOne(id);
	    invoiceRepo.delete(id);
	    return company;
	  }
	
}
