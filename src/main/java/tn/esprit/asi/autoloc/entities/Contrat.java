package tn.esprit.asi.autoloc.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;

    private LocalDate dateSignature;

    private BigDecimal montantTotal;

    private boolean valide;

    @OneToOne
    private Reservation reservation;

    @OneToMany(mappedBy = "contrat")
    private List<Paiement> paiements;

    public void setReservation(Reservation res) {
    }
}