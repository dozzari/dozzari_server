package today.dozzari.server.global.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.support.MissingServletRequestPartException;
import today.dozzari.server.global.exception.dto.res.ExceptionResponse;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<ExceptionResponse> missingServletRequestParameterExceptionHandler(MissingServletRequestParameterException e) {
        log.error("Missing Servlet Request Parameter Exception: {}", e.getMessage());
        final ExceptionResponse response = ExceptionResponse.of(ExceptionCode.MISSING_REQUEST_PARAMETER);
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(MissingServletRequestPartException.class)
    public ResponseEntity<ExceptionResponse> missingServletRequestPartExceptionHandler(MissingServletRequestPartException e) {
        log.error("Missing Servlet Request Part Exception: {}", e.getMessage());
        final ExceptionResponse response = ExceptionResponse.of(ExceptionCode.MISSING_REQUEST_PARAMETER);
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionResponse> methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        log.error("Method Argument Not Valid Exception: {}", e.getMessage());
        final ExceptionResponse response = ExceptionResponse.of(ExceptionCode.MISSING_REQUEST_PARAMETER, e.getBindingResult());
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ExceptionResponse> illegalArgumentExceptionHandler(IllegalArgumentException e) {
        log.error("Illegal Argument Exception: {}", e.getMessage());
        final ExceptionResponse response = ExceptionResponse.of(ExceptionCode.ILLEGAL_ARGUMENT);
        return ResponseEntity.badRequest().body(response);
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ExceptionResponse> businessExceptionHandler(BusinessException e) {
        log.error("Business Exception: {}", e.getMessage());
        final ExceptionResponse response = ExceptionResponse.of(e.getExceptionCode());
        return ResponseEntity.status(e.getExceptionCode().getHttpStatus()).body(response);
    }

    @ExceptionHandler(TokenException.class)
    public ResponseEntity<ExceptionResponse> tokenExceptionHandler(TokenException e) {
        log.error("Token Exception: {}", e.getMessage());
        final ExceptionResponse response = ExceptionResponse.of(e.getExceptionCode());
        return ResponseEntity.status(e.getExceptionCode().getHttpStatus()).body(response);
    }

    @ExceptionHandler(HttpMediaTypeNotSupportedException.class)
    public ResponseEntity<ExceptionResponse> httpMediaTypeNotSupportedExceptionHandler(HttpMediaTypeNotSupportedException e) {
        log.error("Http Media Type Not Supported Exception: {}", e.getMessage());
        final ExceptionResponse response = ExceptionResponse.of(ExceptionCode.HTTP_MEDIA_TYPE_NOT_SUPPORTED);
        return ResponseEntity.badRequest().body(response);
    }
}
