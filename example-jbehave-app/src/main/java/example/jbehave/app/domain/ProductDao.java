package example.jbehave.app.domain;

public interface ProductDao {

    void save(Product product);

    Product findByName(String name);

}
