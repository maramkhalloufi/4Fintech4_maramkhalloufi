package tn.esprit.asi.autoloc.services;

import tn.esprit.asi.autoloc.entities.Paiement;
import tn.esprit.asi.autoloc.entities.ModePaiement;
import java.math.BigDecimal;
import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement Paiement);
    void supprimerPaiement(Long idPaiement);
    Paiement modifierPaiement(Paiement Paiement);
    List<Paiement> afficherListe();
    Paiement PaiementParId(Long idPaiement);
    List<Paiement> ajouterListe(List<Paiement> Paiements);
    BigDecimal getTotalPaiementsByMode(ModePaiement mode);
}
