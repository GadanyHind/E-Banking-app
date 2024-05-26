package hind.gadany.ebanking.dtos;

import lombok.Data;

@Data
public class DebitDto {
    String description;
    String accountId;
    double amount;

}
