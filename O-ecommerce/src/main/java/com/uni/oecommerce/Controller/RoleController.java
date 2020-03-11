package com.uni.oecommerce.Controller;

import com.uni.oecommerce.DTO.RoleDTO;
import com.uni.oecommerce.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/role/")
public class RoleController {
    @Autowired
    RoleService roleService;

    @RequestMapping( value = "/",  method = RequestMethod.POST)
    public String getRole(@RequestBody RoleDTO roleDTO) { return roleService.saverole(roleDTO);}

}
