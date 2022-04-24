package com.chimp.verse.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentDao extends JpaRepository<StudentDao, UUID> {
}
