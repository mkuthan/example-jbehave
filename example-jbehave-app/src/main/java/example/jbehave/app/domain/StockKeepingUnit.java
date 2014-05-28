package example.jbehave.app.domain;

public class StockKeepingUnit {

    private String sku;

    public StockKeepingUnit(String sku) {
        this.sku = sku;
    }

    public String getSku() {
        return sku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockKeepingUnit that = (StockKeepingUnit) o;

        return !(sku != null ? !sku.equals(that.sku) : that.sku != null);

    }

    @Override
    public int hashCode() {
        return sku != null ? sku.hashCode() : 0;
    }

    @Override
    public String toString() {
        return sku;
    }
}
