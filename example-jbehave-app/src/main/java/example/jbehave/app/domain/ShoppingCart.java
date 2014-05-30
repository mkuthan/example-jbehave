package example.jbehave.app.domain;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private CustomerIdentifier customerIdentifier;

    private List<ShoppingCartItem> items = new ArrayList<>();

    public ShoppingCart(CustomerIdentifier customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    public CustomerIdentifier getCustomerIdentifier() {
        return customerIdentifier;
    }

    public void addItem(ShoppingCartItem item) {
        this.items.add(item);
    }

    public int numberOfItems() {
        return items.size();
    }

}
