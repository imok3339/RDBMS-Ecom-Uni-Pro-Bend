package com.uni.oecommerce.Controller;

import com.uni.oecommerce.DTO.OrderDTO;
import com.uni.oecommerce.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getOrder (@RequestBody OrderDTO orderDTo){return orderService.saveorder(orderDTo);}
}
