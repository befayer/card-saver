package com.company.cardsaver.security;

import com.company.cardsaver.entity.*;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

import javax.annotation.Nonnull;

@Nonnull
@ResourceRole(name = "Governor", code = "governor")
public interface GovernorRole {
    @EntityAttributePolicy(entityClass = Account.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Account.class, actions = EntityPolicyAction.ALL)
    void account();

    @EntityAttributePolicy(entityClass = Bank.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Bank.class, actions = EntityPolicyAction.ALL)
    void bank();

    @EntityAttributePolicy(entityClass = Card.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Card.class, actions = EntityPolicyAction.ALL)
    void card();

    @EntityAttributePolicy(entityClass = Client.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Client.class, actions = EntityPolicyAction.ALL)
    void client();

    @EntityAttributePolicy(entityClass = Currency.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Currency.class, actions = EntityPolicyAction.ALL)
    void currency();

    @EntityAttributePolicy(entityClass = Document.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Document.class, actions = EntityPolicyAction.ALL)
    void document();

    @EntityAttributePolicy(entityClass = DocumentType.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = DocumentType.class, actions = EntityPolicyAction.ALL)
    void documentType();

    @EntityAttributePolicy(entityClass = User.class, attributes = "active", action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = User.class, attributes = {"id", "picture", "version", "username", "password", "firstName", "lastName", "email", "timeZoneId"}, action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = User.class, actions = {EntityPolicyAction.READ, EntityPolicyAction.UPDATE})
    void user();

    @MenuPolicy(menuIds = {"themeSettingsScreen", "Bank.browse", "Account.browse", "Card.browse", "Client.browse", "Document.browse", "DocumentType.browse", "Currency.browse", "User.browse"})
    @ScreenPolicy(screenIds = {"themeSettingsScreen", "Bank.browse", "Account.browse", "Card.browse", "Client.browse", "Document.browse", "DocumentType.browse", "Currency.browse", "Account.edit", "Bank.edit", "Card.edit", "Client.edit", "Currency.edit", "Document.edit", "DocumentType.edit", "User.edit", "User.browse"})
    void screens();
}