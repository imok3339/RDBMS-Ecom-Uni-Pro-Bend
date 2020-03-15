package com.uni.oecommerce.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long urid;
    private String urname;

    public  Long getUrid(){return urid;}

    public void setUrid(Long usid){this.urid=urid;}

    public String getUrname() {return urname;}
    public void setUrname(String urname){this.urname = urname;}
}
