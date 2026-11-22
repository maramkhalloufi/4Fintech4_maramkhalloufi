package tn.esprit.asi.autoloc.services;

import tn.esprit.asi.autoloc.entities.Maintenance;
import tn.esprit.asi.autoloc.entities.Vehicule;
import java.time.LocalDate;
import java.util.List;

public interface IMaintenanceService {

    Maintenance ajouterMaintenance(Maintenance Maintenance);
    void supprimerMaintenance(Long idMaintenance);
    Maintenance modifierMaintenance(Maintenance Maintenance);
    List<Maintenance> afficherListe();
    Maintenance MaintenanceParId(Long idMaintenance);
    List<Maintenance> ajouterListe(List<Maintenance> Maintenances);
    List<Vehicule> findVehiculesInMaintenance(LocalDate date);
}
