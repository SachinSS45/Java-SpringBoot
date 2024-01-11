package com.restdemo.service;

import java.util.List;

import com.restdemo.entities.CloudVendor;

public interface CloudVendorService {
	public List<CloudVendor> getAllCloudVendors();
	
	public CloudVendor getVendorById(int vendorId);
	
	public String createCloudVendor(CloudVendor cloudVendor);
	
	public String updateCloudVendor(CloudVendor cloudeVendor);
	
	public String deleteVendorById(int vendorId);	
}
