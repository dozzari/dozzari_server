package today.dozzari.server.auth.service;

import io.jsonwebtoken.Claims;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import today.dozzari.server.auth.domain.Provider;
import today.dozzari.server.auth.dto.req.ReissueRequest;
import today.dozzari.server.auth.dto.req.SignInRequest;
import today.dozzari.server.auth.dto.res.JwtResponse;
import today.dozzari.server.user.entity.User;
import today.dozzari.server.user.repository.UserRepository;
import today.dozzari.server.util.JwtUtil;
import today.dozzari.server.util.StringUtil;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final JwtUtil jwtUtil;
    private final StringUtil stringUtil;
    private final UserRepository userRepository;

    @Transactional
    public JwtResponse signIn(SignInRequest request) {
        User user = userRepository.findByEmailAndProvider(request.email(), Provider.fromName(request.provider()))
                .orElse(null);

        if (user == null) {
            // 회원가입
            user = userRepository.save(User.builder()
                    .id(stringUtil.generateRandomId())
                    .email(request.email())
                    .provider(Provider.fromName(request.provider()))
                    .build());
        }

        return jwtUtil.issueToken(user.getId());
    }

    public JwtResponse reissue(ReissueRequest request) {
        Claims claims = jwtUtil.parse(request.refreshToken());
        String userId = claims.get(JwtUtil.USER_ID, String.class);

        return jwtUtil.issueToken(userId);
    }
}
