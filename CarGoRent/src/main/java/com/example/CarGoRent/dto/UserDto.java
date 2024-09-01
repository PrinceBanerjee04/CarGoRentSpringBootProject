package com.example.CarGoRent.dto;

import com.example.CarGoRent.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;

    private String name;

    private String email;

    private UserRole userRole;
}
