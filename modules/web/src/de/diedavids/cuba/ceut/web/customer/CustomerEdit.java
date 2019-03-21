package de.diedavids.cuba.ceut.web.customer;

import com.haulmont.cuba.gui.screen.*;
import de.diedavids.cuba.ceut.entity.Customer;

@UiController("ceut$Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}