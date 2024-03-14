package DavidRios.HotelEasy.entitiesDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record NewAddress(@NotEmpty(message = "Campo richiesto.")
                         @NotNull(message = "Campo richiesto.")
                         @NotBlank(message = "Campo richiesto.")
                         String streetName,
                         @NotEmpty(message = "Campo richiesto.")
                         @NotNull(message = "Campo richiesto.")
                         @NotBlank(message = "Campo richiesto.")
                         String civicNumber,
                         @NotEmpty(message = "Campo richiesto.")
                         @NotNull(message = "Campo richiesto.")
                         @NotBlank(message = "Campo richiesto.")
                         long postalCode,
                         @NotEmpty(message = "Campo richiesto.")
                         @NotNull(message = "Campo richiesto.")
                         @NotBlank(message = "Campo richiesto.")
                         String municipality,
                         String province,
                         @NotEmpty(message = "Campo richiesto.")
                         @NotNull(message = "Campo richiesto.")
                         @NotBlank(message = "Campo richiesto.")
                         String country,
                         @NotEmpty(message = "Campo richiesto.")
                         @NotNull(message = "Campo richiesto.")
                         @NotBlank(message = "Campo richiesto.")
                         String guestId) {
}
