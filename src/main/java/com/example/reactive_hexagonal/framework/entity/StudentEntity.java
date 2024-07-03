package com.example.reactive_hexagonal.framework.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor

public class StudentEntity {
    @Id
    private Long id;
    private String name;
    private String lastname;
    private Integer age;
    private Boolean state;
}
