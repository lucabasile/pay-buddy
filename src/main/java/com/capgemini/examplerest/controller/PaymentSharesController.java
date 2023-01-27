package com.capgemini.examplerest.controller;

import com.capgemini.examplerest.dto.SharedPayment;
import com.capgemini.examplerest.service.interfaces.ISharedPaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/payment-shares")
public class PaymentSharesController {

    @Autowired
    ISharedPaymentsService sharedPaymentsService;

    @GetMapping
    public SharedPayment getSharedPayment(){
        SharedPayment sharedPayment = sharedPaymentsService.getPayment();
        return sharedPayment;
    }
}
