package me.freewine.aws.web.dto;

import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String name;
    private int age;
    private String country;
}
