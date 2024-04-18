package com.swl.accounts.service;

import com.swl.accounts.dto.CustomerDetailsDto;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/18/2024 2:54 PM
 */
public interface ICustomersService {

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on a given mobileNumber
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
