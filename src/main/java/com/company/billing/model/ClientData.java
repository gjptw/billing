package com.company.billing.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "client_data")
@EqualsAndHashCode(exclude = {"authorizedUser"})
@ToString(exclude = {"authorizedUser"})
public class ClientData extends BaseEntity {

    @Column(name = "rate", nullable = false)
    private Long rate;

    @JoinColumn(name = "balance", nullable = false)
    private Long balance;

    //@JsonIgnore
    @OneToOne(mappedBy = "client")
    private Client authorizedUser;

}
