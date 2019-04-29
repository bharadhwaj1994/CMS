package com.aco.demo.dao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.aco.demo.domain.EmailId;

@Entity
@Table(name="EmailId")
public class EmailIdDao {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Email_1")
	private String email1;
	
	@Column(name="Email_2")
	private String email2;
	
	@Column(name="Email_3")
	private String email3;
	
	@Column(name="User_Name")
	private String userName;
	
	@Column(name="Timestamp")
	private Date timestamp;
	
	public EmailIdDao() {
		super();
	}

	public EmailIdDao(EmailId emailIdDao) {
		this.setEmail1(emailIdDao.getEmail1());
		this.setEmail2(emailIdDao.getEmail2());
		this.setEmail3(emailIdDao.getEmail3());
		this.setUserName(emailIdDao.getUserName());
		this.setTimestamp(emailIdDao.getTimestamp());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEmail3() {
		return email3;
	}

	public void setEmail3(String email3) {
		this.email3 = email3;
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
		return "EmailIdDao [id=" + id + ", email1=" + email1 + ", email2=" + email2 + ", email3=" + email3
				+ ", userName=" + userName + ", timestamp=" + timestamp + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email1 == null) ? 0 : email1.hashCode());
		result = prime * result + ((email2 == null) ? 0 : email2.hashCode());
		result = prime * result + ((email3 == null) ? 0 : email3.hashCode());
		result = prime * result + id;
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
		EmailIdDao other = (EmailIdDao) obj;
		if (email1 == null) {
			if (other.email1 != null)
				return false;
		} else if (!email1.equals(other.email1))
			return false;
		if (email2 == null) {
			if (other.email2 != null)
				return false;
		} else if (!email2.equals(other.email2))
			return false;
		if (email3 == null) {
			if (other.email3 != null)
				return false;
		} else if (!email3.equals(other.email3))
			return false;
		if (id != other.id)
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
