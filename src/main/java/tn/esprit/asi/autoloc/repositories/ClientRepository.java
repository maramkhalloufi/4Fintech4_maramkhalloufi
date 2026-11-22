
package tn.esprit.asi.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.asi.autoloc.entities.Client;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("SELECT COUNT(DISTINCT c) FROM Client c JOIN c.reservations r JOIN r.contrat ct WHERE ct.valide = true")
    Long countClientsWithValidContract();

    @Query("SELECT c FROM Client c JOIN c.reservations r GROUP BY c HAVING COUNT(r) > ?1")
    List<Client> findClientsWithMoreThanNReservations(Long nbReservations);

}
