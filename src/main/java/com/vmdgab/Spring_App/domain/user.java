package com.vmdgab.Spring_App.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class user {
    private String username;
    private String email;
    private String password;
}
