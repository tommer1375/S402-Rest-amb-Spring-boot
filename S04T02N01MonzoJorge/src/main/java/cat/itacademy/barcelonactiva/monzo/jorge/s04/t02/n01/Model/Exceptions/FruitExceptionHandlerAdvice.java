package cat.itacademy.barcelonactiva.monzo.jorge.s04.t02.n01.Model.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class FruitExceptionHandlerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(FruitNotFoundException.class)
    public ResponseEntity<String> fruitNotFoundException(FruitNotFoundException ex)
    {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FruitAlreadyExistsException.class)
    public ResponseEntity<String> fruitAlreadyExistsException(FruitAlreadyExistsException ex)
    {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.IM_USED);
    }
}