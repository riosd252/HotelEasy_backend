package DavidRios.HotelEasy.entitiesDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record NewRoomType(@NotEmpty(message = "Campo richiesto.")
                          @NotBlank(message = "Compilare il campo correttamente.")
                          String roomType) {
}
