package pl.jarek.examples.ecommerce.shipping;

import pl.jarek.examples.ecommerce.Orders;

/**
 * Created by Jarek on 2015-09-04.
 */
public class BookPromoShippingStrategy extends  AbstractShippingStrategy {

    public BookPromoShippingStrategy(Orders pOrders) {
        super(pOrders);
    }

    public int booksPromoShippingCost() {
        if (isSendBooksForFree()) {
            return 0;
        }
        return 5;
    }

    private boolean isSendBooksForFree() {
        return orders.totalPrice() > 200;
    }

    @Override
    public int shippingCost() {
        return booksPromoShippingCost();
    }
}
