package pl.jarek.examples.ecommerce.shipping;

import pl.jarek.examples.ecommerce.Orders;

/**
 * Created by Jarek on 2015-09-04.
 */
public class StandardShippingStrategy extends AbstractShippingStrategy {
    public StandardShippingStrategy(Orders pOrders) {
        super(pOrders);
    }

    @Override
    public int shippingCost() {
        return 15;
    }
}
