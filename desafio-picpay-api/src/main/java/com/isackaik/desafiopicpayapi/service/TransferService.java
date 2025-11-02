package com.isackaik.desafiopicpayapi.service;

import com.isackaik.desafiopicpayapi.dto.UserRequestDTO;
import com.isackaik.desafiopicpayapi.dto.UserResponseDTO;
import com.isackaik.desafiopicpayapi.model.User;
import com.isackaik.desafiopicpayapi.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponseDTO insert(UserRequestDTO userDTO) {
        User user = userRepository.save(UserRequestDTO.userRequestDtoToUser(userDTO));
        return UserResponseDTO.userToUserResponseDTO(user);
    }
}
