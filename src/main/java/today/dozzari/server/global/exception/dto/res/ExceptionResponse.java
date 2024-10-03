package today.dozzari.server.global.exception.dto.res;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import today.dozzari.server.global.exception.ExceptionCode;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
@JsonNaming(PropertyNamingStrategies.LowerCamelCaseStrategy.class)
public class ExceptionResponse {

    private final HttpStatus httpStatus;
    private final int code;
    private final String message;
    private final List<FieldError> errors;

    public static ExceptionResponse of(final ExceptionCode exceptionCode) {
        return new ExceptionResponse(
                exceptionCode.getHttpStatus(),
                exceptionCode.getCode(),
                exceptionCode.getMessage(),
                new ArrayList<>()
        );
    }

    public static ExceptionResponse of(final ExceptionCode exceptionCode, final BindingResult bindingResult) {
        return new ExceptionResponse(
                exceptionCode.getHttpStatus(),
                exceptionCode.getCode(),
                exceptionCode.getMessage(),
                FieldError.of(bindingResult)
        );
    }

    @Getter
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    public static class FieldError {
        private final String field;
        private final String value;
        private final String reason;

        public static List<FieldError> of(final BindingResult bindingResult) {
            return bindingResult.getFieldErrors().stream()
                    .map(error -> new FieldError(
                            error.getField(),
                            error.getRejectedValue() == null ? "" : error.getRejectedValue().toString(),
                            error.getDefaultMessage()
                    )).toList();
        }
    }
}
