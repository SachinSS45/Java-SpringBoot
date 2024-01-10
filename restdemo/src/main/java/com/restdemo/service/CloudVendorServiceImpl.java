package com.restdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restdemo.entities.CloudVendor;
import com.restdemo.repo.CloudVendorRepo;
@Service
public class CloudVendorServiceImpl implements CloudVendorService {
	
	@Autowired
	CloudVendorRepo cloudVendorRepo;
	
	@Override
	public List<CloudVendor> getAllCloudVendors() {
		return cloudVendorRepo.findAll();
	}

	@Override
	public CloudVendor getVendorById(int vendorId) {
		CloudVendor cv=	cloudVendorRepo.findByVendorId(vendorId);
		return cv;
	}
	@Override
	public String createCloudVendor(CloudVendor cloudVendor) {
		cloudVendorRepo.save(cloudVendor);
		return "Successful";
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudeVendor) {
		cloudVendorRepo.save(cloudeVendor);
		return "Success";
	}

	@Override
	public String deleteVendorById(int vendorId) {
		
		CloudVendor cv= cloudVendorRepo.getOne(vendorId);
		cloudVendorRepo.delete(cv);
		return "Success";
	}


	

}
