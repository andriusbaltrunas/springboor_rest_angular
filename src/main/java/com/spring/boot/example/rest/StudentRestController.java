package com.spring.boot.example.rest;

import com.spring.boot.example.bean.Student;
import com.spring.boot.example.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by andriusbaltrunas on 7/12/2018.
 */
@RestController()
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentRestController {

    private final StudentService studentService;

    @GetMapping("/all")
    public List<Student> getStudents(){
        List<Student> students = studentService.getStudents();
        return students;
    }

    @PostMapping("/save")
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }
}
