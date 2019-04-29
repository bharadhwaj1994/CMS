package com.aco.demo.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aco.demo.domain.AcoAgreementDetails;
import com.aco.demo.domain.AcoDetails;
import com.aco.demo.domain.AcoParticipant;
import com.aco.demo.domain.EmailId;

public interface AcoControllerRestApi {

	@RequestMapping(value="/test")
	public String testMethod();
	
	@PostMapping(value="/createNewAcoParticipant",
			produces = { "application/json"},
			consumes = {"application/json"} )
	public ResponseEntity<Object> insertAcoParticipant(@RequestBody AcoParticipant acoParticipant);
	
	@PostMapping(value="/createNewAco",
			produces = { "application/json"},
			consumes = {"application/json"})
	public ResponseEntity<Object> insertAcoDetails(@RequestBody AcoDetails acoDetails);
	
	@PutMapping(value="/uploadAgreement" ,
			produces = { "application/json"} ,
			consumes = {"application/json"})
	public ResponseEntity<Object> insertAcoAgreementDetails(@RequestBody AcoAgreementDetails acoAgreementDetails);
	
	@PutMapping(value="/editAcoParticipant",
			produces = {"application/json"},
			consumes = {"application/json"})
	public ResponseEntity<Object> updateAcoParticipant(@RequestBody AcoParticipant acoParticipant);
	
	@DeleteMapping(value="/deleteAcoParticipant/{acoParticipantId}")
	public ResponseEntity<Object> deleteAcoParticipant(@PathVariable("acoParticipantId") String acoParticipantId);
	
	@PutMapping(value="/editAcoDetails",
			produces = {"application/json"},
		    consumes = {"application/json"})
	public ResponseEntity<Object> updateAcoDetails(@RequestBody AcoDetails acoDetails);
	
	@PutMapping(value="/addEmails",
			produces = {"application/json"},
			consumes = {"application/json"})
	public ResponseEntity<Object> addEmails(@RequestBody EmailId emailId);
	
	@GetMapping(value="/getAcoParticipantDetails/{acoParticipantId}")
	public ResponseEntity<Object> getAcoParticipant(@PathVariable("acoParticipantId") String acoParticipantId);

	@GetMapping(value="/getAcoDetails/{acoId}")
	public ResponseEntity<Object> getAcoDetails(@PathVariable("acoId") String acoId);
	
	@GetMapping(value="/getAcoList")
	public ResponseEntity<Object> getAllAcoDetails();
	
	@GetMapping(value="/getAcoAgreementDetails/{acoAgreementId}")
	public ResponseEntity<Object> getAgreementDetails(@PathVariable("acoAgreementId") String acoAgreementId);
}
