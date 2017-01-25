package com.loxmeetsbagel.api.health;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="health")
public class HealthEntity {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOTE")
    private String note;
}
