package com.isackaik.desafiopicpayapi.dto;

import java.math.BigDecimal;

public record TransferRequestDTO(
        Long id,
        BigDecimal value,
        Long payer,
        Long payee
) {

}
