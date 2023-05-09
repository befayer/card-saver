package com.company.cardsaver.screen.documenttype;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.DocumentType;

@UiController("DocumentType.browse")
@UiDescriptor("document-type-browse.xml")
@LookupComponent("documentTypesTable")
public class DocumentTypeBrowse extends StandardLookup<DocumentType> {
}