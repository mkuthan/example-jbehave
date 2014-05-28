package example.jbehave.app.domain;

import java.math.BigDecimal;

public class Money {

    private BigDecimal amount;

    private String currency;

    public Money(BigDecimal amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money(String amount, String currency) {
        this(new BigDecimal(amount), currency);
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
