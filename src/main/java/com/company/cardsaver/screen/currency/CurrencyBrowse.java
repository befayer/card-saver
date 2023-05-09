package com.company.cardsaver.screen.currency;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.Currency;

@UiController("Currency.browse")
@UiDescriptor("currency-browse.xml")
@LookupComponent("currenciesTable")
public class CurrencyBrowse extends StandardLookup<Currency> {
}