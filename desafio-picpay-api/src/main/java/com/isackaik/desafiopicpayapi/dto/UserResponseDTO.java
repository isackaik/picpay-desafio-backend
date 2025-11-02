package com.isackaik.desafiopicpayapi.dto;

import com.isackaik.desafiopicpayapi.model.User;

public record UserRequestDTO(
        Long id,
        String name,
        String document,
        String email,
        String password,
        boolean seller
) {

    public static User userRequestDtoToUser(UserRequestDTO userDto) {
        User user = new User();
        user.setId(userDto.id);
        user.setDocument(userDto.document);
        user.setName(userDto.name);
        user.setEmail(userDto.email);
        user.setSeller(userDto.seller);
        return user;
    }

}
