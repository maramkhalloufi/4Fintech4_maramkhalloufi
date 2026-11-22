package tn.esprit.asi.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.asi.autoloc.entities.Contrat;
import tn.esprit.asi.autoloc.entities.Reservation;
import tn.esprit.asi.autoloc.repositories.ContratRepository;
import tn.esprit.asi.autoloc.repositories.ReservationRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContratService {

    private final ContratRepository crep;
    private final ReservationRepository rrep;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return crep.save(contrat);
    }

    @Override
    public void supprimerContrat(Long idContrat) {
        crep.deleteById(idContrat);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        return crep.save(contrat);
    }

    @Override
    public List<Contrat> afficherListe() {
        return crep.findAll();
    }

    @Override
    public Contrat ContratParId(Long idContrat) {
        return crep.findById(idContrat).orElse(null);
    }

    @Override
    public List<Contrat> ajouterListe(List<Contrat> contrats) {
        return crep.saveAll(contrats);
    }

    @Override
    public Contrat ajouterReservation(Contrat c, LocalDate debut) {
        Contrat ct = crep.save(c);
        Reservation res = rrep.findByDateDebut(debut);
        ct.setReservation(res);
        return crep.save(ct);
    }
}