package tn.esprit.asi.autoloc.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.asi.autoloc.entities.Paiement;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.asi.autoloc.entities.ModePaiement;
import java.math.BigDecimal;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement,Long> {

    @Query("SELECT COALESCE(SUM(p.montant), 0) FROM Paiement p WHERE p.modePaiement = ?1")
    BigDecimal getTotalPaiementsByMode(ModePaiement mode);



}
