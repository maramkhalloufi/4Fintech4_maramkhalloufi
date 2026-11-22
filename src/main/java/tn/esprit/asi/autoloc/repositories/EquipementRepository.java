package tn.esprit.asi.autoloc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.asi.autoloc.entities.Agence;
import tn.esprit.asi.autoloc.entities.Equipement;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}
