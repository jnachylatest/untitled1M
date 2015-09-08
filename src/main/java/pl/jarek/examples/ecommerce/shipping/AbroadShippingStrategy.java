package pl.jarek.examples.ecommerce.shipping;

import pl.jarek.examples.ecommerce.Orders;

/**
 * Created by Jarek on 2015-09-04.
 */
public class AbroadShippingStrategy extends AbstractShippingStrategy {

    public AbroadShippingStrategy(Orders pOrders) {
        super(pOrders);
    }

    @Override
    public int shippingCost() {
        return abroadShippingCost();
    }

    private int abroadShippingCost() {
        if (isHeavy()) {
            return 70;
        }
        return 50;
    }

    public boolean isHeavy() {
        return orders.totalWeight() > 10.0;
    }
}
