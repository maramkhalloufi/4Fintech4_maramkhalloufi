package tn.esprit.asi.autoloc.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.asi.autoloc.entities.Employe;
import tn.esprit.asi.autoloc.repositories.EmployeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmployeService{

    private final EmployeRepository rrep ;
    @Override
    public Employe ajouterEmploye(Employe Employe) {
        return rrep.save(Employe);
    }

    @Override
    public void supprimerEmploye(long idEmploye) {
        rrep.deleteById(idEmploye);

    }

    @Override
    public Employe modifierEmploye(Employe Employe) {
        return rrep.save(Employe);
    }

    @Override
    public List<Employe> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Employe EmployeParId(long idEmploye) {
        return rrep.findById(idEmploye).get();
    }

    @Override
    public List<Employe> ajouterListe(List<Employe> Employe) {
        return rrep.saveAll(Employe);
    }
}
