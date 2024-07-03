package com.example.reactive_hexagonal.framework.entity;

import com.example.reactive_hexagonal.domain.model.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentEntity {

    private static ModelMapper modelMapper;

    @Id
    private Long id;
    private String name;
    private String lastname;
    private Integer age;
    private Boolean state;

    public static StudentEntity toStudentEntity(Student student) {
        return modelMapper.map(student, StudentEntity.class);
    }
}
