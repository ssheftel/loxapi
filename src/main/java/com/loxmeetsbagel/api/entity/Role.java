package com.loxmeetsbagel.api.entity;

/**
 * Enumerated {@link User} roles.
 *
 */
public enum Role {
    ADMIN, PREMIUM_MEMBER, MEMBER;

    public String authority() {
        return "ROLE_" + this.name();
    }
}
