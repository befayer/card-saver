package com.company.cardsaver.screen.client;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.Client;

@UiController("Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {
}