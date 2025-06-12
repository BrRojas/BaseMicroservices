package com.login.account_service.dto;

import com.login.account_service.utils.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponseDTO {

    private UUID id;

    @Enumerated(EnumType.STRING)
    private Type type;

    private Double balance;
    private LocalDateTime createdAt;
}