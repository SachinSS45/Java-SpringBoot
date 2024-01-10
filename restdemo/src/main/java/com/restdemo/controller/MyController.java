package com.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.entities.CloudVendor;
import com.restdemo.service.CloudVendorService;

@RestController
@RequestMapping("/cloudvendor")
public class MyController {
	
	@Autowired
	CloudVendorService cloudVendorService;

	////Read specific Cloud Vendor Details from DB
	@GetMapping("{vendorId}")
	public CloudVendor getVendorById(@PathVariable String vendorId) {
		return this.cloudVendorService.getVendorById(Integer.parseInt(vendorId));
	}
	
	//Read All Cloud Vendor Details from DB
	@GetMapping
	public List<CloudVendor> getAllCloudVendors() {
		return this.cloudVendorService.getAllCloudVendors();
	}
	//add new vendor to DB
	@PostMapping
	public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendorService.createCloudVendor(cloudVendor);
		return "Cloud Vendor Created Successfully";
	}
	//for updating vendor to DB
	@PutMapping
	public String updateCloudVendor(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendorService.updateCloudVendor(cloudVendor);
		return "Cloud Vendor Updated Successfully";
	}
	//for deleting specific vendor from DB
	@DeleteMapping("{vendorId}")
	public String deleteVendorById(@PathVariable String vendorId) {
		this.cloudVendorService.deleteVendorById(Integer.parseInt(vendorId));
		return "Cloud Vendor Deleted Successfully";
	}
}
