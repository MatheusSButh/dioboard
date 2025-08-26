package com.buthdev.demo.dtos;

import com.buthdev.demo.persistence.entities.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}