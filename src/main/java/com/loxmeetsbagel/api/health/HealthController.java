package com.loxmeetsbagel.api.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final HealthRepository healthRepository;

    @Autowired
    public HealthController(HealthRepository healthRepository) {
        this.healthRepository = healthRepository;
    }

    @RequestMapping("/health")
    public HealthEntity index() {
        HealthEntity health = healthRepository.findById(1L);
        return health;
    }
}
