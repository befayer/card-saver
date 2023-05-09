package com.company.cardsaver.screen.document;

import io.jmix.ui.screen.*;
import com.company.cardsaver.entity.Document;

@UiController("Document.browse")
@UiDescriptor("document-browse.xml")
@LookupComponent("documentsTable")
public class DocumentBrowse extends StandardLookup<Document> {
}