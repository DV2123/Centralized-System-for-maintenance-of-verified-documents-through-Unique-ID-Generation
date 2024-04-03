package org.mm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdetails")
public class UserDetailModel
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String Address;
	
	@Column
	private String AddressPin;
	
	@Column
	private String Email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getAddressPin() {
		return AddressPin;
	}

	public void setAddressPin(String addressPin) {
		AddressPin = addressPin;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public UserDetailModel(int id, String address, String addressPin, String email) {
		super();
		this.id = id;
		Address = address;
		AddressPin = addressPin;
		Email = email;
	}

	public UserDetailModel(String address, String addressPin, String email) {
		super();
		Address = address;
		AddressPin = addressPin;
		Email = email;
	}

	public UserDetailModel() {
		super();
	}
	
}
