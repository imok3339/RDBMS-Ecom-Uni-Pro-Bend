package com.uni.oecommerce.DTO;

public class ProductDTO {
    private Long pid;
    private String pname;
    private Long price;
    private String ptype;
    private Long pquantity;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public Long getPquantity() {
        return pquantity;
    }

    public void setPquantity(Long pquantity) {
        this.pquantity = pquantity;
    }
}
