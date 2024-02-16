package com.example.foyer.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="Etudiant")

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEtudiant;
    private String nomEt;

    private String prenomEt;

    private long cin;

    private String ecole;

    private Date dateNaissance;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy="etudiantSet")
    private Set<Reservation> reservationSet;


}
