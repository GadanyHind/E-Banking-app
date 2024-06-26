package hind.gadany.ebanking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import hind.gadany.ebanking.enums.OperationType;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class AccountOperation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date operationDate;
    private double  amount;
    @Enumerated(EnumType.STRING)
    private OperationType type;
    @ManyToOne()
    private BankAccount bankAccount;
    private String description;
}
