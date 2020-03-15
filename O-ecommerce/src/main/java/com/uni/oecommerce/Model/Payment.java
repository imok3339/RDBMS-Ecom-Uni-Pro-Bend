package com.uni.oecommerce.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentid;
    private String paymenttype;
    private Long amount;

    public Long getPaymentid(){return paymentid; }
    public void setPaymentid(Long paymentid){this.paymentid=paymentid;}

    public String getPaymenttype(){return paymenttype; }
    public void setPaymenttype(String paymenttype){this.paymenttype=paymenttype;}

    public Long getAmount(){return amount;}
    public void setAmount(Long amount){this.amount=amount;}
}
