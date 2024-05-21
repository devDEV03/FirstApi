package com.example.demo.SpringBoot1.repository;

import com.example.demo.SpringBoot1.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryLayer extends JpaRepository<Department,Long> {
}
