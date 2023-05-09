package com.company.cardsaver.screen.account;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.Account;

@UiController("Account.browse")
@UiDescriptor("account-browse.xml")
@LookupComponent("accountsTable")
public class AccountBrowse extends StandardLookup<Account> {
}