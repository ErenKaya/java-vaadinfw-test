package com.eren.spring;


import org.springframework.stereotype.Component;

@Component
public class Address {
	
	private String address = "wall street 12";

	public String getAddress() {
		return this.address;
	}
}
