package DavidRios.HotelEasy.repositories;

import DavidRios.HotelEasy.entities.RoomRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRateRepo extends JpaRepository<RoomRate, Long> {
}
