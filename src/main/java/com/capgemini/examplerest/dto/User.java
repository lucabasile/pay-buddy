package com.capgemini.examplerest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    private String name;
    private Long id;
    private String lastName;
    private String taxId;

}
