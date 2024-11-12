package com.oz.service;

import com.oz.dto.UserDTO;

public interface KeycloakService {

    void userCreate(UserDTO userDTO);

    void userUpdate(UserDTO userDTO);

    void delete(String userName);

}
