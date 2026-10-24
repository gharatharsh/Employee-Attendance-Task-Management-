package com.eatm.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.eatm.Address;
import com.eatm.Attendance;

@Repository
public class AddressDao {
	@Autowired
	EntityManager entityManager;
	
	@Autowired
	EntityTransaction entityTransaction;

	// save Task
	public void saveAddress(Address address) {
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
	}

	// update Task
	public void updateAddress(Address address) {
		entityTransaction.begin();
		entityManager.merge(address);
		entityTransaction.commit();
	}

	// Delete Task
	public void deleteAddress(int addressId) {

		com.eatm.Address address = entityManager.find(Address.class, addressId);

		if (address != null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
		}
	}

	// Find Task by ID
	public Address findAddress(int addressId) {

		return entityManager.find(Address.class, addressId);
	}

	// Find All Task
	public List<Address> findAllAddress() {

		return entityManager.createQuery("SELECT address FROM Address address", Address.class).getResultList();
	}
}

