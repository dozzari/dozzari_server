package today.dozzari.server.auth.domain;

import lombok.Getter;

@Getter
public enum Provider {
    KAKAO,
    APPLE;

    public static Provider fromName(String name) {
        return switch (name) {
            case "KAKAO" -> KAKAO;
            case "APPLE" -> APPLE;
            default -> throw new IllegalArgumentException("No such provider: " + name);
        };
    }
}
