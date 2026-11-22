package tn.esprit.asi.autoloc.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.asi.autoloc.entities.Maintenance;
import tn.esprit.asi.autoloc.repositories.MaintenanceRepository;
import tn.esprit.asi.autoloc.entities.Vehicule;
import java.time.LocalDate;
import java.util.List;
@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final MaintenanceRepository rrep;


    @Override
    public Maintenance ajouterMaintenance(Maintenance Maintenance) {
        return rrep.save(Maintenance);
    }

    @Override
    public void supprimerMaintenance(Long idMaintenance) {
        rrep.deleteById(idMaintenance);

    }

    @Override
    public Maintenance modifierMaintenance(Maintenance Maintenance) {
        return rrep.save(Maintenance);
    }

    @Override
    public List<Maintenance> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Maintenance MaintenanceParId(Long idMaintenance) {
        return rrep.findById(idMaintenance).orElse(null);
    }

    @Override
    public List<Maintenance> ajouterListe(List<Maintenance> Maintenances) {
        return rrep.saveAll(Maintenances);
    }

    @Override
    public List<Vehicule> findVehiculesInMaintenance(LocalDate date) {
        return rrep.findVehiculesInMaintenance(date);
    }

}

