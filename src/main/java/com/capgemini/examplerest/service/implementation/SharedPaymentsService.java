package com.capgemini.examplerest.service.implementation;

import com.capgemini.examplerest.dto.Share;
import com.capgemini.examplerest.dto.SharedPayment;
import com.capgemini.examplerest.service.interfaces.ISharedPaymentsService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class SharedPaymentsService implements ISharedPaymentsService {

    public SharedPayment getPayment() {
        SharedPayment sharedPayment= new SharedPayment();
        sharedPayment.setPaid(false);
        List<Share> shares= new ArrayList<>();
        Share share1= new Share();
        share1.setUserId(new Long("1"));
        share1.setAmount(new BigDecimal(99));
        share1.setPaid(false);
        shares.add(share1);
        Share share2= new Share();
        share2.setUserId(new Long("2"));
        share2.setAmount(new BigDecimal(99));
        share2.setPaid(false);
        shares.add(share2);
        sharedPayment.setShares(shares);
        return sharedPayment;
    }
}
