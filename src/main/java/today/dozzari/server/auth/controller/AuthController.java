package today.dozzari.server.auth.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import today.dozzari.server.auth.dto.req.ReissueRequest;
import today.dozzari.server.auth.dto.req.SignInRequest;
import today.dozzari.server.auth.dto.res.JwtResponse;
import today.dozzari.server.auth.service.AuthService;

@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/auth/signin")
    public ResponseEntity<JwtResponse> signIn(@RequestBody SignInRequest request) {
        return ResponseEntity.ok(authService.signIn(request));
    }

    @PostMapping("/auth/reissue")
    public ResponseEntity<JwtResponse> reissue(@RequestBody ReissueRequest request) {
        return ResponseEntity.ok(authService.reissue(request));
    }
}
