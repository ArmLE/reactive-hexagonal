package com.example.reactive_hexagonal.framework.adapters.output;

import com.example.reactive_hexagonal.domain.model.Student;
import com.example.reactive_hexagonal.framework.entity.StudentEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface R2dbcStudentRepository extends R2dbcRepository<StudentEntity,Long> {

}
