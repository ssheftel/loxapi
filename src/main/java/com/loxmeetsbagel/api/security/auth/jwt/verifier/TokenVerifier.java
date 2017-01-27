package com.loxmeetsbagel.api.security.auth.jwt.verifier;

/**
 * Created by sam on 01/26/17.
 */
public interface TokenVerifier {
    public boolean verify(String jti);
}
