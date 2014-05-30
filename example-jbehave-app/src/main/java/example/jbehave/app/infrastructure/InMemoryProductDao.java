package example.jbehave.app.infrastructure;

import example.jbehave.app.domain.Product;
import example.jbehave.app.domain.ProductDao;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryProductDao implements ProductDao {

    private Map<String, Product> products = new HashMap<>();

    @Override
    public void save(Product product) {
        products.put(product.getName(), product);
    }

    @Override
    public Product findByName(String name) {
        return products.get(name);
    }
}
