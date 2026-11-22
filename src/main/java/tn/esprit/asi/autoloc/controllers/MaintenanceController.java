package tn.esprit.asi.autoloc.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.asi.autoloc.entities.Vehicule;
import tn.esprit.asi.autoloc.services.IMaintenanceService;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/maintenance")
@RequiredArgsConstructor
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @GetMapping("/findVehiculesInMaintenance/{date}")
    public List<Vehicule> findVehiculesInMaintenance(
            @PathVariable LocalDate date) {
        return maintenanceService.findVehiculesInMaintenance(date);
    }
}