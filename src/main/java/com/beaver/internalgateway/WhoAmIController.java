package com.beaver.internalgateway;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class WhoAmIController {
    @GetMapping("/api/claims")
    public Map<String, Object> claims(@AuthenticationPrincipal Jwt jwt) {
        return jwt.getClaims();
    }
}