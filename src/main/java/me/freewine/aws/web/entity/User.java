package me.freewine.aws.web.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private long id;
    private String name;
    private int age;
    private String country;
}
