package DavidRios.HotelEasy.entities;

import DavidRios.HotelEasy.enums.RoomGenericStatuses;
import DavidRios.HotelEasy.enums.RoomHygieneStatuses;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rooms")
@NoArgsConstructor
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    private int roomNumber;
    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
    private int roomSquareMeters;
    private int maxCapacity;
    private String roomDescription;
    @OneToMany(mappedBy = "room")
    private List<RoomPhoto> roomPhotos = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private RoomHygieneStatuses hygieneStatus;
    @Enumerated(EnumType.STRING)
    private RoomGenericStatuses roomStatus;
    private String staffAnnotations;
    @ManyToMany
    @JoinTable(name = "reservation_rooms",
            joinColumns = {@JoinColumn(name = "room_id")},
            inverseJoinColumns = {@JoinColumn(name = "reservation_id")})
    private List<Reservation> reservations;

    public Room(int roomNumber, RoomType roomType, int roomSquareMeters, int maxCapacity, String roomDescription) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomSquareMeters = roomSquareMeters;
        this.maxCapacity = maxCapacity;
        this.roomDescription = roomDescription;
        this.hygieneStatus = RoomHygieneStatuses.PULITO;
        this.roomStatus = RoomGenericStatuses.DISPONIBILE;
    }

    public void setRoomPhoto (RoomPhoto roomPhoto) {
        this.roomPhotos.add(roomPhoto);
    }

    public void setReservation (Reservation reservation) {
        this.reservations.add(reservation);
    }
}
