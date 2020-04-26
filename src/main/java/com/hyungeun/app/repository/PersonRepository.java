package com.hyungeun.app.repository;

import com.hyungeun.app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
