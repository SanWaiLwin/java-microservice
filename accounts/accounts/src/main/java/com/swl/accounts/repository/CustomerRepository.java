package com.swl.accounts.repository;

import com.swl.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/13/2024 3:02 PM
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByMobileNumber(String mobileNumber);
}
