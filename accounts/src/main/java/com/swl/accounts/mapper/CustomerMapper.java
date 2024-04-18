package com.swl.accounts.mapper;

import com.swl.accounts.dto.CustomerDetailsDto;
import com.swl.accounts.dto.CustomerDto;
import com.swl.accounts.entity.Customer;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/13/2024 4:28 PM
 */
public class CustomerMapper {
    public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
        customerDto.setName(customer.getName());
        customerDto.setEmail(customer.getEmail());
        customerDto.setMobileNumber(customer.getMobileNumber());
        return customerDto;
    }

    public static CustomerDetailsDto mapToCustomerDetailsDto(Customer customer, CustomerDetailsDto customerDetailsDto) {
        customerDetailsDto.setName(customer.getName());
        customerDetailsDto.setEmail(customer.getEmail());
        customerDetailsDto.setMobileNumber(customer.getMobileNumber());
        return customerDetailsDto;
    }

    public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());
        return customer;
    }

}
