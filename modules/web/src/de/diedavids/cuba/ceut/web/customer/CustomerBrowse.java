package de.diedavids.cuba.ceut.web.customer;

import com.haulmont.cuba.gui.components.ButtonsPanel;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.components.Table;
import com.haulmont.cuba.gui.screen.*;
import de.diedavids.cuba.ceut.entity.Customer;
import de.diedavids.cuba.taggable.web.WithTagsSupport;

import javax.inject.Inject;

@UiController("ceut$Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> implements WithTagsSupport {

    @Inject
    private GroupTable<Customer> customersTable;

    @Inject
    private ButtonsPanel buttonsPanel;

    @Override
    public Table getListComponent() {
        return customersTable;
    }

    @Override
    public ButtonsPanel getButtonsPanel() {
        return buttonsPanel;
    }

    @Override
    public boolean showTagsInList() {
        return true;
    }

    @Override
    public boolean showTagsAsLink() {
        return true;
    }
}
