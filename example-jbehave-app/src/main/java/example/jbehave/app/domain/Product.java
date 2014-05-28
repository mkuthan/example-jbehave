package example.jbehave.app.domain;

public class Product {

    private StockKeepingUnit sku;

    private String name;

    public Product(StockKeepingUnit sku, String name) {
        this.sku = sku;
        this.name = name;
    }

    public StockKeepingUnit getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }
}
