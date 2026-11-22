package tn.esprit.asi.autoloc.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.asi.autoloc.entities.Equipement;
import tn.esprit.asi.autoloc.repositories.EquipementRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipementService {

    private final EquipementRepository rrep;


    @Override
    public Equipement ajouterEquipement(Equipement Equipement) {
        return rrep.save(Equipement);
    }

    @Override
    public void supprimerEquipement(Long idEquipement) {
        rrep.deleteById(idEquipement);

    }

    @Override
    public Equipement modifierEquipement(Equipement Equipement) {
        return rrep.save(Equipement);
    }

    @Override
    public List<Equipement> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Equipement EquipementParId(Long idEquipement) {
        return rrep.findById(idEquipement).orElse(null);
    }

    @Override
    public List<Equipement> ajouterListe(List<Equipement> Equipements) {
        return rrep.saveAll(Equipements);
    }
}
