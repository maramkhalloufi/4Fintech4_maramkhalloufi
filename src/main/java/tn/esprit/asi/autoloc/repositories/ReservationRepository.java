package tn.esprit.asi.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.asi.autoloc.entities.Reservation;
import tn.esprit.asi.autoloc.entities.StatutReservation;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    Reservation findByDateDebutGreaterThan(LocalDate date);
    List<Reservation> findAllByDateFinBetweenAndStatut(LocalDate debut, LocalDate fin, StatutReservation s);

    @Query("SELECT r FROM Reservation r WHERE r.dateDebut > ?1 AND r.statut = ?2")
    List<Reservation> getReservations(LocalDate date, StatutReservation statut);

    // QUESTION 1
    @Query("SELECT DISTINCT r FROM Reservation r JOIN r.vehicule v JOIN v.equipements e WHERE e.libelle = ?1")
    List<Reservation> findReservationsByEquipement(String libelle);

    Reservation findByDateDebut (LocalDate d);
}
