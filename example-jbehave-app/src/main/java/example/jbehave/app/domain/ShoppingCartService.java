package example.jbehave.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartService {

    @Autowired
    private SystemService systemService;

    @Autowired
    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private PriceDao priceRepository;

    public void createEmptyShoppingCart() {
        CustomerIdentifier customerIdentifier = systemService.authenticatedCustomer();

        ShoppingCart emptyShoppingCart = new ShoppingCart(customerIdentifier);
        shoppingCartRepository.add(emptyShoppingCart);
    }

    public void addProductToShoppingCart(StockKeepingUnit sku, int quantity) {
        CustomerIdentifier customerIdentifier = systemService.authenticatedCustomer();
        Money price = priceRepository.findBySku(sku);

        ShoppingCart shoppingCart = shoppingCartRepository.load(customerIdentifier);
        shoppingCart.addItem(new ShoppingCartItem(sku, quantity, price));
    }

    public ShoppingCart getShoppingCart() {
        CustomerIdentifier customerIdentifier = systemService.authenticatedCustomer();
        return shoppingCartRepository.load(customerIdentifier);
    }

}
