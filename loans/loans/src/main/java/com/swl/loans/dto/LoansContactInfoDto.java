package com.swl.loans.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/15/2024 7:03 PM
 */
@ConfigurationProperties(prefix = "loans")
public record LoansContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
