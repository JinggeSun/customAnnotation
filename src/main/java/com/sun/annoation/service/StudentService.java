package com.sun.annoation.service;

import com.sun.annoation.annoation.Annoation;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Annoation(value=100,res=200)
    public int add(Integer result){
        return result;
    }
}
