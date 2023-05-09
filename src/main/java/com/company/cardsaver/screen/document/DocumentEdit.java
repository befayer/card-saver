package com.company.cardsaver.screen.document;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.Document;

@UiController("Document.edit")
@UiDescriptor("document-edit.xml")
@EditedEntityContainer("documentDc")
public class DocumentEdit extends StandardEditor<Document> {
}