package com.uni.oecommerce.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartno;
    public Long getCartno(){return cartno;}
    public void setCartno(Long cartno){this.cartno=cartno;}
}
