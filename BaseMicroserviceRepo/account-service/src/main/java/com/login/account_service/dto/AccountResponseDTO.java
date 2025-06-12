package com.login.account_service.dto;

import com.login.account_service.utils.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDateTime;
import java.util.UUID;

public class AccountResponseDTO {

    private UUID id;

    @Enumerated(EnumType.STRING)
    private Type type;

    private Double balance;
    private LocalDateTime createdAt;
}