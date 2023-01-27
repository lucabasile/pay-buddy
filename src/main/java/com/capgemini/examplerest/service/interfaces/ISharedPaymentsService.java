package com.capgemini.examplerest.service.interfaces;

import com.capgemini.examplerest.dto.SharedPayment;
import org.springframework.stereotype.Component;

@Component
public interface ISharedPaymentsService {
    public SharedPayment getPayment();
}
