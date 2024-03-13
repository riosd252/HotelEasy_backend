package DavidRios.HotelEasy.entities;

import DavidRios.HotelEasy.enums.ExtraServicesTypes;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    public Extra(String extraName, double extraCost, ExtraServicesTypes extraType) {
        this.extraName = extraName;
        this.extraCost = extraCost;
        this.extraType = extraType;
    }
}
