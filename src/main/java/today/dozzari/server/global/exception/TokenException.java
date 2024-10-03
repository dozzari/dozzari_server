package today.dozzari.server.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class TokenException extends RuntimeException {
    private final ExceptionCode exceptionCode;

    @Override
    public String getMessage() {
        return exceptionCode.getMessage();
    }
}
