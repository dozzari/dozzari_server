package today.dozzari.server.global.security.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.filter.OncePerRequestFilter;
import today.dozzari.server.global.exception.BusinessException;
import today.dozzari.server.global.exception.ExceptionCode;
import today.dozzari.server.global.exception.TokenException;
import today.dozzari.server.global.exception.dto.res.ExceptionResponse;

import java.io.IOException;

@Slf4j
@RequiredArgsConstructor
public class JwtExceptionFilter extends OncePerRequestFilter {

    private final ObjectMapper objectMapper;

    @Override
    protected void doFilterInternal(
            final HttpServletRequest request,
            final HttpServletResponse response,
            final FilterChain filterChain
    ) throws ServletException, IOException {
        try {
            filterChain.doFilter(request, response);
        } catch (SecurityException e) {
            setErrorResponse(response, e, ExceptionCode.ACCESS_DENIED);
        } catch (TokenException e) {
            setErrorResponse(response, e, e.getExceptionCode());
        } catch (BusinessException e) {
            setErrorResponse(response, e, e.getExceptionCode());
        } catch (Exception e) {
            e.printStackTrace();
            setErrorResponse(response, e, ExceptionCode.INTERNAL_SERVER_ERROR);
        }
    }

    private void setErrorResponse(HttpServletResponse response, Exception e, ExceptionCode errorCode) throws IOException {
        log.error("{}: {}, {}", e.getClass().getName(), errorCode.getCode(), errorCode.getMessage());
        response.setStatus(errorCode.getHttpStatus().value());
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().write(objectMapper.writeValueAsString(ExceptionResponse.of(errorCode)));
    }
}
