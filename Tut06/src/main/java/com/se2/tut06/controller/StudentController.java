package com.se2.tut06.controller;
import com.se2.tut06.model.Student;
import com.se2.tut06.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping(value = "/")
    public List<Student> viewStudentList() {
        return studentRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Student viewStudentById(
            @PathVariable(value = "id") Long id) {
        return studentRepository.findById(id).get();
    }

    @PostMapping(value = "/")
    public Student addStudent(
            @RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping(value = "/{id}")
    public void updateStudent(
            @PathVariable(value = "id") Long id,
            @RequestBody Student student) {
        if(studentRepository.existsById(id)) {
            student.setId(id);
            studentRepository.save(student);
        }
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStudent(
            @PathVariable(value = "id") Long id) {
        if(studentRepository.existsById(id)) {
            Student student = studentRepository.getById(id);
            studentRepository.delete(student);
        }

    }
}
