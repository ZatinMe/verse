package com.chimp.verse.dao;

import com.chimp.verse.dto.TestDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TestDao extends JpaRepository<TestDTO, UUID> {
}
