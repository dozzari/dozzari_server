package today.dozzari.server.global.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * 기본 예외가 존재하지만, 이걸 분리한 이유는 프론트에서 에러를 편하게 처리하기 위함입니다.<br>
 */
@Getter
@RequiredArgsConstructor
public enum ExceptionCode {
    // 400 Bad Request
    ILLEGAL_ARGUMENT(400_000, HttpStatus.BAD_REQUEST, "잘못된 요청입니다."),
    MISSING_TOKEN(400_001, HttpStatus.BAD_REQUEST, "토큰이 누락되었습니다."),
    ILLEGAL_TOKEN(400_002, HttpStatus.BAD_REQUEST, "유효하지 않은 토큰입니다."),
    EXPIRED_TOKEN(400_003, HttpStatus.BAD_REQUEST, "만료된 토큰입니다."),
    UNSUPPORTED_TOKEN(400_004, HttpStatus.BAD_REQUEST, "지원하지 않는 토큰입니다."),
    MALFORMED_TOKEN(400_005, HttpStatus.BAD_REQUEST, "잘못된 토큰입니다."),
    UNKNOWN_TOKEN(400_006, HttpStatus.BAD_REQUEST, "알 수 없는 토큰입니다."),

    // 401 Unauthorized

    // 403 Forbidden
    ACCESS_DENIED(403_000, HttpStatus.FORBIDDEN, "접근 권한이 없습니다."),

    // 404 Not Found
    NOT_FOUND_USER(404_000, HttpStatus.NOT_FOUND, "유저를 찾을 수 없습니다."),

    // 500 Internal Server Error
    INTERNAL_SERVER_ERROR(500_000, HttpStatus.INTERNAL_SERVER_ERROR, "서버 내부 요청 중 오류가 발생했습니다."),

    // 502 Bad Gateway
    EXTERNAL_SERVER_ERROR(502_000, HttpStatus.BAD_GATEWAY, "서버 외부 요청 중 오류가 발생했습니다."),
    S3_UPLOAD_ERROR(502_001, HttpStatus.BAD_GATEWAY, "S3 이미지 업로드 중 오류가 발생했습니다."),
    S3_DELETE_ERROR(502_002, HttpStatus.BAD_GATEWAY, "S3 이미지 삭제 중 오류가 발생했습니다.");

    private final Integer code;
    private final HttpStatus httpStatus;
    private final String message;
}
