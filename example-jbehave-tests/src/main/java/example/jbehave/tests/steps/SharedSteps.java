package example.jbehave.tests.steps;

import example.jbehave.app.domain.*;
import org.jbehave.core.annotations.Given;
import org.springframework.beans.factory.annotation.Autowired;

@Steps
public class SharedSteps {

    @Autowired
    private ProductDao productRepository;

    @Autowired
    private PriceDao priceRepository;

    @Given("product $name with SKU $sku")
    public void product(String name, StockKeepingUnit sku) {
        productRepository.save(new Product(sku, name));
    }

    @Given("product $name price is $price")
    public void price(String name, Money price) {
        Product product = productRepository.findByName(name);
        priceRepository.save(product.getSku(), price);
    }
}
