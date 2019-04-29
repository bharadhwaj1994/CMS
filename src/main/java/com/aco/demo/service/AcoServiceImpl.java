package com.aco.demo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aco.demo.dao.AcoAgreementDetailsDao;
import com.aco.demo.dao.AcoAgreementDetailsRepository;
import com.aco.demo.dao.AcoDetailsDao;
import com.aco.demo.dao.AcoDetailsRepository;
import com.aco.demo.dao.AcoParticipantDao;
import com.aco.demo.dao.AcoParticipantsRepository;
import com.aco.demo.dao.EmailIdDao;
import com.aco.demo.dao.EmailIdRepository;
import com.aco.demo.domain.AcoAgreementDetails;
import com.aco.demo.domain.AcoDetails;
import com.aco.demo.domain.AcoParticipant;
import com.aco.demo.domain.EmailId;

@Service
public class AcoServiceImpl implements AcoService {
	
	@Autowired
	AcoParticipantsRepository acoParticipantsRepository;
	
	@Autowired
	AcoDetailsRepository acoDetailsRepository;
	
	@Autowired
	AcoAgreementDetailsRepository acoAgreementDetailsRepository;
	
	@Autowired
	EmailIdRepository emailIdRepository;

	@Override
	public boolean insertAcoParticipant(AcoParticipant acoParticipant) {
		acoParticipant.setTimestamp(new Date());
		AcoParticipantDao acoParticipantDao = new AcoParticipantDao(acoParticipant);
		if(acoParticipantsRepository.save(acoParticipantDao) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertByAcoDetails(AcoDetails acoDetails) {
		acoDetails.setTimestamp(new Date());
		AcoDetailsDao acoDetailsDao = new AcoDetailsDao(acoDetails);
		if(acoDetailsRepository.save(acoDetailsDao) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean insertByAcoAgreementDetails(AcoAgreementDetails acoAgreementDetails) {
		acoAgreementDetails.setTimestamp(new Date());
		AcoAgreementDetailsDao acoAgreementDetailsDao = new AcoAgreementDetailsDao(acoAgreementDetails);
		if(acoAgreementDetailsRepository.save(acoAgreementDetailsDao) != null) {
			return true;
		}
		return false;
	}

	@Override
	public AcoParticipant findAcoParticipantsByAcoParticipantId(String acoParticipantId) {
		AcoParticipantDao acoParticipantDao = acoParticipantsRepository.findByAcoParticipantId(acoParticipantId);
		AcoParticipant acoParticipant = new AcoParticipant(acoParticipantDao);
		return acoParticipant;
	}

	@Override
	public AcoDetails findAcoDetailsByAcoId(String acoId) {
		AcoDetailsDao acoDetailsDao = acoDetailsRepository.findByAcoId(acoId);
		AcoDetails acoDetails = new AcoDetails(acoDetailsDao);
		return acoDetails;
	}

	@Override
	public AcoAgreementDetails findAcoAgreementDetailsByAcoAgreementId(String acoAgreementId) {
		AcoAgreementDetailsDao acoAgreementDetailsDao = acoAgreementDetailsRepository.findByAcoAgreementId(acoAgreementId);
		AcoAgreementDetails acoAgreementDetails = new AcoAgreementDetails(acoAgreementDetailsDao);
		return acoAgreementDetails;
	}

	@Override
	public List<AcoDetails> getAllAcoDetails() {
		List<AcoDetails> acoDetailsList = new ArrayList<AcoDetails>();
		List<AcoDetailsDao> acoDetailsDao = acoDetailsRepository.findAll();
		for(AcoDetailsDao acoDetails:acoDetailsDao) {
			acoDetailsList.add(new AcoDetails(acoDetails));
		}
		return acoDetailsList;
	}

	@Override
	public void deleteAcoParticipant(String acoParticipantId) {
		acoParticipantsRepository.deleteById(acoParticipantId);
	}

	@Override
	public boolean updateAcoDetails( AcoDetails acoDetails) {
		acoDetails.setTimestamp(new Date());
		if(acoDetailsRepository.findByAcoId(acoDetails.getAcoId()) != null) {
			AcoDetailsDao acoDetailsDao = new AcoDetailsDao(acoDetails);
			acoDetailsDao.setAcoId(acoDetails.getAcoId());
			acoDetailsRepository.save(acoDetailsDao);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateAcoParticiapant( AcoParticipant acoParticipant) {
		acoParticipant.setTimestamp(new Date());
		if(acoParticipantsRepository.findByAcoParticipantId(acoParticipant.getAcoParticipantId()) != null) {
			AcoParticipantDao acoParticipantDao = new AcoParticipantDao(acoParticipant);
			acoParticipantDao.setAcoParticipantId(acoParticipant.getAcoParticipantId());
			acoParticipantsRepository.save(new AcoParticipantDao(acoParticipant));
			return true;
		}
		return false;
	}

	@Override
	public boolean addEmails(EmailId emailId) {
		emailId.setTimestamp(new Date());
		if(emailIdRepository.save(new EmailIdDao(emailId)) != null) {
			return true;
		}
		return false;
	}

}
