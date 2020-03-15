package com.uni.oecommerce.Controller;

import com.uni.oecommerce.DTO.UserRoleDTO;
import com.uni.oecommerce.Service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/userrole")
public class UserRoleController {
    @Autowired
    UserRoleService userRoleService;
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String getUserRole(@RequestBody  UserRoleDTO userRoleDTO){return userRoleService.saveuserrole(userRoleDTO);}
}
