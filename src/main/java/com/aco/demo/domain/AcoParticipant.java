package com.aco.demo.domain;

import java.util.Date;

import com.aco.demo.dao.AcoParticipantDao;

public class AcoParticipant {

	public AcoParticipant() {
		super();
	}

	private String acoParticipantId;
	
	private String acoId;
	
	private String acoParticipantName;
	
	private int medicareEnrolledTin;
	
	private boolean status;
	
	private String agreementS3Path;
	
	private Date effectiveStartData;
	
	private String userName;
	
	private Date timestamp;
	
	public AcoParticipant(AcoParticipantDao acoParticipant) {
		this.setAcoId(acoParticipant.getAcoId());
		this.setAcoParticipantId(acoParticipant.getAcoParticipantId());
		this.setAcoParticipantName(acoParticipant.getAcoParticipantName());
		this.setAgreementS3Path(acoParticipant.getAgreementS3Path());
		this.setEffectiveStartData(acoParticipant.getEffectiveStartData());
		this.setMedicareEnrolledTin(acoParticipant.getMedicareEnrolledTin());
		this.setStatus(acoParticipant.isStatus());
		this.setTimestamp(acoParticipant.getTimestamp());
		this.setUserName(acoParticipant.getUserName());
	}

	public String getAcoParticipantId() {
		return acoParticipantId;
	}

	public void setAcoParticipantId(String acoParticipantId) {
		this.acoParticipantId = acoParticipantId;
	}

	public String getAcoId() {
		return acoId;
	}

	public void setAcoId(String acoId) {
		this.acoId = acoId;
	}

	public String getAcoParticipantName() {
		return acoParticipantName;
	}

	public void setAcoParticipantName(String acoParticipantName) {
		this.acoParticipantName = acoParticipantName;
	}

	public int getMedicareEnrolledTin() {
		return medicareEnrolledTin;
	}

	public void setMedicareEnrolledTin(int medicareEnrolledTin) {
		this.medicareEnrolledTin = medicareEnrolledTin;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getAgreementS3Path() {
		return agreementS3Path;
	}

	public void setAgreementS3Path(String agreementS3Path) {
		this.agreementS3Path = agreementS3Path;
	}

	public Date getEffectiveStartData() {
		return effectiveStartData;
	}

	public void setEffectiveStartData(Date effectiveStartData) {
		this.effectiveStartData = effectiveStartData;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "AcoParticipant [acoParticipantId=" + acoParticipantId + ", acoId=" + acoId + ", acoParticipantName="
				+ acoParticipantName + ", medicareEnrolledTin=" + medicareEnrolledTin + ", status=" + status
				+ ", agreementS3Path=" + agreementS3Path + ", effectiveStartData=" + effectiveStartData + ", userName="
				+ userName + ", timestamp=" + timestamp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acoId == null) ? 0 : acoId.hashCode());
		result = prime * result + ((acoParticipantId == null) ? 0 : acoParticipantId.hashCode());
		result = prime * result + ((acoParticipantName == null) ? 0 : acoParticipantName.hashCode());
		result = prime * result + ((agreementS3Path == null) ? 0 : agreementS3Path.hashCode());
		result = prime * result + ((effectiveStartData == null) ? 0 : effectiveStartData.hashCode());
		result = prime * result + medicareEnrolledTin;
		result = prime * result + (status ? 1231 : 1237);
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AcoParticipant other = (AcoParticipant) obj;
		if (acoId == null) {
			if (other.acoId != null)
				return false;
		} else if (!acoId.equals(other.acoId))
			return false;
		if (acoParticipantId == null) {
			if (other.acoParticipantId != null)
				return false;
		} else if (!acoParticipantId.equals(other.acoParticipantId))
			return false;
		if (acoParticipantName == null) {
			if (other.acoParticipantName != null)
				return false;
		} else if (!acoParticipantName.equals(other.acoParticipantName))
			return false;
		if (agreementS3Path == null) {
			if (other.agreementS3Path != null)
				return false;
		} else if (!agreementS3Path.equals(other.agreementS3Path))
			return false;
		if (effectiveStartData == null) {
			if (other.effectiveStartData != null)
				return false;
		} else if (!effectiveStartData.equals(other.effectiveStartData))
			return false;
		if (medicareEnrolledTin != other.medicareEnrolledTin)
			return false;
		if (status != other.status)
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}
	
}
