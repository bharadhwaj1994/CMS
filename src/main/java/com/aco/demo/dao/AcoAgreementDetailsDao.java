package com.aco.demo.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.aco.demo.domain.AcoAgreementDetails;

@Entity
@Table(name="ACO_Agreement_Details")
public class AcoAgreementDetailsDao {

	@Id
	@NotNull
	@Column(name="ACO_Agreement_ID")
	private String acoAgreementId;
	
	@NotNull
	@Column(name="ACO_ID")
	private String acoId;
	
	@Column(name="Agreement_Start_Date")
	private Date agreementStartDate;
	
	@Column(name="Renewal_Date")
	private Date renewalDate;
	
	@Column(name="Last_Updated_Date")
	private Date lastUpdatedDate;
	
	@Column(name="Termination_Date")
	private Date terminationDate;
	
	@Column(name="Date_Of_Formation")
	private Date dateOfFormation;
	
	@Column(name="ACO_Web_Page")
	private String acoWebPage;
	
	@Column(name="ACO_Public_Reporting_Page")
	private String acoPublicReportingPage;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="User_Name")
	private String userName;
	
	@Column(name="Timestamp")
	private Date timestamp;

	public AcoAgreementDetailsDao() {
		super();
	}
	
	public AcoAgreementDetailsDao(AcoAgreementDetails acoAgreementDetails) {
		this.setAcoAgreementId(acoAgreementDetails.getAcoAgreementId());
		this.setAcoId(acoAgreementDetails.getAcoId());
		this.setAcoPublicReportingPage(acoAgreementDetails.getAcoPublicReportingPage());
		this.setAcoWebPage(acoAgreementDetails.getAcoWebPage());
		this.setAddress(acoAgreementDetails.getAddress());
		this.setAgreementStartDate(acoAgreementDetails.getAgreementStartDate());
		this.setDateOfFormation(acoAgreementDetails.getDateOfFormation());
		this.setLastUpdatedDate(acoAgreementDetails.getLastUpdatedDate());
		this.setRenewalDate(acoAgreementDetails.getRenewalDate());
		this.setTerminationDate(acoAgreementDetails.getTerminationDate());
		this.setTimestamp(acoAgreementDetails.getTimestamp());
		this.setUserName(acoAgreementDetails.getUserName());
	}

	public String getAcoAgreementId() {
		return acoAgreementId;
	}

	public void setAcoAgreementId(String acoAgreementId) {
		this.acoAgreementId = acoAgreementId;
	}

	public String getAcoId() {
		return acoId;
	}

	public void setAcoId(String acoId) {
		this.acoId = acoId;
	}

	public Date getAgreementStartDate() {
		return agreementStartDate;
	}

	public void setAgreementStartDate(Date agreementStartDate) {
		this.agreementStartDate = agreementStartDate;
	}

	public Date getRenewalDate() {
		return renewalDate;
	}

	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Date getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public Date getDateOfFormation() {
		return dateOfFormation;
	}

	public void setDateOfFormation(Date dateOfFormation) {
		this.dateOfFormation = dateOfFormation;
	}

	public String getAcoWebPage() {
		return acoWebPage;
	}

	public void setAcoWebPage(String acoWebPage) {
		this.acoWebPage = acoWebPage;
	}

	public String getAcoPublicReportingPage() {
		return acoPublicReportingPage;
	}

	public void setAcoPublicReportingPage(String acoPublicReportingPage) {
		this.acoPublicReportingPage = acoPublicReportingPage;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		return "AcoAgreementDetails [acoAgreementId=" + acoAgreementId + ", acoId=" + acoId + ", agreementStartDate="
				+ agreementStartDate + ", renewalDate=" + renewalDate + ", lastUpdatedDate=" + lastUpdatedDate
				+ ", terminationDate=" + terminationDate + ", dateOfFormation=" + dateOfFormation + ", acoWebPage="
				+ acoWebPage + ", acoPublicReportingPage=" + acoPublicReportingPage + ", address=" + address
				+ ", userName=" + userName + ", timestamp=" + timestamp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acoAgreementId == null) ? 0 : acoAgreementId.hashCode());
		result = prime * result + ((acoId == null) ? 0 : acoId.hashCode());
		result = prime * result + ((acoPublicReportingPage == null) ? 0 : acoPublicReportingPage.hashCode());
		result = prime * result + ((acoWebPage == null) ? 0 : acoWebPage.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((agreementStartDate == null) ? 0 : agreementStartDate.hashCode());
		result = prime * result + ((dateOfFormation == null) ? 0 : dateOfFormation.hashCode());
		result = prime * result + ((lastUpdatedDate == null) ? 0 : lastUpdatedDate.hashCode());
		result = prime * result + ((renewalDate == null) ? 0 : renewalDate.hashCode());
		result = prime * result + ((terminationDate == null) ? 0 : terminationDate.hashCode());
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
		AcoAgreementDetailsDao other = (AcoAgreementDetailsDao) obj;
		if (acoAgreementId == null) {
			if (other.acoAgreementId != null)
				return false;
		} else if (!acoAgreementId.equals(other.acoAgreementId))
			return false;
		if (acoId == null) {
			if (other.acoId != null)
				return false;
		} else if (!acoId.equals(other.acoId))
			return false;
		if (acoPublicReportingPage == null) {
			if (other.acoPublicReportingPage != null)
				return false;
		} else if (!acoPublicReportingPage.equals(other.acoPublicReportingPage))
			return false;
		if (acoWebPage == null) {
			if (other.acoWebPage != null)
				return false;
		} else if (!acoWebPage.equals(other.acoWebPage))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (agreementStartDate == null) {
			if (other.agreementStartDate != null)
				return false;
		} else if (!agreementStartDate.equals(other.agreementStartDate))
			return false;
		if (dateOfFormation == null) {
			if (other.dateOfFormation != null)
				return false;
		} else if (!dateOfFormation.equals(other.dateOfFormation))
			return false;
		if (lastUpdatedDate == null) {
			if (other.lastUpdatedDate != null)
				return false;
		} else if (!lastUpdatedDate.equals(other.lastUpdatedDate))
			return false;
		if (renewalDate == null) {
			if (other.renewalDate != null)
				return false;
		} else if (!renewalDate.equals(other.renewalDate))
			return false;
		if (terminationDate == null) {
			if (other.terminationDate != null)
				return false;
		} else if (!terminationDate.equals(other.terminationDate))
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
