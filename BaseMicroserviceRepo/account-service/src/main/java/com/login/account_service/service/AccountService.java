package com.login.account_service.service;

import com.login.account_service.dto.AccountRequestDTO;
import com.login.account_service.dto.AccountResponseDTO;

import java.util.List;

public interface AccountService {

    //Admin
    List<AccountResponseDTO> getAllAccount();
    void deleteAccount(Long accountId);


    // User
    AccountResponseDTO createAccount(AccountRequestDTO request);
    AccountResponseDTO depositAccount(Long accountId, Double amount);
    AccountResponseDTO getAccountById(Long accountId);



}
