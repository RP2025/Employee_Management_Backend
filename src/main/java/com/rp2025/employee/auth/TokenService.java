package com.rp2025.employee.auth;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TokenService {
    private final Map<String,String> tokens = new ConcurrentHashMap<>();

    public String issueToken(String username) {
        String t = UUID.randomUUID().toString();
        tokens.put(t, username);
        return t;
    }
    public boolean isValid(String token) {
        return token != null && tokens.containsKey(token);
    }
    public void revoke(String token) {
        if (token != null) tokens.remove(token);
    }
}
