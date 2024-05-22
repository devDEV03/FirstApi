package com.example.demo.SpringBoot1.service;


import com.example.demo.SpringBoot1.entity.Department;
import com.example.demo.SpringBoot1.repository.RepositoryLayer;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    @Override
    public Department fetchDepartmentbyId(Long departmentID) {
        return repositoryLayer.findById(departmentID).get();
    }

    @Override
    public void deleteDepartment() {
        repositoryLayer.deleteAll();
    }

    @Override
    public void deleteDepartmentbyId(Long departmentId) {
        repositoryLayer.deleteById(departmentId);
    }

    @Override
    public Department setDepartmentLayer(Long departmentId, Department dep) {
        Department depSb = repositoryLayer.findById(departmentId).get();

        if(Objects.nonNull(dep.getDepartmentName()) && !"".equalsIgnoreCase(dep.getDepartmentName())){
            depSb.setDepartmentName(dep.getDepartmentName());
        }
        if(Objects.nonNull(dep.getDepartmentType()) && !"".equalsIgnoreCase(dep.getDepartmentType())){
            depSb.setDepartmentName(dep.getDepartmentName());
        }
        return repositoryLayer.save(depSb);
    }

    @Override
    public Department findBydepartmentName(String departmentName) {
        return repositoryLayer.findBydepartmentNameIgnoreCase(departmentName);
    }

}
