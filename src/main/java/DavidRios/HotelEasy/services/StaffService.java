package DavidRios.HotelEasy.services;

import DavidRios.HotelEasy.entities.Staff;
import DavidRios.HotelEasy.exceptions.NotFoundException;
import DavidRios.HotelEasy.repositories.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StaffService {

    @Autowired
    private StaffRepo staffRepo;


    public Page<Staff> getStaffMembers(int pageNumber, int size, String orderBy) {
        if (size > 3) size = 3;
        Pageable pageable = PageRequest.of(pageNumber, size, Sort.by(orderBy));
        return staffRepo.findAll(pageable);
    }


    public Staff findById(UUID id) {
        return staffRepo.findById(id).orElseThrow(() -> new NotFoundException(id));
    }

    public Staff findByEmail(String email) { return staffRepo.findByEmail(email).orElseThrow(() -> new NotFoundException("L'utente con indirizzo " + email + " non è stato trovato."));}

    public Staff update(UUID id, Staff modifiedUser) {
        Staff found = this.findById(id);
        found.setName(modifiedUser.getName());
        found.setSurname(modifiedUser.getSurname());
        found.setBirthDate(modifiedUser.getBirthDate());
        found.setEmail(modifiedUser.getEmail());
        return staffRepo.save(found);
    }

    public void delete(UUID id) {
        Staff found = this.findById(id);
        staffRepo.delete(found);
    }
}
