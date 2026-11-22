package tn.esprit.asi.autoloc.entities;


import   jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
//@Table(name = "Res")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idReservation;
   // @Column(nullable = false, unique = true)
    LocalDate dateDebut;
    LocalDate dateFin;
    @Enumerated(EnumType.STRING)
    StatutReservation statut;

    public Reservation() {

    }

    public long getIdReservation() {
        return idReservation;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public StatutReservation getStatut() {
        return statut;
    }

    public void setIdReservation(long idReservation) {
        this.idReservation = idReservation;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public void setStatut(StatutReservation statut) {
        this.statut = statut;
    }

    public Reservation(long idReservation, LocalDate dateDebut, LocalDate dateFin, StatutReservation statut) {
        this.idReservation = idReservation;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.statut = statut;
    }


    @ManyToOne
    private Vehicule vehicule;

    @ManyToOne
    private Client client;

    @OneToOne(mappedBy = "reservation")
    private Contrat contrat;


}
