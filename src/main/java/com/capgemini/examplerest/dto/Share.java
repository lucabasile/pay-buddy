package com.capgemini.examplerest.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Share {
    Long userId;
    BigDecimal amount;
    Boolean paid;
}
