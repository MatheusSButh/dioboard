package com.buthdev.demo.dtos;

import com.buthdev.demo.persistence.entities.BoardColumnKindEnum;

public record BoardColumnDTO(Long id,
        String name,
        BoardColumnKindEnum kind,
        int cardsAmount) {
}