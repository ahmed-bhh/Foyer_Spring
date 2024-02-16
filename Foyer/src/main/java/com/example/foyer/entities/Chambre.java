package com.example.foyer.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="Chambre")

public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numeroChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC ;

    @ManyToOne
    private Bloc bloc;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Reservation> reservationSet;

}
