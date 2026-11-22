package tn.esprit.asi.autoloc.services;

import tn.esprit.asi.autoloc.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement Equipement);
    void supprimerEquipement(Long idEquipement);
    Equipement modifierEquipement(Equipement Equipement);
    List<Equipement> afficherListe();
    Equipement EquipementParId(Long idEquipement);
    List<Equipement> ajouterListe(List<Equipement> Equipements);

}
