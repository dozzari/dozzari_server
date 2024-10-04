package today.dozzari.server.util;

import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import today.dozzari.server.auth.dto.res.JwtResponse;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;
import today.dozzari.server.global.exception.TokenException;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtUtil {

    public static final String USER_ID = "user_id";
    public static final String AUTHORIZATION = "Authorization";
    public static final String BEARER = "Bearer ";

    private final SecretKey key;
    private final Long accessTokenExpirePeriod;
    private final Long refreshTokenExpirePeriod;

    protected JwtUtil(
            @Value("${jwt.secret}") String secret,
            @Value("${jwt.access-token-expire-period}") Long accessTokenExpirePeriod,
            @Value("${jwt.refresh-token-expire-period}") Long refreshTokenExpirePeriod
    ) {
        this.key = Keys.hmacShaKeyFor(Decoders.BASE64.decode(secret));
        this.accessTokenExpirePeriod = accessTokenExpirePeriod;
        this.refreshTokenExpirePeriod = refreshTokenExpirePeriod;
    }

    public String extractToken(final String authorizationHeader) {
        if (authorizationHeader == null || authorizationHeader.startsWith(JwtUtil.BEARER)) {
            throw new TokenException(ExceptionCode.MISSING_TOKEN);
        }

        return authorizationHeader.substring(7);
    }

    public Claims parse(String token) {
        try {
            return Jwts.parser().verifyWith(key).build()
                    .parseSignedClaims(token)
                    .getPayload();
        } catch (IllegalArgumentException e) {
            throw new TokenException(ExceptionCode.ILLEGAL_TOKEN);
        } catch (ExpiredJwtException e) {
            throw new TokenException(ExceptionCode.EXPIRED_TOKEN);
        } catch (UnsupportedJwtException e) {
            throw new TokenException(ExceptionCode.UNSUPPORTED_TOKEN);
        } catch (MalformedJwtException e) {
            throw new TokenException(ExceptionCode.MALFORMED_TOKEN);
        } catch (JwtException e) {
            throw new TokenException(ExceptionCode.UNKNOWN_TOKEN);
        } catch (Exception e) {
            throw new BusinessException(ExceptionCode.INTERNAL_SERVER_ERROR);
        }
    }

    public JwtResponse issueToken(String userId) {
        String accessToken = generateToken(userId, accessTokenExpirePeriod);
        String refreshToken = generateToken(userId, refreshTokenExpirePeriod);

        return JwtResponse.of(accessToken, refreshToken);
    }

    public String generateToken(String userId, Long expirePeriod) {
        return Jwts.builder()
                .claim(JwtUtil.USER_ID, userId)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + expirePeriod))
                .signWith(key, Jwts.SIG.HS512)
                .compact();
    }
}
