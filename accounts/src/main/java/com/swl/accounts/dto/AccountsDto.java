package com.swl.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/13/2024 3:56 PM
 */
@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account Number of SWL bank account", example = "234234234"
    )
    @NotEmpty(message = "Account Number can not be a null or empty.")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account Number must be 10 digits.")
    private Long accountNumber;

    @Schema(
            description = "Account Type of SWL bank account", example = "Savings"
    )
    @NotEmpty(message = "Account Type can not be a null or empty.")
    private String accountType;

    @Schema(
            description = "SWL bank Branch Address", example = "123 Yangon"
    )
    @NotEmpty(message = "Branch Address can not be a null or empty.")
    private String branchAddress;
}
