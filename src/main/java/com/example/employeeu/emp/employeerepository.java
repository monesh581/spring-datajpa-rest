package com.example.employeeu.emp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface employeerepository extends JpaRepository<employee,Integer> {
}
