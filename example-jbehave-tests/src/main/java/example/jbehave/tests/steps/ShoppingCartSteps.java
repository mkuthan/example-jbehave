package example.jbehave.tests.steps;

import example.jbehave.app.domain.*;
import org.jbehave.core.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

@Steps
public class ShoppingCartSteps {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PriceRepository priceRepository;

    private ShoppingCart shoppingCart;

    @Given("empty shopping cart")
    public void emptyShoppingCart() {
        shoppingCart = new ShoppingCart();
    }

    @When("products are added to the shopping cart: $productNames")
    public void addProducts(List<ShoppingCartRow> rows) {
        for (ShoppingCartRow row : rows) {
            Product product = productRepository.findByName(row.getProductName());
            Money price = priceRepository.findBySku(product.getSku());

            shoppingCart.addItem(new ShoppingCartItem(product.getSku(), row.getQuantity(), price));
        }
    }

    @Then("shopping cart is empty")
    public void isEmpty() {
        assertEquals(shoppingCart.numberOfItems(), 0);
    }

    @Then("the number of products in shopping cart is $numberOfItems")
    public void numberOfItems(int numberOfItems) {
        assertEquals(shoppingCart.numberOfItems(), numberOfItems);
    }

    @Then("total price is $price")
    @Pending
    public void totalPrice(Money price) {
        // TODO: implement missing functionality and enable step
    }

    @AsParameters
    public static class ShoppingCartRow {

        @Parameter(name = "PRODUCT")
        private String productName;

        @Parameter(name = "QTY")
        private Integer quantity;

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Integer getQuantity() {
            return quantity;
        }

        public void setQuantity(Integer quantity) {
            this.quantity = quantity;
        }
    }


}
