package today.dozzari.server.global.security.filter;

import io.jsonwebtoken.Claims;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.filter.OncePerRequestFilter;
import today.dozzari.server.global.security.SecurityConstant;
import today.dozzari.server.user.domain.CustomUserDetail;
import today.dozzari.server.user.service.CustomUserDetailService;
import today.dozzari.server.util.JwtUtil;

import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;
    private final AntPathMatcher antPathMatcher;
    private final CustomUserDetailService customUserDetailService;

    @Override
    protected void doFilterInternal(
            final HttpServletRequest request,
            final HttpServletResponse response,
            final FilterChain filterChain
    ) throws ServletException, IOException {
        String authorizationHeader = getAuthorizationHeader(request);
        String token = jwtUtil.extractToken(authorizationHeader);
        Claims claims = jwtUtil.parse(token);

        String userId = claims.get(JwtUtil.USER_ID, String.class);

        CustomUserDetail customUserDetail = customUserDetailService.loadUserByUsername(userId);

        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                customUserDetail,
                null,
                customUserDetail.getAuthorities()
        );

        SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        filterChain.doFilter(request, response);
    }

    @Override
    protected boolean shouldNotFilter(final HttpServletRequest request) throws ServletException {
        return !(SecurityConstant.NEED_AUTHENTICATION.contains(request.getRequestURI())
                || SecurityConstant.NEED_AUTHENTICATION.stream().anyMatch(pattern -> antPathMatcher.match(pattern, request.getRequestURI())));
    }

    private String getAuthorizationHeader(final HttpServletRequest request) {
        return request.getHeader(JwtUtil.AUTHORIZATION);
    }
}
