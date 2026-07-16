package com.vmdgab.Spring_App.services;
import com.vmdgab.Spring_App.database.models.UserEntity;
import com.vmdgab.Spring_App.database.repository.IUserRepository;

import com.vmdgab.Spring_App.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public void save(UserDTO user){
        userRepository.save(
                UserEntity.builder()
                        .username(user.getUsername())
                        .email(user.getEmail())
                        .password(user.getPassword())
                        .build()
        );
    }





}
