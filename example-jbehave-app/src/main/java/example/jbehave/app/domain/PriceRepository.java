package example.jbehave.app.domain;

public interface PriceRepository {

    void save(StockKeepingUnit sku, Money price);

    Money findBySku(StockKeepingUnit sku);

}
