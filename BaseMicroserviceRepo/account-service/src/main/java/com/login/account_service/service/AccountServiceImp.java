package com.login.account_service.service;

import com.login.account_service.dto.AccountRequestDTO;
import com.login.account_service.dto.AccountResponseDTO;
import com.login.account_service.model.Account;
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
    public void deleteAccount(Long id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cuenta no encontrada con ID: " + id));

        accountRepository.deleteById(id);
        }



    @Override
    public AccountResponseDTO createAccount(AccountRequestDTO request) {
        Account account = AccountMapper.toEntity(request);
        Account saved = accountRepository.save(account);
        return AccountMapper.toDTO(saved);
    }

    @Override
    public AccountResponseDTO depositAccount(Long id, Double amount) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cuenta no encontrada con ID: " + id));

        account.setBalance(account.getBalance()+amount);
        Account updated = accountRepository.save(account);

        return AccountMapper.toDTO(updated);
    }

    @Override
    public AccountResponseDTO getAccountById(Long id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Cuenta no encontrada con ID: " + id));
        return AccountMapper.toDTO(account);
    }
}
