package com.uni.oecommerce.Service;

import com.uni.oecommerce.DTO.CartDTO;
import com.uni.oecommerce.Model.Cart;
import com.uni.oecommerce.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;
    public String savecart(CartDTO cartDTO){
        Cart cart=new Cart();
        cart.setCartno(cartDTO.getCartno());
        cartRepository.save(cart);
        return "Record Successfully saved";
    }
}
