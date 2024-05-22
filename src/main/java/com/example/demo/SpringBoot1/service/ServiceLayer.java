package com.example.demo.SpringBoot1.service;

import com.example.demo.SpringBoot1.entity.Department;

import java.util.List;

public interface ServiceLayer {
    public Department saveDepartments(Department department);

    public List<Department> fetchDepartment();

    public Department  fetchDepartmentbyId(Long departmentID);

    public void deleteDepartment();

    public void deleteDepartmentbyId(Long departmentId);

    public Department setDepartmentLayer(Long departmentId, Department dep);

    public Department findBydepartmentName(String departmentName);

}
