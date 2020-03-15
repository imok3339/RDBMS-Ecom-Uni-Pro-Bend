package com.uni.oecommerce.Service;

import com.uni.oecommerce.DTO.UserRoleDTO;
import com.uni.oecommerce.Model.UserRole;
import com.uni.oecommerce.Repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepository;
    public String saveuserrole(UserRoleDTO userRoleDTO){
        UserRole userrole =new UserRole();
        userrole.setUrname(userRoleDTO.getUrname());
        userrole.setUrid(userRoleDTO.getUrid());
        userRoleRepository.save(userrole);
        return "Record successfully Saved";
    }
}
