package example.jbehave.app.domain;

public interface ProductRepository {

    void save(Product product);

    Product findByName(String name);

}
