package com.loxmeetsbagel.api.health;

import com.loxmeetsbagel.api.entity.User;
import com.loxmeetsbagel.api.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HealthController {

    private final HealthRepository healthRepository;
    private final UserRepository userRepository;

    @Autowired
    public HealthController(HealthRepository healthRepository, UserRepository userRepository) {
        this.healthRepository = healthRepository;
        this.userRepository = userRepository;
    }

    @RequestMapping("/api/health")
    public HealthEntity securedHealth() {
        HealthEntity health = healthRepository.findById(1L);
        return health;
    }

    @RequestMapping("/health")
    public User unsecuredHealth() {
        Optional<User> user = userRepository.findByUsername("mjay");
        User user1 = user.get();
        return user1;
    }
}
