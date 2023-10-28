package ru.react.fastpipe.dtos;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.react.fastpipe.model.UserEntity;

@Data
@Builder
public class UserDto {
    private Long id;
    private String name;
    private String password;

    public static UserDto instanceOf(UserEntity user) {
        return  builder().id(user.getId())
                .name(user.getName())
                .password(user.getPassword()).build();
    }
}
