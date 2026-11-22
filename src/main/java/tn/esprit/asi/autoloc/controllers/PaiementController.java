package tn.esprit.asi.autoloc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.autoloc.entities.ModePaiement;
import tn.esprit.asi.autoloc.services.IPaiementService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/paiement")
@RequiredArgsConstructor
public class PaiementController {

    private final IPaiementService paiementService;

    @GetMapping("/getTotalPaiementsByMode/{mode}")
    public BigDecimal getTotalPaiementsByMode(
            @PathVariable ModePaiement mode) {
        return paiementService.getTotalPaiementsByMode(mode);
    }
}