package tn.esprit.asi.autoloc.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.asi.autoloc.entities.Paiement;
import tn.esprit.asi.autoloc.repositories.PaiementRepository;
import tn.esprit.asi.autoloc.entities.ModePaiement;
import java.math.BigDecimal;
import java.util.List;
@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiementService {

    private final PaiementRepository rrep;


    @Override
    public Paiement ajouterPaiement(Paiement Paiement) {
        return rrep.save(Paiement);
    }

    @Override
    public void supprimerPaiement(Long idPaiement) {
        rrep.deleteById(idPaiement);

    }

    @Override
    public Paiement modifierPaiement(Paiement Paiement) {
        return rrep.save(Paiement);
    }

    @Override
    public List<Paiement> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Paiement PaiementParId(Long idPaiement) {
        return rrep.findById(idPaiement).orElse(null);
    }

    @Override
    public List<Paiement> ajouterListe(List<Paiement> Paiements) {
        return rrep.saveAll(Paiements);
    }

    @Override
    public BigDecimal getTotalPaiementsByMode(ModePaiement mode) {
        return rrep.getTotalPaiementsByMode(mode);
    }
}
