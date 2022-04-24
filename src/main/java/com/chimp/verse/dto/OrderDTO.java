package com.chimp.verse.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private Long studentId;
    private Long transactionId;
    private Long courseId;
}
