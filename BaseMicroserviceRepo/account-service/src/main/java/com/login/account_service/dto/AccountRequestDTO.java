package com.login.account_service.dto;

import com.login.account_service.utils.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountRequestDTO {

    @Enumerated(EnumType.STRING)
    private Type type;

    private Double balance;
    private UUID userId;

}
