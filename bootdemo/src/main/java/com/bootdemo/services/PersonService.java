package com.bootdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootdemo.entites.Person;
import com.bootdemo.repo.PersonRepo;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepo repo;
	
	public List<Person> getAllPerson(){
		return null;
	}
}
