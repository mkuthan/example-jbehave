package example.jbehave.app.domain;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<ShoppingCartItem> items = new ArrayList<>();

    public void addItem(ShoppingCartItem item) {
        this.items.add(item);
    }

    public int numberOfItems() {
        return items.size();
    }

    public List<ShoppingCartItem> getItems() {
        return items;
    }
}
