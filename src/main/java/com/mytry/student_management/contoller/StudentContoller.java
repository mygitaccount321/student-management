package com.mytry.student_management.contoller;

import com.mytry.student_management.models.MyAppConfig;
import com.mytry.student_management.models.Student;
import com.mytry.student_management.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@Slf4j
public class StudentContoller {

    @Autowired
    private StudentService studentService;

    @Autowired
    private MyAppConfig myAppConfig;

    @GetMapping("/check")
    public String check() {
        log.info("Check is calling");
        return  "Hi Students 543 "+myAppConfig.applicationName();
    }

    @GetMapping("/check1")
    public String check1() {
        return  "Hi Students check1 "+myAppConfig.applicationName();
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
