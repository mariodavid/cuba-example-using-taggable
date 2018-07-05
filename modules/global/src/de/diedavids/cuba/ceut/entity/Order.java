package de.diedavids.cuba.ceut.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|customer,orderDate")
@Table(name = "CEUT_ORDER")
@Entity(name = "ceut$Order")
public class Order extends StandardEntity {
    private static final long serialVersionUID = 3935991968221446564L;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "ORDER_DATE", nullable = false)
    protected Date orderDate;

    @Lookup(type = LookupType.DROPDOWN)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }


}