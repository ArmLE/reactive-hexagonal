package com.example.reactive_hexagonal.framework.adapters.output;

import com.example.reactive_hexagonal.application.ports.output.StudentRepositoryOutput;
import com.example.reactive_hexagonal.domain.model.Student;
import com.example.reactive_hexagonal.framework.entity.StudentEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class R2dbcStudentRepositoryAdapter implements StudentRepositoryOutput {

    private final R2dbcStudentRepository studentRepository;

    public R2dbcStudentRepositoryAdapter(R2dbcStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Mono<Void> save(Student student) {
        return studentRepository.save(StudentEntity.toStudentEntity(student)).then();
    }

    @Override
    public Flux<Student> findAll() {
        return studentRepository.findAll().map(StudentEntity::toStudent);
    }
}
