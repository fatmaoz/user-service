package com.oz.service;

import com.oz.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO create(UserDTO dto);

    UserDTO readByUserName(String username);
    List<UserDTO> readAllUsers();
    boolean checkByUserName(String username);

    UserDTO update(String username, UserDTO userDTO);
    void delete(String username);

}
