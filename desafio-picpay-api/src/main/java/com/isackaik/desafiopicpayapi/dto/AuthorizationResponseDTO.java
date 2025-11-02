package com.isackaik.desafiopicpayapi.dto;

import java.math.BigDecimal;

public record AuthorizationResponseDTO(
        String status,
        DataResponseDTO data
) {

    private record DataResponseDTO(
            boolean authorization
    ) {}

}
