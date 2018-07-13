package com.spring.boot.example.service.impl;

import com.spring.boot.example.bean.Student;
import com.spring.boot.example.dao.StudentServiceDao;
import com.spring.boot.example.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by andriusbaltrunas on 7/12/2018.
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentServiceImpl implements StudentService {

    private final  StudentServiceDao studentServiceDao;

    @Override
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Iterable<Student> temp = studentServiceDao.findAll();
        temp.forEach(s -> students.add(s));
        return students;
    }

    @Override
    public void saveStudent(Student student) {
        studentServiceDao.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentServiceDao.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        saveStudent(student);
    }

    @Override
    public Student getStudent(Long id) {
        return studentServiceDao.findById(id).get();
    }
}
