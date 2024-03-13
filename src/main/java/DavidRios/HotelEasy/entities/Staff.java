package DavidRios.HotelEasy.entities;

import DavidRios.HotelEasy.enums.StaffRoles;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "staff")
@NoArgsConstructor
@Getter
@Setter
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Setter(AccessLevel.NONE)
    private UUID id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private String email;
    @JsonIgnore
    private String password;
    @Enumerated(EnumType.STRING)
    private StaffRoles role;
    private String avatar;

    public Staff (String name, String surname, LocalDate birthDate, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.email = email;
        this.password = password;
    }
}
