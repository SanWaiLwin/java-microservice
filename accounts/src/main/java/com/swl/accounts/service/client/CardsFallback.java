package com.swl.accounts.service.client;

import com.swl.accounts.dto.CardsDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/19/2024 2:28 PM
 */
@Component
public class CardsFallback implements CardsFeignClient{
    @Override
    public ResponseEntity<CardsDto> fetchCardDetails(String correlationId, String mobileNumber) {
        return null;
    }
}
