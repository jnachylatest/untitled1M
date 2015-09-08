package pl.jarek.examples.ecommerce;

/**
 * Created by Jarek on 2015-09-01.
 */
public class Item {
    private ItemType type;
    private int price;
    private int weight;

    public Item(ItemType type, int price, int weight) {
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    public ItemType getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d", type, price, weight);
    }
}
