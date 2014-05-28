package example.jbehave.app.domain;

public class ShoppingCartItem {

    private StockKeepingUnit sku;

    private int quantity;

    private Money price;

    public ShoppingCartItem(StockKeepingUnit sku, int quantity, Money price) {
        this.sku = sku;
        this.quantity = quantity;
        this.price = price;
    }

    public StockKeepingUnit getSku() {
        return sku;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }
}
