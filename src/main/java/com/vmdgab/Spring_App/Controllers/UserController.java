package com.vmdgab.Spring_App.Controllers;

import com.vmdgab.Spring_App.database.models.UserEntity;
import com.vmdgab.Spring_App.dto.UserDTO;
import com.vmdgab.Spring_App.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping
    public List<UserEntity> getUsers(){
        return userService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void newUser(@RequestBody UserDTO user){
        userService.save(user);
    }

}
