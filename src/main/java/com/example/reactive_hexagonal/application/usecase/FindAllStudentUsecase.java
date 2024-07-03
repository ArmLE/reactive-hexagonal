package com.example.reactive_hexagonal.application.usecase;

import com.example.reactive_hexagonal.application.ports.input.IFindAllStudentUsecase;
import com.example.reactive_hexagonal.application.ports.output.StudentRepositoryOutput;
import com.example.reactive_hexagonal.domain.model.Student;
import reactor.core.publisher.Flux;

public class FindAllStudentUsecase implements IFindAllStudentUsecase {

    private final StudentRepositoryOutput studentRepositoryOutput;

    public FindAllStudentUsecase(StudentRepositoryOutput studentRepositoryOutput) {
        this.studentRepositoryOutput = studentRepositoryOutput;
    }

    @Override
    public Flux<Student> getAllStudents() {
        return studentRepositoryOutput.findAll();
    }
}
