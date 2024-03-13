package DavidRios.HotelEasy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@Table(name = "addresses")
@NoArgsConstructor
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private BigInteger id;
    private String streetName;
    private String civicNumber;
    private BigInteger postalCode;
    private String municipality;
    private String province;
    private String country;
    @JsonIgnore
    @OneToOne
    private Guest guest;

    public Address(String streetName, String civicNumber, BigInteger postalCode, String municipality, String province, String country, Guest guest) {
        this.streetName = streetName;
        this.civicNumber = civicNumber;
        this.postalCode = postalCode;
        this.municipality = municipality;
        this.province = province;
        this.country = country;
        this.guest = guest;
    }
}
