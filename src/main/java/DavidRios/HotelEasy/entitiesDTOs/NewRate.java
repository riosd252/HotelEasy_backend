package DavidRios.HotelEasy.entitiesDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record NewRate(@NotEmpty(message = "Campo richiesto.")
                      @NotNull (message = "Selezionare un'opzione.")
                      String roomType,
                      @NotEmpty(message = "Campo richiesto.")
                      @NotNull(message = "Selezionare una data.")
                      String startDate,
                      @NotEmpty(message = "Campo richiesto.")
                      @NotNull(message = "Selezionare una data.")
                      String endDate,
                      @NotEmpty(message = "Campo richiesto.")
                      @NotNull(message = "Campo errato.")
                      @NotBlank(message = "Compilare il campo correttamente.")
                      double rate) {
}
