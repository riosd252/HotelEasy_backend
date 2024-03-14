package DavidRios.HotelEasy.entitiesDTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record NewIdentificationDoc(@NotEmpty(message = "Campo richiesto.")
                                   @NotNull(message = "Campo richiesto.")
                                   @NotBlank(message = "Campo richiesto.")
                                   String documentType,
                                   @NotEmpty(message = "Campo richiesto.")
                                   @NotNull(message = "Campo richiesto.")
                                   @NotBlank(message = "Campo richiesto.")
                                   String documentNumber,
                                   @NotEmpty(message = "Campo richiesto.")
                                   @NotNull(message = "Campo richiesto.")
                                   @NotBlank(message = "Campo richiesto.")
                                   String issueDate,
                                   @NotEmpty(message = "Campo richiesto.")
                                   @NotNull(message = "Campo richiesto.")
                                   @NotBlank(message = "Campo richiesto.")
                                   String expiryDate,
                                   @NotEmpty(message = "Campo richiesto.")
                                   @NotNull(message = "Campo richiesto.")
                                   @NotBlank(message = "Campo richiesto.")
                                   String issueCountry,
                                   String issueProvince,
                                   String issueMunicipality,
                                   @NotEmpty(message = "Campo richiesto.")
                                   @NotNull(message = "Campo richiesto.")
                                   @NotBlank(message = "Campo richiesto.")
                                   String issueAuthority) {
}
