package today.dozzari.server.auth.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import today.dozzari.server.auth.domain.Provider;
import today.dozzari.server.auth.dto.req.SignInRequest;
import today.dozzari.server.auth.dto.res.JwtResponse;
import today.dozzari.server.user.entity.User;
import today.dozzari.server.user.repository.UserRepository;
import today.dozzari.server.util.JwtUtil;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    @Transactional
    public JwtResponse signIn(SignInRequest request) {
        User user = userRepository.findByEmailAndProvider(request.email(), Provider.fromName(request.provider()))
                .orElse(null);

        if (user == null) {
            // 회원가입
            user = userRepository.save(User.builder()
                    .id(generateUserId())
                    .email(request.email())
                    .provider(Provider.fromName(request.provider()))
                    .build());
        }

        return jwtUtil.issueToken(user.getId());
    }

    private String generateUserId() {
        String uuid = UUID.randomUUID().toString();
        byte[] uuidBytes = uuid.getBytes();
        byte[] userIdBytes;

        try {
            MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
            userIdBytes = sha256.digest(uuidBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("User Id 생성 중에 에러가 발생했습니다.");
        }

        StringBuilder userId = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            userId.append(String.format("%02x", userIdBytes[i]));
        }

        return userId.toString();
    }
}
