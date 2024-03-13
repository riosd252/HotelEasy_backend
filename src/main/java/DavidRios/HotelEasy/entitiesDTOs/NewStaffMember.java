package DavidRios.HotelEasy.entitiesDTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record NewStaffMember(@NotEmpty(message = "Campo richiesto.")
                           String name,
                             @NotEmpty(message = "Campo richiesto.")
                           String surname,
                             @NotEmpty(message = "Campo richiesto.")
                           String birthDate,
                             @NotEmpty(message = "Campo richiesto.")
                           @Email(message = "Il campo richiede un indirizzo mail valido.")
                           String email,
                             @NotEmpty(message = "Campo richiesto.")
                           @Size(min = 8, max = 20, message = "La password deve contenere dagli 8 ai 20 caratteri.")
                           String password) {
}
