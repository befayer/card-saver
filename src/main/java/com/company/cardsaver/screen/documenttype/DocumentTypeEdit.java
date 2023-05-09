package com.company.cardsaver.screen.documenttype;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.DocumentType;

@UiController("DocumentType.edit")
@UiDescriptor("document-type-edit.xml")
@EditedEntityContainer("documentTypeDc")
public class DocumentTypeEdit extends StandardEditor<DocumentType> {
}