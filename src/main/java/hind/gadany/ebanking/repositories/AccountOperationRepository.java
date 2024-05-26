package hind.gadany.ebanking.repositories;

import hind.gadany.ebanking.entities.AccountOperation;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long> {
    List<AccountOperation> findByBankAccountId(String accountId);
    List<AccountOperation> findByBankAccountId(String accountId,  Pageable pageable);
}
