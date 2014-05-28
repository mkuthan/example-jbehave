package example.jbehave.tests.converters;

import example.jbehave.app.domain.Money;
import org.jbehave.core.annotations.AsParameterConverter;
import org.jbehave.core.steps.ParameterConverters;
import org.springframework.util.StringUtils;

@Converter
public class MoneyConverter {

    @AsParameterConverter
    public Money convertPercent(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }

        String[] tokens = value.split("\\s");
        if (tokens.length != 2) {
            throw new ParameterConverters.ParameterConvertionFailed("Expected 2 tokens (amount and currency) but got " + tokens.length + ", value: " + value + ".");
        }

        return new Money(tokens[0], tokens[1]);
    }
}
