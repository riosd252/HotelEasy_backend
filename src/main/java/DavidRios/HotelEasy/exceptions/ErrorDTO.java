package DavidRios.HotelEasy.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class ErrorDTO {
    private String message;
    private LocalDateTime timeStamp;
}
