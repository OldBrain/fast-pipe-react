package ru.react.fastpipe.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
//@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    private Long id;
    @Column("name")
    private String name;
    @Column("password")
    private String password;


}
