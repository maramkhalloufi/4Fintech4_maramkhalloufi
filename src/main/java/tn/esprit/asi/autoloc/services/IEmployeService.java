package tn.esprit.asi.autoloc.services;

import tn.esprit.asi.autoloc.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe Employe);
    void supprimerEmploye(long idEmploye);
    Employe modifierEmploye(Employe Employe);
    List<Employe> afficherListe();
    Employe EmployeParId(long idEmploye);
    List<Employe> ajouterListe( List<Employe> Employe);
}