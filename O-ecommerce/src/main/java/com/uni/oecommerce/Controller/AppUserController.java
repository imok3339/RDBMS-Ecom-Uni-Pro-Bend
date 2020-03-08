package com.uni.oecommerce.Controller;

import com.uni.oecommerce.DTO.AppUserDTO;
import com.uni.oecommerce.Service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/appUser/")
public class AppUserController {
    @Autowired
    AppUserService appUserService;

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String getAppuser(@RequestBody AppUserDTO appUserDTO){
       return appUserService.saveuser(appUserDTO);
    }
}
