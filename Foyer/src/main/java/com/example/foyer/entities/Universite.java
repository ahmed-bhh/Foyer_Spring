package com.example.foyer.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Universite")
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUniveriste;

    private String nomUniversite;

    private String adresse;
@OneToOne
    private Foyer foyer;
}
