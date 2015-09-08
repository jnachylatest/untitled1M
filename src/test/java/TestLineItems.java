import org.junit.Test;
import pl.jarek.examples.ecommerce.Item;
import pl.jarek.examples.ecommerce.ItemType;
import pl.jarek.examples.ecommerce.LineItems;

/**
 * Created by Jarek on 2015-09-02.
 */
public class TestLineItems {

    @Test
    public void testGetTotalPrice(){

        LineItems lineItems= new LineItems();

        lineItems.addItem(new Item(ItemType.BOOK,50,1));
        lineItems.addItem(new Item(ItemType.BOOK, 50, 1));
        lineItems.addItem(new Item(ItemType.CD, 10, 1));

        int totalPrice = lineItems.totalPrice();
        assert totalPrice == 110 : "GOT "+totalPrice+" EXPECTED 110";

    };

    @Test
    public void testIsOnlyBooks(){

        LineItems lineItems= new LineItems();

        lineItems.addItem(new Item(ItemType.BOOK, 50, 1));
        lineItems.addItem(new Item(ItemType.BOOK, 50, 1));

        assert lineItems.onlyBooks() == true;

        lineItems.addItem(new Item(ItemType.CD, 50, 1));

        assert lineItems.onlyBooks() == false;
    };

}
