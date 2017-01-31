package com.loxmeetsbagel.api.entity;

/**
 * Enumerated {@link User} roles.
 *
 */
public enum Role {
    ADMIN, PARTICIPANT;

    public String authority() {
        return "ROLE_" + this.name();
    }
}
