package tn.esprit.asi.autoloc.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.asi.autoloc.entities.Client;
import tn.esprit.asi.autoloc.repositories.ClientRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClientService {

    private final ClientRepository rrep;


    @Override
    public Client ajouterClient(Client Client) {
        return rrep.save(Client);
    }

    @Override
    public void supprimerClient(Long idClient) {
        rrep.deleteById(idClient);

    }

    @Override
    public Client modifierClient(Client Client) {
        return rrep.save(Client);
    }

    @Override
    public List<Client> afficherListe() {
        return rrep.findAll();
    }

    @Override
    public Client ClientParId(Long idClient) {
        return rrep.findById(idClient).orElse(null);
    }

    @Override
    public List<Client> ajouterListe(List<Client> Clients) {
        return rrep.saveAll(Clients);
    }


    @Override
    public Long countClientsWithValidContract() {
        return rrep.countClientsWithValidContract();
    }

    @Override
    public List<Client> findClientsWithMoreThanNReservations(Long nbReservations) {
        return rrep.findClientsWithMoreThanNReservations(nbReservations);
    }
}
