package com.example.demo.SpringBoot1.controller;


import com.example.demo.SpringBoot1.entity.Department;
import com.example.demo.SpringBoot1.service.ServiceLayer;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private ServiceLayer serviceLayer;

    @PostMapping("/departments")
    public Department saveDepartments(@Valid @RequestBody Department department){
        return serviceLayer.saveDepartments(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartment(){
        return serviceLayer.fetchDepartment();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentID){
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
