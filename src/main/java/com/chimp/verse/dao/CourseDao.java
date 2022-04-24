package com.chimp.verse.dao;

import com.chimp.verse.dto.CourseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<CourseDTO, Long> {
}
