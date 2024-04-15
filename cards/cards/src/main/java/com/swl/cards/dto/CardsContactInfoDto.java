package com.swl.cards.dto;


import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/15/2024 3:58 PM
 */
@ConfigurationProperties(prefix = "cards")
public record CardsContactInfoDto(String message, Map<String, String> contactDetails, List<String> onCallSupport) {
}
