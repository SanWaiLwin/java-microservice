package com.swl.accounts.service.client;

import com.swl.accounts.dto.CardsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/18/2024 2:45 PM
 */
@FeignClient("cards")
public interface CardsFeignClient {

    @GetMapping(value = "/api/fetch",consumes = "application/json")
    public ResponseEntity<CardsDto> fetchCardDetails(@RequestParam String mobileNumber);

}
