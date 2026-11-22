package tn.esprit.asi.autoloc.services;

import tn.esprit.asi.autoloc.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence Agence);
    void supprimerAgence(Long idAgence);
    Agence modifierAgence(Agence Agence);
    List<Agence> afficherListe();
    Agence AgenceParId(Long idAgence);
    List<Agence> ajouterListe(List<Agence> Agences);

}
