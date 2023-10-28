package ru.react.fastpipe.controllers.v1;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.react.fastpipe.dtos.UserDto;
import ru.react.fastpipe.model.UserEntity;
import ru.react.fastpipe.services.UserService;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/user")
public class UserController {
    @Autowired
    private final UserService userService;

    @GetMapping("/all")
    public Flux<UserDto> getTestString() {
        return userService.getAll();
    }

    @PostMapping("/add")
    public Mono<UserEntity> addUser(@RequestBody UserEntity user) {
        return userService.addUser(user);
    }
}
