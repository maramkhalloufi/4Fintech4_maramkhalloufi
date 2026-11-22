package tn.esprit.asi.autoloc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.autoloc.entities.Reservation;
import tn.esprit.asi.autoloc.entities.StatutReservation;
import tn.esprit.asi.autoloc.services.IReservationService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationController {

    private final IReservationService ires;

    @PostMapping("/addRes")
    Reservation ajouterR (Reservation reservation) {

        return ires.ajouterReservation(reservation);
    }
    @DeleteMapping("/deleteRes/{idReservation}")
    void supprimerReservation(@PathVariable Long idReservation) {
        ires.supprimerReservation(idReservation);
    }
    @PutMapping("/modifierRes")
    public Reservation modifierReservation(
            @RequestBody Reservation reservation) {
        return ires.modifierReservation(reservation);
    }
    @GetMapping("/afficherListe")
    public List<Reservation> afficherListe() {
        return ires.afficherListe();
    }
    @GetMapping("/reservationParId/{idReservation}")
    public Reservation reservationParId(
            @PathVariable Long idReservation) {
        return ires.reservationParId(idReservation);
    }
    @PostMapping("/ajouterListe")
    public List<Reservation> ajouterListe(
            @RequestBody List<Reservation> reservations) {
        return ires.ajouterListe(reservations);
    }

    @GetMapping("/searchByDate/{date}")
    public Reservation selectRByDB(@PathVariable LocalDate date) {
        return ires.selectRByDB(date);
    }
    @GetMapping("/selectByFindEtStatut/{debut}/{fin}/{s}")
    public List<Reservation> selectByFinEtStatut(
            @PathVariable LocalDate debut, @PathVariable LocalDate fin, @PathVariable StatutReservation s) {
        return ires.selectByFinEtStatut(debut, fin, s);
    }

   @GetMapping("/getRDS/{date}/{statut}")
   public List<Reservation> getReservations(
          @PathVariable LocalDate date, @PathVariable  StatutReservation statut) {
       return ires.getReservations(date, statut);
    }

    @GetMapping("/findReservationsByEquipement/{libelle}")
    public List<Reservation> findReservationsByEquipement(
            @PathVariable String libelle) {

        return ires.findReservationsByEquipement(libelle);
    }
    
}
