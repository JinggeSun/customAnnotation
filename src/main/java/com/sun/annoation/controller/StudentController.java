package com.sun.annoation.controller;

import com.sun.annoation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


    @Autowired
    StudentService studentService;

    @GetMapping("/index")
    public Integer getValue(){
        return studentService.add(1000);
    }
}
