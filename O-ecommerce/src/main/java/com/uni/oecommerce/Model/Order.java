package com.uni.oecommerce.Model;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderno;
    private String orderdate;
    private String ordertime;
    private int ordertotal;

    public Long getOrderno() { return orderno; }
    public  void setOrderno(Long orderno) {this.orderno=orderno;}

    public String getOrderdate(){return orderdate;}
    public void setOrderdate(String orderdate){this.orderdate=orderdate;}

    public String getOrdertime(){return ordertime; }
    public void setOrdertime(String ordertime){this.ordertime=ordertime;}

    public  int getOrdertotal (){return ordertotal;}
    public void setOrdertotal(int ordertotal){this.ordertotal=ordertotal;}

}
