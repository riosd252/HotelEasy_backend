package DavidRios.HotelEasy.entitiesDTOs;

import jakarta.validation.constraints.*;

public record NewGuest(
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        String name,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        String surname,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        String birthDate,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        @Email
        String email,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        @Size(min = 8, max = 16, message = "Il campo richiede un minimo di 8 e un massimo di 16 caratteri.")
        String password) {
}
