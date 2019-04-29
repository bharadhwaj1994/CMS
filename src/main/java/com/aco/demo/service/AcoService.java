package com.aco.demo.service;

import java.util.List;

import com.aco.demo.domain.AcoAgreementDetails;
import com.aco.demo.domain.AcoDetails;
import com.aco.demo.domain.AcoParticipant;
import com.aco.demo.domain.EmailId;


public interface AcoService {

	public boolean insertAcoParticipant(AcoParticipant acoParticipant);
	
	public boolean insertByAcoDetails(AcoDetails acoDetails);
	
	public boolean insertByAcoAgreementDetails(AcoAgreementDetails acoAgreementDetails);
	
	public AcoParticipant findAcoParticipantsByAcoParticipantId(String acoParticipantId);
	
	public AcoDetails findAcoDetailsByAcoId(String acoId);
	
	public AcoAgreementDetails findAcoAgreementDetailsByAcoAgreementId(String acoAgreementId);
	
	public List<AcoDetails> getAllAcoDetails();
	
	public void deleteAcoParticipant(String acoParticipantId);
	
	public boolean updateAcoDetails(AcoDetails acoDetails);
	
	public boolean updateAcoParticiapant(AcoParticipant acoParticipant);
	
	public boolean addEmails(EmailId emailId);
	
}
