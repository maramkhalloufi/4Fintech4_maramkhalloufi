package tn.esprit.asi.autoloc.services;

import tn.esprit.asi.autoloc.entities.Reservation;
import tn.esprit.asi.autoloc.entities.StatutReservation;

import java.time.LocalDate;
import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    void supprimerReservation(Long idReservation);
    Reservation modifierReservation(Reservation reservation);
    List<Reservation> afficherListe();
    Reservation reservationParId(Long idReservation);
    List<Reservation> ajouterListe(List<Reservation> reservations);

    Reservation selectRByDB(LocalDate date);
    List<Reservation> selectByFinEtStatut (LocalDate debut, LocalDate fin, StatutReservation s);
    List<Reservation> getRByDebutStatut(LocalDate date,
                                       StatutReservation s);


    List<Reservation> getReservations(LocalDate date, StatutReservation statut);

    List<Reservation> findReservationsByEquipement(String libelle);

}

