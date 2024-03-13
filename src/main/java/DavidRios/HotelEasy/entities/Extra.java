package DavidRios.HotelEasy.entities;

import DavidRios.HotelEasy.enums.ExtraServicesTypes;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "extras")
@NoArgsConstructor
@Getter
@Setter
public class Extra {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    private String extraName;
    private double extraCost;
    private ExtraServicesTypes extraType;
    @ManyToMany
    @JoinTable(name = "reservation_extras",
            joinColumns = {@JoinColumn(name = "extra_id")},
            inverseJoinColumns = {@JoinColumn(name = "reservation_id")})
    private List<Reservation> reservations;

    public Extra(String extraName, double extraCost, ExtraServicesTypes extraType) {
        this.extraName = extraName;
        this.extraCost = extraCost;
        this.extraType = extraType;
    }

    public void setReservation (Reservation reservation) {
        this.reservations.add(reservation);
    }
}
