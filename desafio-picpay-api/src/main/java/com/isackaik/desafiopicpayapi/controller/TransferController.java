package com.isackaik.desafiopicpayapi.controller;

import com.isackaik.desafiopicpayapi.dto.UserRequestDTO;
import com.isackaik.desafiopicpayapi.dto.UserResponseDTO;
import com.isackaik.desafiopicpayapi.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<UserResponseDTO> insert(@RequestBody UserRequestDTO userDTO) {
        return ResponseEntity.ok(userService.insert(userDTO));
    }

}
