package com.company.cardsaver.screen.card;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.Card;

@UiController("Card.edit")
@UiDescriptor("card-edit.xml")
@EditedEntityContainer("cardDc")
public class CardEdit extends StandardEditor<Card> {
}