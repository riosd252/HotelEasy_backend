package DavidRios.HotelEasy.entitiesDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record NewExtra(
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        String extraName,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        double extraCost,
        @NotEmpty(message = "Campo richiesto.")
        @NotNull(message = "Campo richiesto.")
        @NotBlank(message = "Campo richiesto.")
        String extraType) {
}
