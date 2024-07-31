package com.mytry.student_management.service;

import com.mytry.student_management.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private ArrayList<Student> students = new ArrayList<>() ;

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> getAllStudent() {
        return students;
    }
}
