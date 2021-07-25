package com.otus.k8stask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudentResource {

    @GetMapping("/{studentName}")
    public Student getStudent(@PathVariable String studentName) {
        return new Student(studentName, "otus");
    }
}
