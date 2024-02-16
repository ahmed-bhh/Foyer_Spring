package com.example.foyer.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="Foyer")

public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;
    private String nomFoyer ;

    private long capaciteFoyer;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="foyer")
    private Set<Bloc> blocSet;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;

}
