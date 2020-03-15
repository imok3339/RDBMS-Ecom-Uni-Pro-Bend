package com.uni.oecommerce.Controller;

import com.uni.oecommerce.DTO.CartDTO;
import com.uni.oecommerce.Model.Cart;
import com.uni.oecommerce.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/cart")
public class CartController {
    @Autowired
    CartService cartService;
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String getCart(@RequestBody CartDTO cartDTO){return  cartService.savecart(cartDTO);}
}
