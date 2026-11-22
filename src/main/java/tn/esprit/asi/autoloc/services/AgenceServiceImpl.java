package tn.esprit.asi.autoloc.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.asi.autoloc.entities.Agence;
import tn.esprit.asi.autoloc.repositories.AgenceRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgenceService {

    private final AgenceRepository rrep;


    @Override
    public Agence ajouterAgence(Agence Agence) {
        return rrep.save(Agence);
    }

    @Override
    public void supprimerAgence(Long idAgence) {
        rrep.deleteById(idAgence);

    }

    @Override
    public Agence modifierAgence(Agence Agence) {
        return rrep.save(Agence);
    }

    @Override
    public List<Agence> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Agence AgenceParId(Long idAgence) {
        return rrep.findById(idAgence).orElse(null);
    }

    @Override
    public List<Agence> ajouterListe(List<Agence> Agences) {
        return rrep.saveAll(Agences);
    }
}
