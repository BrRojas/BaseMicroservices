package com.login.account_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String type; // tipo de cuenta (ej: CAJA_AHORRO)
    private Double balance;
    private LocalDateTime createdAt;
}
