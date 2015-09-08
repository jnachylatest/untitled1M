package pl.jarek.examples.ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Jarek on 2015-09-02.
 */
public class LineItems {

    private final List<Item> listItems = new ArrayList();

    public void addItem(Item pItem) {
        listItems.add(pItem);
    }

    public int totalPrice() {
        return listItems
                .stream()
                .map(Item::getPrice)
                .reduce(0, (a, b) -> a + b);
    };

    public boolean onlyBooks(){
        return listItems
                .stream()
                .map(Item::getType)
                .allMatch(Predicate.isEqual(ItemType.BOOK));
    }

    public int totalWeight() {
        return listItems
                .stream()
                .map(Item::getWeight)
                .reduce(0, (a, b) -> a + b);
    }
}