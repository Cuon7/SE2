package com.example.springboot2.repository;

import com.example.springboot2.model.Company;
import com.example.springboot2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    List<Company> findByNameContaining(String name);

}
