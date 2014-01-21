package moneycalculator.Persistence;

import moneycalculator.Model.ExchangeRate;
import java.util.Date;
import moneycalculator.Model.Currency;

public interface ExchangeRateLoader {
    
    public ExchangeRate load(Date date, Currency to, Currency from);
    public ExchangeRate load(Currency to, Currency from);
}
