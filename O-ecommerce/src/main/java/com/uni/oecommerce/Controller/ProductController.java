package com.uni.oecommerce.Controller;

import com.uni.oecommerce.DTO.ProductDTO;
import com.uni.oecommerce.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String getProduct(@RequestBody ProductDTO productDTO){return productService.saveproduct(productDTO);}
}
