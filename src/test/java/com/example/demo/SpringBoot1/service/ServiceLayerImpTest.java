package com.example.demo.SpringBoot1.service;

import com.example.demo.SpringBoot1.Exceptions.DepartmentNotFound;
import com.example.demo.SpringBoot1.entity.Department;
import com.example.demo.SpringBoot1.repository.RepositoryLayer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class ServiceLayerImpTest {


    @Autowired
    private ServiceLayerImp serviceLayerTest;

    @MockBean
    private RepositoryLayer repositoryLayerTest;

    ServiceLayerImpTest() throws DepartmentNotFound {
    }

    @BeforeEach
    void setUp(){
    Department dep = Department.builder().departmentName("IT").departmentType("IT-06").employees(12).build();
    Department dep1 = Department.builder().departmentName("IT").departmentType("IT-06").employees(12).build();
        Mockito.when(repositoryLayerTest.findBydepartmentName("IT")).thenReturn(dep);
        Mockito.when(repositoryLayerTest.findById(2L)).thenReturn(Optional.ofNullable(dep1));

    }

    @Test
    @DisplayName("Get Data based on valid department name")
    public void DepartmentNameValid_departmentNameFound(){
        String name = "IT";
        Department dep = serviceLayerTest.findBydepartmentName(name);
        assertEquals(name,dep.getDepartmentName());
    }

    @Test
    public void DepartmentEmployees_departmentNotFound() throws DepartmentNotFound {
        Long x = 2L;
        Department dep = serviceLayerTest.fetchDepartmentbyId(x);
        assertEquals(x,dep.getDepartmentId());
    }


}