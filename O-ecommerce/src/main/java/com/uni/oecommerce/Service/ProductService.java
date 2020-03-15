package com.uni.oecommerce.Service;

import com.uni.oecommerce.DTO.ProductDTO;
import com.uni.oecommerce.Model.Product;
import com.uni.oecommerce.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public String saveproduct(ProductDTO productDTO){
        Product product=new Product();
        product.setPid(productDTO.getPid());
        product.setpnam(productDTO.getPname());
        product.setPquantity(productDTO.getPquantity());
        product.setPrice(productDTO.getPrice());
        product.setPtype(productDTO.getPtype());
        return "Record Successfully Saved";
    }
}
