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

import com.el.ally.invoicify.models.Company;
import com.el.ally.invoicify.repositories.CompanyRepository;


@RestController
@RequestMapping("/api/company")
public class CompanyController {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@GetMapping
	public List<Company> getCompany() {
		List<Company> companies = companyRepository.findAll();
		return companies;
	}
	
	@GetMapping("{id}")
	public Company getSpecificActor(@PathVariable int id) {

		Company company = companyRepository.findOne(id);

		return company;
	}

	@PostMapping
	public Company createCompany(@RequestBody Company company) {

		Company newCompany = companyRepository.save(company);

		return newCompany;
	}

	@PutMapping("{id}")
	public Company getSpecificCompany(@PathVariable int id, @RequestBody Company company) {

		company.setId(id);

		Company updatedCompany = companyRepository.save(company);

		return updatedCompany;
	}

	@DeleteMapping("{id}")
	public boolean deleteCompany(@PathVariable int id) {

		Company originalCompany = companyRepository.findOne(id);
		companyRepository.delete(originalCompany);
		
		return true;
	}
}
