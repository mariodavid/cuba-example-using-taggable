package de.diedavids.cuba.ceut.web.order

import de.balvi.cuba.declarativecontrollers.web.browse.AnnotatableAbstractLookup
import de.diedavids.cuba.taggable.web.WithTags

@WithTags(
        listComponent = "ordersTable",
        tagContext = "orderSize",
        showTagsInList = true,
        showTagsAsLink = true,
        tagLinkOpenType = "NEW_TAB"
)
class OrderBrowse extends AnnotatableAbstractLookup {
}