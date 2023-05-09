package com.company.cardsaver.screen.currency;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.Currency;

@UiController("Currency.edit")
@UiDescriptor("currency-edit.xml")
@EditedEntityContainer("currencyDc")
public class CurrencyEdit extends StandardEditor<Currency> {
}