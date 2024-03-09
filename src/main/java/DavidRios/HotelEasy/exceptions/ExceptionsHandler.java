package DavidRios.HotelEasy.exceptions;

import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.List;

@RestControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO handleBadRequest(BadRequestException ex) {
        if (ex.getErrorList() != null) {
            List<String> errorList = ex.getErrorList().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).toList();

            return new ErrorListDTO(ex.getMessage(), LocalDateTime.now(), errorList);
        } else {
            return new ErrorDTO(ex.getMessage(), LocalDateTime.now());
        }

    }

    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ErrorDTO handleUnauthorized(UnauthorizedException ex) {
        return new ErrorDTO(ex.getMessage(), LocalDateTime.now());
    }

    @ExceptionHandler(AccessDeniedException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ErrorDTO handleAccessDenied(AccessDeniedException ex) {
        return new ErrorDTO("Restricted endpoint.", LocalDateTime.now());
    }


    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDTO handleNotFound(NotFoundException ex) {
        return new ErrorDTO(ex.getMessage(), LocalDateTime.now());
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public ErrorDTO handleGenericErrors(Exception ex) {
        ex.printStackTrace();
        return new ErrorDTO("Our bad, sorry! Here's a cup of tea for you to taste while we take care of this 🍵", LocalDateTime.now());
    }
}
