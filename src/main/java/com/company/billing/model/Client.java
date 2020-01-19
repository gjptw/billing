package com.company.billing.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "client")
@EqualsAndHashCode(exclude = {"clientData"})
@ToString(exclude = {"clientData"})
public class Client extends BaseEntity {

    @Getter
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @JoinColumn(name = "last_name", nullable = false)
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cont_info_id", nullable = false)
    private ClientData clientData;

    public String getFirstName() {
        return firstName;
    }
}
