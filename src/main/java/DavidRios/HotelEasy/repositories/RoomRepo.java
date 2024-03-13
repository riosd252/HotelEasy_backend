package DavidRios.HotelEasy.repositories;

import DavidRios.HotelEasy.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long> {
}
