package DavidRios.HotelEasy.exceptions;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class ErrorListDTO extends ErrorDTO {
    private final List<String> errorList;

    public ErrorListDTO (String message, LocalDateTime timeStamp, List<String> errorList) {
        super(message, timeStamp);
        this.errorList = errorList;
    }
}