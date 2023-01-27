package com.capgemini.examplerest.dto;

import lombok.Data;

@Data
public class SharedGood {
    Long id;
    String description;
    SharedPayment sharedPayment;
}
