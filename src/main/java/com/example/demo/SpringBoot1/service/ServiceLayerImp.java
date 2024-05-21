package com.example.demo.SpringBoot1.service;


import com.example.demo.SpringBoot1.entity.Department;
import com.example.demo.SpringBoot1.repository.RepositoryLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceLayerImp implements ServiceLayer{

    @Autowired
    private RepositoryLayer repositoryLayer;
    @Override
    public Department saveDepartments(Department department) {
        return repositoryLayer.save(department);
    }

    @Override
    public List<Department> fetchDepartment() {
        return repositoryLayer.findAll();
    }
}
