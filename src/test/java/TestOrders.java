import org.junit.Test;
import pl.jarek.examples.ecommerce.Country;
import pl.jarek.examples.ecommerce.Item;
import pl.jarek.examples.ecommerce.ItemType;
import pl.jarek.examples.ecommerce.Orders;

/**
 * Created by Jarek on 2015-09-02.
 */
public class TestOrders {

    @Test
    public void testGetSummary(){

        Orders orders = new Orders(Country.ABROAD);

        orders.addItem(new Item(ItemType.BOOK,50,1));
        orders.addItem(new Item(ItemType.CD, 50, 1));
        orders.addItem(new Item(ItemType.BOOK, 50, 1));

        int summary = orders.summary();
        assert (summary == 215) : "GOT "+summary + " EXPECTED 215";
    }

    @Test
    public void testGetTotall(){

        Orders orders = new Orders(Country.ABROAD);

        orders.addItem(new Item(ItemType.BOOK,50,1));
        orders.addItem(new Item(ItemType.CD, 50, 10));
        orders.addItem(new Item(ItemType.BOOK, 50, 1));

        int summary = orders.getTotal();
        assert (summary == 220) : "GOT "+summary + " EXPECTED 220";
    }


}
