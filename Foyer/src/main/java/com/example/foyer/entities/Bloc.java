package com.example.foyer.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="Bloc")

public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;

    private String nomBloc;

    private long capaciteBloc;

@ManyToOne
    private Foyer foyer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy="bloc")
    private Set<Chambre> chambreSet;



}
