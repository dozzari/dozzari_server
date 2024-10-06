package today.dozzari.server.global.security;

import java.util.List;

public class SecurityConstant {

    public static final List<String> NEED_AUTHENTICATION = List.of(
            "/api/**"
    );
}
