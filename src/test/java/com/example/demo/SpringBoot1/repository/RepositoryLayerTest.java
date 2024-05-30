package com.example.demo.SpringBoot1.repository;

import com.example.demo.SpringBoot1.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class RepositoryLayerTest {


    @Autowired
    private RepositoryLayer repositoryLayerTest;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department dep = Department.builder().departmentName("Mechanical Engineering").departmentType("Eng").employees(20).build();
        entityManager.persist(dep);
    }

    @Test
    void whenFindById_returndep(){
        Department dep = repositoryLayerTest.findById(1L).get();
        assertEquals(dep.getDepartmentName(),"Mechanical Engineering");
    }
}