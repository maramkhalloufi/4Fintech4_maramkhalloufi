package tn.esprit.asi.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.asi.autoloc.entities.Agence;
import tn.esprit.asi.autoloc.entities.Reservation;

@Repository
public interface AgenceRepository extends JpaRepository<Agence,Long> {
}
