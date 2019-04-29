package com.aco.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.aco.demo.domain.AcoAgreementDetails;
import com.aco.demo.domain.AcoDetails;
import com.aco.demo.domain.AcoParticipant;
import com.aco.demo.domain.EmailId;
import com.aco.demo.service.AcoService;

@RestController
public class AcoControllerRestImpl implements AcoControllerRestApi {

	@Autowired
	AcoService acoService;
	
	@Override
	public String testMethod() {
		String str = "HelloWorld";
		return str;
	}

	@Override
	public ResponseEntity<Object> insertAcoParticipant(AcoParticipant acoParticipant) {
		boolean status =  acoService.insertAcoParticipant(acoParticipant);
		if(status) {
			return ResponseEntity.status(HttpStatus.CREATED).body(null);
		}
		return ResponseEntity.badRequest().body(null);
	}

	@Override
	public ResponseEntity<Object> insertAcoDetails(AcoDetails acoDetails) {
		boolean status =  acoService.insertByAcoDetails(acoDetails);
		if(status) {
			return ResponseEntity.status(HttpStatus.CREATED).body(null);
		}
		return ResponseEntity.badRequest().body(null);
	}

	@Override
	public ResponseEntity<Object> insertAcoAgreementDetails(AcoAgreementDetails acoAgreementDetails) {
		boolean status =  acoService.insertByAcoAgreementDetails(acoAgreementDetails);
		if(status) {
			return ResponseEntity.status(HttpStatus.CREATED).body(null);
		}
		return ResponseEntity.badRequest().body(null);
	}

	@Override
	public ResponseEntity<Object> getAcoParticipant(String acoParticipantId) {
		AcoParticipant acoParticipant =  acoService.findAcoParticipantsByAcoParticipantId(acoParticipantId);
		if(acoParticipant != null) {
			return ResponseEntity.status(HttpStatus.OK).body(acoParticipant);
		}
		return ResponseEntity.badRequest().body(null);
	}

	@Override
	public ResponseEntity<Object> getAcoDetails(String acoId) {
		AcoDetails acoDetails =  acoService.findAcoDetailsByAcoId(acoId);
		if(acoDetails != null) {
			return ResponseEntity.status(HttpStatus.OK).body(acoDetails);
		}
		return ResponseEntity.badRequest().body(null);
	}

	@Override
	public ResponseEntity<Object> getAgreementDetails(String acoAgreementId) {
		AcoAgreementDetails acoAgreementDetails =  acoService.findAcoAgreementDetailsByAcoAgreementId(acoAgreementId);
		if(acoAgreementDetails != null) {
			return ResponseEntity.status(HttpStatus.OK).body(acoAgreementDetails);
		}
		return ResponseEntity.badRequest().body(null);
	}

	@Override
	public ResponseEntity<Object> getAllAcoDetails() {
		List<AcoDetails> acoDetailsList = acoService.getAllAcoDetails();
		return ResponseEntity.status(HttpStatus.OK).body(acoDetailsList);
	}

	@Override
	public ResponseEntity<Object> updateAcoParticipant( AcoParticipant acoParticipant) {
		boolean status =  acoService.updateAcoParticiapant(acoParticipant);
		if(status) {
			return ResponseEntity.status(HttpStatus.OK).body(null);
		}
		return ResponseEntity.badRequest().body(null);
	}

	@Override
	public ResponseEntity<Object> deleteAcoParticipant(String acoParticipantId) {
		acoService.deleteAcoParticipant(acoParticipantId);
		return  ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	}

	@Override
	public ResponseEntity<Object> updateAcoDetails(AcoDetails acoDetails) {
		boolean status =  acoService.updateAcoDetails(acoDetails);
		if(status) {
			return ResponseEntity.status(HttpStatus.OK).body(null);
		}
		return ResponseEntity.badRequest().body(null);
	}

	@Override
	public ResponseEntity<Object> addEmails(EmailId emailId) {
		boolean status = acoService.addEmails(emailId);
		if(status) {
			return ResponseEntity.status(HttpStatus.CREATED).body(null);
		}
		return ResponseEntity.badRequest().body(null);
	}

	

}
