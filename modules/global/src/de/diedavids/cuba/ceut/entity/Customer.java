package de.diedavids.cuba.ceut.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|name")
@Table(name = "CEUT_CUSTOMER")
@Entity(name = "ceut$Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 2263337300282568L;

    @Column(name = "NAME")
    protected String name;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "customer")
    protected List<Order> orders;

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        return orders;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}