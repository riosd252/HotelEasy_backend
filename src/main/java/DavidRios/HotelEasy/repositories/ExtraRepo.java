package DavidRios.HotelEasy.repositories;

import DavidRios.HotelEasy.entities.Extra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtraRepo extends JpaRepository<Extra, Long> {
}
