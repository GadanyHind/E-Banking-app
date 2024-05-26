package hind.gadany.ebanking.dtos;

import lombok.Data;
import hind.gadany.ebanking.enums.AccountStatus;

import java.util.Date;

@Data
public class CurrentBankAccountDto extends BankAccountDto{

    private String id;
    private double balance;
    private Date creationDate;
    private AccountStatus status;
    private CustomerDto costumerDto;
    private double overDraft;
}
