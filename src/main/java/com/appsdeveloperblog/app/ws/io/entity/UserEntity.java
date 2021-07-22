package com.appsdeveloperblog.app.ws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity(name="users")//table name
public class UserEntity implements Serializable {

	private static final long serialVersionUID = 5313493413859894403L;
	@Id
	@GeneratedValue
	private long id;  
	
	@Column(nullable=false)
	private String userId;
	
	@Column(nullable=false,length=50)
	private String firstName;
	
	public UserEntity() {
		
	}

	public UserEntity(long id, String userId, String firstName, String lastName, String email, String encryptedpassword,
			String emailVerificationToken, boolean emailVerificationStatus) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.encryptedpassword = encryptedpassword;
		this.emailVerificationToken = emailVerificationToken;
		this.emailVerificationStatus = emailVerificationStatus;
	}

	@Column(nullable=false,length=50)
	private String lastName;
	
	@Column(nullable=false,length=120, unique = true)
	private String email;
	
	@Column(nullable=false)
	private String encryptedpassword;
	
	private String emailVerificationToken;
	
	@Column(nullable=false)
	private boolean emailVerificationStatus=false;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedpassword() {
		return encryptedpassword;
	}

	public void setEncryptedpassword(String encryptedpassword) {
		this.encryptedpassword = encryptedpassword;
	}

	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}

	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}

	public boolean getEmailVerificationStatus() {
		return emailVerificationStatus;
	}

	public void setEmailVerificationStatus(boolean emailVerificationStatus) {
		this.emailVerificationStatus = emailVerificationStatus;
	}
	
}
