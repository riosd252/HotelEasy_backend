package DavidRios.HotelEasy.entitiesDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record NewRoom(
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        @NotEmpty(message = "Campo richiesto.")
        @Size(min = 1, max = 50, message = "Il campo accetta solo valori compresi tra 1 e 50.")
        int roomNumber,
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        @NotEmpty(message = "Campo richiesto.")
        String roomType,
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        @NotEmpty(message = "Campo richiesto.")
        @Size(min = 15, max = 30, message = "Il campo accetta solo valori compresi tra 15 e 30.")
        int roomSquareMeters,
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        @NotEmpty(message = "Campo richiesto.")
        @Size(min = 1, max = 4, message = "Il campo accetta solo valori compresi tra 1 e 4.")
        int maxCapacity,
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        @NotEmpty(message = "Campo richiesto.")
        String roomDescription) {
}
