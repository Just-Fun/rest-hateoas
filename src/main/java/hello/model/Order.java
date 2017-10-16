package hello.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.hateoas.ResourceSupport;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order extends ResourceSupport {
    private String orderId;
    private double price;
    private int quantity;

    /*public Order() {
        super();
    }

    public Order(final String orderId, final double price, final int quantity) {
        super();
        this.orderId = orderId;
        this.price = price;
        this.quantity = quantity;
    }*/

}