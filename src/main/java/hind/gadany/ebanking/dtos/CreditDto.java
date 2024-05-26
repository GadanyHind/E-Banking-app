package hind.gadany.ebanking.dtos;

import lombok.Data;

@Data
public class CreditDto {
    double amount;
    String description;
    String accountId;

}
