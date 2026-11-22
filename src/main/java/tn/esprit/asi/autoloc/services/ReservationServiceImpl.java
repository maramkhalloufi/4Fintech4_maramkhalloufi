package tn.esprit.asi.autoloc.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.asi.autoloc.entities.Reservation;
import tn.esprit.asi.autoloc.entities.StatutReservation;
import tn.esprit.asi.autoloc.repositories.ReservationRepository;

import java.time.LocalDate;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository rrep;


    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return rrep.save(reservation);
    }

    @Override
    public void supprimerReservation(Long idReservation) {
        rrep.deleteById(idReservation);

    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        return rrep.save(reservation);
    }

    @Override
    public List<Reservation> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Reservation reservationParId(Long idReservation) {
        return rrep.findById(idReservation).orElse(null);
    }

    @Override
    public List<Reservation> ajouterListe(List<Reservation> reservations) {
        return rrep.saveAll(reservations);
    }
    public Reservation selectRByDB(LocalDate date) {
        return rrep.findByDateDebutGreaterThan(date);

    }

    @Override
    public List<Reservation> selectByFinEtStatut(LocalDate debut, LocalDate fin, StatutReservation s) {
        return rrep.findAllByDateFinBetweenAndStatut( debut,  fin, s);
    }

    @Override
    public List<Reservation> getReservations(
            LocalDate date, StatutReservation statut) {
        return rrep.getReservations(date, statut);
    }
    @Override
    public List<Reservation> getRByDebutStatut(
            LocalDate date, StatutReservation s) {

        return rrep.getReservations(date, s);
    }


    @Override
    public List<Reservation> findReservationsByEquipement(String libelle) {
        return rrep.findReservationsByEquipement(libelle);
    }


}
