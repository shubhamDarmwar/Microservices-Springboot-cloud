package com.lightning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lightning.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
