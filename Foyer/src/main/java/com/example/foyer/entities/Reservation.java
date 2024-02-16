package com.example.foyer.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Reservation")

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String idReservation;

    private Date anneUniversitaire;

    private boolean estValide;

    @ManyToMany(cascade = CascadeType.ALL)
private Set<Etudiant> etudiantSet;
}
