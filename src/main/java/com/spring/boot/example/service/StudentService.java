package com.spring.boot.example.service;

import com.spring.boot.example.bean.Student;

import java.util.List;

/**
 * Created by andriusbaltrunas on 7/12/2018.
 */
public interface StudentService {

    List<Student> getStudents();

    void saveStudent(Student student);
}
