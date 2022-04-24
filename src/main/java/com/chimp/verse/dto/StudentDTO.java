package com.chimp.verse.dto;
import com.google.gson.JsonObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private Long age;
    private JsonObject detail;
}
