package example.jbehave.app.domain;

public interface ShoppingCartRepository {

    void add(ShoppingCart shoppingCart);

    ShoppingCart load(CustomerIdentifier customerIdentifier);

}
