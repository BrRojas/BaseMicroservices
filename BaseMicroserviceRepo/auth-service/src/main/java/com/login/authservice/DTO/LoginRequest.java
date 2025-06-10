package com.login.authservice.DTO;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Data
public class LoginRequest {

    @NotBlank
    @Size(min = 3, max = 50)
    private String mail;

    @NotBlank
    @Size(min = 6)
    private String password;
}
