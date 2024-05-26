package hind.gadany.ebanking.repositories;

import hind.gadany.ebanking.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
