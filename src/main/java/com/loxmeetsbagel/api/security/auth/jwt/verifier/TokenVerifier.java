package com.loxmeetsbagel.api.security.auth.jwt.verifier;

public interface TokenVerifier {
    public boolean verify(String jti);
}
