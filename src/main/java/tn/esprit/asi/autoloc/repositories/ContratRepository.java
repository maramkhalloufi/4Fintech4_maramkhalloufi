package tn.esprit.asi.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.asi.autoloc.entities.Contrat;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
}