package com.swl.accounts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/15/2024 7:05 PM
 */
@ConfigurationProperties(prefix = "accounts")
@Setter
@Getter
public class AccountsContactInfoDto {

    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}
