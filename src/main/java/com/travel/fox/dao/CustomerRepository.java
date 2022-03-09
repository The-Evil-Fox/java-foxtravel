package com.travel.fox.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.travel.fox.model.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	List<Customer> findByEmail(String email);

}