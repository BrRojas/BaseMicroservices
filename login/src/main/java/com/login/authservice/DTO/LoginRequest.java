package com.login.authservice.DTO;

import lombok.Data;

@Data
public class LoginRequest {
    private String mail;
    private String password;
}
