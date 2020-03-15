package com.uni.oecommerce.Controller;

import com.uni.oecommerce.DTO.PaymentDTO;
import com.uni.oecommerce.Service.PaymentServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/payment")
public class PaymentController {
    @Autowired
    PaymentServie paymentServie;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getpayment(@RequestBody PaymentDTO paymentDTO) {
        return paymentServie.savepayment(paymentDTO);
    }
}
