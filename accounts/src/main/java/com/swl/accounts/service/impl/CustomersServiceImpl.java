package com.swl.accounts.service.impl;

import com.swl.accounts.dto.AccountsDto;
import com.swl.accounts.dto.CardsDto;
import com.swl.accounts.dto.CustomerDetailsDto;
import com.swl.accounts.dto.LoansDto;
import com.swl.accounts.entity.Accounts;
import com.swl.accounts.entity.Customer;
import com.swl.accounts.exception.ResourceNotFoundException;
import com.swl.accounts.mapper.AccountsMapper;
import com.swl.accounts.mapper.CustomerMapper;
import com.swl.accounts.repository.AccountsRepository;
import com.swl.accounts.repository.CustomerRepository;
import com.swl.accounts.service.ICustomersService;
import com.swl.accounts.service.client.CardsFeignClient;
import com.swl.accounts.service.client.LoansFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/18/2024 2:54 PM
 */
@Service
@AllArgsConstructor
public class CustomersServiceImpl implements ICustomersService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;
    private CardsFeignClient cardsFeignClient;
    private LoansFeignClient loansFeignClient;

    /**
     * @param mobileNumber - Input Mobile Number
     *  @param correlationId - Correlation ID value generated at Edge server
     * @return Customer Details based on a given mobileNumber
     */
    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber, String correlationId) {
        Customer customer = customerRepository.findByMobileNumber(mobileNumber).orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber)
        );
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId()).orElseThrow(
                () -> new ResourceNotFoundException("Account", "customerId", customer.getCustomerId().toString())
        );

        CustomerDetailsDto customerDetailsDto = CustomerMapper.mapToCustomerDetailsDto(customer, new CustomerDetailsDto());
        customerDetailsDto.setAccountsDto(AccountsMapper.mapToAccountsDto(accounts, new AccountsDto()));

        ResponseEntity<LoansDto> loansDtoResponseEntity = loansFeignClient.fetchLoanDetails(correlationId, mobileNumber);
        if(null != loansDtoResponseEntity) {
            customerDetailsDto.setLoansDto(loansDtoResponseEntity.getBody());
        }

        ResponseEntity<CardsDto> cardsDtoResponseEntity = cardsFeignClient.fetchCardDetails(correlationId, mobileNumber);
        if(null != cardsDtoResponseEntity) {
            customerDetailsDto.setCardsDto(cardsDtoResponseEntity.getBody());
        }

        return customerDetailsDto;

    }
}