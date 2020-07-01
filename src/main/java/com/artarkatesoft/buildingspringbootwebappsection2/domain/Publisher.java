package com.artarkatesoft.buildingspringbootwebappsection2.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany
    @JoinColumn(name = "publisher_id")
    @ToString.Exclude
    private Set<Book> books = new HashSet<>();

    public Publisher(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}
