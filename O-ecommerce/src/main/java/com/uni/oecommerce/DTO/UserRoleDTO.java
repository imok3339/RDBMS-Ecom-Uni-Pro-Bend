package com.uni.oecommerce.DTO;

public class UserRoleDTO {
    private Long urid;
    private String urname;

    public String getUrname() {
        return urname;
    }

    public void setUrname(String urname) {
        this.urname = urname;
    }

    public Long getUrid() {
        return urid;
    }

    public void setUrid(Long urid) {
        this.urid = urid;
    }
}
