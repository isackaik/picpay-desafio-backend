package com.isackaik.desafiopicpayapi.dto;

import com.isackaik.desafiopicpayapi.model.User;

public record UserDTO(
        Long id,
        String name,
        String document,
        String email,
        boolean seller
) {

    public static User userDtoToUser(UserDTO userDto) {
        User user = new User();
        user.setId(userDto.id);
        user.setDocument(userDto.document);
        user.setName(userDto.name);
        user.setEmail(userDto.email);
        user.setSeller(userDto.seller);
        return user;
    }

    public static UserDTO userToUserDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getDocument(),
                user.getName(),
                user.getEmail(),
                user.isSeller()
        );
    }

}
