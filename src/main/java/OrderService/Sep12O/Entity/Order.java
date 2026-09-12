package OrderService.Sep12O.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private double price  ;
    private int quantity;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
