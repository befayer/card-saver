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
@ResourceRole(name = "Manager", code = "manager", scope = "UI")
public interface ManagerRole {
    @EntityAttributePolicy(entityClass = Account.class, attributes = {"currency", "bank", "balance", "accountStatus"}, action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = Account.class, attributes = "id", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Account.class, actions = {EntityPolicyAction.CREATE, EntityPolicyAction.READ, EntityPolicyAction.UPDATE})
    void account();

    @EntityAttributePolicy(entityClass = Bank.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Bank.class, actions = EntityPolicyAction.READ)
    void bank();

    @EntityAttributePolicy(entityClass = Card.class, attributes = {"dateStart", "dateEnd", "cvc", "isActive", "account", "balance"}, action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = Card.class, attributes = "id", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Card.class, actions = {EntityPolicyAction.READ, EntityPolicyAction.CREATE, EntityPolicyAction.UPDATE})
    void card();

    @EntityAttributePolicy(entityClass = Client.class, attributes = {"birthday", "patronymic", "lastName", "firstName"}, action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = Client.class, attributes = "id", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Client.class, actions = {EntityPolicyAction.CREATE, EntityPolicyAction.READ, EntityPolicyAction.UPDATE})
    void client();

    @EntityAttributePolicy(entityClass = Currency.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Currency.class, actions = EntityPolicyAction.READ)
    void currency();

    @EntityAttributePolicy(entityClass = Document.class, attributes = {"client", "documentType", "isActive", "issueOrganization", "dateStart"}, action = EntityAttributePolicyAction.MODIFY)
    @EntityAttributePolicy(entityClass = Document.class, attributes = "id", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = Document.class, actions = {EntityPolicyAction.READ, EntityPolicyAction.CREATE, EntityPolicyAction.UPDATE})
    void document();

    @EntityAttributePolicy(entityClass = DocumentType.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = DocumentType.class, actions = EntityPolicyAction.READ)
    void documentType();

    @EntityAttributePolicy(entityClass = User.class, attributes = "*", action = EntityAttributePolicyAction.VIEW)
    @EntityPolicy(entityClass = User.class, actions = EntityPolicyAction.READ)
    void user();

    @MenuPolicy(menuIds = {"Bank.browse", "Account.browse", "Client.browse", "Card.browse", "Document.browse", "DocumentType.browse", "Currency.browse", "themeSettingsScreen"})
    @ScreenPolicy(screenIds = {"Bank.browse", "Account.browse", "Client.browse", "Card.browse", "Document.browse", "DocumentType.browse", "Currency.browse", "Account.edit", "Card.edit", "Client.edit", "Document.edit", "Bank.edit", "Currency.edit", "themeSettingsScreen"})
    void screens();
}