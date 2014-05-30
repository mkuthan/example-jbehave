package example.jbehave.tests.steps;

import example.jbehave.app.domain.*;
import org.jbehave.core.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

@Steps
public class ShoppingCartSteps {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Autowired
    private ProductDao productRepository;

    @Given("empty shopping cart")
    public void emptyShoppingCart() {
        shoppingCartService.createEmptyShoppingCart();
    }

    @When("products are added to the shopping cart: $productNames")
    public void addProducts(List<ShoppingCartRow> rows) {
        for (ShoppingCartRow row : rows) {
            Product product = productRepository.findByName(row.getProductName());
            shoppingCartService.addProductToShoppingCart(product.getSku(), row.getQuantity());
        }
    }

    @Then("shopping cart is empty")
    public void isEmpty() {
        ShoppingCart shoppingCart = shoppingCartService.getShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
    }

    @Then("the number of products in shopping cart is $numberOfItems")
    public void numberOfItems(int numberOfItems) {
        ShoppingCart shoppingCart = shoppingCartService.getShoppingCart();
        assertEquals(numberOfItems, shoppingCart.numberOfItems());
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
