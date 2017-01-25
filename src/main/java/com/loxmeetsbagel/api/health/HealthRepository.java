package com.loxmeetsbagel.api.health;

import org.springframework.data.repository.Repository;

public interface HealthRepository extends Repository<HealthEntity, Long> {
    HealthEntity findById(Long id);
}
