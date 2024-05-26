package hind.gadany.ebanking.services;

import lombok.ToString;
import hind.gadany.ebanking.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ToString
public class BankService {
    @Autowired
    public BankAccountRepository bankAccountRepository;
    public void consulter(){

    }

}
