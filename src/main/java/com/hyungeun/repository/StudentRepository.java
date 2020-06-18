package com.hyungeun.repository;


import com.hyungeun.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByName(final String name);
    List<Student> findAllByEmailIsLike(final String email);
}
