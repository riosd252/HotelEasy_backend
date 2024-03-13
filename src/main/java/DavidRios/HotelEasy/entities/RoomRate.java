package DavidRios.HotelEasy.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "room_rates")
@NoArgsConstructor
@Getter
@Setter
public class RoomRate {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
    private LocalDate startDate;
    private LocalDate endDate;
    private double rate;

    public RoomRate(RoomType roomType, LocalDate startDate, LocalDate endDate, double rate) {
        this.roomType = roomType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.rate = rate;
    }
}
