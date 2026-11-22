package tn.esprit.asi.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.asi.autoloc.entities.Maintenance;
import tn.esprit.asi.autoloc.entities.Vehicule;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {

    @Query("SELECT DISTINCT m.vehicule FROM Maintenance m " +
            "WHERE m.dateDebut <= ?1 AND m.dateFin >= ?1")
    List<Vehicule> findVehiculesInMaintenance(LocalDate date);
}