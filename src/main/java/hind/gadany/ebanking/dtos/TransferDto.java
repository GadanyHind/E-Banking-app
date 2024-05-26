package hind.gadany.ebanking.dtos;

import lombok.Data;

@Data
public class TransferDto {
    String accountIdSource;
    String accountIdDest;
    double amount;
}
