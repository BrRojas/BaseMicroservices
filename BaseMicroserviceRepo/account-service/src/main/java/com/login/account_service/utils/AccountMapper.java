package com.login.account_service.utils;

import com.login.account_service.dto.AccountRequestDTO;
import com.login.account_service.dto.AccountResponseDTO;
import com.login.account_service.model.Account;

import java.time.LocalDateTime;

public class AccountMapper {

    public static Account toEntity(AccountRequestDTO dto) {
        Account account = new Account();
        account.setType(dto.getType());
        account.setBalance(dto.getBalance());
        account.setUserId(dto.getUserId());
        account.setCreatedAt(LocalDateTime.now()); // lógica interna
        return account;
    }

    public static AccountResponseDTO toDTO(Account account) {
        return new AccountResponseDTO(
                account.getId(),
                account.getType(),
                account.getBalance(),
                account.getCreatedAt()
        );
    }
}
