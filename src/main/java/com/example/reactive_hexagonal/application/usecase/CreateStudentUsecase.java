package com.example.reactive_hexagonal.application.usecase;

import com.example.reactive_hexagonal.application.ports.input.ICreateStudentUsecase;
import com.example.reactive_hexagonal.application.ports.output.StudentRepositoryOutput;
import com.example.reactive_hexagonal.domain.model.Student;
import reactor.core.publisher.Mono;

public class CreateStudentUsecase implements ICreateStudentUsecase {

    private final StudentRepositoryOutput studentRepositoryOutput;

    public CreateStudentUsecase(StudentRepositoryOutput studentRepositoryOutput) {
        this.studentRepositoryOutput = studentRepositoryOutput;
    }

    @Override
    public Mono<Void> createStudent(Student student) {
        return studentRepositoryOutput.save(student);
    }
}
