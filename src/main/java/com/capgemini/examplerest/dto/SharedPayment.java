package com.capgemini.examplerest.dto;

import lombok.Data;

import java.util.List;

@Data
public class SharedPayment {
    SharedGood sharedGood;
    List<Share> shares;
    Boolean paid;
}
