package com.kokkinos.TeachersApp.service;

import com.kokkinos.TeachersApp.model.Answer;
import com.kokkinos.TeachersApp.model.Student;
import com.kokkinos.TeachersApp.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public void load(){

    }

    public void addStudent(Student student){
        repo.save(student);
    }

    public Student getStudent(int rollNo){
         return repo.findById(rollNo).orElse(new Student());

    }

    public void addAnswer(Answer answer){}
}
