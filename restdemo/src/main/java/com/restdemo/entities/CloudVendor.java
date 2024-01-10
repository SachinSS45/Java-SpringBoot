package com.restdemo.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CloudVendor {
	
	@Id
	private int vendorId;
	
	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNumber;
	
	public CloudVendor() {
		super();
	}
	
//	public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNumber) 	{
//		super();
//		this.vendorId = vendorId;
//		this.vendorName = vendorName;
//		this.vendorAddress = vendorAddress;
//		this.vendorPhoneNumber = vendorPhoneNumber;
//	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}

	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	
	
	
}
