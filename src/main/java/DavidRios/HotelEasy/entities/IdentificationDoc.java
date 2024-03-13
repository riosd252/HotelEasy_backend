package DavidRios.HotelEasy.entities;

import DavidRios.HotelEasy.enums.IdentificationDocs;
import DavidRios.HotelEasy.enums.IssuingAuthorities;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Table(name = "identification_docs")
@NoArgsConstructor
@Getter
@Setter
public class IdentificationDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    @Enumerated(EnumType.STRING)
    private IdentificationDocs documentType;
    private String documentNumber;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private String issueCountry;
    private String issueProvince;
    private String issueMunicipality;
    @Enumerated(EnumType.STRING)
    private IssuingAuthorities issuingAuthority;

    public IdentificationDoc(IdentificationDocs documentType, String documentNumber, LocalDate issueDate, LocalDate expiryDate, String issueCountry, String issueProvince, String issueMunicipality, IssuingAuthorities issuingAuthority) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
        this.issueCountry = issueCountry;
        this.issueProvince = issueProvince;
        this.issueMunicipality = issueMunicipality;
        this.issuingAuthority = issuingAuthority;
    }
}
