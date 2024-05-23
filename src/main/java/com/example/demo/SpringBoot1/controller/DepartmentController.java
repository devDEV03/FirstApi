package com.example.demo.SpringBoot1.controller;


import com.example.demo.SpringBoot1.entity.Department;
import com.example.demo.SpringBoot1.service.ServiceLayer;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private ServiceLayer serviceLayer;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartments(@Valid @RequestBody Department department){
        LOGGER.info("The save Departments method has been intitated");
        return serviceLayer.saveDepartments(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartment(){
        LOGGER.info("The fetch list Departments method has been intitated");
        return serviceLayer.fetchDepartment();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentID){
        LOGGER.info("The fetch list Departments method has been intitated");

        return serviceLayer.fetchDepartmentbyId(departmentID);
    }
    @DeleteMapping("/departments")
    public void deleteDepartment(){
        serviceLayer.deleteDepartment();
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentbyId(@PathVariable("id") Long departmentId){
        serviceLayer.deleteDepartmentbyId(departmentId);
        return "Department" + departmentId + " has been deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,Department dep){
        return serviceLayer.setDepartmentLayer(departmentId,dep);
    }

    @GetMapping("/departments/name/{name}")
    public Department findDepartmentByName(@PathVariable("name") String departmentName){
        return serviceLayer.findBydepartmentName(departmentName);
    }


}
