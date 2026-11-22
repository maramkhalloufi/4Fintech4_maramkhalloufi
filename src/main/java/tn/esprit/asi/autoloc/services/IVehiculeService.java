package tn.esprit.asi.autoloc.services;

import tn.esprit.asi.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule Vehicule);
    void supprimerVehicule(Long idVehicule);
    Vehicule modifierVehicule(Vehicule Vehicule);
    List<Vehicule> afficherListe();
    Vehicule VehiculeParId(Long idVehicule);
    List<Vehicule> ajouterListe(List<Vehicule> Vehicules);

}
