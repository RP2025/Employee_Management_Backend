package com.rp2025.employee.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class AuthController {
    private final TokenService tokens;
    public AuthController(TokenService tokens) { this.tokens = tokens; }

    public record LoginRequest(String username, String password) {}

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest req) {
        // demo creds: user/pass123, admin/admin123
        boolean ok = ("user".equals(req.username()) && "pass123".equals(req.password()))
                || ("admin".equals(req.username()) && "admin123".equals(req.password()));
        if (!ok) return ResponseEntity.status(401).body(Map.of("error","Invalid credentials"));
        String token = tokens.issueToken(req.username());
        return ResponseEntity.ok(Map.of("token", token, "username", req.username()));
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(@RequestHeader(value="Authorization", required=false) String auth) {
        String token = (auth != null && auth.startsWith("Bearer ")) ? auth.substring(7) : null;
        tokens.revoke(token);
        return ResponseEntity.noContent().build();
    }
}
