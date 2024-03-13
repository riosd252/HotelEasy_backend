package DavidRios.HotelEasy.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "room_photos")
@NoArgsConstructor
@Getter
@Setter
public class RoomPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
    private String photoUrl;

    public RoomPhoto(Room room, String photoUrl) {
        this.room = room;
        this.photoUrl = photoUrl;
    }
}
