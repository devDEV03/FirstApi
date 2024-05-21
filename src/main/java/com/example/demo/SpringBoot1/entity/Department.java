package com.example.demo.SpringBoot1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long departmentId;
    public String departmentName;
    public String departmentType;
    public Integer employees;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentType() {
        return departmentType;
    }

    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    public Department(Long departmentId, String departmentName, String departmentType, Integer employees) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentType = departmentType;
        this.employees = employees;
    }

    public Department() {
    }
}
