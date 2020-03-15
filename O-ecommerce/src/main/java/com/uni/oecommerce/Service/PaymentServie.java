package com.uni.oecommerce.Service;

import com.uni.oecommerce.DTO.PaymentDTO;
import com.uni.oecommerce.Model.Payment;
import com.uni.oecommerce.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServie {
    @Autowired
    PaymentRepository paymentRepository;
    public String savepayment(PaymentDTO paymentDTO){
        Payment payment=new Payment();
        payment.setPaymentid(paymentDTO.getPaymentid());
        payment.setPaymenttype(paymentDTO.getPaymenttype());
        payment.setAmount(paymentDTO.getAmount());
        paymentRepository.save(payment);
        return "Record Successfully Saved";
    }
}
