package ma.usmba.springbankbackend.services;

import ma.usmba.springbankbackend.dtos.*;
import ma.usmba.springbankbackend.entities.BankAccount;
import ma.usmba.springbankbackend.entities.CurrentAccount;
import ma.usmba.springbankbackend.entities.Customer;
import ma.usmba.springbankbackend.entities.SavingAccount;
import ma.usmba.springbankbackend.exceptions.BalanceNotSufficientException;
import ma.usmba.springbankbackend.exceptions.BankAccountNotFoundException;
import ma.usmba.springbankbackend.exceptions.CustomerNotFoundException;

import java.util.List;

public interface BankAccountService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    CurrentBankAccountDTO saveCurrentBankAccount(double initialBalance, double overDraft, Long customerId) throws CustomerNotFoundException;
    SavingBankAccountDTO saveSavingBankAccount(double initialBalance, double interestRate, Long customerId) throws CustomerNotFoundException;
    List<CustomerDTO> listCustomers();
    BankAccountDTO getBankAccount(String accountId) throws BankAccountNotFoundException;
    void debit(String accountId, double amount, String description) throws BankAccountNotFoundException, BalanceNotSufficientException;
    void credit(String accountId, double amount, String description) throws BalanceNotSufficientException, BankAccountNotFoundException;
    void transfer(String accountIdSource, String accountIdDestination, double amount) throws BankAccountNotFoundException, BalanceNotSufficientException;

    List<BankAccountDTO> bankAccountList();

    CustomerDTO getCustomer(Long customerId) throws CustomerNotFoundException;

    CustomerDTO updateCustomer(CustomerDTO customerDTO);

    void deleteCustomer(Long customerId);

    List<AccountOperationDTO> accountHistory(String accountId);
}
