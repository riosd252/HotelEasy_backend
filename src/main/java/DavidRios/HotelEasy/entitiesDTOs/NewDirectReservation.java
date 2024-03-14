package DavidRios.HotelEasy.entitiesDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record NewDirectReservation(
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        String checkInDate,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        String checkOutDate,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        String reservationType,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        List<String> roomsIds,
        String specialRequests,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        String reservationStatus,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        double totalCost,
        String staffAnnotations) {
}
