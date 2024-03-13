package DavidRios.HotelEasy.entities;

import DavidRios.HotelEasy.enums.ReservationStatuses;
import DavidRios.HotelEasy.enums.ReservationTypes;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "reservations")
@NoArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    @Enumerated(EnumType.STRING)
    private ReservationTypes reservationType;
    @ManyToMany
    @JoinTable(name = "reservation_rooms",
            joinColumns = {@JoinColumn(name = "reservation_id")},
            inverseJoinColumns = {@JoinColumn(name = "room_id")})
    private List<Room> rooms = new ArrayList<>();
    private String specialRequests;
    @Enumerated(EnumType.STRING)
    private ReservationStatuses reservationStatus;
    private double totalCost;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private String staffAnnotations;
    @ManyToMany
    @JoinTable(name = "reservation_extras",
    joinColumns = {@JoinColumn(name = "reservation_id")},
    inverseJoinColumns = {@JoinColumn(name = "extra_id")})
    private List<Extra> extras = new ArrayList<>();

    public Reservation(LocalDate checkInDate, LocalDate checkOutDate, ReservationTypes reservationType, List<Room> rooms, String specialRequests, double totalCost) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.reservationType = reservationType;
        this.setRooms(rooms);
        this.specialRequests = specialRequests;
        this.totalCost = totalCost;
    }

    public Reservation(LocalDate checkInDate, LocalDate checkOutDate, ReservationTypes reservationType, List<Room> rooms,
                       String specialRequests, ReservationStatuses reservationStatus, double totalCost, String staffAnnotations) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.setRooms(rooms);
        this.reservationType = reservationType;
        this.specialRequests = specialRequests;
        this.reservationStatus = reservationStatus;
        this.totalCost = totalCost;
        this.staffAnnotations = staffAnnotations;
    }

    public void setExtra(Extra extra) {
        this.extras.add(extra);
    }

    public void setRooms(List<Room> rooms) {
        this.rooms.addAll(rooms);
    }
}
