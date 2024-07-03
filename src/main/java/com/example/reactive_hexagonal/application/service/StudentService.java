package com.example.reactive_hexagonal.application.service;

import com.example.reactive_hexagonal.application.ports.input.ICreateStudentUsecase;
import com.example.reactive_hexagonal.application.ports.input.IFindAllStudentUsecase;
import com.example.reactive_hexagonal.domain.model.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class StudentService implements ICreateStudentUsecase, IFindAllStudentUsecase {

    private final ICreateStudentUsecase createStudentUseCase;
    private final IFindAllStudentUsecase findAllUseCase;

    public StudentService(ICreateStudentUsecase createStudentUseCase, IFindAllStudentUsecase findAllUseCase) {
        this.createStudentUseCase = createStudentUseCase;
        this.findAllUseCase = findAllUseCase;
    }

    @Override
    public Mono<Void> createStudent(Student student) {
        return createStudentUseCase.createStudent(student);
    }

    @Override
    public Flux<Student> getAllStudents() {
        return findAllUseCase.getAllStudents();
    }
}
