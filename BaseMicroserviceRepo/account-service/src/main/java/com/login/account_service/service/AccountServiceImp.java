package com.login.account_service.service;

import com.login.account_service.dto.AccountRequestDTO;
import com.login.account_service.dto.AccountResponseDTO;
import com.login.account_service.repository.AccountRepository;
import com.login.account_service.utils.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImp implements AccountService{

    @Autowired
    AccountRepository accountRepository;

    @Override
    public List<AccountResponseDTO> getAllAccount() {

        return accountRepository.findAll().stream()
                .map(AccountMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAccount(Long accountId) {

    }





    @Override
    public AccountResponseDTO createAccount(AccountRequestDTO request) {
        return null;
    }

    @Override
    public AccountResponseDTO depositAccount(Long accountId, Double amount) {
        return null;
    }

    @Override
    public AccountResponseDTO getAccountById(Long accountId) {
        return null;
    }
}
