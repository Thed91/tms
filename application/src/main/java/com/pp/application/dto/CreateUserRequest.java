package com.pp.application.dto;

import com.pp.domain.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateUserRequest {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private UserRole role;
}
