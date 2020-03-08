package com.uni.oecommerce.Service;

import com.uni.oecommerce.DTO.AppUserDTO;
import com.uni.oecommerce.Model.AppUser;
import com.uni.oecommerce.Repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    @Autowired
    AppUserRepository appUserRepository;
    public String saveuser(AppUserDTO appUserDTO){
        AppUser appUser =new AppUser();
        appUser.setName(appUserDTO.getName());
        appUser.setPassword(appUserDTO.getPassword());
        appUser.setContactNo(appUserDTO.getContactNo());
        appUser.setEmail(appUserDTO.getEmail());
        appUser.setCountry(appUserDTO.getCountry());
        appUser.setCity(appUserDTO.getCity());
        appUser.setArea(appUserDTO.getArea());
        appUser.setHouse_no(appUserDTO.getHouse_no());
        appUserRepository.save(appUser);
        return "Record Successfully Saved";
    }
}
