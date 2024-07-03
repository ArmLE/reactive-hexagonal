package com.example.reactive_hexagonal.application.ports.output;

import com.example.reactive_hexagonal.domain.model.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentRepositoryOutput {
    Mono<Void> save(Student student);
    Flux<Student> findAll();
}
