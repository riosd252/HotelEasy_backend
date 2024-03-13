package DavidRios.HotelEasy.repositories;

import DavidRios.HotelEasy.entities.RoomPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomPhotoRepo extends JpaRepository<RoomPhoto, Long> {
}
