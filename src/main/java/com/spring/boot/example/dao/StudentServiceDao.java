package com.spring.boot.example.dao;

import com.spring.boot.example.bean.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by andriusbaltrunas on 7/12/2018.
 */
public interface StudentServiceDao extends CrudRepository<Student, Long> {
}
