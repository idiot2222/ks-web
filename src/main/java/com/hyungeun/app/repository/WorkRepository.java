package com.hyungeun.app.repository;

import com.hyungeun.app.entity.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, Long> {
}
