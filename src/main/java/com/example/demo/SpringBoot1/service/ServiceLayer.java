package com.example.demo.SpringBoot1.service;

import com.example.demo.SpringBoot1.entity.Department;

import java.util.List;

public interface ServiceLayer {
    public Department saveDepartments(Department department);

    public List<Department> fetchDepartment();
}
