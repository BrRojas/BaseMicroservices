package com.login.account_service.model;

import com.login.account_service.utils.Type;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue
    private UUID id;

    private UUID userId; // para saber de quién es la cuenta

    @Enumerated(EnumType.STRING)
    private Type type; // tipo de cuenta (CAJA_AHORRO/CUENTA_CORRIENTE)

    private Double balance;
    private LocalDateTime createdAt;
}
