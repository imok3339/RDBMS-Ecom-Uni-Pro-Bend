package com.uni.oecommerce.Service;

import com.uni.oecommerce.DTO.RoleDTO;
import com.uni.oecommerce.Model.Role;
import com.uni.oecommerce.Repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    @Autowired
    RoleRepository roleRepository;
    public String saverole(RoleDTO roleDTO){
        Role role =new Role();
        role.setName(roleDTO.getName());
        role.setRoleid(roleDTO.getRoleid());
        roleRepository.save(role);
        return "Record Successfully Saved";
    }
}
