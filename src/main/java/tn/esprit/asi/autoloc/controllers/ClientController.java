package tn.esprit.asi.autoloc.controllers;
import tn.esprit.asi.autoloc.entities.Client;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.autoloc.services.IClientService;

@RestController
@RequestMapping("/client")
@RequiredArgsConstructor
public class ClientController {

    private final IClientService clientService;

    @GetMapping("/countClientsWithValidContract")
    public Long countClientsWithValidContract() {
        return clientService.countClientsWithValidContract();
    }

    @GetMapping("/findClientsWithMoreThanNReservations/{nbReservations}")
    public List<Client> findClientsWithMoreThanNReservations(
            @PathVariable Long nbReservations) {
        return clientService.findClientsWithMoreThanNReservations(nbReservations);
    }
}