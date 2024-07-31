package com.mytry.student_management.contoller;

import com.mytry.student_management.models.Student;
import com.mytry.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class StudentContoller {

    @Autowired
    private StudentService studentService;


    @GetMapping("/check")
    public String check() {
        return  "Hi Students 1";
    }

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getAllStudent();
    }
}
