package com.uni.oecommerce.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;
    private String pname;
    private Long price;
    private String ptype;
    private Long pquantity;

    public Long getPid(){return pid;}
    public void setPid(Long pid){this.pid=pid;}
    public String getPname(){return pname;}
    public void setpnam(String pname){this.pname=pname;}
    public Long getPrice(){return price;}
    public void setPrice(Long price){this.price=price;}
    public String getPtype(){return ptype;}
    public void setPtype(String ptype){this.ptype=ptype;}
    public Long getPquantity(){return pquantity;}
    public void setPquantity(Long pquantity){this.pquantity=pquantity;}
}
