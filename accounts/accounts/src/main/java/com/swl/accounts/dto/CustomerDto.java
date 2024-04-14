package com.swl.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/13/2024 3:59 PM
 */
@Data
@Schema(
        name = "Customer",
        description = "Schema to hold customer and Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "San Wai Lwin"
    )
    @NotEmpty(message = "Name can not be a null or empty.")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30.")
    private String name;

    @Schema(
            description = "Email of the customer", example = "sanwailwin@gmail.com"
    )
    @NotEmpty(message = "Email address can not be a null or empty.")
    @Email(message = "Email address should be a valid value.")
    private String email;

    @Schema(
            description = "Mobile Number of the customer", example = "0942342434"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits.")
    private String mobileNumber;

    @Schema(
            description = "Account Detail of the customer"
    )
    private AccountsDto accountsDto;
}
