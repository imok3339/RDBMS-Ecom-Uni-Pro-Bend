package com.uni.oecommerce.Service;

import com.uni.oecommerce.DTO.OrderDTO;
import com.uni.oecommerce.Model.Order;
import com.uni.oecommerce.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService  {
    @Autowired
    OrderRepository orderRepository;
    public String saveorder(OrderDTO orderDTo){
        Order order=new Order();
        order.setOrderno(orderDTo.getOrderno());
        order.setOrdertotal(orderDTo.getOrdertotal());
        order.setOrderdate(orderDTo.getOrderdate());
        order.setOrdertime(orderDTo.getOrdertime());
        orderRepository.save(order);
        return "Record Successfully Saved";
    }
}
