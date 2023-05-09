package com.company.cardsaver.screen.account;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.Account;

@UiController("Account.edit")
@UiDescriptor("account-edit.xml")
@EditedEntityContainer("accountDc")
public class AccountEdit extends StandardEditor<Account> {
}