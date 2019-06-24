package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    private CurrencyType myType = CurrencyType.EURO;

    @Override
    public Double convert(CurrencyType currencyType){
        return currencyType.getRate()/myType.getRate();
    }

    @Override
    public CurrencyType getCurrencyType() {
        return myType;
    }
}
