package com.project.jobportal.services;

import com.project.jobportal.entity.UsersType;
import com.project.jobportal.repository.UsersTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersTypeService {
    private final UsersTypeRepository usersTypeRepository;

    @Autowired
    private UsersTypeService(UsersTypeRepository usersTypeRepository){
        this.usersTypeRepository=usersTypeRepository;
    }
    public List<UsersType> getAll(){
        return usersTypeRepository.findAll();
    }
}
