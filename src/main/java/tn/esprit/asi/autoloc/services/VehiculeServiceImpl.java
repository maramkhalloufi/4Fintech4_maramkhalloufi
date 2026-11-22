package tn.esprit.asi.autoloc.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.asi.autoloc.entities.Vehicule;
import tn.esprit.asi.autoloc.repositories.VehiculeRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    private final VehiculeRepository rrep;


    @Override
    public Vehicule ajouterVehicule(Vehicule Vehicule) {
        return rrep.save(Vehicule);
    }

    @Override
    public void supprimerVehicule(Long idVehicule) {
        rrep.deleteById(idVehicule);

    }

    @Override
    public Vehicule modifierVehicule(Vehicule Vehicule) {
        return rrep.save(Vehicule);
    }

    @Override
    public List<Vehicule> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Vehicule VehiculeParId(Long idVehicule) {
        return rrep.findById(idVehicule).orElse(null);
    }

    @Override
    public List<Vehicule> ajouterListe(List<Vehicule> Vehicules) {
        return rrep.saveAll(Vehicules);
    }
}
