package com.swl.gatewayserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/19/2024 1:52 PM
 */
@RestController
public class FallbackController {

    @RequestMapping("/contactSupport")
    public Mono<String> contactSupport(){
        return Mono.just("An error occurred. Please try after some time or contact support team!!!");
    }
}
