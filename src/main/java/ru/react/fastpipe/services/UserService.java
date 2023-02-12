package ru.react.fastpipe.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.react.fastpipe.model.UserEntity;
import ru.react.fastpipe.repositoryes.UserRepository;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public Flux<UserEntity> getAll() {
        return userRepository.findAll();
    }

    public Mono<UserEntity> addUser(UserEntity user) {
        return userRepository.save(user);
    }
}
