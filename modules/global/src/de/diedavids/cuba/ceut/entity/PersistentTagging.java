package de.diedavids.cuba.ceut.entity;

import javax.persistence.Entity;
import com.haulmont.cuba.core.entity.annotation.Extends;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import de.diedavids.cuba.taggable.entity.Tagging;

@Extends(Tagging.class)
@Entity(name = "ceut$PersistentTagging")
public class PersistentTagging extends Tagging {
    private static final long serialVersionUID = 6795917365659671988L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }


}