package com.chimp.verse.dao;

import com.chimp.verse.dto.OrderDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderDao extends JpaRepository<OrderDTO, UUID> {
}
