package com.example.demo.SpringBoot1.controller;


import com.example.demo.SpringBoot1.entity.Department;
import com.example.demo.SpringBoot1.service.ServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private ServiceLayer serviceLayer;

    @PostMapping("/departments")
    public Department saveDepartments(@RequestBody Department department){
        return serviceLayer.saveDepartments(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartment(){
        return serviceLayer.fetchDepartment();
    }

}
