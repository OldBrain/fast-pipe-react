package ru.react.fastpipe.repositoryes;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import ru.react.fastpipe.model.UserEntity;

@Repository
public interface UserRepository extends ReactiveCrudRepository<UserEntity, Long> {

}
