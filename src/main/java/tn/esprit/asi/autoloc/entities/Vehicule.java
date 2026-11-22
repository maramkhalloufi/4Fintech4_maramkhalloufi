package tn.esprit.asi.autoloc.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne
    private Agence agence;

    @ManyToMany
    private List<Equipement> equipements;


    @OneToMany(mappedBy = "vehicule")
    private List<Reservation> reservations;
}