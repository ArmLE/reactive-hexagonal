package com.example.reactive_hexagonal.application.ports.input;

import com.example.reactive_hexagonal.domain.model.Student;
import reactor.core.publisher.Mono;

public interface ICreateStudentUsecase {
    Mono<Void> createStudent(Student student);
}
