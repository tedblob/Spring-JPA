package com.tedblob.spring.mvc.springjpa;

import com.tedblob.spring.mvc.springjpa.model.AddressRepository;
import com.tedblob.spring.mvc.springjpa.model.CustomerRepository;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringPagingAndSortingApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringPagingAndSortingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
/*
		// testing
		System.out.println(customerRepository.getCountOfNewUsers("New"));*/

		System.out.println(addressRepository.findByIsPermanentAddressFalse());
		System.out.println(addressRepository.findByIsPermanentAddressTrue());

		System.out.println(addressRepository.findAllPermanentAddress());
	}
}
