package com.chimp.verse.dto;

import com.chimp.verse.model.enums.TransactionType;
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
public class TransactionsDTO {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private TransactionType type;
    private Long age;
    private String extId;
}
