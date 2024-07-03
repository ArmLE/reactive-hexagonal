package com.example.reactive_hexagonal.domain.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    private Long id;
    private String name;
    private String lastname;
    private Integer age;
    private Boolean state;
}
