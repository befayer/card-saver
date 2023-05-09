package com.company.cardsaver.screen.card;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.Card;

@UiController("Card.browse")
@UiDescriptor("card-browse.xml")
@LookupComponent("cardsTable")
public class CardBrowse extends StandardLookup<Card> {
}