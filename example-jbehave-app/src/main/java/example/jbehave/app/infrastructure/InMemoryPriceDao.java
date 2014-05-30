package example.jbehave.app.infrastructure;

import example.jbehave.app.domain.Money;
import example.jbehave.app.domain.PriceDao;
import example.jbehave.app.domain.StockKeepingUnit;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class InMemoryPriceDao implements PriceDao {

    private Map<StockKeepingUnit, Money> prices = new HashMap<>();


    @Override
    public void save(StockKeepingUnit sku, Money price) {
        prices.put(sku, price);
    }

    @Override
    public Money findBySku(StockKeepingUnit sku) {
        return prices.get(sku);
    }
}
