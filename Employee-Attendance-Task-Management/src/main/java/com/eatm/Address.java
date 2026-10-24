package com.eatm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_gen")
	@SequenceGenerator(name = "address_gen",initialValue = 81,allocationSize = 1)
	private int addressId;
	private int houseNumber;
	private String area;
	private String city;
	private String state;
	private String country;
	private int pincode;
}
