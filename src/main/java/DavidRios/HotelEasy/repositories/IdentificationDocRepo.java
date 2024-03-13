package DavidRios.HotelEasy.repositories;

import DavidRios.HotelEasy.entities.IdentificationDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentificationDocRepo extends JpaRepository<IdentificationDoc, Long> {
}
