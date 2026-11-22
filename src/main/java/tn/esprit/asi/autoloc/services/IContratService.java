package tn.esprit.asi.autoloc.services;

import tn.esprit.asi.autoloc.entities.Contrat;

import java.time.LocalDate;
import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat Contrat);
    void supprimerContrat(Long idContrat);
    Contrat modifierContrat(Contrat Contrat);
    List<Contrat> afficherListe();
    Contrat ContratParId(Long idContrat);
    List<Contrat> ajouterListe(List<Contrat> Contrats);

    Contrat ajouterReservation(Contrat c, LocalDate debut);
}
