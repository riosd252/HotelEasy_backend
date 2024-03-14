package DavidRios.HotelEasy.repositories;

import DavidRios.HotelEasy.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface StaffRepo extends JpaRepository<Staff, UUID> {
    Optional<Staff> findByEmail(String email);
}
