package pl.jarek.examples.ecommerce;

import pl.jarek.examples.ecommerce.shipping.AbroadShippingStrategy;
import pl.jarek.examples.ecommerce.shipping.AbstractShippingStrategy;
import pl.jarek.examples.ecommerce.shipping.BookPromoShippingStrategy;
import pl.jarek.examples.ecommerce.shipping.StandardShippingStrategy;

/**
 * Created by Jarek on 2015-09-01.
 */
public class Orders {

    private final LineItems lineItems = new LineItems();

    private Country country = null;

    public Orders(Country pCountry){
        country = pCountry;};

    public void addItem (Item item){
        lineItems.addItem(item);
    }

    //Jezeli suma > 200 i ksiazki niedoliczamy kosztu wysylki
    //Za granice = + 50
    //Za granice i  waga > 10 = + 70

    public int summary(){
        return deliveryPrice() + lineItems.totalPrice();
    }

    private int deliveryPrice() {
        int deliveryPrice = 0;

        if (lineItems.onlyBooks() && lineItems.totalPrice() > 200) return 0;

        if (lineItems.onlyBooks()) deliveryPrice += 5; else deliveryPrice += 15;

        if (country.equals(Country.ABROAD) && lineItems.totalWeight() > 10) {
            deliveryPrice += 70;
        }else if(country.equals(Country.ABROAD) && lineItems.totalWeight() <= 10){
            deliveryPrice += 50;
        }
        return deliveryPrice;
    };

    //===============================================================================================
    //Rozwiazanie jelskiego
    public int getTotal() {
        return lineItems.totalPrice()
                +
                shippingStrategy().shippingCost();
    }

    private AbstractShippingStrategy shippingStrategy() {
        if (isCountryAbroad()) {
            return  new AbroadShippingStrategy(this);
        }
        if (hasOnlyBooks()) {
            return  new BookPromoShippingStrategy(this);
        }
        return  new StandardShippingStrategy(this);
    }

    private boolean hasOnlyBooks() {
        return lineItems.onlyBooks();
    }

    public int totalPrice() {
        return lineItems.totalPrice();
    }

    private boolean isCountryAbroad() {
        return !country.equals(Country.POLAND);
    }

    public double totalWeight() {
        return lineItems.totalWeight();
    }
}
