package com.swl.accounts.service.client;

import com.swl.accounts.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/19/2024 2:27 PM
 */
@Component
public class LoansFallback implements LoansFeignClient {
    @Override
    public ResponseEntity<LoansDto> fetchLoanDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
