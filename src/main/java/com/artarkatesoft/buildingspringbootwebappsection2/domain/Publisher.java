package com.artarkatesoft.buildingspringbootwebappsection2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private Long id;

    private String name;
    @Embedded
    private Address address;

    public Publisher(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
