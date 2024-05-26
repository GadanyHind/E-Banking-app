package hind.gadany.ebanking.mappers;

import hind.gadany.ebanking.dtos.AccountOperationDTO;
import hind.gadany.ebanking.dtos.CurrentBankAccountDto;
import hind.gadany.ebanking.dtos.CustomerDto;
import hind.gadany.ebanking.dtos.SavingBankAccountDto;
import hind.gadany.ebanking.entities.AccountOperation;
import hind.gadany.ebanking.entities.Costumer;
import hind.gadany.ebanking.entities.CurrentAccount;
import hind.gadany.ebanking.entities.SavingAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class BankAccountMapperImpl {
    public CustomerDto formCustomer(Costumer costumer){
        CustomerDto customerDto=new CustomerDto();
        BeanUtils.copyProperties(costumer,customerDto);
        return customerDto;
    }
    public Costumer fromCustomerDto(CustomerDto customerDto){
        Costumer costumer=new Costumer();
        BeanUtils.copyProperties(customerDto,costumer);
        return costumer;
    }
    public SavingBankAccountDto fromSavingBankAccount(SavingAccount savingAccount){
        SavingBankAccountDto savingBankAccountDTO=new SavingBankAccountDto();
        BeanUtils.copyProperties(savingAccount,savingBankAccountDTO);
        savingBankAccountDTO.setCostumerDto(formCustomer(savingAccount.getCostumer()));
        savingBankAccountDTO.setType(savingAccount.getClass().getSimpleName());
        return savingBankAccountDTO;
    }

    public SavingAccount fromSavingBankAccountDTO(SavingBankAccountDto savingBankAccountDTO){
        SavingAccount savingAccount=new SavingAccount();
        BeanUtils.copyProperties(savingBankAccountDTO,savingAccount);
        savingAccount.setCostumer(fromCustomerDto(savingBankAccountDTO.getCostumerDto()));
        return savingAccount;
    }

    public CurrentBankAccountDto fromCurrentBankAccount(CurrentAccount currentAccount){
        CurrentBankAccountDto currentBankAccountDTO=new CurrentBankAccountDto();
        BeanUtils.copyProperties(currentAccount,currentBankAccountDTO);
        currentBankAccountDTO.setCostumerDto(formCustomer(currentAccount.getCostumer()));
        currentBankAccountDTO.setType(currentAccount.getClass().getSimpleName());
        return currentBankAccountDTO;
    }

    public CurrentAccount fromCurrentBankAccountDTO(CurrentBankAccountDto currentBankAccountDTO){
        CurrentAccount currentAccount=new CurrentAccount();
        BeanUtils.copyProperties(currentBankAccountDTO,currentAccount);
        currentAccount.setCostumer(fromCustomerDto(currentBankAccountDTO.getCostumerDto()));
        return currentAccount;
    }

    public AccountOperationDTO fromAccountOperation(AccountOperation accountOperation){
        AccountOperationDTO accountOperationDTO=new AccountOperationDTO();
        BeanUtils.copyProperties(accountOperation,accountOperationDTO);
        return accountOperationDTO;
    }


}
