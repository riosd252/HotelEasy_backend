package DavidRios.HotelEasy.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.UUID;

@Entity
@Table(name = "guests")
@NoArgsConstructor
@Getter
@Setter
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String email;
    @JsonIgnore
    private String password;
    @OneToOne
    @JoinColumn(name = "identification_doc_id")
    private IdentificationDoc identificationDoc;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
    private boolean hasCheckedIn;
    private LocalTime checkInTime;
    private boolean hasCheckedOut;
    private LocalTime checkOutTime;

    public Guest(String name, String surname, LocalDate birthDate, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
        this.hasCheckedIn = false;
        this.hasCheckedOut = false;
    }
}
