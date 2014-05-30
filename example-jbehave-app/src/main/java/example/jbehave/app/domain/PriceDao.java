package example.jbehave.app.domain;

public interface PriceDao {

    void save(StockKeepingUnit sku, Money price);

    Money findBySku(StockKeepingUnit sku);

}
