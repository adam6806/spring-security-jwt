package com.github.adam6806.securerestapi.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private String username;
    private String password;
    private int age;
    private int salary;
}
