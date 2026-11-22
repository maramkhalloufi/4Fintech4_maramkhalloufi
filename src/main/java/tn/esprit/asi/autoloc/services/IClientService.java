package tn.esprit.asi.autoloc.services;

import tn.esprit.asi.autoloc.entities.Client;
import java.util.List;

public interface IClientService {
    Client ajouterClient(Client Client);
    void supprimerClient(Long idClient);
    Client modifierClient(Client Client);
    List<Client> afficherListe();
    Client ClientParId(Long idClient);
    List<Client> ajouterListe(List<Client> Clients);
    Long countClientsWithValidContract();
    List<Client> findClientsWithMoreThanNReservations(Long nbReservations);
}
