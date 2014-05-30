package example.jbehave.app.infrastructure;

import example.jbehave.app.domain.CustomerIdentifier;
import example.jbehave.app.domain.ShoppingCart;
import example.jbehave.app.domain.ShoppingCartRepository;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryShoppingCartRepository implements ShoppingCartRepository {

    private Map<CustomerIdentifier, ShoppingCart> shoppingCarts = new HashMap<>();

    @Override
    public void add(ShoppingCart shoppingCart) {
        shoppingCarts.put(shoppingCart.getCustomerIdentifier(), shoppingCart);
    }

    @Override
    public ShoppingCart load(CustomerIdentifier customerIdentifier) {
        return shoppingCarts.get(customerIdentifier);
    }
}
