package pl.jarek.examples.ecommerce.shipping;

import pl.jarek.examples.ecommerce.Orders;

/**
 * Created by Jarek on 2015-09-04.
 */
public abstract class AbstractShippingStrategy {

    protected final Orders orders;

    public AbstractShippingStrategy(Orders pOrders) {
        orders = pOrders;
    }

    public abstract int shippingCost();
}
