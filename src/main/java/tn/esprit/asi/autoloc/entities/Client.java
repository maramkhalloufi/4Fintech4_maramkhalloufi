package tn.esprit.asi.autoloc.entities;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter
@Setter

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String numPermis;
    private LocalDate dateInscription;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;
}
