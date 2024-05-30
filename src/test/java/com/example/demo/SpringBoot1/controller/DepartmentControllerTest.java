package com.example.demo.SpringBoot1.controller;

import com.example.demo.SpringBoot1.entity.Department;
import com.example.demo.SpringBoot1.service.ServiceLayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;


@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {


    @MockBean
    private ServiceLayer serverTest;


    private Department dep;
    @BeforeEach
    void setUp() {
      dep = Department.builder().departmentId(1L).departmentName("CSE").departmentType("Eng").employees(30).build();
    }

    @Test
    void saveDepartments() {
    }

    @Test
    void fetchDepartmentById() {
    }
}