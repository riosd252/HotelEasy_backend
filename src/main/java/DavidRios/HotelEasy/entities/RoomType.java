package DavidRios.HotelEasy.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "room_types")
@NoArgsConstructor
@Getter
@Setter
public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Setter(AccessLevel.NONE)
    private long id;
    private String roomType;
    @OneToMany(mappedBy = "roomType")
    private List<RoomRate> roomRates = new ArrayList<>();
    @OneToMany(mappedBy = "roomType")
    private List<Room> rooms = new ArrayList<>();

    public RoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setRoomRate (RoomRate roomRate) {
      this.roomRates.add(roomRate);
    }

    public void setRoom (Room room) {
        this.rooms.add(room);
    }
}
