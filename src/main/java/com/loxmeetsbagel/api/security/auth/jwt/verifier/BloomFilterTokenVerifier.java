package com.loxmeetsbagel.api.security.auth.jwt.verifier;

import org.springframework.stereotype.Component;

@Component
public class BloomFilterTokenVerifier implements TokenVerifier {
    @Override
    public boolean verify(String jti) {
        // TODO: implement
        return true;
    }
}
