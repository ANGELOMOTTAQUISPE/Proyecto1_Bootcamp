package Proyecto1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("fixedTermAccount")
@Data
@NoArgsConstructor
public class FixedTermAccount {
    @Id
    private String idProducto;
    private String idClient;
    private String accountNumber;
    private Double movement;
    private Double balance;
}
