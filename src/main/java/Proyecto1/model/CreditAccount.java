package Proyecto1.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("creditAccount")
@Data
@NoArgsConstructor
public class CreditAccount {
    @Id
    private String idProducto;
    private String idClient;
    private Double movement;
    private Double creditline;
}
