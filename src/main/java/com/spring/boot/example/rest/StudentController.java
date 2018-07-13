package com.spring.boot.example.rest;

import com.spring.boot.example.bean.Student;
import com.spring.boot.example.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by andriusbaltrunas on 7/12/2018.
 */
@Controller
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentController {

    private final StudentService studentService;

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @GetMapping("/{studentId}/update")
    public ModelAndView updateStudent(@PathVariable("studentId") Long id){
        ModelAndView modelAndView = new ModelAndView("update");
        Student student = studentService.getStudent(id);
        modelAndView.addObject("student", student);
        return modelAndView;
    }

}
