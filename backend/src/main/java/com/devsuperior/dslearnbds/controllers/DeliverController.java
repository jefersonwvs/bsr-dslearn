package com.devsuperior.dslearnbds.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslearnbds.dtos.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.services.DeliverService;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverController {

	@Autowired
	private DeliverService service;
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Void> saveRevision(@PathVariable Long id, @Valid @RequestBody DeliverRevisionDTO dto) {
		service.saveRevision(id, dto);
		return ResponseEntity.noContent().build();
	}
	
}