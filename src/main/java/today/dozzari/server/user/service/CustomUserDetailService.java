package today.dozzari.server.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;
import today.dozzari.server.user.domain.CustomUserDetail;
import today.dozzari.server.user.entity.User;
import today.dozzari.server.user.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public CustomUserDetail loadUserByUsername(String userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new BusinessException(ExceptionCode.NOT_FOUND_USER));

        return new CustomUserDetail(user);
    }
}
